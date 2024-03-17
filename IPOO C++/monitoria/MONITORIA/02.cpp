//EJERCICIO 23

#include<iostream>
#include<stdlib.h>
#include<ctime>

using namespace std;

int filas, columnas;
int tamB;

int *B;
int **A;

void proceso();
void crear();
void limpiar();
void llenarArray();
void llenarMatriz();
void imprimir();


int main(){
 proceso();

}

void proceso(){

 crear();

 limpiar();

 llenarArray();

 llenarMatriz();

 imprimir();



}

void crear(){

    cout<<"Digite la cantidad de filas : "; cin>>filas;
    cout<<"Digite la cantidad de columnas : "; cin>>columnas;

    tamB=filas*columnas;
    B=new int[tamB];

    A=new int*[filas];
    for(int c=0;c<columnas;c++){
        A[c]=new int[columnas];
    }

}

void limpiar(){
    //Array
    for(int i=0;i<tamB;i++){
        B[i]=0;
    }

    //Matriz
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
        A[f][c]=0;
    }
    }

}


void llenarArray(){

    srand(time(0));

    for(int i=0;i<tamB;i++){
        B[i]=1+rand()%100;
    }
}

void llenarMatriz(){
int u=0;
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            A[f][c]=B[u];
            u++;
    }
    }


}


void imprimir(){

    cout<<"\nB";
    for(int i=0;i<tamB;i++){
        cout<<"["<<B[i]<<"]";
    }

    cout<<"\n\n";

    cout<<"A[][] : \n\n";
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            cout<<"|"<<A[f][c]<<"|";
    }   cout<<endl;
    }


}
