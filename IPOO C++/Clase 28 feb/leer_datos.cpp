#include<iostream>
#include<cmath>
#include<conio.h>
using namespace std;

int main(){

    char tecla;
    string nombre;

    cout<<"Ingrese su nombre: ";
    getline(cin, nombre);

    cout<<"Presione una tecla: ";
    tecla = getche();
    cout<<endl;

cout<<"Hola "<<nombre<<" su letra presionada fue "<<" ' "<<tecla<<" ' "<<endl;


return 0;
}
