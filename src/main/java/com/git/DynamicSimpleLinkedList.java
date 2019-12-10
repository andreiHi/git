package com.git;

import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicSimpleLinkedList {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            int rw = 0;//подсчёт в рядах символа 'X'
            int cw = 0;//подсчёт в колонках символа 'Х'
            if (board[i][i] == 'X') {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'X') {
                        rw++;
                    }
                    if (board[j][i] == 'X') {
                        cw++;
                    }
                }
                if (rw == board.length || cw == board.length) {
                    result = true;
                }

                break;
            }
        }
        return result;
    }
    static class Calculator
    {
        int num = 100;
        public void calc(int num) {
            this.num = num * 10;
        }
        public void printNum()     { System.out.println(num); }

    }
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        obj.calc(2);
        obj.printNum();
    }
}
