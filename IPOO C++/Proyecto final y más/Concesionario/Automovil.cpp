#include <iostream>
#include "Automovil.h"

using namespace std;


Automovil::Automovil() // No construye ningún tipo de vehículo en particular
{
    //ctor
    setDatos("-", "-", 0, 0.0, false);
}

Automovil::~Automovil()
{
    //dtor
}

/// Sobrecarga de constructores
// Basica
Automovil::Automovil(string _marca, string _modelo)
{
    setDatos(_marca, _modelo, 0, 1.3, false);
}

// Intermedia
Automovil::Automovil(string _marca, string _modelo, int _cantBocinas)
{
    setDatos(_marca, _modelo, _cantBocinas, 1.5, false);
}

// Full
Automovil::Automovil(string _marca, string _modelo, int _cantBocinas, bool _tipoDir)
{
    setDatos(_marca, _modelo, _cantBocinas, 1.8, _tipoDir);
}

// Setters
void Automovil::setMarca()
{
    fflush(stdin);
    cout << "Ingrese la marca: ";
    getline(cin, marca);
}

void Automovil::setModelo()
{
    fflush(stdin);
    cout << "Ingrese el modelo: ";
    getline(cin, modelo);
}

void Automovil::setCilindraje()
{
    cout << "Ingrese el cilindraje: ";
    cin >> cilindraje;
}

void Automovil::setCantBocinas()
{
    cout << "Ingrese la cantidad de bocinas: ";
    cin >> cilindraje;
}

void Automovil::setTipoDir()
{
    cout << "Ingrese tipo de dirección [0 = Electrica, 1 = Hidráulica]: ";
    cin >> tipoDir;
    /*int tipo
    cin >> tipo;
    if(tipo == 0)
        tipoDir = false;
    else
        tipoDir = true;*/
}

// Getters
string Automovil::getMarca()
{
    return marca;
}

string Automovil::getModelo()
{
    return modelo;
}

int Automovil::getCantBocinas()
{
    return cantBocinas;
}

double Automovil::getCilindraje()
{
    return cilindraje;
}

bool Automovil::getTipoDir()
{
    return cantBocinas;
}

// Funciones
void Automovil::setDatos(string _marca, string _modelo, int _cantBocinas, double _cilindraje, bool _tipoDir)
{
    marca = _marca;
    modelo = _modelo;
    cantBocinas = _cantBocinas;
    cilindraje = _cilindraje;
    tipoDir = _tipoDir;
}

void Automovil::toString()
{

}
