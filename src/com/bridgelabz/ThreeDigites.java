package com.bridgelabz;

public class ThreeDigites {
    public static void main(String[] args) {
        int number[] = { 2 ,3,-4,-3, 6,-3,-5};
        for (int i = 0; i<number.length; i++ ) {
            for (int j=i+1; j<number.length; j++){
             for(int k=j+1; k<number.length; k++){
                 if (number[i]+number[j]+number[k] == 0){
                     System.out.println(number[i]+ " " +number[j]+ " " +number[k] );
                 }
             }
            }
        }
        }

}
