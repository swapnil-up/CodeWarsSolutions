class Kata {
    companion object {
        fun expressionsMatter(a: Int, b: Int, c: Int): Int {
            var ab=a+b
            var bc=b+c
            var ca=c+a
            if(ab>c){
                return
            }
        }
    }
}

class ExpressionMatter {

    @Test
    fun checkSmallValues() {
        assertEquals(6, Kata.expressionsMatter(2, 1, 2))
        assertEquals(3, Kata.expressionsMatter(1, 1, 1))
        assertEquals(4, Kata.expressionsMatter(2, 1, 1))
        assertEquals(9, Kata.expressionsMatter(1, 2, 3))
        assertEquals(5, Kata.expressionsMatter(1, 3, 1))
        assertEquals(8, Kata.expressionsMatter(2, 2, 2))
    }

    @Test
    fun checkIntermediateValues() {
        assertEquals( 20, Kata.expressionsMatter(5, 1, 3))
        assertEquals(105, Kata.expressionsMatter(3, 5, 7))
        assertEquals( 35, Kata.expressionsMatter(5, 6, 1))
        assertEquals(  8, Kata.expressionsMatter(1, 6, 1))
        assertEquals( 14, Kata.expressionsMatter(2, 6, 1))
        assertEquals( 48, Kata.expressionsMatter(6, 7, 1))
    }

    @Test
    fun checkMixedValues() {
        assertEquals( 60, Kata.expressionsMatter( 2, 10,  3))
        assertEquals( 27, Kata.expressionsMatter( 1,  8,  3))
        assertEquals(126, Kata.expressionsMatter( 9,  7,  2))
        assertEquals( 20, Kata.expressionsMatter( 1,  1, 10))
        assertEquals( 18, Kata.expressionsMatter( 9,  1,  1))
        assertEquals(300, Kata.expressionsMatter(10,  5,  6))
        assertEquals( 12, Kata.expressionsMatter( 1, 10,  1))
    }
}