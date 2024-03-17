//Fetch y axios con await y async

//Fetch sin async
const getName = () => {
    fetch('documento.txt')
        .then(res => {
            if (res.ok) Promise.resolve(res);
            else Promise.reject(res);
        })
        .then(res => console.log(res))
        .catch(err => console.log(err));
}

getName(); //Undefinied

//Fetch con async
const getName2 = async () => {
    let request = await fetch('documento.txt');
    let res = await request.json();
    console.log(res);
    console.log(res.data);
    let HTMLCode = `<p class="rcolor">Nombre ${res.nombre}<br>
                    Edad ${res.edad}</p>`;
    document.querySelector('.res').innerHTML = HTMLCode;
    document.querySelector('.rcolor').style.color = `#f00`;
}

document.querySelector('#nombre').addEventListener('click', getName2);

//Axios con async

const getName3 = async () => {
    let res = await axios('documento.txt');
    console.log(res);
    console.log(res.data);
    let HTMLCode = `<p class="rcolor">Nombre ${res.data.nombre}<br>
                    Edad ${res.data.edad}</p>`;
    document.querySelector('.res').innerHTML = HTMLCode;
    document.querySelector('.rcolor').style.color = `#0ff`;

};

document.querySelector('#nombre2').addEventListener('click', getName3);
