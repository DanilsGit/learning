#ifndef MEDICAMENTOS_H
#define MEDICAMENTOS_H
#include<iostream>
#include "UsuarioCompleto.h"
using namespace::std;

class Medicamentos :public UsuarioCompleto
{
    public:
        string nombreMedica;
        int cant;
        bool autorizado;
        Medicamentos();
        virtual ~Medicamentos();

        void setNombreMedica();
        void setCant();
        void setAutorizado();

        string getNombreMedica();
        int getCant();
        bool getAutorizado();

        string info();


    void setNombreMedica(string);
    void setCant(int);
    void setAutorizado(bool);

    protected:

    private:
};

#endif // MEDICAMENTOS_H
