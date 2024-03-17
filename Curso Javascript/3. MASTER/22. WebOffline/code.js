"use strict";

//ServiceWorker

if (navigator.serviceWorker) {
    navigator.serviceWorker.register("./sw.js");
    console.log("Service Worker Registered");
}

