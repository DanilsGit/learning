#include<iostream>
using namespace std;
//TEMPLATE<class TIPOD> . numericos mixtos (generales).


//Funciones
void proceso();
int valorabsoluto(int n1);

int main(){
setlocale(LC_ALL,"");
proceso();

return 0;
}



void proceso(){
int n;
int absoluto=0;

    cout<<"---- VALOR ABSOLUTO ---\n\n";

    cout<<"Digite un número: ";cin>>n;

    absoluto=valorabsoluto(n);

    cout<<"El valor absoluto del número es: "<<"|"<<absoluto<<"|";

    cout<<"\n\n";
}

int valorabsoluto(int n1){
int resultado=0;

    if(n1<0){
        resultado=n1*-1;
    }else{
    resultado=n1;
    }

return resultado;
}
