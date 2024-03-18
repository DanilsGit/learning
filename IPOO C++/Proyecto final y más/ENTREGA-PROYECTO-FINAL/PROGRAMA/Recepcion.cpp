#include "Recepcion.h"
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

Recepcion::Recepcion()
{
    horasTrabajo = 0;
     tipoUsuario = "Recepcionista";
}

Recepcion::~Recepcion()
{
    //dtor
}
void Recepcion::setHorasTrabajo(){
    cout<< "ingrese la cantidad de horas trbajadas: ";
    cin>>horasTrabajo;
}
void Recepcion::setSalario(){
    salario = 15000 * horasTrabajo;
}
int Recepcion::getHorasTrabajo(){
    return horasTrabajo;
}

// sobrecarga

void Recepcion::setHorasTrabajo(int n){
    horasTrabajo=n;
}
