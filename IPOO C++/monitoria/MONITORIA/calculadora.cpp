#include<iostream>
#include<windows.h>
using namespace std;

/*

N factorial con recursión

*/

double sumar(double n1, double n2);
double restar(double n1, double n2);
double multiplicar(double n1, double n2);
double dividir(double n1, double n2);
void menu();

int main(){
setlocale(LC_ALL,"");
menu();


}



double sumar(double n1, double n2){

return n1+n2;
}

double restar(double n1, double n2){

return n1-n2;
}

double multiplicar(double n1, double n2){

return n1*n2;
}

double dividir(double n1, double n2){

return n1/n2;
}

void menu(){
int opc;
int n1;
int n2;

    do{
        cout<<"INTRODUZCA EL PRIMER NÚMERO: "<<endl; cin>>n1;
        cout<<"INTRODUZCA EL SEGUNDO NÚMERO: "<<endl; cin>>n2;

        cout<<"\n--- CALCULADORA ---\n";
        cout<<"1. SUMA"<<endl;
        cout<<"2. RESTA"<<endl;
        cout<<"3. MULTIPLICACIÓN"<<endl;
        cout<<"4. DIVISIÓN"<<endl;
        cout<<"0. SALIR DE LA APP"<<endl;
        cout<<"-------------------"<<endl;

        cout<<"Seleccione una opción: "<<endl; cin>>opc;

        switch(opc){
            case 1: cout<<"El resultado de la suma es: "<<sumar(n1, n2);break;
            case 2: cout<<"El resultado de la resta es: "<<restar(n1, n2);break;
            case 3: cout<<"El resultado de la multiplicación es: "<<multiplicar(n1, n2);break;
            case 4: cout<<"El resultado de la división es: "<<dividir(n1, n2);break;
            case 0: break;
            default: cout<<"Opción incorrecta"<<endl;break;

        }
    cout<<endl;
    system("pause");
    system("cls");

    }while(opc!=0);


}



