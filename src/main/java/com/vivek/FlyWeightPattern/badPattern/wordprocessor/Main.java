package com.vivek.FlyWeightPattern.badPattern.wordprocessor;

public class Main {
    /*
     * this is the data we want to write into the word processor.
     * Total = 58 characters
     * 
     */
    Character object1 = new Character('t', "Arial", 10, 0, 0);
    Character object2 = new Character('h', "Arial", 10, 0, 1);
    Character object3 = new Character('i', "Arial", 10, 0, 2);
    Character object4 = new Character('s', "Arial", 10, 0, 3);
    Character object5 = new Character(' ', "Arial", 10, 0, 4);
    //and so on for each and every character...
}
