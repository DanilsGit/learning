#include <iostream>
#include "Estudiante.h"
#include <vector>
using namespace std;

// definicion de funciones

vector <Estudiante> vecEstudiantes;

void menuPrincipal();
void menuListados( );
void menuConsultas();
void ingresar();
void listadoGeneral();
void listadoXplan();
void acercaDe();
void consulta_x_estudiante();
void listado_Aprobados_y_reprobados();
void notasGeneral();
void consulta_apro_x_plan();
void histograma();

// implementacion de funciones

void menuPrincipal( ){
    int opc;

    do{
        cout<< "MENU PRINCIPAL"<<endl;
        cout<< "---------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. ingresar nuevo estudiante"<<endl;
        cout<< "2. submenu listados"<<endl;
        cout<< "3. Submenu consultas"<<endl;
        cout<< "4. Acerca de..."<<endl;
        cout<< "0. salir"<<endl;
        cin >> opc;

        switch(opc){

            case 1 : system ("cls"); ingresar(); break;
            case 2 : system ("cls");menuListados(); break;
            case 3 : system ("cls");menuConsultas(); break;
            case 4 : system ("cls"); acercaDe(); break;
            case 0 : break;

            default : cout<<" opcion incorrecta"<<endl;
        }

    }while(opc != 0);
}

void menuListados( ){
    int opc;

    do{
        cout<< "SUBMENU LISTADOS"<<endl;
        cout<< "---------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. listado general"<<endl;
        cout<< "2. listado por plan"<<endl;
        cout<< "3. volver al menu principal"<<endl;
        cin >> opc;

        switch(opc){

            case 1 :  system ("cls");listadoGeneral(); break;
            case 2  : system ("cls");listadoXplan(); break;
            case 3  : system ("cls"); break;

            default : cout<<" opcion incorrecta"<<endl;
        }

    }while(opc != 3);
}

void menuConsultas( ){
    int opc;

    do{ cout<< "SUBMENU CONSULTAS"<<endl;
        cout<< "---------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. consultar estudiante por codigo"<<endl;
        cout<< "2. consultar cantidad de aprobados y reprobados"<<endl;
        cout<< "3. notas promedios"<<endl;
        cout<< "4. Consulta de aprobados y reprobados por plan "<<endl;
        cout<< "5. Histograma"<<endl;
        cout<< "6. volver al menu principal"<<endl;
        cin >> opc;

        switch(opc){

            case 1  : system ("cls");consulta_x_estudiante(); break;
            case 2  : system ("cls");listado_Aprobados_y_reprobados(); break;
            case 3  : system ("cls");notasGeneral(); break;
            case 4  : system ("cls");consulta_apro_x_plan(); break;
            case 5  : system ("cls");histograma(); break;
            case 6  : system ("cls");break;

            default : cout<<" opcion incorrecta"<<endl;
        }

    }while(opc != 6);
}

void ingresar(){
    Estudiante obj;
    cout<< "ingreso un nuevo estudiante"<<"\n\n" ;

    obj. setCodigo();
    obj. setCodPlan();
    obj. setNombre();
    obj. setApellido();
    obj. setNotas(0);
    obj. setNotas(1);
    obj. setNotas(2);
    obj. setNotas(3);

    vecEstudiantes.push_back(obj);
    cout<< "\n\n";
}

void listadoGeneral(){

    if(vecEstudiantes.size() > 0){
            cout<< "listado general "<<endl<<endl;
        Estudiante tmp;
        for (int i = 0; i<vecEstudiantes.size(); i++){
            tmp = vecEstudiantes[i];
            //cout<< tmp.getCodigo()<< " "<< tmp.getNombre()<< " "<< endl;
            cout<< tmp.toString()<<"\n\n";
        }
    }else {
        cout<< "no existe estudiantes en el sistema"<<endl<<endl;
    }
}

void listadoXplan(){
        if(vecEstudiantes.size() > 0){
        Estudiante tmp;
        long cod_plan_buscar;
        bool existe = false;

        cout<< "ingrese el codido de plan a buscar"<<endl;
        cin>> cod_plan_buscar;

        cout<< "listado general por plan"<<endl<<endl;

        for (int i = 0; i<vecEstudiantes.size(); i++){
            tmp = vecEstudiantes[i];
            if(tmp.getCodPlan() == cod_plan_buscar){
                    existe = true;
                cout<< tmp.toString()<<endl<<endl;
            }
        }
        if (!existe ){
            cout<< "no existe estudiantes en el plan "<< cod_plan_buscar<<endl<<endl;
        }
    }else {
        cout<< "no existe estudiantes en el sistema"<<endl<<endl;
    }
}

void acercaDe(){
    cout<< "Autor 1 : \n" << "Daniel Esteban Marquez Upegui \n";
    cout<< "codigo : 202160028 \n";
    cout<< "correo institucional : marquez.daniel@correounivalle.edu.co\n\n\n";
    cout<< "Autor 2 : \n" << "Juan Esteban Vargas Potes \n";
    cout<< "codigo : 202160191 \n";
    cout<< "correo institucional : juan.esteban.vargas@correounivalle.edu.co\n\n\n";
}

void consulta_x_estudiante(){

    if(vecEstudiantes.size()>0){
        Estudiante tmp;
        long busquedaEstudiantil;
        bool existe=false;

        cout<<"Ingrese el codigo estudiantil a buscar: ";cin>>busquedaEstudiantil;

        cout<<"Estudiante con el codigo "<<busquedaEstudiantil<<" : "<<endl;

        for(int i=0;i<vecEstudiantes.size();i++){
            tmp=vecEstudiantes[i];

            if(busquedaEstudiantil==tmp.getCodigo()){
                existe=true;
                cout<<tmp.toString()<<"\n\n";
            }
        }

        if(!existe){
            cout<<"\nNo existe el estudiante con el código "<<busquedaEstudiantil<<" en el sistema\n\n";
        }

    }else{
        cout<<"\nNo existe ningún estudiante registrado en el sistema\n\n";
    }


}

