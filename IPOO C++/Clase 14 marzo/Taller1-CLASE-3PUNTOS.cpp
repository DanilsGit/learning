/*

Daniel Esteban Marquez Upegui 2160028

Juan Esteban Vargas Potes 2160191

*/

#include<iostream>
#include<cmath>
#include<windows.h>

using namespace std;

void menu();
void punto22();
void punto7();
void punto19();

int main(){
    setlocale(LC_ALL,"");
    menu();

return 0;
}


void menu(){
    int opc;

    do{
        cout<<"\n\n----------------------------"<<endl;
        cout<<"1. Punto 22 (2 puntos)"<<endl;
        cout<<"2. Punto 7 (1 punto)"<<endl;
        cout<<"3. Punto 19 (2 puntos)"<<endl;
        cout<<"0. Salir de la aplicación"<<"\n\n";
        cout<<"Seleccione una opcion: ";cin>>opc;


        switch(opc){
            case 1: punto22(); break;
            case 2: punto7(); break;
            case 3: punto19(); break;
            case 0: cout<<"Fin del programa"<<endl; break;
            default: cout<<"Opcion incorrecta";
    }
}while(opc != 0);
}


void punto22(){
    cout<< "\n\nEste programa mostrará las tablas del 1 al 12"<<endl; Sleep(500);
    for(int i=1; i<=12; i++){
        cout<<"----- La tabla del "<<i<<" es: "<<endl;
            for(int u=1; u<=10; u++){
                cout<<i<<" * "<<u<<" = "<<(i*u)<<endl;
            }
            Sleep(500);
    }
}


void punto7(){

    int suma,i, n;
    cout<< "\n\nEste programa sumará un rango de números entre sí"<<endl;
    cout<< "__________________________________________________________"<<endl;
    cout<< "Ingrese el número desde el que desea sumar"<<endl;
    cin>> i;
    cout<< "Ingrese el número hasta el que quiere sumar"<<endl;
    cin>> n;

    for ( i; i <= n; i++){
        suma += i;
    }
    cout<< "El resultado de la suma de estos números es = "<<suma<<endl;
}

void punto19(){
    int lineas;
    cout<< "\n\nEste programa mostrará la cantidad de lineas deseada aumentando consecutivamente los ' * '  "<<endl;
    cout<< "__________________________________________________________"<<endl;
    cout<<"Ingrese la cantidad de lineas deseadas: "; cin>>lineas;

    for(int i=0;i<lineas;i++){
        for(int u=0;u<=i;u++){
            cout<<"*";
            Sleep(100);
        }
        cout<<endl; Sleep(100);
    }
}



