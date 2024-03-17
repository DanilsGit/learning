
addEventListener('message', (e) => {
    if (e.data){
        let i=0;
        while (i<10000){
            console.log(1);
            i++;
            if (i==9999){
                postMessage("Terminado");
            }
        }
    }
});

