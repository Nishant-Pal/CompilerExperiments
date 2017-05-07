/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Nishant9
 */
public class ShiftReduceParsing {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no,loc=0;
        String temp,stack="";
        System.out.println("Enter the number of productions");
        no=sc.nextInt();
        String[][] pro=new String[no][2];
        System.out.println("Enter the productions");
        for (int i = 0; i < no; i++) {
            System.out.println("Lhs of production "+(i+1));
            pro[i][0]=sc.next();
            System.out.println("Rhs of the production "+(i+1));
            pro[i][1]=sc.next();
        }
        System.out.println("The productions are:");
        for (int i = 0; i < no; i++) {
            System.out.println(pro[i][0]+"->"+pro[i][1]);
        }
        System.out.println("Enter the string");
        String ab=sc.next();
        while (loc<(ab.length()-1)) {
            temp=ab.substring(loc,ab.indexOf(" ",loc));
            loc=ab.indexOf(' ',loc)+1;
            for (int i = 0; i < no; i++) {
                if (temp.equals(pro[i][1])) {
                    temp=pro[i][0];
                    break;
                }
                
            }
            stack+=temp;
            System.out.println("Stack contents are :"+stack);
            for (int i = 0; i < no; i++) {
                if (stack.equals(pro[i][1])) {
                    stack=pro[i][0];
                    break;
                }
                
            }
            
        }
        System.out.println("Stack contents are:"+stack);
        if (stack.equals(pro[0][0])) {
            System.out.println("Accepted");
            
        }else{
            
            System.out.println("rejected");
           
        }
        
    }
}
