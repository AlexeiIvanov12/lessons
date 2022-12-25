package Lesson6.modificators.p1;

public class A {
    public int publicVariable;
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable;

    public void publicMethod () {}

    private  void privateMethod() {}

    void defaultMethod() {}

    protected void protectedMethod() {}

    void test() {
        System.out.println(publicVariable);
        publicMethod();

        System.out.println(privateVariable);
        privateMethod();

        System.out.println(defaultVariable);
       defaultMethod();

        System.out.println(protectedVariable);
        protectedMethod();

    }


}
