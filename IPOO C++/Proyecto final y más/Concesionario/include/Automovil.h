#include <iostream>

using namespace std;

#ifndef AUTOMOVIL_H
#define AUTOMOVIL_H


class Automovil
{
    public:
        Automovil();
        virtual ~Automovil();

        // Sobrecarga de constructores
        Automovil(string, string); // Basica
        Automovil(string, string, int); // Intermedia
        Automovil(string, string, int, bool); // Full

        // Atributos
        string marca, modelo;
        int cantBocinas;
        double cilindraje;
        bool tipoDir;

        // Setters
        void setMarca();
        void setModelo();
        void setCilindraje();
        void setCantBocinas();
        void setTipoDir();

        // Getters
        string getMarca();
        string getModelo();
        int getCantBocinas();
        double getCilindraje();
        bool getTipoDir();

        // Funciones
        void setDatos(string, string, int, double, bool);
        void toString();


    protected:

    private:
};

#endif // AUTOMOVIL_H
