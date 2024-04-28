import React from 'react';
import { routes } from "../routes.ts";
import '../App.css';

export const NavDesktop = () => {
    return (
        <ul className='nav-ul'>
            {routes.map((route) => {
                const { Icon, href, title } = route;
                return (
                    <li className='nav-li'>
                        <a
                            href={href}
                            className="flex nav-link"
                        >
                            <Icon />
                            {title}
                        </a>
                    </li>
                );
            })}
        </ul>
    );
};