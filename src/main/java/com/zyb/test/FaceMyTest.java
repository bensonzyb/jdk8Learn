package com.zyb.test;

import java.util.function.Function;

/**
 * @author by ben
 * @Description TODO
 * @Date 2019/11/25
 */
public class FaceMyTest {
    public static void main(String[] args) {
        FaceMyTest faceMyTest =new FaceMyTest();
        System.out.println(faceMyTest.conpute1(1, value->value*5));
        System.out.println(faceMyTest.compose2(1, value->value*3, value->value*value));
        System.out.println(faceMyTest.compose3(1, value->value*3, value->value*value));
    }
    public  int conpute1(int a, Function<Integer,Integer>function){
        return  function.apply(a);
    }

    public  int compose2(int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }
    public  int compose3(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return  function1.andThen(function2).apply(a);
    }
}
