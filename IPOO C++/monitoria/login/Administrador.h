#ifndef ADMINISTRADOR_H
#define ADMINISTRADOR_H
#include<Usuario.h>
#include <iostream>
using namespace std;

class Administrador:public Usuario
{
    public:
        Administrador();
        virtual ~Administrador();

        string getClase();

    protected:

    private:
};

#endif // ADMINISTRADOR_H
