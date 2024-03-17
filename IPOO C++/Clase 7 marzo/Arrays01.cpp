#include<iostream>
#include<cstdlib> //srand(), rand()
#include<ctime>//time()
using namespace std;

int *valores;
int tam;

//Declaración de prototipos de funciones
void imprimir();
void leer_datos();
void menu();
void sumatoria();
void llenar();
void frecuencia();
void leer_tam();
void inverso();


int main(){
    setlocale(LC_ALL,"");
    leer_tam();
    menu();

return 0;
}

//Implementación de funciones

//Menu ------------------------------------------------
void menu(){
    int opc;

    do{
        cout<<"\n\n----------------------------"<<endl;
        cout<<"1. Asignar tamaño al array"<<endl;
        cout<<"2. Leer datos"<<endl;
        cout<<"3. Llenar datos aleatorios"<<endl;
        cout<<"4. Cuantas veces se repite el dato"<<endl;
        cout<<"5. Sumatoria de datos leidos"<<endl;
        cout<<"6. imprimir"<<endl;
        cout<<"0. Salir de la aplicación"<<"\n\n";
        cout<<"Seleccione una opcion: ";cin>>opc;


        switch(opc){
            case 1: leer_tam(); break;
            case 2: leer_datos(); break;
            case 3: llenar(); break;
            case 4: frecuencia(); break;
            case 5: sumatoria(); break;
            case 6: imprimir(); break;
            case 0: cout<<"Fin del programa"<<endl; break;
            default: cout<<"Opcion incorrecta";
    }
}while(opc != 0);
}

//Imprimir ------------------------------------------------
void imprimir(){
    cout<<"Elementos del Array valores[]"<<endl;
    for(int i = 0; i < tam; i++){
    cout<<"valores["<<i<<"] = "<<valores[i]<<"\n";
}

}

//leer_datos ------------------------------------------------
void leer_datos(){
    cout<<"Ingreso de datos al arreglo"<<endl;
    for(int i=0; i<tam; i++){
        cout<<"valores["<<i<<"] = "; cin>>valores[i];
    }
}

//sumatoria -------------------------------------------------
void sumatoria(){

    long suma=0;

    for(int i=0;i<tam;i++){
        suma+=valores[i];
    } cout<<"La sumatoria es: "<<suma<<endl;
}

//llenar -------------------------------------------------
void llenar(){

    srand(time(NULL)); //Genera una nueva semilla de numeros aleatorios

    for(int i=0;i<tam;i++){
        valores[i]=1+rand()%10;
    } cout<<"Datos llenados con éxito";
}

//frecuencia -------------------------------------------------
void frecuencia(){
    int cantidad=0, valor_buscar;

    cout<<"ingrese el valor a buscar: "; cin>>valor_buscar;

    for(int i=0; i<tam; i++){
        if(valores[i] == valor_buscar){
                cantidad++;
                }
    }
    cout<<valor_buscar<<" está "<<cantidad<<" veces"<<endl;
}

//leer tamaño del array -------------------------------------------------
void leer_tam(){
    cout<<"Ingrese la cantidad de elementos para el Array"<<endl; cin>>tam;
    valores=new int[tam];
}

//Llamar de manera inversa al array -------------------------------------------------
void inverso(){
    cout<<"Inverso del arreglo valores"<<endl;

    for(int i= (tam-1); i>=0; i--){
        cout<<"valores["<<i<<"] = "<<valores[i]<<endl;
    }
}
