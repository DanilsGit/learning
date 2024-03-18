#ifndef CITAS_H
#define CITAS_H
#include<iostream>
#include "UsuarioCompleto.h"
using namespace::std;


class Citas : public UsuarioCompleto
{
    public:

    bool autorizado, asignado;
    string fecha, hora, tipo, atendido;


        Citas();
        virtual ~Citas();

        void setAutorizado();
        void setAsignado();
        void setFecha();
        void setHora();
        void setTipoCita();
        void setAtendido();
       // void autorizar();

        bool getAutorizado();
        bool getAsignado();
        string getFecha();
        string getHora();
        string getTipoCita();
        string getAtendido();
        string Descripcion();

        //sobrecarga


        void setAutorizado(bool);
        void setAsignado(bool);
        void setFecha(string);
        void setHora(string);
        void setTipoCita(string);
        void setAtendido(string);
       //  void autorizar(bool);


    protected:

    private:
};

#endif // CITAS_H
