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
    cout<<"Ingrese los datos para el array A[]"<<endl;
    for(int i=0; i<tam; i++){
        cout<<"A["<<i<<"] = "; cin>>A[i];
    }
}


void copia_de_array(){


    for(int i=(tam-1); i>=0; i--){
        B[(tam-i-1)]=A[i];
    }

    cout<<"---Datos copiados del array A[] al B[] de forma inversa correctamente---";
/*

si el array es de tamaño 5 hace un for que comienza deste el i=tamaño_array-1 hasta 0 contando este.


i=4. B[5-4-1] = A[4]   -> B[0] = A[9]
i=3. B[5-3-1] = A[3]   -> B[1] = A[8]
i=2. B[5-2-1] = A[2]   -> B[2] = A[7]
i=1. B[5-1-1] = A[1]   -> B[3] = A[6]
i=0. B[5-0-1] = A[0]   -> B[4] = A[5]


*/






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


