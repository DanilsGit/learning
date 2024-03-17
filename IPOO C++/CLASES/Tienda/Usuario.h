#ifndef USUARIO_H
#define USUARIO_H
#include<iostream>
using namespace std;

class Usuario
{
    public:
        Usuario();
        virtual ~Usuario();

        //Atributos
        string nombre;
        int cedula;


    protected:

    private:
};

#endif // USUARIO_H
