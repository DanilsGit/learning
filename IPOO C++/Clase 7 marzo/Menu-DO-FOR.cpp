#include<iostream>
#include<cmath>
#include<conio.h>
#include<windows.h>
using namespace std;

void menu();
void validar();
void factorial();
void histograma();
void serie_decremento();
void cuadrado();

void validar(){
    int numero;
    cout<<"\n\n-----------Validar un numero-----------"<<endl;
    do{
        cout<<"ingrese un numero entre 18 y 25: ";
        cin>>numero;
        if(numero<18 || numero > 25){
            cout<<"Numero fuera de rango. Pruebe nuevamente"<<endl;
        }

    //Si es verdadera la expreción se repite el do, si es falsa el ciclo se rompe y ejecuta el while
    }while(numero<18 || numero > 25);{
    cout<<"Numero correcto"<<endl<<endl;

    }
}

void factorial(){
    double n, fact;

    cout<<"\n\n-----------Factorial de un número-----------"<<endl;
    cout<<"Ingrese el número: ";cin>>n;

        if(n == 0 || n == 1){
            cout<<"El factorial de "<<n<<" es 1"<<endl;
        }else{
            for(int i = 1; i<=n; i++){
                fact*=i; //fact = fact * 1;
            }
            cout<<"El factorial de "<<n<<" es "<<fact<<endl;
        }

}

void histograma(){
    int numero;
    cout<<"\n\n-----------Histograma-----------"<<endl;
    do{
        cout<<"Ingrese un número mayor que 0: ";cin>>numero;
        if(numero<=0){
            cout<<"Número incorrecto"<<endl;
        }
    }while(numero<=0);

    int a=0;
    while(a<numero){
        cout<<"{}";
        a++;
    }

}

void serie_decremento(){
    int valor_mayor;
    cout<<"\n\n-----------Valor en decremento-----------"<<endl;
    cout<<"Ingrese el valor mayor: ";cin>>valor_mayor;
    /* i tendrá el valor de valor_mayor ; Mientras que i sea mayor que 0 funciona ; i disminuirá 1 cada ronda ; */
    for(int i = valor_mayor; i > 0; i--){
        cout<<i<<endl;
        Sleep(1000);
    }


}

void menu(){
    int opc;

    do{
        cout<<"\n\n----------------------------"<<endl;
        cout<<"1. Validar un numero"<<endl;
        cout<<"2. Factorial"<<endl;
        cout<<"3. Histograma"<<endl;
        cout<<"4. Serie en decremento"<<endl;
        cout<<"5. Cuadrado"<<endl;
        cout<<"0. Salir de la aplicación"<<"\n\n";
        cout<<"Seleccione una opcion: ";cin>>opc;


        switch(opc){
            case 1: validar(); break;
            case 2: factorial(); break;
            case 3: histograma(); break;
            case 4: serie_decremento(); break;
            case 5: cuadrado(); break;
            case 0: cout<<"Fin del programa"<<endl; break;
            default: cout<<"Opcion incorrecta";
    }
}while(opc != 0);
}

void cuadrado(){
    int lado;
    cout<<"Ingrese el valor del lado: ";cin>>lado;

    for(int fila= 1; fila<= lado; fila++){
        for(int columna=1; columna<=lado; columna++){
            cout<<"*";
            Sleep(100);
        } cout<<endl;
    }

}

int main(){
    setlocale(LC_ALL,"");
    menu();

return 0;
}





