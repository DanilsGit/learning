#ifndef CIRCULO_H
#define CIRCULO_H
#include "Figura.h"
#include <iostream>

using namespace std;
class Circulo:public Figura
{
    public:
        Circulo();
        virtual ~Circulo();
        //Variables
        double radio;

        //Polimorfismo
        double CalcArea();

        //Set
        void setRadio();

        //Get
        double getRadio();

    protected:

    private:
};

#endif // CIRCULO_H
