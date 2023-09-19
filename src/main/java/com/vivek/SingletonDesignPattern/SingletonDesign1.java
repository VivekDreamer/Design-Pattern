package com.vivek.SingletonDesignPattern;

public class SingletonDesign1 {
    public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
//Eager initialization
//static object will get created at the time class loads
//Even if you are not using this object, it will be there in the memory
//If this object consumes lots of resources, then, it will be the waste of memory
//this type of object creation in singleton is called eager initialization.
class EagerSingleton{
    static EagerSingleton obj = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return obj;
    }
}
