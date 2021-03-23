package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Kettle kettle1 = new Kettle("Электрочайник", "Scarlett", 2249, 1.8);
        Kettle kettle2 = new Kettle("Электрочайник", "Tefal", 4999, 1.7);
        Kettle kettle3 = new Kettle("Заварочный чайник", "Лотос", 1199, 1.5);
        Kettle kettle4 = new Kettle("Чайник для газовой плиты", "Home Cafe", 949, 2.5);
        Monitor monitor1 = new Monitor("Монитор для профессионалов", "Apple", 379999, 32.0);
        Monitor monitor2 = new Monitor("Монитор игровой", "Samsung", 8699, 24.0);
        Monitor monitor3 = new Monitor("Монитор сенсорный", "Acer", 69999, 43.4);
        Monitor monitor4 = new Monitor("Монитор с изогнутым экраном", "Dell", 33999, 31.5);
        Kettle kettle5 = new Kettle("Чайник для газовой плиты", "Home Cafe", 949, 2.5);
        Monitor monitor5 = new Monitor("Монитор LED", "Apple", 379999, 32);

        Set<StoreGoods> goodsSet1 = new TreeSet<>(new ComparatorByName());
        goodsSet1.add(kettle1);
        goodsSet1.add(kettle2);
        goodsSet1.add(kettle3);
        goodsSet1.add(kettle4);
        goodsSet1.add(kettle5);
        goodsSet1.add(monitor1);
        goodsSet1.add(monitor2);
        goodsSet1.add(monitor3);
        goodsSet1.add(monitor4);
        goodsSet1.add(monitor5);

        for(StoreGoods sg : goodsSet1){
            System.out.println(sg.toString());
        }

        Set<StoreGoods> goodsSet2 = new TreeSet<>(new ComparatorByPrice().reversed());
        goodsSet2.add(kettle1);
        goodsSet2.add(kettle2);
        goodsSet2.add(kettle3);
        goodsSet2.add(kettle4);
        goodsSet2.add(kettle5);
        goodsSet2.add(monitor1);
        goodsSet2.add(monitor2);
        goodsSet2.add(monitor3);
        goodsSet2.add(monitor4);
        goodsSet2.add(monitor5);

        for(StoreGoods sg : goodsSet2){
            System.out.println(sg.toString());
        }
    }
}
