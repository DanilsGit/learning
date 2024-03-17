
let version = "v1";

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
        return Promise.all(key.map(cache => {
            if(cache !== version){
                console.log("Cache antiguos eliminados");
                return caches.delete(cache);
            }
        }));
    });
});

self.addEventListener('fetch', e =>{
    console.log('Service Worker: Fetching');
    e.respondWith(
        async function(){
            const response = await caches.match(e.request);
            if(response) return response;
            return e.request;
        }
    );
});


//Cachear sitio web y mostrarlo offline

