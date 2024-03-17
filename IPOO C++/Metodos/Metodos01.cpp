#include<iostream>
using namespace std;

//Variables
int tam;

//Funciones
void proceso();
void leerTam();
void leerArreglo(int*,string);
void imprimir(string,int*,string,int*);
bool igualdad(int*,int*);

int main(){
proceso();
return 0;
}

void proceso(){

int *array1, *array2;
bool resp;

leerTam();
array1=new int[tam];
array2=new int[tam];

cout<<"\nLeer array A[]"<<endl;
leerArreglo(array1,"A");
cout<<"\nLeer array B[]"<<endl;
leerArreglo(array2,"B");

cout<<"\n";
imprimir("A",array1,"B",array2);

cout<<"\n";
resp = igualdad(array1,array2);

if(resp){
    cout<<"Los arreglos son iguales!";
}else{
    cout<<"Los arreglos son diferentes!";
}

cout<<"\n\n";

}

void leerTam(){

    cout<<"Digite el tamaño del array 1 y 2: ";cin>>tam;

}

void leerArreglo(int *datos,string nom_arreglo){

    for(int i=0; i<tam;i++){
        cout<<"Digite un valor para "<<nom_arreglo<<"["<<i<<"] : ";cin>>datos[i];
    }

}


void imprimir(string nomA,int *A,string nomB,int *B){

    cout<<nomA;
    for(int i=0;i<tam;i++){
        cout<<"["<<A[i]<<"]";
    }

    cout<<endl;

    cout<<nomB;
    for(int i=0;i<tam;i++){
        cout<<"["<<B[i]<<"]";
    }

}


bool igualdad(int *A, int*B){

bool iguales=true;

    for(int i=0;i<tam;i++){
        if(A[i]!=B[i]){
        iguales=false;
        break;
        }
    }


return iguales;
}




