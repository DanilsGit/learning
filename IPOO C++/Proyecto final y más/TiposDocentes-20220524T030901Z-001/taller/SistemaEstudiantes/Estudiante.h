#ifndef ESTUDIANTE_H
#define ESTUDIANTE_H
#include <iostream>
#include <vector>
using namespace std;


class Estudiante
{
    public:
        Estudiante();
        virtual ~Estudiante();
        void setCodigo();
        void setCodPlan();
        void setNombre ();
        void setApellido ();
        void setNotas(int ); // recibe un numero y lee esa posicion en el arreglo. Ejemplo -> 0 = parcial 1.

        long getCodigo();
        long getCodPlan();
        string getApellido();
        string getNombre();
        double getNotas(int);
        string toString(); // retornará todo la informacion del estudiante.


    protected:

    private:
        long codigo;
        long cPlan;
        string nombre, apellido;
        double notas[4]; // primer parcial 30 - segundo parcial 30 - trabajo final 40 - nota final
};

#endif // ESTUDIANTE_H
