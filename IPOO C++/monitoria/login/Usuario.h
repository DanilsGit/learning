#ifndef USUARIO_H
#define USUARIO_H
#include <iostream>
using namespace std;

class Usuario
{
    public:
        Usuario();
        virtual ~Usuario();
        string nombreUsuario, contrasena;

        void setNombreUsuario();
        void setContrasena();

        virtual string getClase()=0;

        string getNombreUsuario();
        string getContrasena();

    protected:

    private:
};

#endif // USUARIO_H
