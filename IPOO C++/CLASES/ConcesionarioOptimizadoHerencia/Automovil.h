#ifndef AUTOMOVIL_H
#define AUTOMOVIL_H
#include<iostream>
using namespace std;

class Automovil
{
    public:
        Automovil();
        virtual ~Automovil();
        //SOBRECARGA DE CONSTRUCTORES
        Automovil(string, string); //Marca y modelo - basica
        Automovil(string, string, int); //Marca, modelo, cantidad de bocinas - intermedia
        Automovil(string, string, int, bool); //Marca, modelo, cantidad de bocinas, tipo de dirección - FULL

        string marca, modelo;
        double cilindraje;
        int cant_bocinas;
        bool tipo_direccion;
        ////////////////////////// SET
        void setMarca();
        void setModelo();
        void setCilindraje();
        void setCant_bocinas();
        void setTipo_direccion();
        ////////////////////////// GET
        string getMarca();
        string getModelo();
        double getCilindraje();
        int getCant_bocinas();
        bool getTipo_direccion();
        ////////////////////////// OTRAS FUNCIONES
        void setDatos(string, string, double, int, bool);
        string toString();


    protected:

    private:
};

#endif // AUTOMOVIL_H
