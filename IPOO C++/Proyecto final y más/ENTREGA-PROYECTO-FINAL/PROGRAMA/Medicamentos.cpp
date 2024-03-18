#include "Medicamentos.h"
#include<iostream>
#include "UsuarioCompleto.h"
using namespace::std;
Medicamentos::Medicamentos()
{
    nombreMedica = "-";
    cant = 0;
}

Medicamentos::~Medicamentos()
{
    //dtor
}

void Medicamentos::setNombreMedica() {
     fflush(stdin);
    cout<< "Ingrese el nombre del medicamento: ";
    getline (cin, nombreMedica);
}
void Medicamentos::setCant() {
    cout<<"Ingrese la cantidad del medicamento: ";
    cin>> cant;
}
void Medicamentos::setAutorizado(){
   int opc;
    cout<< "Seleccione una opcion"<<endl;
    cout<< "---------------------"<<endl;
    cout<< "1. Autorizar medicamento"<<endl;
    cout<< "2. No autorizar medicamento"<<endl;
    cin>>opc;

    if(opc == 1){
        autorizado == true;
    } if(opc == 2){
        autorizado == false;
    }
}

string Medicamentos::getNombreMedica() {
return nombreMedica;
}
int Medicamentos::getCant() {
return cant;
}
bool Medicamentos::getAutorizado(){
    return autorizado;
}

string Medicamentos::info() {
    return "Paciente = " + nombre + " " + apellido + "\n"+
           "Numero de ID = " + to_string(numID) + "\n"+
           "Edad = " + to_string(edad) + "\n"+
           "Medicamento = " + nombreMedica + "\n"+
           "Cantidad del medicamento = " + to_string(cant) + "\n\n";
}

void Medicamentos::setNombreMedica(string n){
    nombreMedica = n;
}
void Medicamentos::setCant(int a){
    cant = a;
}
void Medicamentos::setAutorizado(bool a){
    autorizado = a;
}
