#include "Docente.h"
#include<iostream>
#include<string>
using namespace std;

Docente::Docente()
{
    numID=0;
    apellido = nombre = profesion = "-";
    salario=0.0;
}

Docente::~Docente()
{
    //dtor
}

//////////////////////// SET
void Docente::setNumID()
{
    cout<<"Ingrese el ID: ";
    cin>>numID;
}
void Docente::setApellido()
{
    fflush(stdin);
    cout<<"Ingrese el apellido: ";
    getline(cin,apellido);
}
void Docente::setNombre()
{
    fflush(stdin);
    cout<<"Ingrese el nombre: ";
    getline(cin,nombre);
}
void Docente::setProfesion()
{
    fflush(stdin);
    cout<<"Ingrese la profesion: ";
    getline(cin,profesion);
}

void Docente::setSalario()
{

} //Función para las clases hijas.


//////////////////////// GET
long Docente::getNumID(){
return numID;
}
string Docente::getApellido(){
return apellido;
}
string Docente::getNombre(){
return nombre;
}
string Docente::getProfesion(){
return profesion;
}
double Docente::getSalario(){
return salario;
}

string Docente::toString(){
return "Num ID = " + to_string(numID) + "\n"
    +   "Nombre = " + nombre + " " + apellido + "\n"
    +   "Profesion = " + profesion + "\n"
    +   "Salario a pagar = " + to_string(salario) + "\n";
}
