#include "PersonalDeSalud.h"
#include "Profesionales.h"
#include "Gerente.h"
#include "Paciente.h"
#include "Recepcion.h"
#include "UsuarioCompleto.h"
#include "Citas.h"
#include "Procedimientos.h"
#include "Medicamentos.h"
#include "HistorialMedico.h"
#include<iostream>
#include <vector>
#include<windows.h>
using namespace::std;

string userPropios="-";

vector<Gerente> vecGerente;
vector<PersonalDeSalud> vecPersoSalud;
vector<Profesionales> vecProfesionales;
vector<Recepcion> vecRecepcion;
vector<Paciente> vecPaciente;
vector<Citas> vecCitas;
vector<Procedimientos> vecProce;
vector<Medicamentos> vecMedica;
vector<HistorialMedico> vecHistorial;

int buscar;
void limpiar();
void login();
string credencial_user();
string credencial_password();
void usuariosDefault();

//Menus-----------------
void menuGerente();
void menuProfesionales();
void menuPersonalDeSalud();
void menuRecepcion();
void menuPaciente();
void menuCitas();
void menuProcedimientos();
void menuMedicamentos();
void menuHistorial();
//Menus-----------------
void ingresar();
void consultar_ID();
//yaaaaa-----------------
void consultarPropios();
void modificar_Datos();
void modificar_Gerente();
void modificar_profesional();
void modificar_personal_salud();
void modificar_recepcion();
void modificar_paciente();
void asignar_cita();
void consultar_cita();
void autorizar_cita();
void solicitar_cita();
void ingresar_Gerente();
void ingresar_profesional();
void ingresar_personal_salud();
void ingresar_recepcion();
void ingresar_paciente();
void consultar_gerente();
void consultar_profesional();
void consultar_personal_salud();
void consultar_recepcion();
void consultar_paciente();
void buscarID();
void validar_procedimiento();
void programar_procesos();
void consultar_procesos();
void autorizar_medica();
void asignar_medica();
void consultar_medicamen();
void consultar_historial();
void asignar_historial();


//validacion del tipo de usuario
int tipoUsuario(){
int opc;
    cout<< "[1| Gerente]\n"<<
           "[2| Profesional]\n"<<
           "[3| Personal de salud]\n"<<
           "[4| Recepcion]\n"<<
           "[5| Paciente]\n";

           do{
            cout<<"Respuesta: ";cin>>opc;
            if(opc<1 || opc>5) cout<<"Digite un valor válido: "<<endl;

           }while(opc<1 || opc>5);



return opc;
}

