import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {connect} from 'react-redux';
import * as actions from '../../actions';
import {withRouter} from "react-router-dom";

import ProductCard from "../../components/ProductCard/ProductCard";

import './ProductsCards.css';
import NoProduct from "../../components/NoProducts/NoProducts";

class ProductCards extends Component {

    constructor(props) {
        super(props);
        this.state = this.getInitialState();
    }

    getInitialState = () => {
        return {
            allProducts: null,
            filteredProducts: null,
            noProducts: false
        }
    };

    handleAddProductToShoppingCarts = (idProduct) => {
        this.props.addProductToShoppingCart(idProduct);
    };

    goToDescription = id => {
        this.props.history.push(`/product/${id}`);
    };

    renderProductCard = products => {
        return products.map(product => {
            const {
                id,
                name,
                description,
                category,
                image,
				price
            } = product;

            const props = {
                idProduct: id,
                name,
                description,
                category,
                image,
				price,
                handleAddProductToShoppingCarts: this.handleAddProductToShoppingCarts
                // goToDescription: (id) => this.goToDescription(id)
            };
            return <ProductCard {...props} />
        });
    };

    renderProducts = () => {
        const {allProducts, filteredProducts, noProducts} = this.state;

        console.log("render products: " + allProducts);
		console.log("render products no products: " + noProducts);

        if (noProducts) {
            return <NoProduct information={'No products.'}/>
        } else if (allProducts && !filteredProducts) {
            return this.renderProductCard(allProducts);
        } else if (filteredProducts) {
            return this.renderProductCard(filteredProducts);
        } else {
            return <b>no products</b>
        }
    };

    filterDataByCategory = category => {
    	console.log("filterByCategory in ProductCards");
        const {allProducts} = this.state;
        let rightProducts = null;
        console.log("Category: " + category);
        if (category === 'All') {
        	console.log("Category all: " + allProducts);
            rightProducts = allProducts;
        } else {
            rightProducts = allProducts.filter(product => product.category === category);
        }

        if (rightProducts.length > 0) {
			console.log("Right products lenght > 0");
            this.setState({
                filteredProducts: rightProducts,
                noProducts: false
            });
        } else {
            this.setState({
                noProducts: true
            });
        }

    };

    filterProductsByKeyWords = keyWords => {
        const {allProducts} = this.state;

        const rightProducts = [];

        allProducts.map(product => {
            const productHasKey = product.keyWords.split(',');
            const hasGoodKey = productHasKey.find(key => key.toLocaleLowerCase().trim() === keyWords.toLocaleLowerCase().trim());
            if (hasGoodKey) {
                rightProducts.push(product)
            }

            return product;
        });

        if (rightProducts.length > 0) {
            this.setState({
                filteredProducts: rightProducts,
                noProducts: false
            });
        } else {
            this.setState({
                noProducts: true
            });
        }
    };

    componentDidMount() {
        this.props.getProducts();
    }

    componentWillReceiveProps(nextProps) {

        const {allProducts, sortByCategory, sortByKeyWords} = nextProps;

        if (allProducts) {
            this.setState({
                allProducts,
                noProducts: false
            }, () => {
                if (sortByCategory) {
                    this.filterDataByCategory(sortByCategory);
                }

                if (sortByKeyWords) {
                    this.filterProductsByKeyWords(sortByKeyWords);
                }
            })
        }
    }

    render() {
        return <div className="container all-products">
            <div className="row">
                {this.renderProducts()}
            </div>
        </div>
    }
}

ProductCards.propTypes = {
    addProductToShoppingCart: PropTypes.func,
    getProducts: PropTypes.func,
    sortByCategory: PropTypes.string
};

ProductCards.defaultTypes = {
    addProductToShoppingCart: () => {
    },
    getProducts: () => {
    },
    sortByCategory: null
};

const mapStateToProps = state => {
    return {
        allProducts: state.product.allProducts,
        sortByCategory: state.product.sortByCategory,
        sortByKeyWords: state.product.sortByKeyWords
    }
};

export default withRouter(connect(mapStateToProps, actions)(ProductCards));