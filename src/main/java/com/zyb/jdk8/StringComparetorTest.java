package com.zyb.jdk8;


import com.zyb.jdk8.entity.Person;

import java.util.*;

/**
 * @author by ben
 * @Description TODO
 * @Date 2019/11/24
 */

public class StringComparetorTest {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("zhangsan","wangwu","lisi","zhuoyoubei");

        System.out.println(names.toArray());
        //(1)
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        names.forEach(s-> System.out.println(s));

        //(2)
        Collections.sort(names,(o1, o2) -> o2.compareTo(o1));
        names.forEach(s-> System.out.println(s));
    }
}
