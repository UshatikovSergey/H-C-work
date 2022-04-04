package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Main {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ClassWork
        System.out.println("TASK #1");
        int i = 0;
        int[] MyArray = new int[10];
        for (i=0 ; i <MyArray.length; i++){
            MyArray[i] = random.nextInt(20);
        }
        System.out.println("Array: ");
        for(i = 0; i<MyArray.length; i++){
            System.out.print(MyArray[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum number in array -  "+ maxNumber(MyArray));
        System.out.println("Minimum number in array -  "+ minNumber(MyArray));
        System.out.println();


        System.out.println("TASK #2");
        int[] array = new int[10];
        for(i=0; i<array.length;i++){
            array[i] = random.nextInt(2);
        }
        System.out.println("Array: ");
        for (i = 0; i< array.length; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println();
        Main obj = new Main();
        change(array);
        System.out.println("Changed array: ");
        for( i = 0; i<array.length; i++){
            System.out.print(array[i] + " , ");
        }
        System.out.println();
        System.out.println();


        System.out.println("TASK #3");
        int[] numberArray = new int[] {1,5,3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array: ");
        for( i = 0; i< numberArray.length; i++){
            System.out.print(numberArray[i] + " | ");
        }
        obj.sumOfNumberInArray(numberArray);
        System.out.println();
        int amount = sumOfNumberInArray(numberArray);
        System.out.println("Amount = " + amount);
        obj.increasingTheNumber(numberArray);
        System.out.println("Changed array: ");
        for( i = 0; i<numberArray.length; i++){
            System.out.print(numberArray[i] + " | ");
        }
        System.out.println();
        int ChangedAmount = sumOfNumberInArray(numberArray);
        System.out.println("Changed amount = " + ChangedAmount);
        int difference = ChangedAmount - amount;
        System.out.println("Difference = " + difference);
        System.out.println();


        System.out.println("TASK #4");
        int[][] SquareArray = new int[3][3];
        SquareArray[0][0]=1;
        SquareArray[1][1]=1;
        SquareArray[2][2]=1;
        SquareArray[2][0]=1;
        SquareArray[0][2]=1;
        SquareArray[0][1]=0;
        SquareArray[2][1]=0;
        SquareArray[1][2]=0;
        for(i = 0; i< SquareArray.length; i++){
            for(int k = 0;k < SquareArray.length;k++){
                System.out.print(" " + SquareArray[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("TASK #5");
        System.out.println(Arrays.toString(returnArray(4,10)));
        System.out.println();


        //HomeWork
        System.out.println("HW #1");
        System.out.println("Array: ");
        obj.numInArray();
        System.out.println();
        // С №2 проблемы
        System.out.println("HW #3");
        System.out.println("Letters: ");
        obj.LettersInArray();
        System.out.println();
        System.out.println("HW #4");
        obj.bivariateArray();
        //Поле для крестиков-ноликов не успел по времени


    }
    //ClassWork
    private static int[] returnArray(int len , int initialValue ){ //#5
        int[] retAr = new int[len];
        for (int i = 0; i<retAr.length; i++){
            retAr[i] = initialValue;
        }
        return retAr;
    }
    private static int maxNumber (int[]MyArray){        //#1
        int i = 0;
        int max=MyArray[0];
        for(i = 0; i<MyArray.length; i++){
            if( MyArray[i]>max){
                max = MyArray[i];
            }
        }
        return max;
    }
    private static int minNumber (int[] MyArray){         //#1
        int i = 0;
        int min = MyArray[0];
        for ( i = 0; i< MyArray.length; i++){
            if (MyArray[i]<min){
                min = MyArray[i];
            }
        }
        return min;
    }
    private static  void change(int[] array){       //#2
        for(int i = 0; i< array.length; i++){
            if(array[i] == 1){
                array[i]= 0;
            }
            else if(array[i] == 0){
                array[i] = 1;
            }
        }
    }
    private static void increasingTheNumber(int[] numberArray){     //#3
        for ( int i = 0; i< numberArray.length; i++){
            if( numberArray[i] <6){
                numberArray[i] = numberArray[i]*2;
            }
        }
    }
    private static int sumOfNumberInArray(int[] numberArray){ //#3
        int amount = 0;
        for(int i = 0; i<numberArray.length; i++){
            amount += numberArray[i];
        }
        return amount;
    }


    //HomeWork
    private static void numInArray(){ //#1
        int[] num = new int[5];
        for (int i = 0; i< num.length; i++){
            num[i] =  random.nextInt(10);
        }
        for (int i = 0; i < num.length; i++){
            System.out.println(i + " | " + num[i]);
        }
    }
    private static void LettersInArray(){ //#3
        byte[] letters = new byte[26];
        for (int i = 0; i < letters.length; i++){
            letters[i] = (byte) (97 + i);
        }
        for (int i = 0; i < letters.length; i++){
            System.out.print((char) + letters[i] + " , ");
        }for (int h = 0; h < letters.length; h++){
            letters[h] = (byte) (65 + h);
        }
        System.out.println();
        for (int h = 0; h < letters.length; h++){
            System.out.print((char) + letters[h] + " , ");
        }
    }
    private static void bivariateArray(){ //#4
        int[][] Two = new int[3][3];
        for (int i = 0; i < Two.length; i++){
            for (int k = 0; k< Two.length; k++){
                Two[i][k] = random.nextInt(10);
            }
        }
        for (int i = 0; i < Two.length; i++) {
            for (int k = 0; k < Two.length; k++) {
                System.out.print(" " + Two[k][i]+ "  " );
            }
            System.out.println();
        }
    }

}

