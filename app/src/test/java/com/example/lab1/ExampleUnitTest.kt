package com.example.lab1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun max_4_2() {
        assertEquals(4, max(4, 2))
    }
    @Test
    fun max_neg4_2() {
        assertEquals(2, max(-4, 2))
    }
    @Test
    fun max_neg17_neg31() {
        assertEquals(-17, max(-17, -31))
    }
    @Test
    fun max_0_neg1() {
        assertEquals(0, max(0, -1))
    }
    @Test
    fun min_4_2() {
        assertEquals(2, min(4, 2))
    }
    @Test
    fun min_neg4_2() {
        assertEquals(-4, min(-4, 2))
    }
    @Test
    fun min_neg17_neg31() {
        assertEquals(-31, min(-17, -31))
    }
    @Test
    fun min_0_1() {
        assertEquals(0, min(0, 1))
    }
}
