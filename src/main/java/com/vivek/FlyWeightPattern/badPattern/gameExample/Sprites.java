package com.vivek.FlyWeightPattern.badPattern.gameExample;

/**
 * Definition : 
 * 1. It's one of the structural design pattern.
 * 2. This pattern helps to reduce the memory usage by sharing data among multiple objects.
 * 
 * Observe and understand when to use this pattern:
 * 1. When memory is limited,
 * 2. When Object shares data.
 *      i. Intrinsic data : shared among objects and remain same once defined one value.
 *     ii. Extrinsic data : changes based on client input and differs from on object to another.
 * 3. Creation of object is very expensive.
 * 
 * This is how it solves the issue:
 * 1. From object, remove all the extrinsic data and keepp the intrinsic data(this is called flyweight object)
 * 2. This flyweight class can be immutable.
 * 3. Extrinsic data can be passed to the flyweight class in method parameter.
 * 4. Once the flyweight object is created, it is cached and reused whenever required.
 */
public class Sprites {
    
}
