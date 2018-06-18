import React from 'react';

import "./ProductCard.css"

const ProductCard = (props) => {
    return <div className="col-lg-4 product-card-wrapper">
        <div className="product-card">
            <img src={`/images/product/${props.image}.png`} alt={`${props.image}` } width="300"/>
            <div className="small-description">
                <h3 className='title-product'>{props.name}</h3>
                <h6>{props.description}</h6>
                <footer>
                    <button onClick={() => props.handleAddProductToShoppingCarts(props.idProduct)} className="btn-buy">
                        <img src="/images/shoppingCarts.png" alt=""/>
                    </button>
                    <div className="cost">
                        <span>{props.price}$</span>
                        {props.freeDelivery ?
                            <div className="free-delivery">
                                <img src="/images/free-delivery.png" alt=""/>
                                <span>Darmowa dostawa</span>
                            </div> : null}
                    </div>
                </footer>
            </div>
        </div>
    </div>

};

export default ProductCard;