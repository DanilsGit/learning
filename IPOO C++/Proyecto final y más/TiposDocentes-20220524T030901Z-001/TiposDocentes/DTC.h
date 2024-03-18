#ifndef DTC_H
#define DTC_H
#include"Docente.h"
#include<iostream>
using namespace std;

class DTC:public Docente
{
    public:
        DTC();
        virtual ~DTC();


        //////////////////////// VARIABLES

        int cantHorasInv;

        //////////////////Polimorfismo
        void setSalario();
        //////////////////

        //////////////////////// SET

        void setCantHorasInv();

        //////////////////////// GET

        int getCantHorasInv();


    protected:

    private:
};

#endif // DTC_H
