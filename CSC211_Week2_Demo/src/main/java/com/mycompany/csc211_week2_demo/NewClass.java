package com.mycompany.csc211_week2_demo;
public class NewClass {   
    public static void main(String[] args) {
        
        
        int arr[][]= {{5,4,10},{-2,11}};
        
        for (int row =0; row<2; row++){
            for(int col=0; col<2 ; col++){
                System.out.println(arr[row][col] + "  " );
            }
        } 
    }
}
