#ifndef PERRO_H
#define PERRO_H
#include "SerVivo.h"
#include <iostream>

using namespace std;

class Perro
{
    public:
        Perro();
        virtual ~Perro();

        void Sleep();
        void Eat();

    protected:

    private:
};

#endif // PERRO_H
