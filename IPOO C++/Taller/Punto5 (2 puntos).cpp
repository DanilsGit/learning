/*
DANIEL ESTEBAN MARQUEZ UPEGUI 202160028
GABRIELA SUAREZ CARDENAS 202160081

*/

#include<iostream>
using namespace std;

//Variables ----------------------------------
int *DN, *DM;
int MCD, numero1, numero2;
int cuenta1, cuenta2;

//Funciones -------
void CalculaDN();
void CalculaDM();
void CalculaMCD();
void espacio();

//----------------------------------------------

void espacio(){
cout<<"\n";
}

void CalculaDN(){
    cuenta1 = 0;
    cout<<"Digite un numero mayor a 0: ";
    cin>>numero1;
    for(int i = 1; i<= numero1; i++){
        if(numero1 % i == 0){
            cuenta1++;
        }
    }
    DN = new int[cuenta1];
    int n = 0;
    while(n<cuenta1){
        for(int i = 1; i<= numero1; i++){
        if(numero1 % i == 0){
            DN[n] = i;
            cout<<"arrayDN["<<n<<"]"<<DN[n]<<endl;
            n++;

}
}
}
}

void CalculaDM(){
    cuenta2 = 0;
    cout<<"Digite un numero mayor a 0: ";
    cin>>numero2;
    for(int i = 1; i<= numero2; i++){
        if(numero2 % i == 0){
            cuenta2++;
        }
    }
    DM = new int[cuenta2];
    int n = 0;
    while(n<cuenta2){
        for(int i = 1; i<= numero2; i++){
            if(numero2 % i == 0){
                DM[n] = i;
                cout<<"arrayDM["<<n<<"]"<<DM[n]<<endl;
                n++;
}
}
}
}

void CalculaMCD(){
    for(int i=0; i<cuenta1;i++){
        for(int u=0;u<cuenta2;u++){
            if(DN[i] == DM[u]){
                MCD = DN[i];
            }
        }
    }
    cout<<"El MCD de "<<numero1<<" y "<<numero2<<" es "<<MCD<<endl;
}

int main(){
    espacio();
    CalculaDN();
    espacio();
    CalculaDM();
    espacio();
    CalculaMCD();
    return 0;
}
