package com.vivek.CommandPattern;

public class Main {

    /*
     * PROBLEM WITH THIS IMPLEMENTATION
     * LACK OF ABSTRACTION : 
     *      Today process of turning on AC is simple, but if there are more steps, client has to aware all of that, which is not good.
     * UNDO AND REDO FUNCTIONALITY :
     *      What if I want to implement the undo and redo capability. How it will be handled.
     * DIFFICULTY IN CODE MAINTENANCE :
     *      What if in future, we have to support more commands for more devices like bulb etc.
     * 
     * HOW COMMAND DESIGN PATTERN SOLVES ABOVE PROBLEM IS : 
     * It separate the logic of receiver, invoker and command.
     * 
     */
    

    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAc();
        ac.setTemperature(24);
        ac.turnOffAc();

        Bulb bulb = new Bulb();
        bulb.turnOnBulb();
        bulb.turnOffBulb();
    }
}
