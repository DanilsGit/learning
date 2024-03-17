#include<iostream>
#include<cmath>
using namespace std;

int main(){

    int base=0, exponente=0;
    cout<<"Ingrese el valor de la base"<<endl;
    cin>>base;
    cout<<"Ingrese el valor del exponente"<<endl;
    cin>>exponente;

    int resultado;

    resultado= pow(base, exponente);

    cout<<"El resultado de elevar "<<base<<" a la "<<exponente<<" es "<<resultado<<endl;


return 0;
}