//LOGIN-----------------
int tipoUsuario();
string credencial_user(){
string user;
    cout<<"Digita tu usuario: ";
    fflush(stdin);
    getline(cin, user);
return user;
}
string credencial_password(){
string password;
    cout<<"Digita tu password: ";
    fflush(stdin);
    getline(cin, password);
return password;
}
void login(){

bool acceso=false;
int opcion;
string user;
string password;

    cout<<"Digita qué tipo de usuario eres: "<<endl;
    opcion=tipoUsuario();
    if (opcion == 1){

    if(vecGerente.size ()> 0){

            Gerente obj;
do{
            system("cls");
            cout<<"--LOGIN--"<<endl;
            user=credencial_user();
            password=credencial_password();
            for(int i = 0; i < vecGerente.size (); i++){

                obj = vecGerente.at(i);

                if((obj.getUser() == user) && (obj.getPassword() == password)){
                    system("cls");
                    userPropios=obj.getUser();
                    menuGerente();
                    acceso=true;
                    break;
                }
            }
            if(!acceso){
                cout<< "Credenciales inválidos, inténtelo nuevamente\n\n";
                system("pause");
            }
    }while(!acceso);

}else{
    cout<<"No existe ningun Gerente."<<endl;
}
}

    if (opcion == 2){

    if(vecProfesionales.size ()> 0){
            Profesionales obj;

do{
            system("cls");
            cout<<"--LOGIN--"<<endl;
            user=credencial_user();
            password=credencial_password();
            for(int i = 0; i < vecProfesionales.size (); i++){

                obj = vecProfesionales.at(i);

                if((obj.getUser() == user) && (obj.getPassword() == password)){
                    system("cls");
                    userPropios=obj.getUser();
                    menuProfesionales();
                    acceso=true;
                    break;
                }
            }
            if(!acceso){
                cout<< "Credenciales inválidos, inténtelo nuevamente\n\n";
                system("pause");
            }
    }while(!acceso);

    }else{
        cout<< "No existe ningun Profesional."<<endl<<endl;
}
    }

    if (opcion == 3){

    if(vecPersoSalud.size ()> 0){
            PersonalDeSalud obj;

do{
            system("cls");
            cout<<"--LOGIN--"<<endl;
            user=credencial_user();
            password=credencial_password();
            for(int i = 0; i < vecPersoSalud.size (); i++){

                obj = vecPersoSalud.at(i);

                if((obj.getUser() == user) && (obj.getPassword() == password)){
                    system("cls");
                    userPropios=obj.getUser();
                    menuPersonalDeSalud();
                    acceso=true;
                    break;
                }
            }
            if(!acceso){
                cout<< "Credenciales inválidos, inténtelo nuevamente\n\n";
                system("pause");
            }
    }while(!acceso);

    }else{
        cout<< "No existe ningun personal de salud."<<endl<<endl;
}
    }

    if (opcion == 4){

    if(vecRecepcion.size ()> 0){
            Recepcion obj;
do{
            system("cls");
            cout<<"--LOGIN--"<<endl;
            user=credencial_user();
            password=credencial_password();
            for(int i = 0; i < vecRecepcion.size (); i++){

                obj = vecRecepcion.at(i);

                if((obj.getUser() == user) && (obj.getPassword() == password)){
                    system("cls");
                    userPropios=obj.getUser();
                    menuRecepcion();
                    acceso=true;
                    break;
                }
            }
            if(!acceso){
                cout<< "Credenciales inválidos, inténtelo nuevamente\n\n";
                system("pause");
            }
    }while(!acceso);

    }else{
        cout<< "No existe ningun usuario de recepción."<<endl<<endl;
}
    }

    if (opcion == 5){

    if(vecPaciente.size ()> 0){
            Paciente obj;

do{
            system("cls");
            cout<<"--LOGIN--"<<endl;
            user=credencial_user();
            password=credencial_password();
            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if((obj.getUser() == user) && (obj.getPassword() == password)){
                    system("cls");
                    userPropios=obj.getUser();
                    menuPaciente();
                    acceso=true;
                    break;
                }
            }
            if(!acceso){
                cout<< "Credenciales inválidos, inténtelo nuevamente\n\n";
                system("pause");
            }
    }while(!acceso);

    }else{
        cout<< "No existe ningun paciente."<<endl<<endl;
      }
    }
}
//Menus de cada tipo
void menuGerente(){
    int opc;

    do{
        cout<< "Bienvenido a su menu, Gerente."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Ingresar un nuevo usuario"<<endl;
        cout<< "2. Consultar datos por ID"<<endl;
        cout<< "3. Modificar datos"<<endl;
        cout<< "4. Gestion de Citas medicas"<<endl;
        cout<< "5. Gestion de Procedimientos"<<endl;
        cout<< "6. Gestion de Historial medico"<<endl;
        cout<< "7. Gestion de Medicamentos"<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");ingresar(); break;
            case 2  : system ("cls");consultar_ID(); break;
            case 3  : system ("cls");modificar_Datos(); break;
            case 4  : system ("cls");menuCitas(); break;
            case 5  : system ("cls");menuProcedimientos(); break;
            case 6  : system ("cls");menuHistorial(); break;
            case 7  : system ("cls");menuMedicamentos(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;

        }
    }while(opc != 0);

}
void menuCitas(){
        int opc;

    do{
        cout<< "Menu de citas medicas."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "1. Asignar cita medica"<<endl;
        cout<< "2. Autorizar cita medica"<<endl;
        cout<< "3. Consultar cita medica"<<endl;
        cout<< "4. Solicita cita medica"<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");asignar_cita(); break;
            case 2  : system ("cls");autorizar_cita(); break;
            case 3  : system ("cls");consultar_cita(); break;
            case 4  : system ("cls");solicitar_cita(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;

        }
    }while(opc != 0);
}
void menuProcedimientos(){
        int opc;

    do{
        cout<< "Menu de procedimientos."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Autorizar procedimientos"<<endl;
        cout<< "2. Programar procedimientos"<<endl;
        cout<< "3. Consultar procedimientos"<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");validar_procedimiento(); break;
            case 2  : system ("cls");programar_procesos(); break;
            case 3  : system ("cls");consultar_procesos(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;

        }
    }while(opc != 0);
}
void menuMedicamentos(){
        int opc;

    do{
        cout<< "Menu de medicamentos."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Autorizar medicamentos "<<endl;
        cout<< "2. Asignar medicamentos "<<endl;
        cout<< "3. Consultar medicamentos "<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1 : system ("cls");autorizar_medica(); break;
            case 2 : system ("cls");asignar_medica(); break;
            case 3 : system ("cls");consultar_medicamen(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;

        }
    }while(opc != 0);

}
void menuHistorial(){
            int opc;

    do{
        cout<< "Menu del historial medico."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Asignar historial medico "<<endl;
        cout<< "2. Consultar historial medico "<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1 : system ("cls");asignar_historial(); break;
            case 2 : system ("cls");consultar_historial(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;

        }
    }while(opc != 0);

}
void menuProfesionales(){
int opc;

    do{
        cout<< "Bienvenido al menu de profesionales"<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Citas medicas"<<endl;
        cout<< "2. Procedimientos "<<endl;
        cout<< "3. Historial medico"<<endl;
        cout<< "4. Medicamentos"<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");menuCitas(); break;
            case 2  : system ("cls");menuProcedimientos(); break;
            case 3  : system ("cls");menuHistorial(); break;
            case 4  : system ("cls");menuMedicamentos(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;
        }
    }while(opc!=0);


}
void menuPersonalDeSalud(){
 int opc;

     do{
        cout<< "Bienvenido al menu del personal de salud."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Asignar cita medica"<<endl;
        cout<< "2. Programar procesos"<<endl;
        cout<< "3. Asignar medicamentos"<<endl;
        cout<< "4. asignar historial medico"<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");asignar_cita(); break;
            case 2  : system ("cls");programar_procesos(); break;
            case 3  : system ("cls");asignar_medica(); break;
            case 4  : system ("cls");asignar_historial(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;
        }
    }while(opc!=0);


}
void menuRecepcion(){
    int opc;

    do{
        cout<< "Bienvenido al menu de recepcion"<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Ingresar un nuevo usuario"<<endl;
        cout<< "2. Consultar datos por ID"<<endl;
        cout<< "3. Modificar datos"<<endl;
        cout<< "4. Solicitar cita medica"<<endl;
        cout<< "5. Consultar cita medica "<<endl;
        cout<< "6. Consultar medicamentos "<<endl;
        cout<< "7. Consultar procedimientos "<<endl;
        cout<< "8. Consultar historial medico "<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");ingresar(); break;
            case 2  : system ("cls");consultar_ID(); break;
            case 3  : system ("cls");modificar_Datos(); break;
            case 4  : system ("cls");solicitar_cita(); break;
            case 5  : system ("cls");consultar_cita(); break;
            case 6  : system ("cls");consultar_medicamen(); break;
            case 7  : system ("cls");consultar_procesos(); break;
            case 8  : system ("cls");consultar_historial(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;
        }
    }while(opc!=0);


}
void menuPaciente(){
int opc;

    do{
        cout<< "Bienvenido al menu de pacientes."<<endl;
        cout<< "------------------------------"<<endl<<endl;
        cout<< "Seleccione una opcion "<<endl;
        cout<< "1. Consultar sus datos"<<endl;
        cout<< "2. solicitar cita medica"<<endl;
        cout<< "0. Salir"<<endl;
        cout<<"Respuesta: ";cin >> opc;

        switch(opc){

            case 1  : system ("cls");consultarPropios(); break;
            case 2  : system ("cls");solicitar_cita(); break;
            case 0  : system ("cls"); break;
            default : cout<<"Número ingresado no válido\n\n"; limpiar(); break;
        }
    }while(opc!=0);


}
//funciones ingresar
void ingresar(){
int opcion;
    cout<< "Digite el tipo de usuario a ingresar: "<<endl;
    opcion=tipoUsuario();

    if (opcion == 1){
        ingresar_Gerente();
    } if (opcion == 2){
        ingresar_profesional();
    } if (opcion == 3){
        ingresar_personal_salud();
    } if (opcion == 4){
        ingresar_recepcion();
    } if (opcion == 5){
        ingresar_paciente();
    }
}
void ingresar_Gerente(){

    Gerente obj;

    obj.setUser();
    obj.setPassword();
    obj.setNumID();
    obj.setApellido();
    obj.setNombre();
    obj.setEdad();
    obj.setExperiencia();
    obj.setNivelEstudio();
    obj.setSalario();
    vecGerente.push_back(obj);
    cout<<"\nINGRESADO CON ÉXITO!";
    cout<< "\n\n";
limpiar();
}
void ingresar_profesional(){

    Profesionales obj;

    obj.setUser();
    obj.setPassword();
    obj.setNumID();
    obj.setApellido();
    obj.setNombre();
    obj.setEdad();
    obj.setProfesion();
    obj.setSalario();

    vecProfesionales.push_back(obj);
    cout<<"\nINGRESADO CON ÉXITO!";
    cout<< "\n\n";
limpiar();
}
void ingresar_personal_salud(){

    PersonalDeSalud obj;

    obj.setUser();
    obj.setPassword();
    obj.setNumID();
    obj.setApellido();
    obj.setNombre();
    obj.setEdad();
    obj.setHoras();
    obj.setSalario();

    vecPersoSalud.push_back(obj);
    cout<<"\nINGRESADO CON ÉXITO!";
    cout<< "\n\n";
    limpiar();
}
void ingresar_recepcion(){
    Recepcion obj;

    obj.setUser();
    obj.setPassword();
    obj.setNumID();
    obj.setApellido();
    obj.setNombre();
    obj.setEdad();
    obj.setHorasTrabajo();
    obj.setSalario();

    vecRecepcion.push_back(obj);
    cout<<"\nINGRESADO CON ÉXITO!";
    cout<< "\n\n";
    limpiar();
}
void ingresar_paciente(){
    Paciente obj;

    obj.setUser();
    obj.setPassword();
    obj.setNumID();
    obj.setApellido();
    obj.setNombre();
    obj.setEdad();
    obj.setEstado();

    vecPaciente.push_back(obj);
    cout<<"\nINGRESADO CON ÉXITO!";
    cout<< "\n\n";
    limpiar();
}

