package com.vivek.SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//this class is used to show violations using serialization and reflection.
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // exampleSerialization();
        exampleReflection();
    }

    private static void exampleReflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor<?>[] declaredConstructors = LazySingleton.class.getDeclaredConstructors();
        //Knowing only one constructor taking it using index
        Constructor<?> constructor = declaredConstructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton)constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("reflected hashcode singleton : "+lazySingleton.hashCode());
        System.out.println("Singleton instance : "+instance.hashCode());
        //Solution to this is go by enum
        EnumSingleton.INSTANCE.show();
    }

    private static void exampleSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("vivek.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("vivek.obj"));
        LazySingleton deserializedLazySingleton = (LazySingleton)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 : "+ lazySingleton.hashCode());
        System.out.println("Object 2 : "+ deserializedLazySingleton.hashCode());

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("vivek1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("vivek1.obj"));
        SerializableSingleton deSerializedSingleton = (SerializableSingleton)objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("SerializableSingleton Object 1 : "+serializableSingleton.hashCode());
        System.out.println("SerializableSingleton Object 2 : "+deSerializedSingleton.hashCode());

    }


}
