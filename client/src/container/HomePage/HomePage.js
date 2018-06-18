import React, {Component, Fragment} from 'react';
import {connect} from 'react-redux';
import * as actions from '../../actions';
import '../../App.css';

import Header from "../Header/Header";
import ProductCards from "../ProductsCards/ProductCards";

class HomePage extends Component {

    componentDidMount() {
        this.props.fetchUser()
    }

    render() {
        return (
			<div style={{backgroundColor:'#6dc4aa'}}>
                <Fragment>
                    <Header/>
                    <ProductCards/>
                </Fragment>
			</div>
        );
    }
}

export default connect(null, actions)(HomePage);
