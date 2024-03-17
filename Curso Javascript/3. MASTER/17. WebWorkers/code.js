"use strict";

const worker = new Worker("./worker.js"); // Create a worker

worker.addEventListener("message", (event) => {
    console.log(event.data); // Receive data from worker
    worker.terminate(); // Close the worker
});

const EjecutarBucle = () => {
    worker.postMessage(true); // Send a message to the worker
};


const btn = document.querySelector(".button")
btn.addEventListener("click", () => EjecutarBucle());


