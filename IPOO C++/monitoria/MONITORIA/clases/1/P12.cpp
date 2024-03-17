#include<iostream>
using namespace std;


char **tabla;
int filas, columnas;

void crearMatriz();
void cruz();
void imprimir();

int main(){
crearMatriz();
cruz();
imprimir();
return 0;
}



void crearMatriz(){


    do{
    cout<<"Digite numeros impares\n";
    cout<<"Digite el numero de filas: "; cin>>filas;
    cout<<"Digite el numero de columnas: "; cin>>columnas;
    }while(filas%2==0 && columnas%2==0);

    tabla=new char*[filas];
    for(int i=0;i<filas;i++){
        tabla[i]=new char[columnas];
    }


    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            tabla[f][c]=' ';
        }
    }

}

void cruz(){

int mitadFila=(filas-1)/2;
int mitadColumna=(columnas-1)/2;


    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            if(f==mitadFila){
                tabla[f][c]='*';
            }
            if(c==mitadColumna){
                tabla[f][c]='*';
            }
        }
    }


}

void imprimir(){

    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            cout<<"|"<<tabla[f][c]<<"|";
        } cout<<endl;
    }

}
