#include "SeresVivos.h"
#include<iostream>
#include<windows.h>

using namespace std;


SeresVivos::SeresVivos()
{
    nombre="-";
    color="-";
    edad=0;

}

SeresVivos::~SeresVivos()
{
    //dtor
}


//Prototipos SET Y GET
void setNombre()
{
    fflush(stdin);
    cout<<"Ingrese el NOMBRE del ser vivo: ";
    getline(cin,nombre);
}
string getNombre()
{
    return nombre;
}
/////////////////////////
void setColor()
{
    fflush(stdin);
    cout<<"Ingrese el COLOR del ser vivo: ";
    getline(cin,nombre);
}
string getColor()
{
    return color;
}
/////////////////////////
void setEdad()
{
    cout<<"Ingrese la EDAD del ser vivo: ";
    cin>>edad;
}
int getEdad()
{
    return edad;
}
////////////////////////////
void comer()
{
    cout<<"El ser vivo se está alimentando..."<<endl;
    Sleep(1000);
    cout<<"El ser vivo ha quedado lleno"<<endl;
}

void dormir()
{
    cout<<"El ser vivo está durmiendo..."<<endl;
    Sleep(1000);
    cout<<"El ser vivo ha descansado lo suficiente"<<endl;
}

