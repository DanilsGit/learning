#include<iostream>
using namespace std;

//Variables
int x;
int tam;
int *array;
//Funciones
long frecuencia(int *a, int x);
void proceso();
void leer();
void limpiar();


int main(){
setlocale(LC_ALL, "");
proceso();
return 0;
}

void proceso(){
long cuenta;

    cout<<"Ingrese el tamaño del array: ";cin>>tam;
    array= new int[tam];

    limpiar();

    leer();

    cout<<"\n";

    cout<<"Ingrese el término a buscar: ";cin>>x;

    cuenta=frecuencia(array, x);

    cout<<"El número "<<x<<" se repite "<<cuenta<<" veces\n\n";

}

void limpiar(){

    for(int i=0;i<tam;i++){
            array[i]=0;
        }

}

void leer(){

    cout<<"\nIngrese los datos en el array: ";
    cout<<"\n";
    for(int i=0;i<tam;i++){
        cout<<"Array["<<i<<"] : ";
        cin>>array[i];
    }

}

long frecuencia(int *a, int x){
long cuenta=0;

    for(int i=0;i<tam;i++){
        if(a[i]==x) cuenta++;
    }

return cuenta;
}
