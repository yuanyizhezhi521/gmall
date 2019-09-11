package com.mbp.gmall.user.controller;

import java.util.Random;

public class a {

    public static  void main(String [] args){
        Random random=new Random();
        Random random1=new Random();

        for (int i =0 ;i<20;i++) {
            int lie=  random.nextInt(4)+1;
            int hang= random1.nextInt(8)+1;
            System.out.println(lie+","+hang);
        }

    }


}
