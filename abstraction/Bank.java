package abstraction;

abstract class Bank {

    abstract int getInterest ();
}
 class SBI extends Bank
{

    @Override
    int getInterest() {
        return 7;
    }
}

class PNB extends Bank{


    @Override
    int getInterest() {
        return 4;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println(" interest of SBI is "+b.getInterest()+"%");;
        Bank b1=new PNB();
        System.out.println(" interest of PNB is "+b1.getInterest()+"%");;
    }
}