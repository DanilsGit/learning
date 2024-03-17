#include "Cuadrado.h"
#include <iostream>

using namespace std;


Cuadrado::Cuadrado()
{
    base = altura =0;
}

Cuadrado::~Cuadrado()
{
    //dtor
}


//Polimorfismo
double Cuadrado::CalcArea()
{
    area=base*altura;
    return area;
}

//Set
void Cuadrado::setBase()
{
    cout<<"Digite la base : ";
    cin>>base;
}
void Cuadrado::setAltura()
{
    cout<<"Digite la altura : ";
    cin>>altura;
}

//Get
long Cuadrado::getBase()
{
    return base;
}
long Cuadrado::getAltura()
{
    return altura;
}



