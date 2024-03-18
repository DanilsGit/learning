#ifndef PERSONALDESALUD_H
#define PERSONALDESALUD_H
#include "Profesionales.h"
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;


class PersonalDeSalud : public Profesionales
{
    public:

        int horas;
        PersonalDeSalud();
        virtual ~PersonalDeSalud();

        void setHoras();
        int getHoras();
        void setSalario();

        //Sobrecarga
        void setHoras(int);

    protected:

    private:
};

#endif // PERSONALDESALUD_H
