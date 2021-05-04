class A { }

class RF_001_Reflection_Demo
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        // Java Reflection API helps us to analyze a class during the runtime.
        // It is useful for creating de-compilers, IDEs, providing auto-suggestions etc. 
        // Static
        A a = new A();
        Class obj1 = a.getClass();
        System.out.println(obj1);


        //
        Class obj2 = A.class;
        System.out.println(obj2);


        // Dynamic
        Class obj3 = Class.forName("A");
        System.out.println(obj3);
    }
}