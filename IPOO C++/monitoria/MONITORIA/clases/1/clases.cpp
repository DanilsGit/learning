#include<iostream>
#include "automovil.h"
using namespace std;


int main()
{
setlocale(LC_ALL,"");

    automovil carrito;
    carrito.setColor("Amarillo");

    cout<<carrito.getColor();
}





