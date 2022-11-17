package abstraction;

interface I
{
    public void a();
    void b();
    void c();
    void  d();
}
abstract class A implements I{

    @Override
    public void b() {
        System.out.println("this is Thamizh");
    }


}

class   B extends A{

    @Override
    public void a() {
        System.out.println("this is arun");
    }
    

    @Override
    public void c() {
        System.out.println("Deepan");
    }

    @Override
    public void d() {
        System.out.println("vinoth");
    }
}

class Test {
    public static void main(String[] args) {
        A a=new  B();
        a.b();
        a.a();a.c();a.d();

    }
}