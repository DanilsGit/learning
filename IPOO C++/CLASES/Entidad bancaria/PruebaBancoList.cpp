#include<iostream>
using namespace::std;
#include <list>
#include"ClienteBanco.h"

list<ClienteBanco> lista;

int main(){

    ClienteBanco tmp;

    for(int i = 0; i < 3; i++){
        cout<<"Datos del estudiante "<<(i+1)<<endl;
        tmp.setNumID();
        tmp.setApellido();
        tmp.setNombre();
        tmp.setNumCuenta();
        lista.push_back(tmp);
        cout<<endl;
    }

    list <ClienteBanco> :: iterator it;
    for(it = lista.begin(); it != lista.end(); ++it){
        tmp = *it;
        cout <<tmp.getNumID()<<" "<<tmp.getApellido()<<" "<<
               tmp.getNombre()<<" "<<tmp.getNumCuenta()<<endl<<endl;
    }
}
