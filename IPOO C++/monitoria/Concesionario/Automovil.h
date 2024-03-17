#ifndef AUTOMOVIL_H
#define AUTOMOVIL_H
#include<iostream>
using namespace std;

class Automovil
{
    public:
        Automovil();
        virtual ~Automovil();

    //atributos
    string marca, modelo;
    int nPuertas;

    void setMarca();
    void setModelo();
    void setNPuertas();
    void setMotor();

    void arrancar();
    void pitar();

    string getModelo();
    string getMarca();
    int getNPuertas();
    string getMotor();

protected:

private:
    string motor;
};

#endif // AUTOMOVIL_H
