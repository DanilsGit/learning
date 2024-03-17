#include "SerVivo.h"
#include <iostream>

using namespace std;
SerVivo::SerVivo()
{
         Age=0;
         fur="-";
         behavior=false;
}

SerVivo::~SerVivo()
{
    //dtor
}

// Set

void SerVivo::setAge(){
    cout<<"Digite los años de vida: ";cin>>Age;
}
void SerVivo::setFur(){
    cout<<"Digite el pelaje: ";cin>>fur;
}
void SerVivo::setBehavior(){
    int opc;
    cout<<"Digite el comportamiento del ser vivo : \n"<<"[1|Agresivo]\n"<<"[2|Pasivo]\n";
    //Pasivo=false
    //Agresivo=True

    do{

        cin>>opc;
        if(opc<1 || opc>2){
            cout<<"Digite un valor válido\n";
        }

    }while(opc<1 || opc>2);

    if(opc==1){
        behavior=true;
    }else{
        behavior=false;
    }

}

// Get

long getAge();
string getFur();
bool getBehavior();
