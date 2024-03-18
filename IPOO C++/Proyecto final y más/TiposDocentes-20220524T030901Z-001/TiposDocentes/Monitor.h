#ifndef MONITOR_H
#define MONITOR_H
#include"Docente.h"
#include<iostream>
using namespace std;

class Monitor:public Docente
{
    public:
        Monitor();
        virtual ~Monitor();

        int cantidadHT;

        //POLIMORFISMO
        void setSalario();
        //SET
        void setCantidadHT();
        //GET
        int getCantidadHT();

    protected:

    private:
};

#endif // MONITOR_H
