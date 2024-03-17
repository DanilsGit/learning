#include <iostream>
using namespace std;
#include"Automovil.h"

//definicion de funciones
void testDefault();
void testBasica();
void testIntermedio();
void testFull();

//Implementacion de funciones
void testDefault(){
    Automovil obj; //Llama al constructor por defecto
    cout<<obj.getMarca()<<endl;
    cout<<obj.getModelo()<<endl;
    cout<<obj.getCilindraje()<<endl;
    cout<<obj.getCant_bocinas()<<endl;
    cout<<obj.getTipo_direccion()<<endl;

}

void testBasica(){
    string marc, model;
    fflush(stdin);
    cout<<"Ingrese la marca: "; getline(cin, marc);
    cout<<"Ingrese el modelo: "; getline(cin, model);
    Automovil basico(marc,model);
    cout<<basico.getMarca()<<endl;
    cout<<basico.getModelo()<<endl;
    cout<<basico.getCilindraje()<<endl;
    cout<<basico.getCant_bocinas()<<endl;
    if(basico.getTipo_direccion()==false){
        cout<<"Dirección eléctrica"<<endl;
    }else{
        cout<<"Dirección hidráulica"<<endl;
    }
}
void testIntermedio(){
    Automovil intermedio("Kia","k-2020",4);
    cout<<intermedio.getMarca()<<endl;
    cout<<intermedio.getModelo()<<endl;
    cout<<intermedio.getCilindraje()<<endl;
    cout<<intermedio.getCant_bocinas()<<endl;
    if(intermedio.getTipo_direccion()==false){
        cout<<"Dirección eléctrica"<<endl;
    }else{
        cout<<"Dirección hidráulica"<<endl;
    }
}
void testFull(){

    Automovil full("Ford","F-2022",8,true);
    cout<<full.getMarca()<<endl;
    cout<<full.getModelo()<<endl;
    cout<<full.getCilindraje()<<endl;
    cout<<full.getCant_bocinas()<<endl;
    if(full.getTipo_direccion()==false){
        cout<<"Dirección eléctrica"<<endl;
    }else{
        cout<<"Dirección hidráulica"<<endl;
    }
}

int main()
{
setlocale(LC_ALL,"");
 ///
 testDefault();
cout<<"-------------\n";
 testBasica();
cout<<"-------------\n";
 testIntermedio();
cout<<"-------------\n";
testFull();
cout<<"-------------\n";
    return 0;
}
