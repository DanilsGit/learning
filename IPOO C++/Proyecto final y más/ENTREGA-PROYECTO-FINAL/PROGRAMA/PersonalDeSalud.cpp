#include "PersonalDeSalud.h"
#include "Profesionales.h"
#include "Gerente.h"
#include "Paciente.h"
#include "Recepcion.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

PersonalDeSalud::PersonalDeSalud()
{
    horas = 0;
     tipoUsuario = "Personal de salud";
}

PersonalDeSalud::~PersonalDeSalud()
{
    //dtor
}


void PersonalDeSalud::setHoras(){
    cout<< "Ingrese la cantidad de horas trbajadas: ";
    cin>>horas;
}
int PersonalDeSalud::getHoras(){
    return horas;
}
void PersonalDeSalud::setSalario(){

    salario = 22000 * horas;
}

//Sobrecarga

void PersonalDeSalud::setHoras(int n){
    horas=n;
}
