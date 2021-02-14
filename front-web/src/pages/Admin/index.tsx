import React from 'react';
import { Route, Switch } from 'react-router-dom';
import Navbar from './componets/Navbar';
import Products from './componets/Products';
import './styles.scss';

const Admin = () => (
<div className="admin-container">
    <Navbar/>
    <div className="admin-content">
        <Switch>
            <Route path="/admin/products">
                <Products />
            </Route>
            <Route path="/admin/categories">
                <h2>Categories</h2>
            </Route>  
            <Route path="/admin/users">
                <h2>Users</h2>
            </Route> 
        </Switch>    
    </div>
</div>

);

export default Admin;