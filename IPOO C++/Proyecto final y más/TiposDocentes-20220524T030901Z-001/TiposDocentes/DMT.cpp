#include "DMT.h"
#include"DTC.h"
#include<iostream>
using namespace std;

DMT::DMT()
{
    CantTrabajos=0;
}

DMT::~DMT()
{
    //dtor
}

void DMT::setSalario()
{
    DTC dtc;

    dtc.setSalario();
    salario=((dtc.getSalario())/2);
}


//SET
void DMT::setCantTrabajos(){
    cout<<"Digite la cantidad de trabajos de grado: "; cin>>CantTrabajos;
}

//GET
int DMT::getCantTrabajos(){
return CantTrabajos;
}


