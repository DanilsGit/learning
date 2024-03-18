#ifndef USUARIOCOMPLETO_H
#define USUARIOCOMPLETO_H
#include<iostream>
using namespace::std;


class UsuarioCompleto
{
    public:

        //atributos de CUALQUIER TIPO DE USUARIO.
        string nombre, apellido, tipoUsuario;
        long numID, salario;
        int edad;
        string user, password;

        UsuarioCompleto();
        virtual ~UsuarioCompleto();
// SETS Y GETS de los atributos de CUALQUIER TIPO DE USUARIO.
        //SETTERS
        void setNumID();
        void setApellido();
        void setNombre();
        void setEdad();
        void setTipoUsuario();
        void setUser();
        void setPassword();
        //GETTERS
        long getNumID();
        string getApellido();
        string getNombre();
        int getEdad();
        string getTipoUsuario();
        string getUser();
        string getPassword();
        //toString
        string toString();
        // Funciones a definir en cada clase
        virtual void setSalario();
        long getSalario();

        //SOBRECARGA

        void setNumID(long);
        void setApellido(string);
        void setNombre(string);
        void setEdad(int);
        void setTipoUsuario(string);
        void setUser(string);
        void setPassword(string);


    protected:

    private:
};

#endif // USUARIOCOMPLETO_H
