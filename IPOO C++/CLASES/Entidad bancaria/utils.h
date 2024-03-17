#include<iostream>
using namespace::std;

void pausa(){
    system("pause");
    system("cls");
}

void titulo(string texto){
    int longitud = texto.length();
    cout<<texto<<endl;
    for(int i = 0; i < longitud; i++) cout<<"-";
    cout<<endl<<endl;
}
