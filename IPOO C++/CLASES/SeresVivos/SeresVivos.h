#ifndef SERESVIVOS_H
#define SERESVIVOS_H
#include<iostream>
using namespace std;

class SeresVivos
{
public:
    SeresVivos();
    virtual ~SeresVivos();

    //Atributos
    string nombre;
    string color;
    int edad;

    //Prototipos SET Y GET
    void setNombre();
    string getNombre();
    /////////////////////////
    void setColor();
    string getColor();
    /////////////////////////
    void setEdad();
    int getEdad();
    ///////////////////////////
    void comer();
    void dormir();
    ///////////////////////////

protected:

private:
};

#endif // SERESVIVOS_H
