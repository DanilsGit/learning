const name = document.getElementById("name");
const email = document.getElementById("email");
const subject = document.getElementById("subject");
const textarea_body = document.getElementById("textarea-body");
const button = document.getElementById("send-btn");

const result = document.querySelector(".result");

button.addEventListener("click",(e)=>{
    e.preventDefault();
    let error = verify();
    if(error[0]){
        result.innerHTML = error[1];
        result.classList.add("error");
    }else{
        result.innerHTML = `Solicitud enviada correctamente. Por favor verifique su bandeja de entrada.`;
        result.classList.add("success");
        result.classList.remove("error");
    }
});

const verify = ()=>{
    let error = [];
    let nameLength = name.value.length;
    if(nameLength <5){
        error[0] = true;
        error[1] = `Código de error 2: El nombre no puede contener menos de 5 caracteres `;
        return error;
    }
    if(nameLength > 50){
        error[0] = true;
        error[1] = `Código de error 3: El nombre no puede contener más de 50 caracteres `;
        return error;
    }
    if(email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1){
        error[0] = true;
        error[1] = `Código de error 4: El correo electrónico es inválido`;
        return error;
    }
    error[0] = false;
    return error;
}