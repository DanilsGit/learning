#include "Procedimientos.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

Procedimientos::Procedimientos()
{
     fecha, hora, tipoProce = "-";
     autorizado = false;
}

Procedimientos::~Procedimientos()
{
    //dtor
}


void Procedimientos::setTipoProce(){
    fflush(stdin);
    cout<<"Ingrese el tipo de procedimiento a realizar :";
    getline(cin,tipoProce);
}
void Procedimientos::setAutorizado(){
        int opc;
    cout<< "Seleccione una opcion"<<endl;
    cout<< "---------------------"<<endl;
    cout<< "1. Autorizar procedimiento"<<endl;
    cout<< "2. No autorizar procedimiento"<<endl;
    cin>>opc;

    if(opc == 1){
        autorizado == true;
    } if(opc == 2){
        autorizado == false;
    }
}
void Procedimientos::setFecha(){
    fflush(stdin);
    cout<< "Ingrese la fecha de la cita: ";
    getline (cin, fecha);
}
void Procedimientos::setHora(){
   fflush(stdin);
    cout<< "Ingrese la hora de la cita: ";
    getline (cin, hora); }


string Procedimientos::getTipoProce(){
    return tipoProce;
}
bool Procedimientos::getAutorizado(){
    return autorizado;
}
string Procedimientos::getFecha(){
    return fecha;
}
string Procedimientos::getHora(){
    return hora;
}
string Procedimientos::informa(){
    return "Paciente = " + nombre + " " + apellido + "\n"+
           "Numero de ID = " + to_string(numID) + "\n"+
           "Edad = " + to_string(edad) + "\n"+
           "Tipo de procedimiento = " + tipoProce + "\n";
}


void Procedimientos::setAutorizado(bool n){
    autorizado = n;
}
void Procedimientos::setTipoProce(string a){
    tipoProce = a;
}
void Procedimientos::setFecha(string a){
fecha = a;
}
void Procedimientos::setHora(string b){
hora = b;
}
