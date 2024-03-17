#include<iostream>
#include<cmath>
using namespace std;


int tam;
int *A;


//Funciones
void proceso();
void leerTam();
void variables();
void operacion();
void imprimir(double n, int*a);

//Int main
int main(){
setlocale(LC_ALL,"");
proceso();

}

void proceso(){

    leerTam();
    variables();
    operacion();
}

void leerTam(){

    cout<<"\nIngrese el tamaño del arreglo: ";cin>>tam;
    A=new int[tam];
    for(int i=0;i<tam;i++){
        A[i]=0;
    }

}

void variables(){

    for(int i=0;i<tam;i++){
        cout<<"\nDigite el valor: "<<i+1<<" : "; cin>>A[i];
    }

}

void operacion(){
double suma=0;
double resultado=0;

    for(int i=0;i<tam;i++){
        suma+=pow(A[i], 2);
    }

    resultado=sqrt(suma);

    imprimir(resultado, A);
}

void imprimir(double n, int*a){

    cout<<"\nRAIZ(";
    for(int i=0;i<tam;i++){
        cout<<"+"<<a[i]<<"^2  ";
    }cout<<")";
    cout<<"\n";

    cout<<"\n|"<<"A"<<"|"<<" : "<<n;
    cout<<"\n";

}



