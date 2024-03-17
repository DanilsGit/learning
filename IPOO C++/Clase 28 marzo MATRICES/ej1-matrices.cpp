#include<iostream>
#include <stdio.h>
#include <wchar.h>
#include <locale.h>
#include <stdlib.h>
using namespace std;
//srand(time(NULL)); genera una nueva semilla de numeros aleatorios.   1+rand()%100; numeros de 2 cifras


/*
CALCULAR:
 La suma de los elementos
 El promedio
 Cantidad de números pares
 Cantidad de números impares
 Cantidad de números positivos
 Cantidad de números negativos
 Cantidad de ceros
 Porcentaje de números pares
 Porcentaje de números impares
 Porcentaje de números positivos
 Porcentaje de números negativos
 El mayor valor almacenado
 El menor valor almacenado
*/

//Declarar variables
int**enteros;
int filas;
int columnas;




//Declaracion de fnciones
void creacion_matriz();
void imprimir();
void leer();
void limpiar();
//--Cálculos
void sumatoria();
void promedio();
void cantidad_pares_impares();                       int cuenta_pares=0, cuenta_impares=0;
void cantidad_positivos_negativos_ceros();           int cuenta_positivos=0, cuenta_negativos=0, cuenta_ceros=0;
void porcentaje_pares_impares_positivos_negativos();
void mayor_valor();
void menor_valor();


int main(){
setlocale(LC_ALL, "");

creacion_matriz();
leer();
imprimir();
limpiar();

sumatoria();
promedio();
cantidad_pares_impares();
cantidad_positivos_negativos_ceros();
porcentaje_pares_impares_positivos_negativos();
mayor_valor();
menor_valor();

return 0;
}

void creacion_matriz(){
    cout<<"Ingrese la cantidad de filas: "; cin>>filas;
    cout<<"Ingrese la cantidad de columnas: "; cin>>columnas;

    enteros=new int*[filas];
    for(int i=0; i<filas; i++){
        enteros[i]= new int[columnas];
    }
}

void limpiar(){
system("pause");
system("cls");
}

void leer(){
    cout<<"\n\nLectura de la matriz"<<endl;
    for(int f=0; f<filas;f++){
        for(int c=0;c<columnas;c++){
            cout<<"enteros["<<f<<"]["<<c<<"] = "; cin>>enteros[f][c];
        }
    }
}

void imprimir(){
    cout<<"\n\nVisualización de la matríz"<<endl;

    for(int f=0; f<filas; f++){
        for(int c=0;c<columnas;c++){
            cout<<"enteros["<<f<<"]["<<c<<"] = "<<enteros[f][c]<<" ";
        }
        cout<<endl;
    }
}

void sumatoria(){
    cout<<"-   Cálculos   -\n\n";
    int suma=0;
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            suma+=enteros[f][c];
        }
    }
    cout<<"El resultado de la sumatoria es: "<<suma<<"\n\n";
}

void promedio(){
    int suma=0;
    float promedio=0;
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            suma+=enteros[f][c];
        }
    }
    promedio= (float)suma/(float)(filas*columnas);
    cout<<"El resultado del promedio es: "<<promedio<<"\n\n";
}

void cantidad_pares_impares(){
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            if((enteros[f][c] % 2) == 0){
                cuenta_pares+=1;
            } else {
                cuenta_impares+=1;
            }
        }
    }
    cout<<"La cantidad de pares es: "<<cuenta_pares<<"\n\n";
    cout<<"La cantidad de impares es: "<<cuenta_impares<<"\n\n";
}

void cantidad_positivos_negativos_ceros(){
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            if(enteros[f][c] == 0){
                cuenta_ceros+=1;
            }else{
                if(enteros[f][c] > 0){
                    cuenta_positivos+=1;
                }else{
                    cuenta_negativos+=1;
                }
            }
        }
    }
    cout<<"La cantidad de positivos: "<<cuenta_positivos<<"\n\n";
    cout<<"La cantidad de negativos: : "<<cuenta_negativos<<"\n\n";
    cout<<"La cantidad de ceros: : "<<cuenta_ceros<<"\n\n";
}

void porcentaje_pares_impares_positivos_negativos(){
    cout<<"-    Porcentajes    -\n\n";

    cout<<"El porcentaje de pares es: "<<(cuenta_pares*100)/(filas*columnas)<<"%"<<"\n\n";

    cout<<"El porcentaje de impares es: "<<(cuenta_impares*100)/(filas*columnas)<<"%"<<"\n\n";

    cout<<"El porcentaje de positivos es: "<<(cuenta_positivos*100)/(filas*columnas)<<"%"<<"\n\n";

    cout<<"El porcentaje de negativos es: "<<(cuenta_negativos*100)/(filas*columnas)<<"%"<<"\n\n";

    cout<<"El porcentaje de ceros es: "<<(cuenta_ceros*100)/(filas*columnas)<<"%"<<"\n\n";
}

void mayor_valor(){
    cout<<"-   Valores mayores y menores   -\n\n";
    int n_mayor=0;
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            if(n_mayor < enteros[f][c]){
                n_mayor=enteros[f][c];
            }
        }
    }
    cout<<"El número mayor es : "<<n_mayor<<"\n\n";
}

void menor_valor(){

    int n_menor=0;
    for(int f=0;f<filas;f++){
        for(int c=0;c<columnas;c++){
            if(enteros[f][c] < n_menor){
                n_menor=enteros[f][c];
            }
        }
    }
    cout<<"El número menor es : "<<n_menor<<"\n\n";
}
