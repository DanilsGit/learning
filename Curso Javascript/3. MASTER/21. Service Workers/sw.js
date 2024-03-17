
let version = "v2";

self.addEventListener('install', e =>{
    console.log('Service Worker: Installed');
    caches.open(version).then(cache => {
        cache.add("index.html").then(() => {
            console.log("Page Cached");
        }).catch(err => console.log(err));
    });
});

self.addEventListener('activate', e =>{
    console.log('Service Worker: Activated');
    caches.keys().then(key => {
        if(key !== version){
            // caches.delete(key);
        }
    });
});

self.addEventListener('fetch', e =>{
    console.log('Service Worker: Fetching');
    
});

self.addEventListener("message", e => {
    console.log("SW Received Message: " + e.data);
    e.source.postMessage("Hello from the SW");
});

//Cachear sitio web y mostrarlo offline

