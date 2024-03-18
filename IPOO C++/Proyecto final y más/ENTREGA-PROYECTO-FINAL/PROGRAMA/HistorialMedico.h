#ifndef HISTORIALMEDICO_H
#define HISTORIALMEDICO_H
#include<iostream>
#include "UsuarioCompleto.h"
using namespace::std;

class HistorialMedico: public UsuarioCompleto
{
    public:
        HistorialMedico();
        virtual ~HistorialMedico();

        void setAlergias();
        void setEnfermedades();
        void setCantProcedimientos();

        string getAlergias();
        string getEnfermedades();
        long getCantProcedimientos();

        string infoHistorial();

    protected:
        string alergias;
        string enfermedades;
        long cantProcedimientos;

    private:
};

#endif // HISTORIALMEDICO_H
