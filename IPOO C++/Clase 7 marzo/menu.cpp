#include<iostream>
#include<cmath>
using namespace std;

void funcion1();
void funcion2();
void funcion3();
void menu();

int main(){
setlocale(LC_ALL,"");
menu();


return 0;
}

void funcion1(){
double numero;
float raiz;

cout<<"ingrese un número: "<<endl;
cin>>numero;
raiz = sqrt(numero);
cout<<"La raiz cuadrada es "<<raiz<<endl;
}

void funcion2(){
double numero, valorabs;

cout<<"Ingrese un numero: "<<endl;
cin>>numero;
valorabs = abs(numero);
cout<<"El valor absoluto es "<<valorabs<<endl;
}


void funcion3(){
    float cA, cB, h;
    cout<<"Ingrese el cateto a: "; cin>>cA;
    cout<<"Ingrese el cateto b: "; cin>>cB;

    h = sqrt((cA*cA)+(cB*cB));

    cout.precision(3);
    cout<<"La hipotenusa del triángulo rectángulo es: "<<h<<endl;



}

void menu(){
int opc;

cout<<"Menu de opciones"<<endl;
cout<<"1. Raiz cuadrada"<<endl;
cout<<"2. Valor absoluto"<<endl;
cout<<"3. Hipotenusa de triangulo rectangulo"<<endl;
cout<<"Seleccione una opción"<<endl;
cin>>opc;

switch(opc){

case 1: funcion1(); break; //Raiz cuadrada
case 2: funcion2(); break; //Valor Absoluto
case 3: funcion3(); break; //Hipotenusa de triangulo rectangulo
case 0: cout<<"Programa finalizado"; break;
default: cout<<"opcion incorrecta"<<endl;

}

}

