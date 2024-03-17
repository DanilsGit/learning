/*
DANIEL ESTEBAN MARQUEZ UPEGUI 202160028
GABRIELA SUAREZ CARDENAS 202160081

*/

#include<iostream>
using namespace std;


//Variables
int tam=0;
char *tipos_art;
int**articulos;


//Funciones
void leer_cant_art();
//------
void creacion_matriz();
void imprimir_factura();
void leer_articulo();
void datos_extras();
void neto();

int main(){
leer_cant_art();
leer_articulo();
imprimir_factura();
neto();
datos_extras();
return 0;
}

void leer_cant_art(){
    cout<<"--    --   --  --  SISTEMA DE FACTURAS   --    --  --   --"<<endl<<endl;
    cout<<"Ingrese la cantidad de articulos a comprar"<<endl; cin>>tam;
    tipos_art=new char[tam];
    creacion_matriz();
}

void creacion_matriz(){
    int filas=tam, columnas=3;
    articulos=new int*[filas];
    for(int i=0; i<filas; i++){
        articulos[i]= new int[columnas];
    }
}


void leer_articulo(){
char articulo;
    cout<<"\naPRODUCTOS:"<<endl;
    cout<<"A = Aseo personal:"<<endl;
    cout<<"S = Aseo del hogar:"<<endl;
    cout<<"L = Lacteos:"<<endl;
    cout<<"C = Carnicos:"<<endl;
    cout<<"G = Granos:"<<endl<<endl;

    for(int i=0; i<tam; i++){
        cout<<"Articulo "<<i<<" : ";cin>>articulo;
        tipos_art[i] = articulo;

        cout<<"Digite el precio del articulo : "; cin>>articulos[i][0];
        cout<<"Digite la cantidad de articulos : "; cin>>articulos[i][1];
        articulos[i][2] = articulos[i][0] * articulos[i][1];
    }
}



void imprimir_factura(){
    cout<<"\n\nTIPO DE ARTICULO - VALOR UNITARIO - CANT. ARTICULOS - SUBTOTAL- ARTICULOS"<<endl;

    for(int f=0; f<tam; f++){
        cout<<tipos_art[f]<<"                   ";
        for(int c=0;c<3;c++){
            cout<<articulos[f][c]<<"                   ";
        }
        cout<<endl<<endl;
    }

}

int Cneto;

void neto(){

    for(int f=0;f<tam;f++){
            Cneto+=articulos[f][2];
    }
}


void datos_extras(){

cout<<"Cantidad de articulos en total : "<<tam<<endl;
cout<<"NETO : "<<Cneto<<endl;
cout<<"IVA : 19%"<<endl;
cout<<"Valor del IVA : "<<(Cneto*0.19)<<endl;
cout<<"Valor con IVA : "<<(Cneto*1.19)<<endl;
}






