#include<iostream>
using namespace std;

int**enteros;
int filas;
int columnas;

void creacion_matriz();
void imprimir();
void leer();


int main(){

creacion_matriz();
leer();
imprimir();
return 0;
}
//srand(time(NULL)); genera una nueva semilla de numeros aleatorios.   1+rand()%100; numeros de 2 cifras



void creacion_matriz(){
    cout<<"Ingrese la cantidad de filas: "; cin>>filas;
    cout<<"Ingrese la cantidad de columnas: "; cin>>columnas;

    enteros=new int*[filas];
    for(int i=0; i<filas; i++){
        enteros[i]= new int[columnas];
    }
}

void leer(){
    cout<<"Lectura de la matriz"<<endl;
    for(int f=0; f<filas;f++){
        for(int c=0;c<columnas;c++){
            cout<<"enteros["<<f<<"]["<<c<<"] = "; cin>>enteros[f][c];
        }
    }
}

void imprimir(){
    cout<<"Visualización de la matríz"<<endl;

    for(int f=0; f<filas; f++){
        for(int c=0;c<columnas;c++){
            cout<<"enteros["<<f<<"]["<<c<<"] = "<<enteros[f][c]<<" ";
        }
        cout<<endl;
    }
}
