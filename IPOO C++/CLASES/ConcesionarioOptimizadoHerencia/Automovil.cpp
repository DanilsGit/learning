#include "Automovil.h"
#include<iostream>
using namespace std;


Automovil::Automovil() //Valores default
{
    setDatos("-", "-", 0.0, 0, false);
}

Automovil::~Automovil()
{
    //dtor
}

////////////////////////// SET
void Automovil::setMarca(){
    fflush(stdin);
    cout<<"Digite la marca: "; getline(cin, marca);
}
void Automovil::setModelo(){
    fflush(stdin);
    cout<<"Digite el modelo: "; getline(cin, modelo);
}
void Automovil::setCilindraje(){
    cout<<"Digite el cilindraje: "; cin>>cilindraje;
}
void Automovil::setCant_bocinas(){
    cout<<"Digite la cantidad de bocinas: "; cin>>cant_bocinas;
}
void Automovil::setTipo_direccion(){
    int n;
    cout<<"Digite el tipo de dirección: ";
    cout<<"[1: electrica]"<<"\n"<<"[2: hidraulica]";
    do{
        cin>>n;
        if(n!=1 && n!=2){
            cout<<"Digite un número válido";
        }
    }while(n==1 || n==2);

    if(n==1){
        tipo_direccion=false;
    }else{
    tipo_direccion=true;
    }
}
////////////////////////// GET
string Automovil::getMarca(){
return marca;
}
string Automovil::getModelo(){
return modelo;
}
double Automovil::getCilindraje(){
return cilindraje;
}
int Automovil::getCant_bocinas(){
return cant_bocinas;
}
bool Automovil::getTipo_direccion(){
return tipo_direccion;
}

//CONSTRUCTORES

Automovil::Automovil(string marc, string model)  //Marca y modelo - basica
{
    setDatos(marc,model,1.3,0,false);
}
Automovil::Automovil(string marc, string model, int cBocinas) //Marca, modelo, cantidad de bocinas - intermedia
{
    setDatos(marc,model,1.5,cBocinas,false);
}
Automovil::Automovil(string marc, string model, int cBocinas, bool Tdireccion) //Marca, modelo, cantidad de bocinas, tipo de dirección - FULL
{
    setDatos(marc,model,1.8,cBocinas,Tdireccion);
}

void Automovil::setDatos(string marc, string model, double cilin, int cBocinas, bool tDireccion)
{
    marca=marc;
    modelo=model;
    cilindraje=cilin;
    cant_bocinas=cBocinas;
    tipo_direccion=tDireccion;
}

//FUNCIONES ADICIONALES



