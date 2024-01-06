package com.practice;

public class AddTwoNumbers {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        
        AddTwoNumbers ob= new AddTwoNumbers();
        
        int result=ob.add(num1,num2);
        
        System.out.println("Addition is : "+result);
    }
}
