import React, { useEffect } from 'react';
import { Loader } from '@googlemaps/js-api-loader';

export const Maps = () => {
    let map: google.maps.Map | null = null;

    useEffect(() => {
        const loader = new Loader({
            apiKey: 'AIzaSyCK_ahQN_rbHErXn_6KpQwPIZQAYKiOVWo',
            version: 'weekly',
        });

        loader.importLibrary('maps').then(() => {
            initMap();
        });
    }, []);
    
    // Initialize and add the map
    async function initMap() {
        const centerPosition = { lat: 63.40806593235845, lng: 10.248096538814815 };
        
        const { Map, InfoWindow } = await google.maps.importLibrary("maps") as google.maps.MapsLibrary;
        const { AdvancedMarkerElement, PinElement } = await google.maps.importLibrary("marker") as google.maps.MarkerLibrary;

        map = new Map(document.getElementById("map"), {
            zoom: 12,
            center: centerPosition,
            mapId: "fd9e02854c4edf5f",
            mapTypeControl: true,
                mapTypeControlOptions: {
                style: google.maps.MapTypeControlStyle.DROPDOWN_MENU,
                mapTypeIds: ["roadmap", "terrain", "satellite"],
            },
            streetViewControl: false,
        });

        const markers = [
            {
                position: { lat: 63.4002554548343, lng: 10.202238452169981},
                title:"Sensor 1",
                body: 23,
            },
            {
                position: { lat: 63.41933158838722, lng: 10.289468508287875 },
                title: "Sensor 2",
                body: 20,
            }
        ]

        const contentString = (title: string, position: { lat: any; lng: any; }, body: string | number) => {
            return '<div id="content">' +
                '<h1 id="firstHeading" class="firstHeading">' + title + '</h1>' +
                '<div id="bodyContent">' +
                '<h2>Temperature</h2>' +
                '<p>Celsius: ' + body + '</p>' +
                '<h2>Position</h2>' +
                '<p>Latitude: ' + position.lat + '</p>' +
                '<p>Longitude: ' + position.lng + '</p>' +
                '</div>' +
                '</div>';
        };        
        

        // Create an info window to share between markers.
        const infoWindow = new InfoWindow();

        // Create the markers.
        markers.forEach(({position, title, body}, i) => {
            const pin = new PinElement({
                glyph: `${i + 1}`,
            });

            const marker = new AdvancedMarkerElement({
                position,
                map,
                title: contentString(title, position, body),
                content: pin.element,
            });

            // Add a click listener for each marker, and set up the info window.
            marker.addListener('click', () => {
                infoWindow.close();
                infoWindow.setContent(marker.title);
                infoWindow.open(marker.map, marker);
            });
        });
    }

    return (
        <main className="flex container justify-center flex-column">
                <h1 className="page-title">
                    Map
                </h1>
                <div className="map-container">
                    <div id='map' style={{ height: '100%', width: '100%' }}></div>
                </div>
        </main>
    );
};