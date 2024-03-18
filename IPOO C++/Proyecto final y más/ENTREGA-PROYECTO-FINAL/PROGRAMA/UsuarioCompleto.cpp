#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

UsuarioCompleto::UsuarioCompleto()
{
    user, password, nombre, apellido, tipoUsuario = "-";
    salario , numID = 0;
    edad = 0;
}

UsuarioCompleto::~UsuarioCompleto()
{
    //dtor
}

// SETS Y GETS de los atributos de CUALQUIER TIPO DE USUARIO.
//SETTERS
void UsuarioCompleto::setNumID(){
    cout<< "Ingrese el numero de identificacion (ID): ";
    cin>> numID;
}
void UsuarioCompleto::setApellido(){
    fflush(stdin);
    cout<<"Ingrese el apellido: ";
    getline(cin, apellido);
}
void UsuarioCompleto::setNombre(){
     fflush(stdin);
    cout<<"Ingrese el Nombre: ";
    getline(cin, nombre);
}
void UsuarioCompleto::setEdad(){
    cout<< "Ingrese la edad: ";
    cin>> edad;
}
void UsuarioCompleto::setTipoUsuario(){
    fflush(stdin);
    cout<<"Ingrese el tipo de usuario: ";
    getline(cin, tipoUsuario);
}
void UsuarioCompleto::setUser(){
    fflush(stdin);
    cout<<"Ingrese el nombre de cuenta: ";
    getline(cin, user);
}
void UsuarioCompleto::setPassword(){
    fflush(stdin);
    cout<<"Ingrese la contraseña: ";
    getline(cin, password);
}
//GETTERS
long UsuarioCompleto::getNumID(){
    return numID;
}
string UsuarioCompleto::getApellido(){
    return apellido;
}
string UsuarioCompleto::getNombre(){
    return nombre;
}
int UsuarioCompleto::getEdad(){
    return edad;
}
string UsuarioCompleto::getTipoUsuario(){
    return tipoUsuario;
}
string UsuarioCompleto::getUser(){
    return user;
}
string UsuarioCompleto::getPassword(){
    return password;
}
//----------------------------------------------------------------
 string UsuarioCompleto::toString(){

     return "Num ID = " + to_string(numID) + "\n" +
            "Nombre y apellido = " + nombre + " " +apellido + "\n" +
            "Tipo de usuario = " + tipoUsuario + "\n" +
            "Edad = " + to_string(edad) + "\n"+
            "Nombre de cuenta = " + user +"\n"+
            "Contraseña = " + password +"\n";
 }

void UsuarioCompleto::setSalario(){
 }
long UsuarioCompleto::getSalario(){
    return salario;
}

//SOBRECARGA

void UsuarioCompleto::setNumID(long n){
    numID=n;
}
void UsuarioCompleto::setApellido(string t){
    apellido=t;
}
void UsuarioCompleto::setNombre(string t){
    nombre=t;
}
void UsuarioCompleto::setEdad(int n){
    edad=n;
}
void UsuarioCompleto::setTipoUsuario(string t){
    tipoUsuario=t;
}
void UsuarioCompleto::setUser(string t){
    user=t;
}
void UsuarioCompleto::setPassword(string t){
    password=t;
}

