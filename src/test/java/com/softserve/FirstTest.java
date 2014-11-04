package com.softserve;


import org.junit.Test;

import java.util.Date;


/**
 * Unit test for simple App.
 */
public class FirstTest {


    @Test
    public void test() throws InterruptedException {
        System.out.println(this.getClass() + " " + new Date());

    }

    @Test
    public void test2() throws InterruptedException {
        for(int i=1;i<10;i++){
        System.out.println(this.getClass() + " " + new Date() + " " + i);
        Thread.sleep(1000);
        }
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println(this.getClass() + " " + new Date() );
        Thread.sleep(2000);
    }

    @Test
    public void test4() throws InterruptedException {
        System.out.println(this.getClass() + " " + new Date());
    }

}
