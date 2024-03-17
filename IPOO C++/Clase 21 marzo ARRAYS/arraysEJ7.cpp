 #include<iostream>
using namespace std;

//Declaración de variables
int *A;
int tam;

//Declaración de funciones
void leer_datos();
void leer_tam();
void imprimir();

//Int main
int main(){

leer_tam();
leer_datos();
imprimir();


return 0;
}

void leer_tam(){
    cout<<"Ingrese la cantidad de elementos para el Array A[]"<<endl; cin>>tam;
    A=new int[tam];
}


void leer_datos(){
    cout<<"Ingrese los datos para el array A[]"<<endl;
    for(int i=0; i<tam; i++){
        cout<<"A["<<i<<"] = "; cin>>A[i];
    }
}


void imprimir(){
    cout<<"\n\n --- Elementos del array A[] ---"<<endl;
    for(int i=0; i<tam; i++){
    cout<<"A["<<i<<"] = "<<A[i]<<"\n";
}}
