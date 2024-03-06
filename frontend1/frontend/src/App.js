import React from 'react';
import './App.css';
import { Topbar } from './components/topbar.tsx'; // Import the NavDesktop component
import { Maps } from './components/maps.tsx'

function App() {
    
    return (
        <div className="flex p-5">
            <Topbar />
            <Maps />
        </div>
    );  
}

export default App;