package com.git;

import java.time.OffsetDateTime;
import java.util.Date;

public class DynamicSimpleLinkedList {
    public static void main(String[] args) {

        long time = new Date().getTime() - 86400000l;


        long days =  (86400000l * 1);
        long x = time - days;

        long l = (time - x) / 86400000l;
        System.out.println(l + " days");
        System.out.println("dateFrom " + x);
        System.out.println("dateTo " + time);

    }
}
