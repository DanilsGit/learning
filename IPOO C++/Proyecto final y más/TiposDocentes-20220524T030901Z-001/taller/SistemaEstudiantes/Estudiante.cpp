#include "Estudiante.h"
#include <iostream>
#include <conio.h>
using namespace std;

// -----------------------------------------
// constructor
Estudiante::Estudiante()
{
  codigo = 0;
  cPlan = 0;
  apellido = "-";
  nombre = "-";
  for(int i = 0; i < 4; i++){
    notas[i] = 0.0;
  }
}
// -----------------------------------------
// destructor
Estudiante::~Estudiante()
{

}

        void Estudiante :: setCodigo(){

            cout<< "ingrese el codigo del estudiante: ";
            cin>> codigo;
        }
        void Estudiante :: setCodPlan(){

            cout<< "ingrese el codigo del plan: ";
            cin>> cPlan;
        }
        void Estudiante :: setNombre (){
            fflush(stdin);
            cout<< "ingrese el nombre del estudiante: ";
            getline(cin ,nombre);
        }
        void Estudiante :: setApellido (){
            fflush(stdin);
            cout<< "ingrese el apellido: ";
            getline(cin ,apellido);
        }
        void Estudiante :: setNotas(int n ){
            if( n == 0 || n == 1 || n == 2){
            cout<< "ingrese nota de la evaluacion"<< n+1<< ": ";
            cin >> notas [n];
            }
             else{notas [3] = (notas[0] * 0.3 + notas[1]*0.3 + notas [2]* 0.4);

             }
             }


        long Estudiante :: getCodigo(){
            return codigo;
        }
        long Estudiante :: getCodPlan(){
            return cPlan;
        }
        string Estudiante ::  getApellido(){
            return apellido;
        }
        string Estudiante :: getNombre(){
            return nombre;
        }
        double Estudiante :: getNotas(int n){
            return notas[n];
        }
        string Estudiante :: toString(){
            return "codigo :" + to_string(codigo) + "\n" +
            "codigo Plan : " + to_string(cPlan) +  "\n" +
            "nombre : " + nombre + " apellido : " + apellido +  "\n" +
            "definitiva : " + to_string(getNotas(3))
            ;
        }
