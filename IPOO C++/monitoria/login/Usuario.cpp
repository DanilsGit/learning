#include "Usuario.h"

Usuario::Usuario()
{
    nombreUsuario = contrasena = "-";
}

Usuario::~Usuario()
{
    //dtor
}


void Usuario::setNombreUsuario()
{
    cout<<"Digite el nombre de usuario a asignar : ";
    getline(cin,nombreUsuario);
}

void Usuario::setContrasena(){
    cout<<"Digite la contrasena a asignar : ";
    getline(cin,contrasena);
}


string Usuario::getNombreUsuario(){
return nombreUsuario;
}
string Usuario::getContrasena(){
return contrasena;
}
