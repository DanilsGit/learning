#include<iostream>
using namespace::std;

#ifndef ESTUDIANTE_H
#define ESTUDIANTE_H


class Estudiante
{
    public:
        long codEstudiantil, codPlan;
        string apellido, nombre;
        double notas[4];

        Estudiante();
        virtual ~Estudiante();

        void setCodEstudiantil();
        void setCodPlan();
        void setApellido();
        void setNombre();
        void setNotas();
        void setDefinitiva();

        long getCodEstudiantil();
        long getCodPlan();
        string getApellido();
        string getNombre();
        double getNota(int);


    protected:

    private:
};

#endif // ESTUDIANTE_H
