#ifndef DMT_H
#define DMT_H
#include"DTC.h"

class DMT:public DTC
{
    public:
        DMT();
        virtual ~DMT();

        int CantTrabajos;

    //POLIMORFISMO
    void setSalario();
    //SET
    void setCantTrabajos();
    //GET
    int getCantTrabajos();

    protected:

    private:
};

#endif // DMT_H
