#include<iostream>
using namespace std;

//Variables
int filaA,columnaA,filaB,columnaB,tamM;


//Funciones
int *unionDeMatrices(int **a, int **b);
void proceso();
void creacion();
void leer(int **a, int **b, int *m);
void limpiar(int **a, int **b, int *m);
void imprimir(int **a, int **b, int *m);


int main(){
setlocale(LC_ALL, "");
proceso();
return 0;
}


void proceso(){

int **a;
int **b;
int *m;

    creacion(a,b,m);
    limpiar(a,b,m);
    leer(a,b,m);
    imprimir(a,b,m);

    m=unionDeMatrices(a,b);

}

void limpiar(int **a, int **b, int *m){

    for(int f=0;f<filaA;f++){
        for(int c=0;c<columnaA;c++){
            a[f][c]=0;
        }

    }

    for(int f=0;f<filaB;f++){
        for(int c=0;c<columnaB;c++){
            b[f][c]=0;
        }

    }

    for(int i=0;i<tamM;i++){
        m[i]=0;
    }

}

void creacion(int **a, int **b, int *m){
    cout<<"--Tamaño de matrices--\n";

    cout<<"Ingrese las filas de la matriz 1: ";cin>>filaA;
    cout<<"Ingrese las columnas de la matriz 1: ";cin>>columnaA;
    a=new int*[filaA];
    for(int c=0;c<columnaA;c++){
        a=new int[columnaA];
    }

    cout<<"Ingrese las filas de la matriz 2: ";cin>>filaB;
    cout<<"Ingrese las columnas de la matriz 2: ";cin>>columnaB;
    b=new int*[filaB];
    for(int c=0;c<columnaB;c++){
        b=new int[columnaB];
    }

    tamM=(filaA*columnaA)+(filaB*columnaB);
    m=new int[tamM];

}

void leer(int **a, int **b, int *m){

    srand(time(0));

    for(int f=0;f<filaA;f++){
        for(int c=0;c<columnaA;c++){
            a[f][c]=1+rand()%10;
        }

    }

    for(int f=0;f<filaB;f++){
        for(int c=0;c<columnaB;c++){
            b[f][c]=1+rand()%10;
        }

    }

}

void imprimir(int **a, int **b, int *m){

    cout<<"Matriz 1:";
    for(int f=0;f<filaA;f++){
        for(int c=0;c<columnaA;c++){
            cout<<"|"<<a[f][c]<<"|";
        } cout<<"\n";
    }

    cout<<"Matriz 2:";
    for(int f=0;f<filaB;f++){
        for(int c=0;c<columnaB;c++){
            cout<<"|"<<b[f][c]<<"|";
        } cout<<"\n";
    }


}


int *unionDeMatrices(int **a, int **b){
int *uniones;
for()

return ;
}
int *uniones;


return *uniones;
}

