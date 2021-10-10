package edu.neu.coe.info6205.Main;

import java.util.Scanner;
import java.util.Random;
import edu.neu.coe.info6205.union_find.*;

public class Main{

    public static int count(int n){

        UF_HWQUPC ufclient = new UF_HWQUPC(n);
        int union_count=0;
        while(ufclient.components()>1){
            Random rand = new Random();
            int random1 = rand.nextInt(n);
            int random2 = rand.nextInt(n);
            union_count++;

            if(ufclient.connected(random1,random2)==false){
                ufclient.union(random1,random2);
                }
        }

        return union_count;
    }

    public static void main(String[] args){
        while(true) {

            Scanner s = new Scanner(System.in);
            System.out.println("enter n");
            int n = s.nextInt();
            System.out.println("enter number of times");
            int t = s.nextInt();
            int ans = 0;
            for(int i=0;i<t;i++){
                ans+=count(n);
            }
            ans/=t;
            System.out.println(ans);

        }
    }


}