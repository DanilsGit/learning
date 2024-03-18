#ifndef DHC_H
#define DHC_H
#include"Docente.h"
#include<iostream>
using namespace std;

class DHC: public Docente
{
    public:
        DHC();
        virtual ~DHC();

        //////////////////////// VARIABLES
        int cantHT; //cantidad horas trabajadas
        string nivelEST; //Nivel de estudios
        //////////////////////// POLIMORFISMO
        void setSalario();
        //////////////////////// SET
        void setCantHT();
        void setNivelEST();
        //////////////////////// GET
        int getCantHT();
        string getNivelEST();

    protected:

    private:
};

#endif // DHC_H
