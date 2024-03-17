#include "automovil.h"
#include<iostream>
using namespace std;

automovil::automovil()
{
    //atributos
    color="";
    placa="";
    referencia="";
    nPuertas=0;
    nLlantas=0;
}

automovil::~automovil()
{
    //dtor
}

void automovil::setColor(string color){
color=color;
}

void automovil::setPlaca(string placa){
placa=placa;
}

void automovil::setReferencia(string referencia){
referencia=referencia;
}

void automovil::setNPuertas(int n){
nPuertas=n;
}

void automovil::setNLlantas(int n){
nLlantas=n;
}
///////////////////////////////////////////////////
string automovil::getColor(){
return color;
}

string automovil::getPlaca(){
return placa;
}

string automovil::getReferencia(){
return referencia;
}

int automovil::getNumeroPuertas(){
return nPuertas;
}

int automovil::getNumeroLlantas(){
return nLlantas;
}
