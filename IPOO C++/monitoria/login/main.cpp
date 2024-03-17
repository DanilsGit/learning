#include <iostream>
#include<vector>
#include<Administrador.h>
#include<Gerente.h>
#include"Usuario.h"

#include <iostream>
using namespace std;


vector<Administrador> lista_admin;

int indice=0;

void crearUSERS(){

    Administrador adm;
    adm.setNombreUsuario();
    adm.setContrasena();
    lista_admin.push_back(adm);

}

void login(){

string nombre, contra;

fflush(stdin);
cout<<"Digite el nombre de usuario : ";
getline(cin,nombre);

cout<<"\n\n";

fflush(stdin);
cout<<"Digite el nombre de usuario : ";
getline(cin,contra);

int n=lista_admin.size();

if(n>0){





}else{
cout<<"No hay ningun usuario creado";
}



}

int main()
{
    crearUSERS();
    login();

    return 0;
}
