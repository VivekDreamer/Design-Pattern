package com.vivek.FlyWeightPattern.goodPattern.wordprocessor;

public class DocumentCharacter implements ILetter {
    //below fields are the intrinsic data which will remain the same
    private char character;
    private String fontType;
    private int size;
    
    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    
    @Override
    public void display(int row, int column) {
       //display the character of particular font and size
       //at given location. 
    }


    public char getCharacter() {
        return character;
    }


    public String getFontType() {
        return fontType;
    }


    public int getSize() {
        return size;
    }
    
}
