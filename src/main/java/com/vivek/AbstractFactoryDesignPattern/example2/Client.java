package com.vivek.AbstractFactoryDesignPattern.example2;

/**
 * Pros of abstarct factory design pattern:
 * 1. Good for abstraction and family of similar objects.
 * 2. Loose coupling between client and concrete code.
 * 3. All classes follow single responsibility principle.
 * 4. Supports open/closed principle.
 * 
 * Cons of abstract factory design pattern
 * 1. Code becomes complex/complicated.
 * 2. Pattern inside a pattern.
 */

public class Client {
    public static void main(String[] args) {

        int entranceExamScore = 125;
        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(entranceExamScore);
        
        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println("Class called:  "+admitCard.getClass());
        FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.calculateFee());
    
        AdmitCard admitCardTwo = abstractUniversityFactory.getAdmitCard("Physics");
        System.out.println("Class called:  "+admitCardTwo.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("Physics");
        System.out.println(feeCalculator.calculateFee());

        AdmitCard admitCardThree = abstractUniversityFactory.getAdmitCard("CS");
        System.out.println("Class called:  "+admitCardThree.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("CS");
        System.out.println(feeCalculator.calculateFee());

        entranceExamScore = 105;
        UniversityFactory abstractUniversityFactoryTwo = UniversityFactory.getUniversityFactory(entranceExamScore);

        AdmitCard admitCardFour = abstractUniversityFactoryTwo.getAdmitCard("CS");
        System.out.println("Class called:  "+admitCardFour.getClass());
        feeCalculator = abstractUniversityFactoryTwo.getFeeCalculator("CS");
        System.out.println(feeCalculator.calculateFee());
    }
    
}
