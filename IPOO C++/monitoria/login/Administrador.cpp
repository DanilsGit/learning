#include "Administrador.h"
#include <iostream>
using namespace std;

Administrador::Administrador()
{
    nombreUsuario = contrasena="-";
}

Administrador::~Administrador()
{
    //dtor
}

string Administrador::getClase(){
return "Administrador";
}
