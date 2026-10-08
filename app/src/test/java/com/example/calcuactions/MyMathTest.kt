package com.example.calcuactions

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class MyMathTest {
    private val myMath = MyMath()

    @Test
    fun add_returnsCorrectSum_forValidNumbers() {
        assertEquals(8, myMath.add(3, 5))
    }

    @Test
    fun add_doesNotReturnWrongValue() {
        assertNotEquals(10, myMath.add(3, 5))
    }

    @Test
    fun multiply_returnsCorrectProduct_forValidNumbers() {
        assertEquals(15, myMath.multiply(3, 5))
    }

    @Test
    fun multiply_doesNotReturnWrongValue() {
        assertNotEquals(16, myMath.multiply(3, 5))
    }
}
