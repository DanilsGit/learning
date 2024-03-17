"use strict";
//MatchMedia

const matchMedia = window.matchMedia("(max-width: 500px)");
console.log(matchMedia)
console.log(matchMedia.matches)

const container = document.querySelector(".container");

matchMedia.addEventListener("change", (event) => {
    console.log(event)
    console.log(event.matches)
    if (event.matches) {
        container.classList.replace("container", "container-responsive");
    }else{
        container.classList.replace("container-responsive", "container");
    }
});