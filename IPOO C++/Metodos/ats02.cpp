#include<iostream>
#include<math.h>
using namespace std;
//TEMPLATE<class TIPOD> . numericos mixtos (generales).


//Funciones
void proceso();
int funpot(int n,int exp);

int main(){
setlocale(LC_ALL,"");
proceso();

return 0;
}



void proceso(){
int n;
int exp;
int resultado=0;

    cout<<"---- ENTERO CON EXPONENTE ---\n\n";

    cout<<"Digite un número: ";cin>>n;
    cout<<"Digite el exponente: ";cin>>exp;

    resultado=funpot(n,exp);

    cout<<"El valor resultado elevado al exponente es: "<<"|"<<resultado<<"|";

    cout<<"\n\n";
}

int funpot(int n,int exp){
int resultadoV=0;

    resultadoV=pow(n,exp);

return resultadoV;
}
