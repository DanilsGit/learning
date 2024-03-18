#ifndef GERENTE_H
#define GERENTE_H
#include "UsuarioCompleto.h"
#include<iostream>
using namespace::std;


class Gerente : public UsuarioCompleto
{
    public:

        int Experiencia; //experiencia en años como gerente
        string nivelEstudios;

        Gerente();
        virtual ~Gerente();
        //SETTERS
        void setExperiencia();
        void setNivelEstudio();
        //GETTERS
        int getExperiencia();
        string getNivelEstudio();
        void setSalario();
        //


        //Sobrecarga
        void setExperiencia(int);
        void setNivelEstudio(string);

    protected:

    private:
};

#endif // GERENTE_H
