import React, {Component, Fragment} from 'react';

import Header from '../Header/Header';
import Cart from "../Cart/Cart";

class ShoppingCartPage extends Component {
    render() {
        return (
			<div style={{backgroundColor:'#6dc4aa'}}>
                <Fragment>
                    <Header/>
                    <Cart/>
                </Fragment>
            </div>
        )
    }
}

export default ShoppingCartPage;