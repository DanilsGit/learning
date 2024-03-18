#include <iostream>
#include <vector>
#include<windows.h>
#include"Docente.h"
#include"DTC.h"
#include"DHC.h"
#include"Monitor.h"
#include"DMT.h"
using namespace std;

//Declaración de funciones
void menu();
void ingresar();
void consulta_ID();
void Listado_tipo_docente();
void valor_pagar();
int sabertipo();

//Variables

vector <DHC> vecDHC;
vector <DMT> vecDMT;
vector <DTC> vecDTC;
vector <Monitor> vecMonitor;


//Funciones

void menu()
{
    int opc;

    do
    {
        cout<< "Menú"<<endl;
        cout<< "---------------------"<<endl;
        cout<< "1. Crear un nuevo docente"<<endl;
        cout<< "2. Consulta por numero de ID"<<endl;
        cout<< "3. Listado por tipo de docente"<<endl;
        cout<< "4. Mostra el valor a pagar a todos los docentes"<<endl;
        cout<< "0. Salir"<<endl;
        cout<< "Seleccione una opción : ";
        cin >> opc;
        switch(opc)
        {

        case 1  :
            system ("cls");
            ingresar();
            break;
        case 2  :
            system ("cls");
            consulta_ID();
            break;
        case 3  :
            system ("cls");
            Listado_tipo_docente();
            break;
        case 4  :
            system ("cls");
            valor_pagar();
            break;
        case 0  :
            system ("cls");
            break;

        default :
            cout<<" opcion incorrecta"<<endl;
        }

    }
    while(opc != 0);
}

int sabertipo()
{
    int tipo;
    cout<<"Ingrese el tipo de docente\n";
    cout<<"[1| DTC]\n"<<"[2| DHC]\n"<< "[3| DMT]\n"<< "[4| MONITOR]";
    do
    {
        cout<<"\nOpción : ";
        cin>>tipo;
        if(tipo<1 || tipo>4)
        {
            cout<<"Digite un número válido";
        }
    }
    while(tipo<1 || tipo>4);

    return tipo;
}

void ingresar()
{

    cout<<"--- Ingresar un nuevo docente ---\n\n";
    int tipo;
    tipo=sabertipo();

    if (tipo == 1)
    {
        DTC objDTC;

        objDTC.setNumID();
        objDTC.setNombre();
        objDTC.setApellido();
        objDTC.setProfesion();
        objDTC.setCantHorasInv();
        objDTC.setSalario();

        vecDTC.push_back(objDTC);
        cout<< "DTC agregado! \n\n";
    }

    if (tipo == 2)
    {
        DHC objDHC;

        objDHC.setNumID();
        objDHC.setNombre();
        objDHC.setApellido();
        objDHC.setProfesion();
        objDHC.setCantHT();
        objDHC.setNivelEST();
        objDHC.setSalario();

        vecDHC.push_back(objDHC);
        cout<< "DHC agregado! \n\n";
    }

    if(tipo == 3 )
    {
        DMT objDMT;

        objDMT.setNumID();
        objDMT.setNombre();
        objDMT.setApellido();
        objDMT.setProfesion();
        objDMT.setCantTrabajos();
        objDMT.setSalario();

        vecDMT.push_back(objDMT);
        cout<< "DMT agregado! \n\n";
    }

    if(tipo == 4 )
    {
        Monitor objmonitor;

        objmonitor.setNumID();
        objmonitor.setNombre();
        objmonitor.setApellido();
        objmonitor.setProfesion();
        objmonitor.setCantidadHT();
        objmonitor.setSalario();

        vecMonitor.push_back(objmonitor);
        cout<< "MONITOR agregado! \n\n";
    }

    system("pause");
    system ("cls");
}

