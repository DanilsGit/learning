 #include<iostream>
using namespace std;

//Declaración de variables
int *array;
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
    cout<<"Ingrese la cantidad de elementos para el Array"<<endl; cin>>tam;
    array=new int[tam];
}


void leer_datos(){
    int n=2;
    for(int i=0;i<tam;i++){
        if((i%2)==0){
            array[i]=n*-1;
        }else{
            array[i]=n;
        }
        n+=2;
    }
        cout<<"Ingreso de datos al arreglo realizado exitosamente"<<endl<<endl;
}


void imprimir(){
    cout<<"Elementos del array[]"<<endl;
    for(int i=0; i<tam; i++){
    cout<<"array["<<i<<"] = "<<array[i]<<"\n";
}}




