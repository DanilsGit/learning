#include <iostream>
#include "Circulo.h"
#include "Cuadrado.h"
#include "Figura.h"
using namespace std;

int main()
{
    Cuadrado cua1 = Cuadrado();
    cua1.setBase();
    cua1.setAltura();
    cout<<cua1.CalcArea();

    /////////////////////////////

    Circulo cir1= Circulo();
    cir1.setRadio();
    cout<<cir1.CalcArea();

    /////////////////////////////

return 0;
}
