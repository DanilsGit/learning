#include<iostream>
using namespace::std;

#include "Estudiante.h"

Estudiante::Estudiante()
{
    codEstudiantil = codPlan = 0;
    apellido = nombre = "";
    for(int i = 0; i < 4; i++) notas[i] = 0.0;
}

Estudiante::~Estudiante()
{
    //dtor
}

void Estudiante::setCodEstudiantil(){
    cout<<"Ingrese el codigo estudiantil: ";
    cin>>codEstudiantil;
}

void Estudiante::setCodPlan(){
    cout<<"Ingrese el codigo plan: ";
    cin>>codPlan;
}

void Estudiante::setApellido(){
    fflush(stdin);
    cout<<"Ingrese el apellido: ";
    getline(cin, apellido);
}

void Estudiante::setNombre(){
    fflush(stdin);
    cout<<"Ingrese el nombre: ";
    getline(cin, nombre);
}

void Estudiante::setNotas(){
    for(int i = 0; i < 3; i++){
       cout<<"Ingrese el parcial # "<<(i+1)<<": ";
       cin>>notas[i];
    }
}

void Estudiante::setDefinitiva(){
    notas[3] = (notas[0] * 0.3) + (notas[1] * 0.3) + (notas[2] * 0.4);
}

long Estudiante::getCodEstudiantil(){
    return codEstudiantil;
}

long Estudiante::getCodPlan(){
    return codPlan;
}

string Estudiante::getApellido(){
    return apellido;
}

string Estudiante::getNombre(){
    return nombre;
}

double Estudiante::getNota(int indice){
    return notas[indice];
}
