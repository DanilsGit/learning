#include <iostream>
#include "SeresVivos.h"
#include<vector>

using namespace std;

void menu();
void crearSeresVivos();
void listado();

int main()
{
    menu();
    return 0;
}


vector <SeresVivos> lista_SeresVivos;

void menu(){

int opc;

do{
    cout<<"1.Crear Seres vivos"<<endl;
    cout<<"2.Mostrar lista de seres vivos"<<endl;
    cout<<"0.Salir"<<endl;
    cout<<"Seleccione una opción: "; cin>>opc;
    switch(opc){
case 1: crearSeresVivos(); break;
case 2: listado(); break;
case 0: break;
default : cout<<"Opc incorrecta"<<endl; break;

    }
}while(opc!=0);


}


void crearSeresVivos(){
SeresVivos servivo;

servivo.setNombre();
servivo.setColor();
servivo.setEdad();

lista_SeresVivos.push_back(servivo);

}

void listado()
{

    if(lista_SeresVivos.size() > 0)
    {
        SeresVivos servivo;
        cout<<"LISTA DE SERES VIVOS"<<endl;
        for(int i=0; i<lista_SeresVivos.size(); i++)
        {
            servivo = lista_SeresVivos.at(i);
            cout<<"Nombre: "<<servivo.getNombre()<<endl;
            cout<<"Color: "<<servivo.getColor()<<endl;
            cout<<"Edad: "<<servivo.getEdad()<<endl;
        }
    }
    else
    {
        cout<<"No hay alumnos";
    }

}
