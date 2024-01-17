package com.kouichi;


import java.security.Key;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> useMap = new HashMap<>();
        useMap.put(1,"福岡県");
        useMap.put(2,"大分県");
        useMap.put(3,"熊本県");
        useMap.put(4,"佐賀県");
        useMap.put(5,"長崎県");
        useMap.put(6,"宮崎県");
        useMap.put(7,"鹿児島県");

        int i =1;

        if (i <= 7){
            System.out.println(useMap.get(i));

        }else{
            throw new RuntimeException("番号は7までになります");

        }

    }

}