void consulta_ID()
{
    cout<<"--- Consultar docente por ID ---\n\n";
    int tipo;
    tipo=sabertipo();
    long idBuscar=0;
    if(tipo==1)
    {
        if(vecDTC.size() > 0)
        {
            DTC tmp;
            bool existe = false;
            idBuscar=0;

            cout<< "ingrese el número de ID a buscar: ";
            cin>> idBuscar;


            for (int i = 0; i<vecDTC.size(); i++)
            {
                tmp = vecDTC[i];
                if(tmp.getNumID() == idBuscar)
                {
                    existe = true;
                    cout<<"\n"<<tmp.toString();
                    cout<<"Cantidad de horas de investigación: "<<tmp.getCantHorasInv()<<endl<<endl;
                }
            }
            if (!existe )
            {
                cout<< "No existe un DTC con el código "<<idBuscar<<endl<<endl;
            }
        }
        else
        {
            cout<< "No existen DTC en el sistema"<<endl<<endl;
        }

    }

    if(tipo==2)
    {
        if(vecDHC.size() > 0)
        {
            DHC tmp;
            idBuscar=0;
            bool existe = false;

            cout<< "ingrese el número de ID a buscar: ";
            cin>> idBuscar;


            for (int i = 0; i<vecDHC.size(); i++)
            {
                tmp = vecDHC[i];
                if(tmp.getNumID() == idBuscar)
                {
                    existe = true;
                    cout<<"\n"<<tmp.toString();
                    cout<<"Cantidad de horas trabajadas: "<<tmp.getCantHT()
                        <<endl<<"Nivel de estudios: "<<tmp.getNivelEST()<<endl<<endl;;
                }
            }
            if (!existe)
            {
                cout<< "No existe un DHC con el código "<<idBuscar<<endl<<endl;
            }
        }
        else
        {
            cout<< "No existen DHC en el sistema"<<endl<<endl;
        }

    }

    if(tipo==3)
    {
        if(vecDMT.size() > 0)
        {
            DMT tmp;
            idBuscar=0;
            bool existe = false;

            cout<< "ingrese el número de ID a buscar: ";
            cin>> idBuscar;


            for (int i = 0; i<vecDMT.size(); i++)
            {
                tmp = vecDMT[i];
                if(tmp.getNumID() == idBuscar)
                {
                    existe = true;
                    cout<<"\n"<<tmp.toString();
                    cout<<"Cantidad de trabajos dirigidos: "<<tmp.getCantTrabajos()<<endl<<endl;
                }
            }
            if (!existe)
            {
                cout<< "No existe un DMT con el código "<<idBuscar<<endl<<endl;
            }
        }
        else
        {
            cout<< "No existen DMT en el sistema"<<endl<<endl;
        }

    }

    if(tipo==4)
    {
        if(vecDMT.size() > 0)
        {
            Monitor tmp;
            idBuscar=0;
            bool existe = false;

            cout<< "ingrese el número de ID a buscar: ";
            cin>> idBuscar;


            for (int i = 0; i<vecDMT.size(); i++)
            {
                tmp = vecMonitor[i];
                if(tmp.getNumID() == idBuscar)
                {
                    existe = true;
                    cout<<"\n"<<tmp.toString();
                    cout<<"Cantidad de trabajos dirigidos: "<<tmp.getCantidadHT()<<endl<<endl;;
                }
            }
            if (!existe)
            {
                cout<<"No existe un monitor con el código "<<idBuscar<<endl<<endl;
            }
        }
        else
        {
            cout<<"No existen monitores en el sistema"<<endl<<endl;
        }

    }

    system("pause");
    system ("cls");
}

