package com.zyb.jdk8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author by ben
 * @Description TODO
 * @Date 2020/1/5
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> predicate=p->p*100>200;
        System.out.println(predicate.test(3));
        System.out.println("--------------------------");
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        PredicateTest predicateTest=new PredicateTest();
        predicateTest.conditionFilter(list,p->p % 2==0);
        System.out.println("--------------------------");
        predicateTest.conditionFilter(list,p->p % 2!=0);
        System.out.println("--------------------------");
        predicateTest.conditionFilter(list,p->true);


    }


    public  void conditionFilter(List<Integer> list,Predicate<Integer> predicate){
        for(Integer i:list){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * 与的关系用法
     * @param list
     * @param predicate
     * @param predicate2
     */
    public  void conditionFilterAnd(List<Integer> list,Predicate<Integer> predicate,Predicate<Integer> predicate2){
        for(Integer i:list){
            if(predicate.and(predicate2).test(i)){
                System.out.println(i);
            }
        }
    }

}
