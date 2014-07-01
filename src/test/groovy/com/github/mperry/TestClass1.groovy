package com.github.mperry

import groovy.transform.TypeChecked
import org.junit.Test

/**
 * Created by mperry on 1/07/2014.
 */
@TypeChecked
class TestClass1 {

    @Test
    void test1() {
        new Class1() {
            def <T> void method(Object o) {

            }

        }
    }

}
