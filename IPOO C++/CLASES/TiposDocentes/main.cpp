#include <iostream>
#include"Docente.h"
#include"DTC.h"
#include"DHC.h"
#include"Monitor.h"
#include"DMT.h"
using namespace std;

//Declaración de funciones
void testDTC(){
    DTC docenteTC;

    docenteTC.setNumID();
    docenteTC.setApellido();
    docenteTC.setNombre();
    docenteTC.setProfesion();
    docenteTC.setCantHorasInv();
    docenteTC.setSalario();
    cout<<endl;
    cout<<docenteTC.toString();
    cout<<docenteTC.getCantHorasInv()<<endl;
}

void testDHC(){
    DHC docenteHC;

    docenteHC.setNumID();
    docenteHC.setApellido();
    docenteHC.setNombre();
    docenteHC.setProfesion();
    docenteHC.setNivelEST();
    docenteHC.setCantHT();
    docenteHC.setSalario();
    cout<<endl;
    cout<<docenteHC.toString()<<"\n";
    cout<<docenteHC.getNivelEST()<<"\n";
    cout<<docenteHC.getCantHT()<<"\n";
}

void testMonitor(){
    Monitor mon;

    mon.setNumID();
    mon.setApellido();
    mon.setNombre();
    mon.setProfesion();
    mon.setCantidadHT();
    mon.setSalario();
    cout<<endl;
    cout<<mon.toString();
    cout<<mon.getCantidadHT()<<"\n";
}

void testDMT(){
    DMT dmt;

    dmt.setNumID();
    dmt.setApellido();
    dmt.setNombre();
    dmt.setProfesion();
    dmt.setCantTrabajos();
    dmt.setSalario();
    cout<<endl;
    cout<<dmt.toString();
    cout<<dmt.getCantTrabajos()<<"\n";
}

int main()
{
    setlocale(LC_ALL,"");

    testDMT();
    cout<<"-------------------\n";
    testMonitor();
    cout<<"-------------------\n";
    return 0;
}
