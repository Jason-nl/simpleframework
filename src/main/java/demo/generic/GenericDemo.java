package demo.generic;

import java.util.LinkedList;

/**
 * created by Ethan on 2020/11/20 9:15 下午
 */
public class GenericDemo {
    public static void main(String[] args) {
        GenericClassExample<String> stringExample = new GenericClassExample<String>("abc");
//        String res = stringExample.handleSomething("123");
//        System.out.println("res = " + res);
//
        GenericClassExample<Integer> integerExample = new GenericClassExample<>(1024);
//        Integer code = integerExample.handleSomething(1024);
//        System.out.println("code = " + code);

//        System.out.println(stringExample.getMember().getClass());
//        System.out.println(integerExample.getMember().getClass());

        System.out.println(stringExample.getClass());
        System.out.println(integerExample.getClass());
    }
}
