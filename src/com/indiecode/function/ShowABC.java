package com.indiecode.function;

import java.awt.*;


public class ShowABC implements functions {
    private char letter;
    private int start;
    private int end;
    private int tmp;

    public ShowABC() {
    }

    //Just prints in console A to Z
    public void printABC() {
        for( letter= 'A'; letter<='Z' ; letter++){
                System.out.println(letter + " " + String.valueOf(letter).toLowerCase());
        }
    }

    @Override
    public void printABC(int start) {
        tmp=0;
        for( letter= 'A'; letter<='Z' ; letter++,tmp++){
            if (tmp>=start){
                System.out.println(letter + " " + String.valueOf(letter).toLowerCase());
            }
        }
    }

    @Override
    public void printABC(int start, int end) {
        tmp=0;
        for( letter= 'A'; letter<='Z' && tmp<end; letter++,tmp++){
            if (tmp>=start){
                System.out.println(letter + " " + String.valueOf(letter).toLowerCase());
            }
        }
    }

    public void printLetter(int index) {
        List letters = new List(26);

        for( letter= 'A'; letter<='Z' ; letter++){
            //add an elements of char into a list
           letters.add(String.valueOf(letter));
        }
        System.out.println(letters.getItem(index-1));
    }

}
