import React from 'react';
import { NavDesktop } from "./nav-desktop.tsx";
import '../App.css';


export const Topbar = () => {
  return (
    <div className="fixed topbar-background">
      <nav className="container flex items-center justify-between py-1">
        <span className="topbar-title">Root fungi - Mapification</span>
        <NavDesktop />
      </nav>
    </div>
  );
};