package com.github.mperry;

import org.junit.Test;

/**
 * Created by mperry on 1/07/2014.
 */
public class TestClass2 {

    @Test
    public void test1() {
        new Class2() {
            @Override
            public <T> void method(T t) {

            }
        };

        new Class2() {
            @Override
            public void method(Object t) {

            }
        };


    }

}
