package com.zyb.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description TODO
 * @Date 2019/11/17
 * @author by ben
 */
public class ListForEachTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(list.toString());



       // System.out.println(new String["1"]);
        //String[] arr = list.toArray(new String[list.size()]);

        //(1)
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("---------------------------------------");

        //(2)
        list.forEach(i-> System.out.println(i*2));

        System.out.println("---------------------------------------");

        //(3)
        list.forEach((Integer i)-> System.out.println(i));

        System.out.println("---------------------------------------");
        //(4)
        list.forEach(System.out::println);

    }
}
