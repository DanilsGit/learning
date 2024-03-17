#include<iostream>
#include<cmath>
#include<conio.h>
using namespace std;

int main(){

    int base=0, exponente=0;
    double potencia = 1;


    cout<<"Ingrese la base: ";
    cin>>base;
    cout<<"Ingrese el exponente: ";
    cin>>exponente;
    potencia = pow(base, exponente);
    cout<<endl;

    cout<<base<<" elevado a la "<<exponente<<" es igual a "<<potencia<<"\n";

return 0;
}
