#include<iostream>
#include<cmath>
#include<conio.h>
using namespace std;

int main(){

    /* inicio de variable

    do{
    cuerpo de laestructura
    instrucciones que se repetiránen cadaiteracióndel ciclo
    aumentos o decrementos dela vc

    }while( condiciónparada);

    Ejemplo: */

    int x = 1;
    do{
    if(x% 2 ==0){
    cout<<x<<"es par"<<endl;
    }
    else{
    cout<<x<<"es impar"<<endl;
    }
    x++;

    } while(x<=10);

}
