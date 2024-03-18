#include "Paciente.h"
#include "Recepcion.h"
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

Paciente::Paciente()
{
    estado = "-";
    tipoUsuario = "Paciente";
}

Paciente::~Paciente()
{
    //dtor
}

void Paciente::setEstado(){
    int opc;
    cout<< "Ingrese su estado actual: "<<endl<<endl;
    cout<< "1. Cotizante."<<endl;
    cout<< "2. Beneficiario."<<endl;

    do
    {
        cin>>opc;
        cout<<"\n";
        if(opc == 1)
        {
            estado = "Cotizante";
        }else{
        if(opc == 2)
        {
            estado = "Beneficiario";
        }else{
        cout<< "Ingrese un valor válido: ";
        }
        }

    }
    while(opc<1 || opc>2);

}
string Paciente::getEstado(){
    return estado;
}



//sobrecarga
void Paciente::setEstado(string t){
 estado=t;
}
