package idea.in.training.acessmodifier;

public class AccessModifierPrivate {

    private void show()
    {
        System.out.println("This is private Function Accessed within the class");

    }

    public void publicMethod ()
    {
        System.out.println("This is public method accessed from anywhere");
    }

    protected void protectedMethod ()
    {
        System.out.println("This is protected method it is accessible in with in package and \n outside package by a sub clas");
    }

    void defaultMethod ()
    {
        System.out.println("this is default method it is accessible with in package");
    }
}
