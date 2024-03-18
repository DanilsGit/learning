#include <iostream>
#include "Automovil.h"

using namespace std;

// Definición de funciones
void testNinguno();
void testBasica();
void testInter();
void testFull();

// Función principal
int main()
{
    setlocale(LC_ALL, "");
    testNinguno();
    testBasica();
    testInter();
    testFull();

    return 0;
}

// Implementación de funciones
void testNinguno()
{
    Automovil obj;
    cout << obj.getMarca() << endl;
    cout << obj.getModelo() << endl;
    cout << obj.getCantBocinas() << endl;
    cout << obj.getCilindraje() << endl;
    cout << obj.getTipoDir() << endl;
}

void testBasica()
{
    string _marca, _modelo;
    fflush(stdin);
    cout << "Ingrese la marca: ";
    getline(cin, _marca);
    fflush(stdin);
    cout << "Ingrese el modelo: ";
    getline(cin, _modelo);

}

void testInter()
{
    Automovil inter("Kía", "K-250", 4);
    cout << inter.getMarca() << endl;
    cout << inter.getModelo() << endl;
    cout << inter.getCantBocinas() << endl;
    cout << inter.getCilindraje() << endl;
    cout << inter.getTipoDir() << endl;
}

void testFull()
{
    Automovil full("Yamaha", "Y-120", 8, true);
    cout << full.getMarca() << endl;
    cout << full.getModelo() << endl;
    cout << full.getCantBocinas() << endl;
    cout << full.getCilindraje() << endl;
    cout << full.getTipoDir() << endl;
}
