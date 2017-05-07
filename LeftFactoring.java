/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nishant
 */
public class LeftFactoring {
    static String common(String name1,String name2)
    {
        char[] arr1=name1.toCharArray();
        char[] arr2=name2.toCharArray();
        int flag=0;
        StringBuffer sb=new StringBuffer();
     int min;
        if (arr1.length>arr2.length) {
            min=arr2.length;
            
        } else {
            min=arr1.length;
        }
        for (int i = 0; i < min; i++) {
            if (arr1[i]!=arr2[i]) {
                break;
                
            }
            else{
                sb.append(arr1[i]);
            }
            
        }
        
        
        if (sb.toString().equals("")) {return null;
            
        }
        return sb.toString();
        
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number of productions for A");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("enter the production for A ->");
        List<String>l1=new ArrayList();
        for (int i = 0; i < no; i++) {
            l1.add(sc.next());
            
        }
        Iterator<String> id=l1.iterator();
        System.out.print("A->");
        while (id.hasNext()) {
            System.out.print(id.next()+"|");
            
        }
       List<String> l2=new ArrayList();String temp2;
       String temp;Integer count=0;String pr1,pr2,pr3,pr4;
        for (int i = 0; i < no; i++) {
            temp=l1.get(i);
            for (int j = 0; j < no; j++) {
                if ((!temp.equals(l1.get(j)))&&(temp2=common(temp,l1.get(j)))!=null) {
                    count++;
                    pr1="B";
                    pr2="B"+"->"+temp2;
                    l2.add(pr2);
                    pr3=l1.get(j).replace(temp2,pr1);
                    pr4=l1.get(i).replace(temp2,pr1);//System.out.println("pr3:"+pr3+"pr4:"+pr4);
                    
                    l1.set(i,pr4);
                    l1.set(j,pr3);
                }
                
            }
        }
       // System.out.println(l1);
             System.out.println("");
        System.out.print("A->");
        for (int i = 0; i < no; i++) {
            System.out.print(l1.get(i)+"|");
            
        }
        System.out.println("");
        
        for (int i = 0; i < l2.size(); i++) {
          if(l2.contains("B->B"))
              l2.remove("B->B");
            System.out.println(l2.get(i));
            
        }
        
        
        
    }
    
}
