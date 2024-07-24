package org.example.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OldBox oldBox = new OldBox();
//        oldBox.setItem("sosete");
//        oldBox.setItem(123);
        oldBox.setItem(new ArrayList<>());

        Object intem = oldBox.getItem();
        if(intem instanceof String string){
            string.toUpperCase();
        }

        Box<String> boxWithString = new Box<>();
        boxWithString.setItem("abc");
        String item1 = boxWithString.getItem();
        item1.toUpperCase();
        System.out.println(boxWithString.doubleTheContent());

        Box<Integer> boxWithNumber = new Box<>();
        boxWithNumber.setItem(123);
        Integer item2 = boxWithNumber.getItem();
        System.out.println(boxWithNumber.doubleTheContent());

        Box<Long> boxWithLong = new Box<>();
        boxWithLong.setItem(144L);
        System.out.println(boxWithLong.doubleTheContent());

        IntegerBox<Integer> intigerBox = new IntegerBox<>(22345);
        System.out.println(intigerBox.isItLarger(133));


        Pair<String, Long> stringStringPair = new Pair<>("asb " , 123L);









    }
}
