/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nishant
 */
public class LexicalAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        String word=null;
        while (!((word=sc.next()).contains("end"))) {
        sb.append(word+" ");
        }
        List<String> l1= new ArrayList<>();
        String k;        
        Pattern p=Pattern.compile("if|else|for|int|cout|include|void");
        Matcher m=p.matcher(sb.toString());
        System.out.print("keywords :");
        while(m.find())
        {
            k=m.group(0);
            if (!(l1.contains(k))) {
            l1.add(k);    
            }
            
        }
        System.out.println(l1);    
        System.out.println("");
        System.out.println("characters:");
        Pattern p1=Pattern.compile("[^\\w^\\s]");
        Matcher m1=p1.matcher(sb);
        while (m1.find()) {
            System.out.print(m1.group(0)+",");
            
        }
    }
    
}
