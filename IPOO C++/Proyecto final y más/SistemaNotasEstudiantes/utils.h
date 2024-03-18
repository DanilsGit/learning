#include<iostream>
using namespace std;

void titulo(string texto){
    int n = texto.length();
    cout<<texto<<endl;
    for(int i = 0; i < n; i++) cout<<"-";
    cout<<endl<<endl;
}

void pausa(){
    system("pause");
    system("cls");
}