// funciones consultar por ID
void buscarID(){
    cout<< "ingrese el ID que desea buscar : ";
    cin>>buscar;
}
void consultar_ID(){
int opcion;

    opcion=tipoUsuario();

 if (opcion == 1){
        consultar_gerente();
    } if (opcion == 2){
         consultar_profesional();
    } if (opcion == 3){
         consultar_personal_salud();
    } if (opcion == 4){
         consultar_recepcion();
    } if (opcion == 5){
         consultar_paciente();
    }
}
void consultar_gerente(){
    buscarID();
    bool existe=false;
    if(vecGerente.size ()> 0){
            Gerente obj;

            for(int i = 0; i < vecGerente.size (); i++){

                obj = vecGerente.at(i);

                if(obj.getNumID() == buscar){
                    existe=true;
                    cout<<obj.toString();
                    cout<< "Nivel de estudio = "<< obj.getNivelEstudio()<<endl;
                    cout<< "Años de experiencia = "<<obj.getExperiencia()<<endl;
                    cout<< "Salario = "<< obj.getSalario()<<endl<<endl;
                    break;
                }

                }

                if(!existe){
                cout<<"No se encontró ese Gerente."<<endl<<endl;
                }
    }else{
        cout<< "No existe ningun Gerente."<<endl<<endl;
}
limpiar();
}
void consultar_profesional(){
    buscarID();
    bool existe=false;
    if(vecProfesionales.size ()> 0){
            Profesionales obj;

            for(int i = 0; i < vecProfesionales.size (); i++){

                obj = vecProfesionales.at(i);

                if(obj.getNumID() == buscar){
                    existe=true;
                    cout<<obj.toString();
                    cout<< "Profesion = "<< obj.getProfesion()<<endl;
                    cout<< "Salario = "<< obj.getSalario()<<endl<<endl;
                    break;
                }

            }
                if(!existe){
                cout<<"No se encontró ese profesional."<<endl<<endl;
                }
    }else{
        cout<< "No existe ningun Profesional."<<endl<<endl;
}limpiar();
}
void consultar_personal_salud(){
    buscarID();
    bool existe=false;
    if(vecPersoSalud.size ()> 0){
            PersonalDeSalud obj;

            for(int i = 0; i < vecPersoSalud.size (); i++){

                obj = vecPersoSalud.at(i);

                if(obj.getNumID() == buscar){
                    existe=true;
                    cout<<obj.toString();
                    cout<< "Cantidad de horas trabajadas = "<< obj.getHoras()<<endl;
                    cout<< "Salario = "<< obj.getSalario()<<endl<<endl;
                    break;
                }
            }
                if(!existe){
                cout<<"No se encontró ese personal de salud."<<endl<<endl;
                }
    }else{
        cout<< "No existe ningun Personal de salud."<<endl<<endl;
}limpiar();
}
void consultar_recepcion(){
        buscarID();
        bool existe=false;
    if(vecRecepcion.size ()> 0){
            Recepcion obj;

            for(int i = 0; i < vecRecepcion.size (); i++){

                obj = vecRecepcion.at(i);

                if(obj.getNumID() == buscar){
                    existe=true;
                    cout<<obj.toString();
                    cout<< "Cantidad de horas trabajadas = "<< obj.getHorasTrabajo()<<endl;
                    cout<< "Salario = "<< obj.getSalario()<<endl<<endl;
                    break;
                }
            }
                if(!existe){
                cout<<"No se encontró ese ID de recepción."<<endl<<endl;
                }
    }else{
        cout<< "No existe ningun Recepcionista."<<endl<<endl;
} limpiar();
}
void consultar_paciente(){
        buscarID();
        bool existe=false;
    if(vecPaciente.size ()> 0){
            Paciente obj;

            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if(obj.getNumID() == buscar){
                    existe=true;
                    cout<<obj.toString();
                    cout<< "Estado = "<< obj.getEstado()<<endl;
                    break;
                }

            }
                if(!existe){
                cout<<"No se encontró ese Paciente."<<endl<<endl;
                }
    }else{
        cout<< "No existe ningun Paciente."<<endl<<endl;
}limpiar();
}
//Modificar nombre de cuenta o su contraseña
void modificar_Datos(){
int opcion;

    opcion=tipoUsuario();

    if(opcion == 1){
        modificar_Gerente();
    }if(opcion == 2){
        modificar_profesional();
    }if(opcion == 3){
        modificar_personal_salud();
    }if(opcion == 4){
        modificar_recepcion();
    }if(opcion == 5){
        modificar_paciente();
    }
}
void modificar_Gerente(){
bool existe=false;
                if(vecGerente.size ()> 0){

                    int opci, UsuCambiar;
                    cout<< "A cual usuario le desea hacer el cambio?"<<endl;
                    cout<< "Ingrese el numero de ID : ";
                    cin>> UsuCambiar;

                    Gerente obj;

                    for(int i = 0; i <vecGerente.size (); i++){

                            obj = vecGerente.at(i);
                    if(UsuCambiar == obj.getNumID()){

                    existe=true;
                    cout<< "Que dato desea cambiar?"<<endl;
                    cout<< "------------------------"<<endl<<endl;
                    cout<< "1. Nombre de cuenta."<<endl;
                    cout<< "2. Contraseña de cuenta."<<endl;
                    cin>> opci;

                            if(opci == 1){

                                    cout<< "Usted va a ingresar el nuevo nombre de cuenta (user): \n"<<endl;
                                    obj.setUser();
                                    vecGerente.at(i) = obj;
                                    break;

                            }if(opci == 2){
                                    cout<< "Usted va a ingresar la contraseña: \n"<<endl;
                                    obj.setPassword();
                                    vecGerente.at(i) = obj;
                                    break;
                            }

                    }
                }
                if(!existe){
                cout<< "Ese Gerente no se encuentra en el sistema."<<endl<<endl;
                }

            }else{
                cout<< "No hay ningun Gerente."<<endl<<endl;
            }limpiar();
}
void modificar_profesional(){
    bool existe=false;
                if(vecProfesionales.size ()> 0){

                    int opci, UsuCambiar;
                    cout<< "A cual usuario le desea hacer el cambio?"<<endl;
                    cout<< "Ingrese el numero de ID: ";
                    cin>> UsuCambiar;

                    Profesionales obj;

                    for(int i = 0; i <vecProfesionales.size (); i++){

                            obj = vecProfesionales.at(i);
                    if(UsuCambiar == obj.getNumID()){
                    existe=true;
                    cout<< "Que dato desea cambiar?"<<endl;
                    cout<< "------------------------"<<endl<<endl;
                    cout<< "1. Nombre de cuenta."<<endl;
                    cout<< "2. Contraseña de cuenta."<<endl;
                    cin>> opci;

                            if(opci == 1){

                                    cout<< "Usted va a ingresar el nuevo nombre de cuenta (user): \n"<<endl;
                                    obj.setUser();
                                    vecProfesionales.at(i) = obj;
                                    break;

                            }if(opci == 2){
                                    cout<< "Usted va a ingresar la nueva contraseña: \n"<<endl;
                                    obj.setPassword();
                                    vecProfesionales.at(i) = obj;
                                    break;
                            }

                    }
                }
                if(!existe){
                cout<< "Ese Profesional no se encuentra en el sistema."<<endl<<endl;
                }
            }else{
                cout<< "No hay ningun Profesional."<<endl<<endl;
            }limpiar();
}
void modificar_personal_salud(){
    bool existe=false;
      if(vecPersoSalud.size ()> 0){

                    int opci, UsuCambiar;
                    cout<< "A cual usuario le desea hacer el cambio?"<<endl;
                    cout<< "Ingrese el numero de ID : ";
                    cin>> UsuCambiar;

                    PersonalDeSalud obj;

                    for(int i = 0; i <vecPersoSalud.size (); i++){

                            obj = vecPersoSalud.at(i);
                    if(UsuCambiar == obj.getNumID()){
                    existe=true;
                    cout<< "Que dato desea cambiar?"<<endl;
                    cout<< "------------------------"<<endl<<endl;
                    cout<< "1. Nombre de cuenta."<<endl;
                    cout<< "2. Contraseña de cuenta."<<endl;
                    cin>> opci;

                            if(opci == 1){

                                    cout<< "Usted va a ingresar el nuevo nombre de cuenta (user): \n"<<endl;
                                    obj.setUser();
                                    vecPersoSalud.at(i) = obj;
                                    break;

                            }if(opci == 2){
                                    cout<< "Usted va a ingresar la nueva contraseña: \n"<<endl;
                                    obj.setPassword();
                                    vecPersoSalud.at(i) = obj;
                                    break;

                            }

                    }
                }
                if(!existe){
                cout<< "Ese Personal de salud no se encuentra en el sistema."<<endl<<endl;
                }
            }else{
                cout<< "No hay ningun personal de salud."<<endl<<endl;
            }limpiar();
}
void modificar_recepcion(){
    bool existe=false;
     if(vecRecepcion.size ()> 0){

                    int opci, UsuCambiar;
                    cout<< "A cual usuario le desea hacer el cambio?"<<endl;
                    cout<< "Ingrese el numero de ID : ";
                    cin>> UsuCambiar;

                    Recepcion obj;

                    for(int i = 0; i <vecRecepcion.size (); i++){

                            obj = vecRecepcion.at(i);
                    if(UsuCambiar == obj.getNumID()){
                    existe=true;
                    cout<< "Que dato desea cambiar?"<<endl;
                    cout<< "------------------------"<<endl<<endl;
                    cout<< "1. Nombre de cuenta."<<endl;
                    cout<< "2. Contraseña de cuenta."<<endl;
                    cin>> opci;

                            if(opci == 1){

                                    cout<< "Usted va a ingresar el nuevo nombre de cuenta (user): \n"<<endl;
                                    obj.setUser();
                                    vecRecepcion.at(i) = obj;
                                    break;

                            }if(opci == 2){
                                    cout<< "Usted va a ingresar la nueva contraseña: \n"<<endl;
                                    obj.setPassword();
                                    vecRecepcion.at(i) = obj;
                                    break;
                            }

                    }
                }
                if(!existe){
                cout<< "Ese recepcionista no se encuentra en el sistema."<<endl<<endl;
                }

            }else{
                cout<< "No hay ningun recepcionista."<<endl<<endl;
            }limpiar();
}
void modificar_paciente(){
    bool existe=false;
            if(vecPaciente.size ()> 0){

                    int opci, UsuCambiar;
                    cout<< "A cual usuario le desea hacer el cambio?"<<endl;
                    cout<< "Ingrese el numero de ID : ";
                    cin>> UsuCambiar;

                    Paciente obj;

                    for(int i = 0; i <vecPaciente.size (); i++){

                            obj = vecPaciente.at(i);
                    if(UsuCambiar == obj.getNumID()){
                    existe=true;
                    cout<< "Que dato desea cambiar?"<<endl;
                    cout<< "------------------------"<<endl<<endl;
                    cout<< "1. Nombre de cuenta."<<endl;
                    cout<< "2. Contraseña de cuenta."<<endl;
                    cin>> opci;

                            if(opci == 1){

                                    cout<< "Usted va a ingresar el nuevo nombre de cuenta (user): \n"<<endl;
                                    obj.setUser();
                                    vecPaciente.at(i) = obj;
                                    break;

                            }if(opci == 2){
                                    cout<< "Usted va a ingresar la nueva contraseña: \n"<<endl;
                                    obj.setPassword();
                                    vecPaciente.at(i) = obj;
                                    break;
                            }

                    }
                }
                if(!existe){
                cout<< "Ese Paciente no se encuentra en el sistema."<<endl<<endl;
                }

            }else{
                cout<< "No hay ningun paciente."<<endl<<endl;
            }limpiar();
}

