"use strict";

//IndexedDB
//CRUD Create Read Update Delete
const IDBRequest = indexedDB.open("myDB", 1);
console.log(IDBRequest);

//Métodos
IDBRequest.addEventListener("upgradeneeded", () => {
    const db = IDBRequest.result; // Conexión
    console.log("Upgrade needed");
    db.createObjectStore("nombres", {
        autoIncrement: true
    });
});

IDBRequest.addEventListener("success", () => {
    console.log("Success");
    getObj();
});

IDBRequest.addEventListener("error", () => {
    console.log("Error");
});

const getIDBdata = (mode,msg) => {
    const db = IDBRequest.result;
    //Lectura y escritura
    //modos: readonly, readwrite
    const IDBTransaction = db.transaction("nombres", mode);
    const objectStore = IDBTransaction.objectStore("nombres");
    //Ahora la transacción puede hacer CRUD, porque ya tiene acceso al objectStore
    IDBTransaction.addEventListener("complete", () => {
        console.log("Transacción hecha "+msg);
    });
    return objectStore;
}

//Agregar datos
const addObj = (objeto) => {
    const IDBdata = getIDBdata("readwrite","al agregar");
    IDBdata.add(objeto);
};

//Leer datos
const getObj = () => {
    const IDBdata = getIDBdata("readonly","al leer");
    const cursor = IDBdata.openCursor();
    let fragmento = document.createDocumentFragment();
    cursor.addEventListener("success", () => {
        document.querySelector(".names").innerHTML = "";
        if (cursor.result) {
            let key = cursor.result.key;
            let name = cursor.result.value;
            let elemento = createHTML(key,name);
            fragmento.appendChild(elemento);
            console.log(cursor.result.value);
            cursor.result.continue();
        } else {
            console.log("No hay más datos");
            document.querySelector(".names").appendChild(fragmento);
        }
    });
};

//Leer un dato
const getObjByKey = (key) => {
    const IDBdata = getIDBdata("readonly","al leer");
    const cursor = IDBdata.openCursor();
    cursor.addEventListener("success", () => {
        if (cursor.result) {
            if (cursor.result.key === key) {
                console.log(cursor.result.value);
            }
            cursor.result.continue();
        } else {
            console.log("No hay más datos");
        }
    });
};

//Actualizar datos
const updateObj = (key,objeto) => {
    const IDBdata = getIDBdata("readwrite","al actualizar");
    IDBdata.put(objeto,key);
};

//Eliminar datos
const deleteObj = (key) => {
    const IDBdata = getIDBdata("readwrite","al eliminar");
    IDBdata.delete(key);
};

//Uso en HTML
const createHTML = (id,name) => {
    const div = document.createElement("div");
    const h2 = document.createElement("h2");
    const options = document.createElement("div");
    const saveBtn = document.createElement("button");
    const deleteBtn = document.createElement("button");

    h2.textContent = name.nombre;
    h2.setAttribute("contenteditable","true");
    h2.setAttribute("spellcheck","false");

    h2.addEventListener("keyup", () => {
        saveBtn.classList.replace("imposible","posible");
    });

    saveBtn.textContent = "Guardar";
    deleteBtn.textContent = "Eliminar";

    saveBtn.addEventListener("click", () => {
        if (saveBtn.classList.contains("posible")) {
            let newName = h2.textContent;
            updateObj(id,{nombre: newName});
            saveBtn.classList.replace("posible","imposible");
        }
    });

    deleteBtn.addEventListener("click", () => {
        deleteObj(id);
        getObj();
    });

    div.classList.add("name");
    options.classList.add("options");
    saveBtn.classList.add("imposible");
    deleteBtn.classList.add("delete");

    options.appendChild(saveBtn);
    options.appendChild(deleteBtn);

    div.appendChild(h2);
    div.appendChild(options);

    return div;
};

document.getElementById("add").addEventListener("click", () => {
    const name = document.getElementById("name").value;
    if (name.length > 0) {
        if (document.querySelector(".posible") !== null) {
            if (confirm("Hay elementos sin guardar, ¿desea continuar?")) {
                console.log(document.querySelector(".posible"));
                addObj({nombre: name});
                getObj();
                document.getElementById("name").value = "";
            }
        }
        else {
            addObj({nombre: name});
            getObj();
        }
    }
});


