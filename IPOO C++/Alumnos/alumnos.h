#include<iostream>
using namespace std;
#ifndef ALUMNOS_H
#define ALUMNOS_H


class alumnos
{
    public:

        //Atributos
        string cedula, nombre;
        float n1,n2,n3;

        alumnos();
        virtual ~alumnos();

        void setCedula();
        void setCedula(string);
        string getCedula();
        //
        void setNombre();
        void setNombre(string);
        string getNombre();
        //
        void setNota1();
        void setNota1(float);
        float getNota1();
        //
        void setNota2();
        void setNota2(float);
        float getNota2();
        //
        void setNota3();
        void setNota3(float);
        float getNota3();

    protected:

    private:
};

#endif // ALUMNOS_H

