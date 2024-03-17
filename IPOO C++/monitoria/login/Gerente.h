#ifndef GERENTE_H
#define GERENTE_H
#include<Usuario.h>

class Gerente:public Usuario
{
    public:
        Gerente();
        virtual ~Gerente();

        string getClase();

    protected:

    private:
};

#endif // GERENTE_H

