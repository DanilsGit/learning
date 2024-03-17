#include<iostream>
using namespace::std;
#include <array>
#include"ClienteBanco.h"

array<ClienteBanco, 3> vec;

int main(){

    ClienteBanco tmp;

    for(int i = 0; i < vec.size(); i++){
        cout<<"Datos del estudiante "<<(i+1)<<endl;
        tmp.setNumID();
        tmp.setApellido();
        tmp.setNombre();
        tmp.setNumCuenta();
        vec[i] = tmp;
        cout<<endl;
    }

    for(int i = 0; i < vec.size(); i++){
        cout<<"Datos del estudiante "<<(i+1)<<endl;
        tmp = vec[i];
        cout <<tmp.getNumID()<<" "<<tmp.getApellido()<<" "<<
               tmp.getNombre()<<" "<<tmp.getNumCuenta()<<endl<<endl;
    }
}
