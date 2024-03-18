#include "Profesionales.h"
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

Profesionales::Profesionales()
{
    profesion = "-";
    tipoUsuario = "Profesional";
}

Profesionales::~Profesionales()
{
    //dtor
}

void Profesionales::setProfesion(){
    fflush(stdin);
    cout<< "Ingrese la profesion : ";
    getline(cin, profesion);
}
string Profesionales::getProfesion(){
    return profesion;
}
void Profesionales::setSalario(){
    salario = 4000000;
}

//Sobrecarga
void Profesionales::setProfesion(string t){
    profesion=t;
}
