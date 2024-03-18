#include "DTC.h"
#include"Docente.h"
#include<iostream>
using namespace std;


DTC::DTC()
{
    cantHorasInv=0;
}

DTC::~DTC()
{
    //dtor
}

//////////////////  Polimorfismo
void DTC::setSalario(){
    salario=2*(1150000);
}

//////////////////////// SET

void DTC::setCantHorasInv(){
cout<<"Cantidad de horas de investigación: "; cin>>cantHorasInv;
}

//////////////////////// GET

int DTC::getCantHorasInv(){
return cantHorasInv;
}
