#ifndef DOCENTE_H
#define DOCENTE_H
#include<iostream>
using namespace std;

class Docente
{
    public:
        Docente();
        virtual ~Docente();
        //////////////////////// VARIABLES
        long numID;
        string apellido, nombre, profesion;
        double salario;
        //////////////////////// SET
        void setNumID();
        void setApellido();
        void setNombre();
        void setProfesion();
        virtual void setSalario();
        //////////////////////// GET
        long getNumID();
        string getApellido();
        string getNombre();
        string getProfesion();
        double getSalario();
        //////////////////////// Adicionales
        string toString();

    protected:

    private:
};

#endif // DOCENTE_H