void Listado_tipo_docente()
{

    cout<<"--- Listado de docentes ---\n\n";
    int tipo;
    tipo=sabertipo();

    if(tipo==1)
    {
        if(vecDTC.size() > 0)
        {
            DTC tmp;

            for (int i = 0; i<vecDTC.size(); i++)
            {
                tmp = vecDTC[i];

                cout<<"\n"<<tmp.toString();
                cout<<"Cantidad de horas de investigación: "<<tmp.getCantHorasInv()<<endl<<endl;

            }
        }
        else
        {
            cout<< "No existen DTC en el sistema"<<endl<<endl;
        }

    }

    if(tipo==2)
    {
        if(vecDHC.size() > 0)
        {
            DHC tmp;

            for (int i = 0; i<vecDHC.size(); i++)
            {
                tmp = vecDHC[i];

                cout<<"\n"<<tmp.toString();
                cout<<"Cantidad de horas trabajadas: "<<tmp.getCantHT()
                    <<endl<<"Nivel de estudios: "<<tmp.getNivelEST()<<endl<<endl;;

            }

        }
        else
        {
            cout<< "No existen DHC en el sistema"<<endl<<endl;
        }

    }

    if(tipo==3)
    {
        if(vecDMT.size() > 0)
        {
            DMT tmp;

            for (int i = 0; i<vecDMT.size(); i++)
            {
                tmp = vecDMT[i];

                cout<<"\n"<<tmp.toString();
                cout<<"Cantidad de trabajos dirigidos: "<<tmp.getCantTrabajos()<<endl<<endl;;

            }

        }
        else
        {
            cout<< "No existen DMT en el sistema"<<endl<<endl;
        }

    }

    if(tipo==4)
    {
        if(vecDMT.size() > 0)
        {
            Monitor tmp;

            for (int i = 0; i<vecDMT.size(); i++)
            {
                tmp = vecMonitor[i];

                cout<<"\n"<<tmp.toString();
                cout<<"Cantidad de trabajos dirigidos: "<<tmp.getCantidadHT()<<endl<<endl;;
            }
        }
        else
        {
            cout<< "No existen monitores en el sistema"<<endl<<endl;
        }

    }


    system("pause");
    system ("cls");
}

void valor_pagar()
{
    cout<<"--- Valor a pagar a todos los docentes ---\n\n";
    int tipo;
    long cantidad=0;
    double sumaSalarios=0;
    tipo=sabertipo();

    if(tipo==1)
    {
        cantidad=0;
        sumaSalarios=0;

        if(vecDTC.size() > 0)
        {
            DTC tmp;

            for (int i = 0; i<vecDTC.size(); i++)
            {
                tmp = vecDTC[i];
                cantidad++;
                sumaSalarios+=tmp.getSalario();
            }

            cout<<"El valor a pagar de los "<<cantidad<<" DTC registrados es :"<<sumaSalarios<<"\n\n";
        }
        else
        {
            cout<< "No existen DTC en el sistema"<<endl<<endl;
        }

    }

    if(tipo==2)
    {
        cantidad=0;
        sumaSalarios=0;

        if(vecDHC.size() > 0)
        {
            DHC tmp;

            for (int i = 0; i<vecDHC.size(); i++)
            {
                tmp = vecDHC[i];
                cantidad++;
                sumaSalarios+=tmp.getSalario();
            }

            cout<<"El valor a pagar de los "<<cantidad<<" DHC registrados es :"<<sumaSalarios<<"\n\n";
        }
        else
        {
            cout<< "No existen DHC en el sistema"<<endl<<endl;
        }

    }

    if(tipo==3)
    {
        cantidad=0;
        sumaSalarios=0;

        if(vecDMT.size() > 0)
        {
            DMT tmp;

            for (int i = 0; i<vecDMT.size(); i++)
            {
                tmp = vecDMT[i];
                cantidad++;
                sumaSalarios+=tmp.getSalario();
            }

            cout<<"El valor a pagar de los "<<cantidad<<" DMT registrados es :"<<sumaSalarios<<"\n\n";
        }
        else
        {
            cout<< "No existen DMT en el sistema"<<endl<<endl;
        }

    }

    if(tipo==4)
    {
        cantidad=0;
        sumaSalarios=0;

        if(vecMonitor.size() > 0)
        {
            Monitor tmp;

            for (int i = 0; i<vecMonitor.size(); i++)
            {
                tmp = vecMonitor[i];
                cantidad++;
                sumaSalarios+=tmp.getSalario();
            }

            cout<<"El valor a pagar a los "<<cantidad<<" monitores registrados es : "<<sumaSalarios<<"\n\n";
        }
        else
        {
            cout<< "No existen monitores en el sistema"<<endl<<endl;
        }

    }

    system("pause");
    system ("cls");
}


int main()
{
    setlocale(LC_ALL,"");
    menu();


    return 0;
}
