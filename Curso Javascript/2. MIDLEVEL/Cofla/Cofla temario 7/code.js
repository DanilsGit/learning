let height = window.screen.height;
let width = window.screen.width;

let comprar = confirm(`El alto es ${height}px y el largo es ${width}. 
                    ¿Comprar?`);

if(comprar){
    alert(`Compra realizada exitosamente`);
}else{
    alert(`Compra rechazada`);
}


let href = window.location.href;
let pathname = window.location.pathname;
let hostname = window.location.hostname;
let protocol = window.location.protocol;
document.write(`Información del sitio web:<br>
                url: <b style="color:purple;">${href}</b><br>
                protocol: <b style="color:purple;">${protocol}</b><br>
                pathname: <b style="color:purple;">${pathname}</b><br>
                hostname: <b style="color:purple;">${hostname}</b><br>`);

