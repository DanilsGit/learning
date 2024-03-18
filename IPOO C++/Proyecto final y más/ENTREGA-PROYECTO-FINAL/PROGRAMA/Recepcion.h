#ifndef RECEPCION_H
#define RECEPCION_H
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;


class Recepcion : public Gerente
{
    public:

        int horasTrabajo;

        Recepcion();
        virtual ~Recepcion();

        void setHorasTrabajo();
        void setSalario();
        int getHorasTrabajo();

        // sobrecarga

        void setHorasTrabajo(int);

    protected:

    private:
};

#endif // RECEPCION_H
