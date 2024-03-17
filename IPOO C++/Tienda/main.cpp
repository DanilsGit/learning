#include <iostream>
#include "Producto.h"
#include<vector>
using namespace std;

vector <Producto> lista_productos;

void crearUsuario(){
Producto obj;

obj.setNombre("Jabon");
obj.setPrecio(2300);
obj.setProveedor("G");

lista_productos.push_back(obj);

}


int main()
{
    Producto p1 = Producto();

    p1.setNombre("");
    cout<<"nombre = "<<p1.getNombre();

    return 0;
}
