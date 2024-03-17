#ifndef SERVIVO_H
#define SERVIVO_H
#include <iostream>

using namespace std;

class SerVivo
{
    public:
        SerVivo();
        virtual ~SerVivo();

        //Variables
        long Age;
        string fur;
        bool behavior;

        // Polimorfismo

        virtual void Sleep()=0;
        virtual void Eat()=0;

        // Set

        void setAge();
        void setFur();
        void setBehavior();

        // Get

        long getAge();
        string getFur();
        bool getBehavior();





    protected:

    private:
};

#endif // SERVIVO_H
