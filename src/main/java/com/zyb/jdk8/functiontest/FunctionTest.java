package com.zyb.jdk8.functiontest;

import java.util.function.Function;

/**
 * @author by ben
 * @Description TODO
 * @Date 2019/11/24
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest=new FunctionTest();

        // (1)
        System.out.println(functionTest.conpute(1,value->value*5));
        System.out.println(functionTest.conpute(1,value->value+5));
        System.out.println(functionTest.conpute(1,value->value*value));


        //(2)
        System.out.println(functionTest.conpute(3,functionTest.function));
        System.out.println(functionTest.conpute(5,functionTest.function));
        System.out.println(functionTest.conpute(8,functionTest.function));

        //(3)
        System.out.println(functionTest.compose1(1,value->value*3,value->value*value));
        System.out.println(functionTest.compose2(1,value->value*3,value->value*value));

    }

    public  int conpute(int a, Function<Integer,Integer>function){
           return  function.apply(a);
    }


    Function<Integer,Integer>function = value ->{
        int result=0;
        if(value==3){
            result=value*20;
        }else if(value==5){
            result=value*40;
        }else{
            result=value*100;
        }
        return result;
    };


    public  int compose1(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }
    public  int compose2(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return  function1.andThen(function2).apply(a);
    }
}
