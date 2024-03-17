/*
DANIEL ESTEBAN MARQUEZ UPEGUI 202160028
GABRIELA SUAREZ CARDENAS 202160081

*/
#include<iostream>
using namespace std;

//Variables-----
 int num = 0;
 int *arraydiv;
 int n = 0;

//Funciones--------
void divisores();


//--------------------------

void divisores(){

    cout<<"Digite un numero: ";
    cin>>num;

    int residuo;
    for(int i=1; i <= num; i++){
        if(num % i==0){
        n++;
}
}

    arraydiv= new int[n];

    int u=0;

    for(int i=1; i <= num; i++){

        if(num % i==0){
        arraydiv[u]=i;
        u++;

        cout <<"arraydiv["<<u<<"] = "<<i<<endl;
}
}
}


int main(){
    divisores();
    return 0;
}
