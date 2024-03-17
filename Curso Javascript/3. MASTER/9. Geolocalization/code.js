//Geolocalization

const geolocation = navigator.geolocation;
// console.log(geolocation)
//getCurrentPosition(position,error,option)


position = (pos)=> {
    console.log("Tengo la posición")
    console.log(pos.coords)
}

err = (e)=> {
    console.log("No tengo la posición \n"+e.code+" \n "+e.message)
}

const options = {
    enableHighAccuracy: true,
    timeout: 1000,
    maximumAge: 0
}

// geolocation.getCurrentPosition(position,err,options);

// watchPosition(position,error,option)
geolocation.watchPosition(position,err,options);