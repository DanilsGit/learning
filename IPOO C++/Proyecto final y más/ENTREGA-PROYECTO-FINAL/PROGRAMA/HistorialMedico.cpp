#include "HistorialMedico.h"
#include<iostream>
using namespace::std;

HistorialMedico::HistorialMedico()
{

        alergias="-";

        enfermedades="-";


    cantProcedimientos=0;

}

HistorialMedico::~HistorialMedico()
{
    //dtor
}

void HistorialMedico::setAlergias(){
string tx;
cout<<"Digite la alergia que presenta el paciente: ";
fflush(stdin);
getline(cin, tx);

alergias=tx;
}

void HistorialMedico::setEnfermedades(){

string tx;
cout<<"Digite la enfermedad que presenta el paciente: ";
fflush(stdin);
getline(cin, tx);

    enfermedades=tx;

}

void HistorialMedico::setCantProcedimientos(){
int n;
cout<<"Digite la cantidad de procedimientos que ha tenido el paciente: ";
cin>>n;
n=cantProcedimientos;

}

string HistorialMedico::getAlergias(){
return alergias;
}
string HistorialMedico::getEnfermedades(){
return enfermedades;
}
long HistorialMedico::getCantProcedimientos(){
return cantProcedimientos;
}

string HistorialMedico::infoHistorial(){

return "Enfermedad: " + enfermedades + "\n"
    +   "Alergias: " + alergias + "\n";
}


