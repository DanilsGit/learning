"use strict";

//ServiceWorker

if (navigator.serviceWorker) {
    navigator.serviceWorker.register("sw.js");
    console.log("Service Worker Registered");
}

navigator.serviceWorker.ready.then(res => {
    res.active.postMessage("Hello from the page");
});


navigator.serviceWorker.addEventListener("message", e => {
    console.log("Page Received Message: " + e.data);
});