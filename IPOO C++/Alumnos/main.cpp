#include <iostream>
#include"alumnos.h"
#include<vector>



using namespace std;

float fin;
float notaFinal(float n1, float n2, float n3);

alumnos est1;


alumnos arreglo[3];
void leerDatosAlumnos();
void MostrarEstudiantes();

void leerDatosAlumnos(){

    for(int i=0;i<3;i++){
        cout<<"Datos del alumno #"<<(i+1)<<" : "<<endl;
        arreglo[i].setCedula();
        arreglo[i].setNombre();
        arreglo[i].setNota1();
        arreglo[i].setNota2();
        arreglo[i].setNota3();
        cout<<endl;
    }

}

void MostrarEstudiantes()
{

    for(int i=0; i<3; i++)
    {
        cout<<"Datos del alumno #"<<(i+1)<<"\n";
        cout<<arreglo[i].getCedula()<<endl;
        cout<<arreglo[i].getNombre()<<endl;
        cout<<arreglo[i].getNota1()<<endl;
        cout<<arreglo[i].getNota2()<<endl;
        cout<<arreglo[i].getNota3()<<endl;
        fin=notaFinal(arreglo[i].getNota1(),arreglo[i].getNota2(),arreglo[i].getNota3());
        cout<<fin;
        if(fin>2.99)
        {
            cout<<"El alumno aprobó"<<endl;
        }
        else
        {
            cout<<"El alumno NO aprobó"<<endl;
        }
        cout<<endl;
    }

}


float notaFinal(float n1, float n2, float n3){

fin=(n1+n2+n3)/3;

return fin;
}




// VECTORES ------------------------------------------

vector <alumnos> vecAlumnos;

//definicion de metodos
void leer_datos_alumnosVector()
{

    cout<<"Datos del nuevo alumno"<<endl;
    cout<<"----------------------"<<endl;
    alumnos est1; //Crear OBJETO
    est1.setCedula();
    est1.setNombre();
    est1.setNota1();
    est1.setNota2();
    est1.setNota3();
    vecAlumnos.push_back(est1);
}

void listado()
{

    if(vecAlumnos.size() > 0)
    {
        alumnos est1;
        for(int i=0; i<vecAlumnos.size(); i++)
        {
            est1 = vecAlumnos.at(i);
            cout<<"Listado de alumnos"<<endl;
            cout<<"Cédula: "<<est1.getCedula()<<endl;
            cout<<"Nombre: "<<est1.getNombre()<<endl;
            cout<<"Nota 1: "<<est1.getNota1()<<endl;
            cout<<"Nota 2: "<<est1.getNota2()<<endl;
            cout<<"Nota 3: "<<est1.getNota3()<<endl;
        }
    }
    else
    {
        cout<<"No hay alumnos";
    }

}


void consultar_cedula(){

    if(vecAlumnos.size() > 0)
    {
        alumnos est1;
        long nBuscar;
        cout<<"Cédula a buscar : ";
        cin>>nBuscar;
        bool existe=false;
        for(int i=0; i<vecAlumnos.size(); i++)
        {
            est1 = vecAlumnos.at(i);
            long cc;
            cc=stoi(est1.getCedula());
            if(cc==nBuscar)
            {
                existe=true;
                cout<<"Datos del estudiante"<<endl;
                cout<<"Cédula: "<<est1.getCedula()<<endl;
                cout<<"Nombre: "<<est1.getNombre()<<endl;
                cout<<"Nota 1: "<<est1.getNota1()<<endl;
                cout<<"Nota 2: "<<est1.getNota2()<<endl;
                cout<<"Nota 3: "<<est1.getNota3()<<endl;
            }
        }//Fin del for
        if(!existe){ //if(existe==false)
            cout<<"Alumno con cedula "<<nBuscar<<" NO existe"<<endl;
        }
    }
    else
    {
        cout<<"No hay alumnos";
    }

}

void menu(){
    int opc;

    do
    {
        cout<<"1. Crear alumno"<<endl;
        cout<<"2. Listado general"<<endl;
        cout<<"3. Buscar por cedula"<<endl;
        cout<<"0. Salir"<<endl;
        cout<<"Seleccione una opción: "<<endl;
        cin>>opc;

        switch(opc)
        {
        case 1:
            leer_datos_alumnosVector();
            cout<<endl;
            break;
        case 2:
            listado();
            cout<<endl;
            break;
        case 3:
            consultar_cedula();
            cout<<endl;
            break;
        case 0:
            cout<<endl;
            break;
        default:
            cout<<"Opción incorrecta"<<endl<<endl;
        }

    }
    while(opc!=0);

}



// VECTORES ------------------------------------------



int main()
{

    setlocale(LC_ALL,"");
    menu();

    //leerDatosAlumnos();
    //MostrarEstudiantes();


/*
    est1.setCedula("1116070100");
    est1.setNombre();
    est1.setNota1(4);
    est1.setNota2(3);
    est1.setNota3(4.5);
    fin=notaFinal(est1.getNota1(),est1.getNota2(),est1.getNota3());
    //
    cout<<"\n\n-- DATOS DEL ESTUDIANTE --\n";
    cout<<"Cédula: "<<est1.getCedula()<<endl;
    cout<<"Nombre: "<<est1.getNombre()<<endl;
    cout<<"Nota 1: "<<est1.getNota1()<<endl;
    cout<<"Nota 2: "<<est1.getNota2()<<endl;
    cout<<"Nota 3: "<<est1.getNota3()<<endl;

    cout<<"Nota final: "<<fin<<endl;

    if(fin>2.99){
        cout<<"El alumno aprobó"<<endl;
    }else{
    cout<<"El alumno NO aprobó"<<endl;
    }

    return 0;

    */
}


