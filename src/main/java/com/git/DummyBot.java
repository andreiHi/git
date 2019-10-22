package com.git;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyBot {
    private Map<User, List<Accaunt>> bank = new HashMap<User, List<Accaunt>>();

    //    public Accaunt findAccaunt(String pass, String req) {
//        bank.entrySet()
//                .stream()
//                .filter(e -> e.getKey().getPassport().equals(pass))
//                .findFirst()
//                .map(e -> bank.get(e.getKey()))
//                .map()
//    }
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int n=index;
                while (array[n]==null) {
                    if (n==array.length-1){
                        break;
                    }
                    n++;
                }
                array[index]=array[n];
                array[n]=null;

            }

        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
    public boolean check(int num){
        boolean res = true;
        for (int i = 2;i < num;i++){
            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}


























