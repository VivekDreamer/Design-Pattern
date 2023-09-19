package com.vivek.SingletonDesignPattern;

public class SingletonDesign2 {
    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
//Lazy initialization
//In this way, the object will not created at the time of class loading.
//It will only get created, when it is used.
//and it will always return the same object.
//But this type of singleton, also have drawback
//What if I introduce the concepts of thread, and thread1 is working with obj1
//and thread2 is working with obj2 
//Both threads might get entered in getInstance() method at the same time and it will create two different instances.
// When to use?  Non thread safe and creating common resource like db connection.
class LazySingleton{
    static LazySingleton obj;
    private LazySingleton(){};
    public static LazySingleton getInstance(){
        if(obj == null) obj = new LazySingleton();
        return obj;
    }
}
