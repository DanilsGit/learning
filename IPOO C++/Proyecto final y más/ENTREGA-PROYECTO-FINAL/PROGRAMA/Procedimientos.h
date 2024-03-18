#ifndef PROCEDIMIENTOS_H
#define PROCEDIMIENTOS_H
#include<iostream>
#include "UsuarioCompleto.h"
using namespace::std;

class Procedimientos : public UsuarioCompleto
{
    public:

        string fecha, hora, tipoProce;
        bool autorizado;

        Procedimientos();

        virtual ~Procedimientos();
        void setTipoProce();
        void setAutorizado();
        void setFecha();
        void setHora();


        string getTipoProce();
        bool getAutorizado();
        string getFecha();
        string getHora();

        string informa();

        //sobrecarga

         void setAutorizado(bool);
         void setTipoProce(string);
        void setFecha(string);
        void setHora(string);


    protected:

    private:
};

#endif // PROCEDIMIENTOS_H
