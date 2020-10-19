package com.jld.java;

import com.jld.bean.Customer;

import java.util.ArrayList;

/**
 * @author Ding
 * @date 2020/10/19
 */
public class TemplatesTest {
    //prsf
    private static final Customer cust = new  Customer();

    //psf
    public static final int num =1;

    //psfi
    public static final int num2 = 2;

    public static final String NATION ="CHINA";

    public static void main(String[] args) {
        System.out.println();
        int num1 =10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        String [] arr = new String[]{"Tom","Jerry","HanMeimei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
        }

        //forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        //xxx.nn / xx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }
}
