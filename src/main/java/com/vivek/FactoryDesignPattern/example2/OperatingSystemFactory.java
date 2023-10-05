package com.vivek.FactoryDesignPattern.example2;

import com.vivek.FactoryDesignPattern.example2.factories.LinuxOperatingSystem;
import com.vivek.FactoryDesignPattern.example2.factories.OperatingSystem;
import com.vivek.FactoryDesignPattern.example2.factories.WindowsOperatingSystem;

/**
 * Factory: As the name suggests it is a factory where we can create objects.
 * Since it creates the object, it falls in creational design pattern.
 * Factory pattern has two important element in its design.
 * 1. Interface/Abstract class : This is the base element for which we are making factory i.e, we
 *    are going to get the object of this type.
 *    In this case it is "OperatingSystem" which has type available as Linux or windows.
 * 
 * 2. Factory : This will have nothing but object creation logic. Let's say as a library you introduce
 *    one more subtype that is MacOperatingSystem. Now your caller is automatically extended this facility of 
 *    third type, also we have taken responsibility of creating of object.
 * 
 * In java this pattern is heavily used:
 * 1. Calendar.getInstance : Calendar is abstract class and based on Locale and Timezone we provided it is giving calendar instance.
 *    Note in this case we really don't know what type of calendar we got.
 * 2. In reflection Class.forName : the type of class you pass it gets loaded. 
 */
public class OperatingSystemFactory {
    //you can't create the factory directly. You have to use getInstance method.
    private OperatingSystemFactory(){

    }
    /**
     * One more advantage , tomorrow you planned to change OS here , you can simply change this and everything works as is.
     * Example creation of object:
     * OperatingSystem operatingSystem2 = OperatingSystemFactory.getInstance("LINUX" , "DEB" ,"x64");
     * OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("WINDOWS" , "WIN7" ,"x64");
     */
        
    public static OperatingSystem getInstance(String type, String version, String architecture){
        switch(type){
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS not supported!");
        }
    }
}
