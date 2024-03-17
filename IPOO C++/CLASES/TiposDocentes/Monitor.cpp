#include "Monitor.h"
#include"Docente.h"
#include<iostream>
using namespace std;

Monitor::Monitor()
{
    cantidadHT=0;
}

Monitor::~Monitor()
{
    //dtor
}

//POLIMORFISMO
void Monitor::setSalario()
{
    salario=cantidadHT*5800;
}
//SET
void Monitor::setCantidadHT()
{
    cout<<"Digite la cantidad de horas trabajadas: ";
    cin>>cantidadHT;
}
//GET
int Monitor::getCantidadHT()
{
    return cantidadHT;
}



