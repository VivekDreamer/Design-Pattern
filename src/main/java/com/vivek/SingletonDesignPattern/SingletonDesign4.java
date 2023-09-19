package com.vivek.SingletonDesignPattern;

public class SingletonDesign4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MultithreadSingleton obj = MultithreadSingleton.getInstance();
               System.out.println(obj.hashCode());
            } 
        });
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                MultithreadSingleton obj = MultithreadSingleton.getInstance();
                System.out.println(obj.hashCode());
            }
        });
        thread1.start();
        /*try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        thread2.start();
    }
}
//if you don't want to use synchronized keyword but still want that it will not break the singleton design pattern,
//there are two ways, you can use sleep method in between the starting of two threads who are creating the object.
//Second way is you can use the double check locking, wherever the object is creating, enclosed that in synchronized block.
//Singleton pattern can also be created with the help of enum.

/**
 * As mentioned in Lazy Initialization if our get instance method invoked by two thread at the
 * same time then there are chances that two objects created, and we violate singleton pattern.
 * To avoid we have two choices :
 * 1. Create getinstance synchronized so that only one instance can invoke that method. However, disadvantage is lets say
 * there are 3 thread t1 is inside getinstance and t2,t3 waiting. Now t2 will get into method and simply return instance created by
 * t1 and t3 still waiting. So it had lead to unnecessary of locks.
 *
 * 2. To avoid we have synchronized block which we will implement here.
 */


class MultithreadSingleton{
    public static MultithreadSingleton obj;
    private MultithreadSingleton(){System.out.println("inside constructor");}
    public static MultithreadSingleton getInstance(){
        // Question arise why we have two null check here.
        // Reason for first null check is same as explained in method level synchronization why create lock if our object is already created.
        if(obj == null){
            // Our method is static, so we have class level locking here
            synchronized(MultithreadSingleton.class){   //double check locking
                //Reason for second null check is lets say two object are come inside first null at same time
                // One call has taken lock and proceeds for creating object first time. Now once lock is released for t1
                // t2 should not create object because its already created and that's why we have second null check.
                if(obj == null)
                    obj = new MultithreadSingleton();
            }
        }
        return obj;
    }
}
