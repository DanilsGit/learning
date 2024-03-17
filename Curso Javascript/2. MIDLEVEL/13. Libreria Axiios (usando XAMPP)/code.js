//Librería Axios
//Basado en promesas

//A diferencia de fetch, 
//axios no necesita transformar la respuesta a json

//Fetch:
fetch('documento.txt')
.then(res => res.json())
.then(data => console.log(data));

//Axios:
axios('documento.txt')
.then(res => console.log(res.data));

//Axios con post
//No es necesario serializar el objeto
axios.post('https://reqres.in/api/users',
        {
        name: 'Juan',
        job: 'Developer'
        }).then(res => console.log(res.data));

//Otra forma de hacerlo, por medio de configuraciones
axios('https://reqres.in/api/users',
        {
        method: 'post',
        data:   {
                name: 'Juan',
                job: 'Developer'
                }
        }).then(res => console.log(res.data));