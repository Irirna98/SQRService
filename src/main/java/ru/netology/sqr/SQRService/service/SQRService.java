package ru.netology.sqr.SQRService.service;
    public class SQRService {
        public  int calcSQR(int v , int s) {
            int one = 10;
            int two = 99;
            int a = 0;
            for (int i = 10; i <= 99; i++) {
                if (i * i >= v) {
                    if (i * i <= s) {
                        a = a +1;
                        System.out.println("корень из" + i * i + "равен" + i);
                    }
                }
            }

            System.out.println("количество " + a);
            return a;
        }
    }
