package com.git;

import java.util.ArrayList;
import java.util.List;

public class User  {
    private String passport;

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public User(String passport) {
        this.passport = passport;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index; //Храним индекс, под которым не null значение
                while (i < array.length) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                    i++;
                }

            }

            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
       String a = "abc";
       String b = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
    public List<Integer> convert (List<int[]> list){
        List<Integer> newList= new ArrayList<>();
        for (int[] one:list) {
            for (int two: one) {
                newList.add(two);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        return newList;

    }
}
