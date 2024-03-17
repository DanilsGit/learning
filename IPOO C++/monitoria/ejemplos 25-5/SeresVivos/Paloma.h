#ifndef PALOMA_H
#define PALOMA_H
#include "SerVivo.h"
#include <iostream>

using namespace std;

class Paloma:public SerVivo
{
    public:
        Paloma();
        virtual ~Paloma();

        void Sleep();
        void Eat();

    protected:

    private:
};

#endif // PALOMA_H
