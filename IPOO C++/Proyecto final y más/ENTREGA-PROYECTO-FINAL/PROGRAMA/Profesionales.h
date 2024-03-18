#ifndef PROFESIONALES_H
#define PROFESIONALES_H
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;


class Profesionales : public Gerente
{
    public:
        string profesion;

        Profesionales();
        virtual ~Profesionales();

        void setProfesion();
        string getProfesion();
        void setSalario();

        //Sobrecarga
        void setProfesion(string);

    protected:

    private:
};

#endif // PROFESIONALES_H
