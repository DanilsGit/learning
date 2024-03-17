#ifndef CUADRADO_H
#define CUADRADO_H
#include "Cuadrado.h"
#include "Figura.h"

class Cuadrado:public Figura
{
    public:
        Cuadrado();
        virtual ~Cuadrado();

        //Variables
        long base, altura;

        //Polimorfismo
        double CalcArea();

        //Set
        void setBase();
        void setAltura();

        //Get
        long getBase();
        long getAltura();




    ///////////////////////////////////

    protected:

    private:
};

#endif // CUADRADO_H
