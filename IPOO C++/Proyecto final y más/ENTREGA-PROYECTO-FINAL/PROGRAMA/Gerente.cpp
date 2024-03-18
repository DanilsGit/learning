#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;

Gerente::Gerente()
{
    Experiencia = 0;
    nivelEstudios = "-";
    tipoUsuario = "Gerente";


}

Gerente::~Gerente()
{
    //dtor
}

//SETTERS
void Gerente::setExperiencia(){
    cout<< "ingrese la cantidad de años de experiencia: ";
    cin>> Experiencia;
}
void Gerente::setNivelEstudio(){
    string tipos[] = {"Profesional",
        "Especialista", "Maestria", "Doctorado"};
    int opc;

    cout<<"Tipos de Nivel Estudios"<<endl;
    for(int i = 0; i < 4; i++)
        cout<<(i+1)<<". "<<tipos[i]<<endl;
    cout<<"Seleccione Nivel Estudios: ";
    cin>>opc;

    nivelEstudios = tipos[opc-1];
}
//GETTERS
int Gerente::getExperiencia(){
    return Experiencia;
}
string Gerente::getNivelEstudio(){
    return nivelEstudios;

}
void Gerente::setSalario(){

    if(nivelEstudios == "Profesional"){
        salario = (4000000) * (Experiencia * 1.2);
    }
    if(nivelEstudios == "Especialista"){
        salario = (4000000 + (4000000 * 0.4)) * (Experiencia * 1.2);
    }
    if(nivelEstudios == "Maestria"){
        salario = (4000000 + (4000000 * 0.6)) * (Experiencia * 1.2);
    }
    if(nivelEstudios == "Doctorado"){
        salario = (4000000 * 2) * (Experiencia * 1.2);
    }
}


//Sobrecarga

void Gerente::setExperiencia(int n){
    Experiencia=n;
}
void Gerente::setNivelEstudio(string t){
    nivelEstudios=t;
}

