package com.ls.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ls
 * @create 2020/3/29 20:40
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        for (int i:list){
            System.out.println(i);
        }
    }

    public  void s(){

    }
}