void listado_Aprobados_y_reprobados(){

int cont_Aprobaron=0;
int cont_Desaprobaron=0;

    if(vecEstudiantes.size()>0){
        Estudiante tmp;

        cout<<"Listado de estudiantes que han aprobado y reprobado"<<endl;

        for(int i=0;i<vecEstudiantes.size();i++){
            tmp=vecEstudiantes[i];

            if(tmp.getNotas(3)>=2.95){
                cont_Aprobaron+=1;
            }else{
                cont_Desaprobaron+=1;
            }
        }

    cout<<"La cantidad de estudiantes que aprobaron son :"<<cont_Aprobaron<<"\n\n";
    cout<<"La cantidad de estudiantes que reprobaron son :"<<cont_Desaprobaron<<"\n\n";

    }else{
        cout<<"\nNo existe ningún estudiante registrado en el sistema\n\n";
    }

}

void notasGeneral(){

double sumaGeneral=0;
double promedioGeneral=0;

double promedioAprobados=0, promedioDesaprobados=0;

double cantAprobados=0, sumaAprobados=0;
double cantDesaprobados=0, sumaDesaprobados=0;

    if(vecEstudiantes.size()>0){
        Estudiante tmp;

        cout<<"Nota promedio de todos los estudiantes"<<"\n\n";

        for(int i=0;i<vecEstudiantes.size();i++){
            tmp=vecEstudiantes[i];
            sumaGeneral+=tmp.getNotas(3);

            if(tmp.getNotas(3)>=2.95){
                cantAprobados+=1;
                sumaAprobados+=tmp.getNotas(3);
            }

            if(tmp.getNotas(3)<2.95){
                cantDesaprobados+=1;
                sumaDesaprobados+=tmp.getNotas
                (3);
            }

        }

        promedioGeneral=(sumaGeneral)/vecEstudiantes.size();

        promedioAprobados=(sumaAprobados)/cantAprobados;

        promedioDesaprobados=(sumaDesaprobados)/cantDesaprobados;

        cout<<"El promedio de todos los estudiantes es : "<<promedioGeneral<<"\n\n";

        cout<<"El promedio de los estudiantes aprobados es : "<<promedioAprobados<<"\n\n";

        cout<<"El promedio de los estudiantes reprobados es : "<<promedioDesaprobados<<"\n\n";


    }else{
        cout<<"\nNo existe ningún estudiante registrado en el sistema\n\n";
    }

}

void consulta_apro_x_plan(){

int contAprobados=0;
int contDesaprobados=0;

    if(vecEstudiantes.size()>0){
        Estudiante tmp;
        bool existe=false;
        long buscarPlan=0;

        cout<<"Ingrese el codigo del plan a buscar: "; cin>>buscarPlan;

        cout<<"\n\nCantidad de estudiantes que han aprobado y desaprobado en el plan "<<buscarPlan<<endl;

        for(int i=0;i<vecEstudiantes.size();i++){
            tmp=vecEstudiantes[i];

            if(tmp.getCodPlan()==buscarPlan){
                    existe=true;
                if(tmp.getNotas(3)>=2.95){
                    contAprobados+=1;
                }else{
                    contDesaprobados+=1;
                }
            }
        }

        if(!existe){
            cout<<"\nNo existen estudiantes que hayan aprobado o desaprobado en el plan "<<buscarPlan<<"\n\n";
        }else{
            cout<<"\nLa cantidad de estudiantes que aprobaron en el plan "<<buscarPlan<<" son : "<<contAprobados<<"\n\n";
            cout<<"\nLa cantidad de estudiantes que desaprobaron en el plan "<<buscarPlan<<" son : "<<contDesaprobados<<"\n\n";
        }

    }else{
        cout<<"\nNo existe ningun estudiante registrado en el sistema\n\n";
    }

}

void histograma(){

int nota0a2=0;
int nota2a3=0;
int nota3a4=0;
int nota4a5=0;

    if(vecEstudiantes.size()>0){
        Estudiante tmp;

        cout<<"Histograma de notas definitivas"<<"\n\n";

        for(int i=0;i<vecEstudiantes.size();i++){
            tmp=vecEstudiantes[i];

            if(tmp.getNotas(3)>=0 && tmp.getNotas(3)<=1.9){
                nota0a2+=1;
            }
            if(tmp.getNotas(3)>=2 && tmp.getNotas(3)<=2.9){
                nota2a3+=1;
            }
            if(tmp.getNotas(3)>=3 && tmp.getNotas(3)<=3.9){
                nota3a4+=1;
            }
            if(tmp.getNotas(3)>=4 && tmp.getNotas(3)<=5){
                nota4a5+=1;
            }
        }

    cout<<"0.0-1.9: ";
    for(int i=0;i<nota0a2;i++){
        cout<<"*";
    }

    cout<<"\n\n";

    cout<<"2.0-2.9: ";
    for(int i=0;i<nota2a3;i++){
        cout<<"*";
    }

    cout<<"\n\n";

    cout<<"3.0-3.9: ";
    for(int i=0;i<nota3a4;i++){
        cout<<"*";
    }

    cout<<"\n\n";

    cout<<"4.0-5.0: ";
    for(int i=0;i<nota4a5;i++){
        cout<<"*";
    }

    cout<<"\n\n";

    }else{
        cout<<"\nNo existe ningún estudiante registrado en el sistema\n\n";
    }
}


int main(){
    menuPrincipal();
    return 0;
}
