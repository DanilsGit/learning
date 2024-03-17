#include "alumnos.h"
#include<iostream>
using namespace std;



alumnos::alumnos()
{
    cedula="";
    nombre="";
    n1=0;
    n2=0;
    n3=0;
}

alumnos::~alumnos()
{
    //dtor
}

void alumnos::setCedula()
{
    fflush(stdin);
    cout<<"Ingrese la cédula del alumno : ";
    getline(cin,cedula);
}
void alumnos::setCedula(string tx)
{
    cedula=tx;
}
string alumnos::getCedula()
{
    return cedula;
}
//
void alumnos::setNombre()
{
    fflush(stdin);
    cout<<"Ingrese el nombre del alumno : ";
    getline(cin,nombre);
}
void alumnos::setNombre(string tx)
{
    nombre=tx;
}
string alumnos::getNombre()
{
    return nombre;
}
//
void alumnos::setNota1()
{
    cout<<"Ingrese la nota 1 del alumno : ";
    cin>>n1;
}
void alumnos::setNota1(float n)
{
    n1=n;
}
float alumnos::getNota1()
{
    return n1;
}
//
void alumnos::setNota2()
{
    cout<<"Ingrese la nota 2 del alumno : ";
    cin>>n2;
}
void alumnos::setNota2(float n)
{
    n2=n;
}
float alumnos::getNota2()
{
    return n2;
}
//
void alumnos::setNota3()
{
    cout<<"Ingrese la nota 3 del alumno : ";
    cin>>n3;
}
void alumnos::setNota3(float n)
{
    n3=n;
}
float alumnos::getNota3()
{
    return n3;
}
