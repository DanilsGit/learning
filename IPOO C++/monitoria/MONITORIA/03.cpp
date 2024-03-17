//PUNTO 1 PARCIAL

#include<iostream>
#include<stdlib.h>
#include<ctime>

using namespace std;

int est=0;

int *notas;
int **frecuencia;

void proceso();
void crear();
void limpiar();
void leerRandom();
void imprimir();

int main(){
 proceso();

}

void proceso(){

 crear();
 limpiar();
 leerRandom();
 imprimir();


}


void crear(){

    cout<<"Digite la cantidad de estudiantes : "; cin>>est;

    notas=new int[est];

    frecuencia=new int*[est];
    for(int c=0;c<5;c++){
        frecuencia[c]=new int[5];
    }
}

void limpiar(){

    //Array
    for(int i=0;i<est;i++){
        notas[i]=0;
    }

cout<<"a";
    //Matriz
    for(int f=0;f<est;f++){
        for(int c=0;c<5;c++){
        frecuencia[f][c]=0;
    }
    }

cout<<"a";
}

void leerRandom(){

    srand(time(0));

    for(int i=0;i<est;i++){
            notas[i]=1+rand()%5;
        }
        cout<<"a";
}

void imprimir(){

    cout<<"Notas";
        for(int i=0;i<est;i++){
                cout<<"["<<notas[i]<<"]";
            }


}



