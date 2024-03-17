#include "DHC.h"
#include<iostream>
#include"Docente.h"
using namespace std;

DHC::DHC()
{
    cantHT=0;
    nivelEST="-";
}

DHC::~DHC()
{
    //dtor
}

//////////////////////// POLIMORFISMO
void DHC::setSalario()
{
    if(nivelEST=="Profesional"){
        salario=cantHT*38000;
    }
    if(nivelEST=="Especializacion"){
        salario=cantHT*42000;
    }
    if(nivelEST=="Maestria"){
        salario=cantHT*50000;
    }
}
//////////////////////// SET
void DHC::setCantHT()
{
    cout<<"Ingrese la cantidad de horas trabajadas: ";
    cin>>cantHT;
}
void DHC::setNivelEST(){
fflush(stdin);
int opc;
cout<<"Seleccione nivel de estudios"<<endl;
cout<<"1. Profesional\n";
cout<<"2. Especialización\n";
cout<<"3. Maestria\n";
do{
    cin>>opc;

    if(opc<1 || opc>3){
        cout<<"Digite una opción correcta (1,2,3) : ";
    }

}while(opc<1 || opc>3);

switch(opc){
case 1: nivelEST = "Profesional";
case 2: nivelEST = "Especializacion";
case 3: nivelEST = "Maestria";
}

}
//////////////////////// GET
int DHC::getCantHT(){
return cantHT;
}
string DHC::getNivelEST(){
return nivelEST;
}
