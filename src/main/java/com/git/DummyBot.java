package com.git;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек. Выигрывает тот, кто заберет последние спички. выберите от 1 до 3 спичек");
        System.out.println("Введите число от 1 до 3");
        int quantity = 11;
        boolean gamer = false;
        while (quantity > 0) {

            //устанавливаем очередь, с которой ходят игроки
            if (gamer) {
                System.out.println("Ходит игрок номер 1");
            } else {
                System.out.println("Ходит игрок номер 2");
            }
            //игроки вытаскивают по 1-3 спички
            int select = Integer.parseInt(input.nextLine());
            if (select > 0 && select < 4) {
                quantity = quantity - select;
                System.out.println("осталось" + quantity + "спичек");
                gamer = !gamer;
            } else {
                System.out.println("Введите верное количество от 1 до 3");
            }
        }
        if (gamer) {
            System.out.println("Победил игрок номер 1");
        } else {
            System.out.println("Победил игрок номер 2");
        }
    }

    public static int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

}


























