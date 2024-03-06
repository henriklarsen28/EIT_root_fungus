import { Loader } from '@googlemaps/js-api-loader';
import React, { useRef, useEffect } from 'react';

export const Maps = () => {
    const mapContainerRef = useRef(null);
    const mapRef = useRef(null);

    async function getMarkers() {
        const { AdvancedMarkerElement } = await google.maps.importLibrary("marker") as google.maps.MarkerLibrary;
    }
    
    useEffect(() => {
        const loader = new Loader({
            apiKey: 'AIzaSyCK_ahQN_rbHErXn_6KpQwPIZQAYKiOVWo',
            version: 'weekly',
        });

        loader.importLibrary("maps").then(() => {
            mapRef.current = new window.google.maps.Map(mapContainerRef.current, {
                center: { lat: 63.4, lng: 10.3 },
                zoom: 12,
                mapid: 'fd9e02854c4edf5f'
            });
        });
    }, []);

    return (
        <main className="flex container justify-center flex-column">
                <h1 className="page-title">
                    Map
                </h1>
                <div className="map-container">
                    <div ref={mapContainerRef} style={{ height: '100%', width: '100%' }}></div>
                </div>
        </main>
    );
};