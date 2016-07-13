// script.js

    // create the module and name it scotchApp
        // also include ngRoute for all our routing needs
    var iTravelApp = angular.module('iTravelApp', ['ngRoute']);

    // configure our routes
    iTravelApp.config(function($routeProvider) {
        $routeProvider

            // route for the home page
            .when('/home', {
                templateUrl : 'home1.html',
                controller  : 'homeController'
            })

            // route for the about page
            .when('/about', {
                templateUrl : 'about.html',
                controller  : 'aboutController'
            })

            // route for the contact page
            .when('/contact', {
                templateUrl : 'contact.html',
                controller  : 'contactController'
            });      
        
    });

   