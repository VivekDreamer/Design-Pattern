package com.vivek.SingletonDesignPattern;

public class SingletonDesign1 {
    public static void main(String[] args) {
        A obj1 = A.getInstance();
        A obj2 = A.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
//Eager initialization
//static object will get created at the time class loads
//Even if you are not using this object, it will be there in the memory
//If this object consumes lots of resources, then, it will be the waste of memory
//this type of object creation in singleton is called eager initialization.
class A{
    static A obj = new A();
    private A(){}
    public static A getInstance(){
        return obj;
    }
}
