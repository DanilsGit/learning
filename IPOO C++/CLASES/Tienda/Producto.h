#ifndef PRODUCTO_H
#define PRODUCTO_H
#include<iostream>
using namespace std;

class Producto
{
    public:
        Producto();
        virtual ~Producto();

        //Atributos
        string nombre;
        string marca;
        float precio;
        string proveedor;
        string fecha_vencimiento;

        //Prototipos SET Y GET
        void setNombre();
        void setNombre(string);
        string getNombre();
        //
        void setMarca();
         void setMarca(string);
        string getMarca();
        //
        void setPrecio();
        void setPrecio(float);
        float getPrecio();
        //
        void setProveedor();
        void setProveedor(string);
        string getProveedor();
        //
        void setFecha_vencimiento();
        void setFecha_vencimiento(string);
        string getFecha_vencimiento();

    protected:

    private:
};

#endif // PRODUCTO_H
