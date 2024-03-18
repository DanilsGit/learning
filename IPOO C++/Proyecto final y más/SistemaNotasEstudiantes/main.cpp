#include<iostream>
using namespace std;
#include<vector>
#include"Estudiante.h"
#include"utils.h"

vector<Estudiante> vecEstudiantes;

//protipos de funciones
void ingresar();
void listar();
void consultar_x_codEst();
void modificar_x_codEst();
void eliminar_x_codEst();
void menu();

void ingresar(){
    system("cls");
    titulo("Ingresar un nuevo Estudiante");
    cout<<"Datos del nuevo Estudiante"<<endl<<endl;

    Estudiante obj;
    obj.setCodEstudiantil();
    obj.setApellido();
    obj.setNombre();
    obj.setCodPlan();
    obj.setNotas();
    obj.setDefinitiva();
    vecEstudiantes.push_back(obj);
    pausa();
}

void listar(){
    system("cls");
    int n = vecEstudiantes.size();
    string texto = "Listado General de Estudiantes [" + to_string(n) + "]";
    titulo(texto);

    Estudiante obj;

    for(int i = 0; i < n; i++){
        cout<<"Datos del estudiante # "<<(i+1)<<endl;
        obj = vecEstudiantes.at(i);
        cout<<obj.getCodEstudiantil()<<" "<<
              obj.getApellido()<<", "<<obj.getNombre()<<" "<<
              obj.getCodPlan()<<" "<<obj.getNota(3)<<endl<<endl;
    }
    pausa();
}

void consultar_x_codEst(){
    system("cls");
    titulo("Consulta x Codigo estudiantil");
    bool existe = false;
    Estudiante obj;
    int buscar;
    cout<<"Ingrese el codigo a buscar: ";
    cin>>buscar;

    int n = vecEstudiantes.size();
    for(int i = 0; i < n; i++){
        obj = vecEstudiantes[i];
        if(obj.getCodEstudiantil() == buscar){
           existe = true;
           cout<<"Datos del Estudiante"<<endl;
           cout<<obj.getCodEstudiantil()<<" "<<
              obj.getApellido()<<", "<<obj.getNombre()<<" "<<
              obj.getCodPlan()<<" "<<obj.getNota(3)<<endl<<endl;
           break;
        }
    }
    if(!existe){
        cout<<"El estudiante con codigo "<<buscar<<
              " no existe"<<endl<<endl;
    }
    pausa();
}

void modificar_x_codEst(){
    system("cls");
    titulo("Modificar x Codigo estudiantil");
    bool existe = false;
    Estudiante obj;
    int buscar, opc;
    cout<<"Ingrese el codigo a buscar: ";
    cin>>buscar;

    int n = vecEstudiantes.size();
    for(int i = 0; i < n; i++){
        obj = vecEstudiantes[i];
        if(obj.getCodEstudiantil() == buscar){
           existe = true;
           cout<<"Datos del Estudiante"<<endl;
           cout<<obj.getCodEstudiantil()<<" "<<
              obj.getApellido()<<", "<<obj.getNombre()<<" "<<
              obj.getCodPlan()<<" "<<obj.getNota(3)<<endl<<endl;

           cout<<"Datos a modificar"<<endl;
           cout<<"1. Codigo Estudiantil"<<endl;
           cout<<"2. Apellido"<<endl;
           cout<<"3. Nombre"<<endl;
           cin>>opc;
           switch(opc){
               case 1: cout<<"Ingreso del nuevo codigo"<<endl;
                       obj.setCodEstudiantil();
                       break;
               case 2: cout<<"Ingreso del nuevo apellido"<<endl;
                       obj.setApellido();
                       break;
               case 3: cout<<"Ingreso del nuevo nombre"<<endl;
                       obj.setNombre();
                       break;
           }
           vecEstudiantes[i] = obj;
           break;
        }
    }
    if(!existe){
        cout<<"El estudiante con codigo "<<buscar<<
              " no existe"<<endl<<endl;
    }
    pausa();
}

void eliminar_x_codEst(){
    system("cls");
    titulo("Eliminar x Codigo estudiantil");
    bool existe = false;
    Estudiante obj;
    int buscar;
    cout<<"Ingrese el codigo a buscar: ";
    cin>>buscar;

    int n = vecEstudiantes.size();
    for(int i = 0; i < n; i++){
        obj = vecEstudiantes[i];
        if(obj.getCodEstudiantil() == buscar){
           existe = true;
           cout<<"Datos del Estudiante"<<endl;
           cout<<obj.getCodEstudiantil()<<" "<<
              obj.getApellido()<<", "<<obj.getNombre()<<" "<<
              obj.getCodPlan()<<" "<<obj.getNota(3)<<endl<<endl;

           vecEstudiantes.erase(vecEstudiantes.begin()+i);
           break;
        }
    }
    if(!existe){
        cout<<"El estudiante con codigo "<<buscar<<
              " no existe"<<endl<<endl;
    }
    pausa();
}

void menu(){
    int opc;
    do{
        cout<<"1. Ingresar un nuevo estudiante"<<endl;
        cout<<"2. Listado general de estudiantes"<<endl;
        cout<<"3. Consultar x Codigo estudiantil"<<endl;
        cout<<"4. Modificar x Codigo estudiantil"<<endl;
        cout<<"5. Eliminar x Codigo estudiantil"<<endl;
        cout<<"0. Salir"<<endl;
        cout<<"Seleccione una opción: ";
        cin>>opc;
        switch(opc){
            case 1: ingresar(); break;
            case 2: listar(); break;
            case 3: consultar_x_codEst(); break;
            case 4: modificar_x_codEst(); break;
            case 5: eliminar_x_codEst(); break;
            case 0: break;
            default: cout<<"Opción incorrecta"<<endl<<endl;
        }
    }while(opc != 0);
}

int main()
{
    menu();
    return 0;
}
