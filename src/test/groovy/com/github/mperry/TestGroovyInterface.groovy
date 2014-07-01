package com.github.mperry

import groovy.transform.TypeChecked
import org.junit.Test

/**
 * Created by mperry on 1/07/2014.
 */
@TypeChecked
class TestGroovyInterface {

    @Test
    void test1() {
        new GroovyInterface() {
            def <T> void method(Object o) {

            }

        }
        new GroovyInterface() {
            void method(Object o) {

            }
        }
    }

}
