#ifndef AUTOMOVIL_H
#define AUTOMOVIL_H
#include<iostream>
using namespace std;

class automovil
{
    public:
        automovil();            //Constructor
        virtual ~automovil();   //Destructor

    //atributos
    string color;
    string placa;
    string referencia;
    int nPuertas;
    int nLlantas;

    void setColor(string color);
    void setPlaca(string placa);
    void setReferencia(string referencia);
    void setNPuertas(int n);
    void setNLlantas(int n);

    string getColor();
    string getPlaca();
    string getReferencia();
    int getNumeroPuertas();
    int getNumeroLlantas();


    protected:

    private:
};

#endif // AUTOMOVIL_H
