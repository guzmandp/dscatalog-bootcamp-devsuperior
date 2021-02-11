import React from 'react';
import './styles.scss'

const Navbar = () => (
<div>
    <nav className= "admin-nav-container">
        <ul>
            <li>
                <a href="Link" className="admin-nav-item active">Meus Produtos</a>
            </li>
            <li>
                <a href="Link" className="admin-nav-item">Minhas Categorias</a>
            </li>
            <li>
                <a href="Link" className="admin-nav-item">Meus Usuários</a>
            </li>    
        </ul>
    </nav>
</div>

);

export default Navbar;