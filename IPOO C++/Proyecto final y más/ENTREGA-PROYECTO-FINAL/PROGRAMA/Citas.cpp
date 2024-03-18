#include "Citas.h"
#include<iostream>
#include "UsuarioCompleto.h"
using namespace::std;

Citas::Citas()
{
   autorizado, asignado = false;
   fecha, hora, tipo, atendido = "-";

}

Citas::~Citas()
{
    //dtor
}

//meter las nuevas funciones

/*void Citas::autorizar() {
    if(autorizado == true){
               cout<< "Su cita ya ha sido autorizada."<<endl<<endl;
           }else {
               cout<< "Su cita medica aun no ha sido autorizada."<<endl<<endl;
           }
}*/
void Citas::setAutorizado(){
    int opc;
    cout<< "Seleccione una opcion"<<endl;
    cout<< "---------------------"<<endl;
    cout<< "1. Autorizar cita"<<endl;
    cout<< "2. No autorizar cita"<<endl;
    cin>>opc;

    if(opc == 1){
        autorizado == true;
    } if(opc == 2){
        autorizado == false;
    }
}
void Citas::setAsignado(){
    int opc;
    cout<< "Seleccione una opcion"<<endl;
    cout<< "---------------------"<<endl;
    cout<< "1. Asignar cita"<<endl;
    cout<< "2. No asignar cita"<<endl;
    cin>>opc;

    if(opc == 1){
        asignado == true;
    } if(opc == 2){
        asignado == false;
    }
}

void Citas::setFecha(){
    fflush(stdin);
    cout<< "Ingrese la fecha de la cita: ";
    getline (cin, fecha);
}
void Citas::setHora(){
   fflush(stdin);
    cout<< "Ingrese la hora de la cita: ";
    getline (cin, hora); }
void Citas::setTipoCita(){
    fflush(stdin);
    cout<< "Ingrese el tipo de cita: ";
    getline (cin, tipo);
}
void Citas::setAtendido(){
       fflush(stdin);
    cout<< "Ingrese quien atenderá la cita cita: ";
    getline (cin, atendido);
}

//getters

bool Citas::getAutorizado(){
    return autorizado;
}
bool Citas::getAsignado(){
    return asignado;
}
string Citas::getFecha(){
    return fecha;
}
string Citas::getHora(){
    return hora;
}
string Citas::getTipoCita(){
    return tipo;
}
string Citas::getAtendido(){
    return atendido;
}

string Citas::Descripcion(){
    return "Paciente = " + nombre + " " + apellido + "\n"+
           "Numero de ID = " + to_string(numID) + "\n"+
           "Edad = " + to_string(edad) + "\n"+
           "Fecha y hora de la cita = " + fecha + " - " + hora + "\n"+
           "Tipo de cita = " + tipo + "\n"+
           "Atendido por = " + atendido + "\n\n" +
           "RECOMENDACIONES = " + "\n"+
           "RECUERDE ASISTIR 30 MINUTOS ANTES DE SU CITA. " + "\n\n"+
           "TRAER LOS SIGUIENTES DOCUMENTOS: " + "\n"+
           "1. ORDEN MEDICA ORIGINAL." + "\n"+
           "2. AUTORIZACION DEL SERVICIO." + "\n"+
           "3. DOCUMENTO DE IDENTIFICACION." + "\n\n"+
           "EN CASO DE NO PODER ASISTIR A LA CITA, COMUNIQUESE AL: 2250822," + "\n"+
           "PARA PODER SER REPROGRAMADA SU CITA."+ "\n\n";
}

// sobrecarga

void Citas::setAutorizado(bool n){
    autorizado = n;
}
void Citas::setAsignado(bool i){
asignado = i;
}
void Citas::setFecha(string a){
fecha = a;
}
void Citas::setHora(string b){
hora = b;
}
void Citas::setTipoCita(string c){
tipo = c;
}
void Citas::setAtendido(string d){
atendido = d;
}
/*void  Citas::autorizar(bool c){
    autorizado = c;
}*/
