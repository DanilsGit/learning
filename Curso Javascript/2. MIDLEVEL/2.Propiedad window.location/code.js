//Información de la propiedad location.

//href, devuelve el url de la página
const url = window.location.href;
document.write(`La url es: ${url} <br><br>`);

//hostname, devuelve el nombre del dominio del servidor web
//Ya no devuelve https
//pero si el subDominio en caso de tener uno como www
const hostname = window.location.hostname;
document.write(`El nombre del host: ${hostname} <br><br>`);

//host, además del dominio, devuelve el puerto
const host = window.location.host;
document.write(`El nombre del host con puerto: ${host} <br><br>`);

//pathname, devuelve desde la ruta origen
//la ubicación de donde me encuentro.
const pathname = window.location.pathname;
document.write(`Sección de la página donde me encuentro: ${pathname} <br><br>`);

//protocol, devuelve el protocolo (http o https)
const protocol = window.location.protocol;
document.write(`Protocolo ${protocol} <br><br>`);

//Método assign(), carga un nuevo documento
//  window.location.assign("servicios");
// nos llevaría a https://pagina/servicios.
