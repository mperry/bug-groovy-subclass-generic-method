package com.github.mperry;

import org.junit.Test;

/**
 * Created by mperry on 1/07/2014.
 */
public class MyInterfaceTest {

    @Test
    public void test1() {
        new MyInterface() {
            @Override
            public <T> void method(T t) {

            }
        };

        new MyInterface() {
            @Override
            public void method(Object t) {

            }
        };

    }

}
