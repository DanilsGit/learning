"use strict";

if ('Notification in window') {
    console.log('El navegador soporta notificaciones');
}else{
    console.log('El navegador no soporta notificaciones')
}

Notification.requestPermission(()=>{
    if(Notification.permission === 'granted'){
        console.log('Se ha concedido el permiso para notificaciones')

        new Notification(`hola, soy una notificación`)

    }else{
        console.log('No se ha concedido el permiso para notificaciones')
    }
})