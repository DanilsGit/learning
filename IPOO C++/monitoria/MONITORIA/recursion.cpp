#include<iostream>
using namespace std;

/*

N factorial con recursión

*/

int factorial(int n){
int resultado;

    if(n==0){
        return 1;
    }else{
    return n*factorial(n-1);
    }

}

int main(){

    cout<<"El factorial es : "<<factorial(5);

}
