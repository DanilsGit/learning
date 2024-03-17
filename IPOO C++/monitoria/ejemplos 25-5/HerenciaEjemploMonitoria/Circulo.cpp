#include "Circulo.h"
#include <iostream>
#include <math.h>

using namespace std;

Circulo::Circulo()
{
    //ctor
    radio=0;
}

Circulo::~Circulo()
{
    //dtor
}

double Circulo::CalcArea()
{

    return (M_PI)*radio*radio;
}

//Set
void Circulo::setRadio(){
cout<<"Digite el radio: "; cin>>radio;
}

//Get
double Circulo::getRadio(){
return radio;
}