void validar_procedimiento(){
    bool existe=false;
    long buscar;


    if(vecProce.size ()> 0){
       cout<< "Ingrese la ID del paciente al que le desea validar el procedimiento: "; cin>>buscar;
            Procedimientos obj;

            for(int i = 0; i < vecProce.size (); i++){

                obj = vecProce.at(i);

                if(obj.getNumID() == buscar){
                        existe=true;
                        obj.setAutorizado(true);
                        vecProce.at(i)=obj;
                        cout<< "A este usuario ya se le ha autorizado el procedimiento con exito."<<endl<<endl;

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente al que se le haya asignado un procedimiento medico."<<endl<<endl;
  }limpiar();
}
void programar_procesos(){
    long buscar;
    bool existe=false;


     if(vecPaciente.size ()> 0){
        cout<< "Ingrese la ID del paciente al que le desea programar un procedimiento: "; cin>>buscar;
            Paciente obj;

            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                Procedimientos proce;

                proce.setNumID(obj.getNumID());
                proce.setNombre(obj.getNombre());
                proce.setApellido(obj.getApellido());
                proce.setEdad(obj.getEdad());

                proce.setAutorizado(false);
                proce.setTipoProce();
                proce.setFecha();
                proce.setHora();

                vecProce.push_back(proce);
                cout<< "\n\n";

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente."<<endl<<endl;
  }limpiar();

}
void consultar_procesos(){
         int buscar;
         bool existe=false;


    if(vecProce.size ()> 0){
     cout<< "Ingrese la ID del paciente al que le desea consultar el procedimiento: ";
     cin>> buscar;
            Procedimientos obj;

            for(int i = 0; i < vecProce.size (); i++){

                obj = vecProce.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                cout<<obj.informa()<<endl;
                if(obj.getAutorizado()== false){
                    cout<<"El procedimiento aun no ha sido autorizado"<<endl<<endl;
                } else {
                     cout<<"El procedimiento ha sido autorizado"<<endl<<endl;
                }
                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente con procedimientos asignados."<<endl<<endl;
 }limpiar();
}

void autorizar_medica(){
double buscar;
bool existe=false;


      if(vecMedica.size ()> 0){
      cout<< "Ingrese la ID del paciente al que le desea autorizar el medicamento: ";
     cin>> buscar;
            Medicamentos obj;

            for(int i = 0; i < vecMedica.size (); i++){

                obj = vecMedica.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                        obj.setAutorizado(true);
                        vecMedica.at(i)=obj;
                        cout<< "A este usuario ya se le ha autorizado el medicamento con exito"<<endl<<endl;

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente al que se le haya asignado un medicamento."<<endl<<endl;
  }limpiar();
}
void asignar_medica(){
 double buscar;
 bool existe=false;

     if(vecPaciente.size ()> 0){
    cout<< "Ingrese la ID del paciente al que le desea asignar un medicamento: ";
     cin>> buscar;
     Paciente obj;

            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                Medicamentos medi;

                medi.setNumID(obj.getNumID());
                medi.setNombre(obj.getNombre());
                medi.setApellido(obj.getApellido());
                medi.setEdad(obj.getEdad());

                medi.setAutorizado(false);

                medi.setNombreMedica();
                medi.setCant();

                vecMedica.push_back(medi);
                cout<< "\n\n";

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente."<<endl<<endl;
  }limpiar();
}
void consultar_medicamen(){
    int buscar;
    bool existe=false;

    if(vecMedica.size ()> 0){

            cout<< "Ingrese la ID del paciente al que le desea consultar el medicamento: ";
            cin>> buscar;


            Medicamentos obj;

            for(int i = 0; i < vecMedica.size (); i++){

                obj = vecMedica.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                cout<<obj.info();
                if(obj.getAutorizado()== false){
                    cout<<"El medicamento aun no ha sido autorizado"<<endl<<endl;
                } else {
                     cout<<"El medicamento ha sido autorizado"<<endl<<endl;
                }
                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente con medicamentos asignados."<<endl<<endl;
 }limpiar();
}

//citas medicas
void consultar_cita(){
     int buscar;
    bool existe=false;

    if(vecCitas.size ()> 0){
     cout<< "Ingrese la ID del paciente al que le desea consultar la cita: ";
     cin>> buscar;
            Citas obj;

            for(int i = 0; i < vecCitas.size (); i++){

                obj = vecCitas.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                cout<<obj.Descripcion()<<endl<<endl;
                if(obj.getAutorizado()== false){
                    cout<<"La cita aun no ha sido autorizado"<<endl<<endl;
                } else {
                     cout<<"La cita ha sido autorizado"<<endl<<endl;
                }
                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente con citas asignadas."<<endl<<endl;
 }limpiar();
}
void asignar_cita(){

     double buscar;
    bool existe=false;

     if(vecPaciente.size ()> 0){
     cout<< "Ingrese la ID del paciente al que le desea asignar una cita: ";
     cin>> buscar;
            Paciente obj;

            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                Citas cita;

                cita.setNumID(obj.getNumID());
                cita.setNombre(obj.getNombre());
                cita.setApellido(obj.getApellido());
                cita.setEdad(obj.getEdad());

                cita.setAutorizado(false);
                cita.setAsignado(true);
                cita.setFecha();
                cita.setHora();
                cita.setTipoCita();
                cita.setAtendido();

                vecCitas.push_back(cita);
                cout<< "\n\n";

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente."<<endl<<endl;
  }limpiar();
}
void autorizar_cita(){

     double buscar;
     bool existe=false;

      if(vecCitas.size ()> 0){
     cout<< "Ingrese la ID del paciente al que le desea autorizar la cita: ";
     cin>> buscar;
            Citas obj;

            for(int i = 0; i < vecCitas.size (); i++){

                obj = vecCitas.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                        obj.setAutorizado(true);
                        vecCitas.at(i)=obj;
                        cout<< "A este usuario ya se le ha autorizado la cita con exito"<<endl<<endl;

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente al que se le haya asignado una cita medica."<<endl<<endl;
  }limpiar();
}
void solicitar_cita(){

     double buscar;
    bool existe=false;

     if(vecPaciente.size ()> 0){
     cout<< "Ingrese su numero de ID: ";
     cin>> buscar;
            Paciente obj;

            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                Citas cita;

                cita.setNumID(obj.getNumID());
                cita.setNombre(obj.getNombre());
                cita.setApellido(obj.getApellido());
                cita.setEdad(obj.getEdad());

                cita.setAutorizado(false);
                cita.setAsignado(false);
                cita.setTipoCita();

                vecCitas.push_back(cita);
                cout<< "\n\n";

                cout<< "Su cita ya se ha solicitado, acerquese a recepcion para que esta "<<endl;
                cout<< "sea asignada y autorizada correctamente. "<<endl;
                cout<< "Muchas gracias por confiar en nostros. :)"<<endl;
                break;

                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "NO HAY PACIENTES REGISTRADOS."<<endl<<endl;
  }limpiar();
}

void usuariosDefault(){

//GERENTE --------- Profesional  Especialista  Maestria  Doctorado
Gerente ger1;

ger1.setNombre("Daniel Esteban");
ger1.setApellido("Marquez Upegui");
ger1.setUser("Daniel");
ger1.setPassword("d123.");
ger1.setEdad(18);
ger1.setNumID(1);
//clase
ger1.setNivelEstudio("Profesional");
ger1.setExperiencia(3);
ger1.setSalario();
vecGerente.push_back(ger1);
//-----------------------------------
//PROFESIONAL ---------
Profesionales prof1;

prof1.setNombre("Juan Esteban");
prof1.setApellido("Vargas");
prof1.setUser("vargas2000");
prof1.setPassword("JV222.");
prof1.setEdad(19);
prof1.setNumID(2);
//clase
prof1.setProfesion("Profesional");
prof1.setSalario();
vecProfesionales.push_back(prof1);
//-----------------------------------
//Personal De Salud ---------
PersonalDeSalud salud1;

salud1.setNombre("Gabriela");
salud1.setApellido("Suarez Cardenas");
salud1.setUser("gabriela");
salud1.setPassword("GS33.");
salud1.setEdad(19);
salud1.setNumID(3);
//clase
salud1.setHoras(240);
salud1.setSalario();
vecPersoSalud.push_back(salud1);
//-----------------------------------
//Recepcion ---------
Recepcion recep1;

recep1.setNombre("Gina");
recep1.setApellido("Paola");
recep1.setUser("ginaP");
recep1.setPassword("GP51");
recep1.setEdad(19);
recep1.setNumID(4);
//clase
recep1.setHorasTrabajo(240);
recep1.setSalario();
vecRecepcion.push_back(recep1);
//-----------------------------------
//Paciente ---------
Paciente pacien1;

pacien1.setNombre("Carlos");
pacien1.setApellido("Rojas");
pacien1.setUser("carlos10");
pacien1.setPassword("carlitos2003");
pacien1.setEdad(20);
pacien1.setNumID(5);
//clase
pacien1.setEstado("Beneficiario");
vecPaciente.push_back(pacien1);
//-----------------------------------

}

void limpiar(){
    system("pause");
    system("cls");
}

void consultarPropios(){
Paciente tmp;

        cout<<"Sus datos son: \n\n";
            for(int i = 0; i < vecPaciente.size (); i++){

                tmp = vecPaciente.at(i);

                if(tmp.getUser() == userPropios){
                    cout<<tmp.toString();
                    cout<< "Estado = "<< tmp.getEstado()<<endl;
                    cout<<"\n\n";
                    limpiar();
                    break;
                }
            }

}
void asignar_historial(){
 double buscar;
 bool existe=false;

     if(vecPaciente.size ()> 0){
     cout<< "Ingrese la ID del paciente al que le desea asignar un historial: ";
     cin>> buscar;
            Paciente obj;

            for(int i = 0; i < vecPaciente.size (); i++){

                obj = vecPaciente.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                HistorialMedico historial;

                historial.setNumID(obj.getNumID());
                historial.setNombre(obj.getNombre());
                historial.setApellido(obj.getApellido());
                historial.setEdad(obj.getEdad());

                historial.setAlergias();
                historial.setEnfermedades();
                historial.setCantProcedimientos();

                vecHistorial.push_back(historial);
                cout<< "\n\n";

                    break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun Paciente."<<endl<<endl;
  }
}
void consultar_historial(){
    int buscar;
    bool existe=false;
    if(vecHistorial.size ()> 0){
     cout<< "Ingrese la ID del paciente al que le desea consultar el medicamento: ";
     cin>> buscar;

            HistorialMedico obj;

            for(int i = 0; i < vecHistorial.size (); i++){

                obj = vecHistorial.at(i);

                if(obj.getNumID() == buscar){ existe=true;

                cout<<obj.infoHistorial();

                break;
                }
            }
            if(!existe){
               cout<< "No se encontro ese Paciente."<< endl<<endl;
            }
    }else{
        cout<< "No existe ningun paciente con historial medico."<<endl<<endl;
 }
}


int main()
{
setlocale(LC_ALL,"");
usuariosDefault();
login();
}
