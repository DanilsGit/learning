#ifndef PACIENTE_H
#define PACIENTE_H
#include "Recepcion.h"
#include "Gerente.h"
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;


class Paciente : public UsuarioCompleto
{
    public:

        string estado;
        double cita; // --------------------------
        Paciente();
        virtual ~Paciente();

        void setEstado();
        string getEstado();

        //sobrecarga
        void setEstado(string);


    protected:

    private:
};

#endif // PACIENTE_H
