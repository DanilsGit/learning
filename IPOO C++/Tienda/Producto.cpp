#include "Producto.h"
#include<iostream>
using namespace std;

Producto::Producto()
{
    nombre="-";
    marca="-";
    precio=0;
    proveedor="-";
    fecha_vencimiento="00/00/0000";
}

Producto::~Producto()
{
    //dtor
}

/////////////////////////////////////////////////
void Producto::setNombre(){
fflush(stdin);
cout<<"Ingrese el nombre : ";
getline(cin,nombre);
}
void Producto::setNombre(string txt){
nombre=txt;
}
string Producto::getNombre(){
return nombre;
}
/////////////////////////////////////////////////
void Producto::setMarca(){
fflush(stdin);
cout<<"Ingrese la marca : ";
getline(cin,marca);
}
void Producto::setMarca(string txt){
marca=txt;
}
string Producto::getMarca(){
return marca;
}
/////////////////////////////////////////////////
void Producto::setPrecio(){
cout<<"Ingrese el precio : ";
cin>>precio;
}
void Producto::setPrecio(float n){
precio=n;
}
float Producto::getPrecio(){
return precio;
}
/////////////////////////////////////////////////
void Producto::setProveedor(){
fflush(stdin);
cout<<"Ingrese el proveedor : ";
getline(cin,proveedor);
}
void Producto::setProveedor(string txt){
proveedor=txt;
}
string Producto::getProveedor(){
return proveedor;
}
/////////////////////////////////////////////////
void Producto::setFecha_vencimiento(){
fflush(stdin);
cout<<"Ingrese la fecha de vencimiento : ";
getline(cin,fecha_vencimiento);
}
void Producto::setFecha_vencimiento(string txt){
fecha_vencimiento=txt;
}
string Producto::getFecha_vencimiento(){
return fecha_vencimiento;
}
/////////////////////////////////////////////////
