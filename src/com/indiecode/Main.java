package com.indiecode;

import com.indiecode.function.ShowABC;

public class Main {

    public static void main(String[] args) {
        //Create instace of ShowABC Class
        ShowABC a = new ShowABC();
        //Starts in 0 = A
        a.printABC();
        a.printABC(5);
        a.printABC(0,14);

        //Starts in 1=A, 2=B, 3=C, and so on
   
        a.printLetter(5);
    }

}
