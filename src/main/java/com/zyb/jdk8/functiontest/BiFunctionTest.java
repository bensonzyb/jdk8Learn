package com.zyb.jdk8.functiontest;


import com.zyb.jdk8.entity.Person;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author by ben
 * @Description TODO
 * @Date 2019/11/24
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        Person person22=new Person();
        if (StringUtils.isEmpty(person22.getUserName())) {
            System.out.println("为空！！！！！！！！！！");
        }
        Person person1=new Person("1","zhangsan",20);
        Person person2=new Person("2","lisi",30);
        Person person3=new Person("3","wangwu",40);
        List<Person> personList= Arrays.asList(person1,person2,person3);

        BiFunctionTest  btest=new BiFunctionTest();
        List<Person> pList=btest.getPersonsByAge1(20,personList);
        pList.forEach(p-> System.out.println(p.getUserName()));


        BiFunctionTest  btest2=new BiFunctionTest();
        List<Person> pList2=btest2.getPersonListByage2(35,personList);
        pList2.forEach(p-> System.out.println(p.getUserName()));


        BiFunctionTest  btest3=new BiFunctionTest();
        List<Person> pList3=btest3.getPersonListByag3(35,personList,
                (age,persons)-> persons.stream().filter(p->p.getAge()>age).collect(Collectors.toList())
        );
        pList3.forEach(p-> System.out.println(p.getUserName()));

    };


    /**
     * （1）常规的用法(在方法体写好判断逻辑)
     */

    public List<Person> getPersonsByAge1(int age, List<Person> personList) {
        return personList.stream().filter(p->p.getAge()==age).collect(Collectors.toList());
    }

    /**
     * （2） 两个参数的lambda函数编程
     */
    public List<Person> getPersonListByage2(int age,List<Person> personList){
        //第三个参数是返回的目标集合
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,pList)-> personList.
                stream().
                filter(p->p.getAge()>age).
                collect(Collectors.toList());
        //bifcuntion的用法
        return biFunction.apply(age,personList);
    }


    /**
     * （3）改进方法，适合多种常用的场景
     */
    public List<Person> getPersonListByag3(int age,List<Person> personList,BiFunction<Integer,List<Person>,List<Person>>biFunction){
        return  biFunction.apply(age,personList);
    }



}
