//Programa para conocer si aprob� la asignatura, reprob� y en dicho caso si puede habilitar

#include<iostream>
#include<cmath>
using namespace std;


    double parcial1, parcial2, final, definitiva;
    int aprueban = 0, habilitan = 0, reprueban = 0;

    //Declaraci�n de los prototipos de funciones

    void leer_notas();
    void calcular_def();
    void salida();

    //Implementaci�n de funciones

    void leer_notas(){
    cout<<"Ingrese la nota del parcial 1: ";
    cin>>parcial1;

    cout<<"Ingrese la nota del parcial 2: ";
    cin>>parcial2;

    cout<<"Ingrese la nota del trabajo final: ";
    cin>>final;

    }
    ////////////////////////////////////////////////

    void calcular_def(){

    definitiva=(parcial1*0.3)+(parcial2*0.3)+(final*0.4);
    }
    ////////////////////////////////////////////////
    void salida(){

    cout<<"La nota definitiva es: "<<definitiva<<endl;

    if(definitiva >= 2.95){
        cout<<"Aprob�"<<endl;
        aprueban++;
    }else{
        if(definitiva>=1.95){
        cout<<"Habilita"<<endl;
        habilitan++;
    }else{
        if(definitiva<1.95){
        cout<<"Reprob�"<<endl;
        reprueban++;
        }
    }
    }
    }
    //////////////////////////////////////////////


int main(){
    leer_notas();
    calcular_def();
    salida();
    return 0;
}
