#ifndef FIGURA_H
#define FIGURA_H
#include <iostream>

using namespace std;

class Figura
{
    public:
        Figura();
        virtual ~Figura();

        double area;

        virtual double CalcArea()=0;

    protected:

    private:
};

#endif // FIGURA_H
