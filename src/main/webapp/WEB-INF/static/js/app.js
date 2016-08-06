// script.js

    // create the module and name it scotchApp
        // also include ngRoute for all our routing needs
    var iTravelApp = angular.module('iTravelApp', ['ngRoute']);

    // configure our routes
    iTravelApp.config(function($routeProvider) {
        $routeProvider
        //default login page
        .when('/', {
            templateUrl : 'home1.html',
            controller  : 'homeController'
        })
            // route for the home page
            .when('/home', {
                templateUrl : 'home1.html',
                controller  : 'homeController'
            })

            // route for the about page
            .when('/grpDtl', {
                templateUrl : 'groupDetails.html',
                controller  : 'groupDetailsController'
            })

            // route for the contact page
            .when('/contact', {
                templateUrl : 'contact.html',
                controller  : 'contactController'
            });      
        
    });

   