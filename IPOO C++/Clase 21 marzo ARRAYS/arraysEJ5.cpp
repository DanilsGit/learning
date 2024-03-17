 #include<iostream>
using namespace std;

//Declaración de variables
int *A;
int *B;
int tam;

//Declaración de funciones
void leer_datos();
void leer_tam();
void copia_de_array();
void imprimirA();
void imprimirB();

//Int main
int main(){

leer_tam();
leer_datos();
copia_de_array();
imprimirA();
imprimirB();


return 0;
}

void leer_tam(){
    cout<<"Ingrese la cantidad de elementos para el Array A[]"<<endl; cin>>tam;
    A=new int[tam];
    B=new int[tam];
}


void leer_datos(){
    cout<<"Ingrese los datos para el arreglo"<<endl;
    for(int i=0; i<tam; i++){
        cout<<"A["<<i<<"] = "; cin>>A[i];
    }
}


void copia_de_array(){

    for(int i=0; i<tam; i++){
        B[i]=A[i];
    }

    cout<<"---Datos copiados del array A[] al B[] correctamente---";
}


void imprimirA(){
    cout<<"\n\n --- Elementos del array A[] ---"<<endl;
    for(int i=0; i<tam; i++){
    cout<<"A["<<i<<"] = "<<A[i]<<"\n";
}}

void imprimirB(){
    cout<<"\n\n--- Elementos del array B[] ---"<<endl;
    for(int i=0; i<tam; i++){
    cout<<"B["<<i<<"] = "<<B[i]<<"\n";
}}

