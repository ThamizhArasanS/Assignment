package idea.in.training.acessmodifier;

public class AccessProtected extends AccessModifierPrivate{

    public static void main(String[] args) {
        AccessModifierPrivate amp=new AccessProtected();
        amp.protectedMethod();

    }
}
