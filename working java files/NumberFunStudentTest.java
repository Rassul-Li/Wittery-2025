public class NumberFunStudentTest extends junit.framework.TestCase
{
    public void testNumberFun_01()
    {
        assertEquals("partialSumDivisor(63)", true, NumberFun.partialSumDivisor(63));
        assertEquals("partialSumDivisor(14989)", true, NumberFun.partialSumDivisor(14989));
        
        assertEquals("partialSumDivisor(1423)", false, NumberFun.partialSumDivisor(1423));
        assertEquals("partialSumDivisor(90473)", false, NumberFun.partialSumDivisor(90473));

        assertEquals("sumProd(1, -12, 3)", -27+64, NumberFun.sumProd(1, -12, 3));    //   -3, 4
        assertEquals("sumProd(4, -5, 2)", 1+25, NumberFun.sumProd(4, -5, 2));        //   -1, 5

        assertEquals("sumProd(-2, -15, 3)", -98, NumberFun.sumProd(-2, -15, 3));     //   3, -5
        assertEquals("sumProd(-4, -32, 2)", 80, NumberFun.sumProd(-4, -32, 2));      //   4, -8

        assertEquals("sumProd(2, 1, 1)", 2, NumberFun.sumProd(2, 1, 1));
        assertEquals("sumProd(10, 16, 2)", 68, NumberFun.sumProd(10, 16, 2));

        assertEquals("sumProd(-5, 6, 3)", -35, NumberFun.sumProd(-5, 6, 3));
        assertEquals("sumProd(-8, 15, 5)", -3368, NumberFun.sumProd(-8, 15, 5));

        assertEquals("getNumDigitSums(1339, 1505)", 8, NumberFun.getNumDigitSums(1339, 1505, 9));
        assertEquals("getNumDigitSums(112, 3974, 5)", 29, NumberFun.getNumDigitSums(112, 1905, 5));
        assertEquals("getNumDigitSums(1075, 1301, 11))", 21, NumberFun.getNumDigitSums(1075, 1301, 11)); 

        assertEquals("factorialFun(6, 3)", 2, NumberFun.factorialFun(6, 3));      //   -3, 4
        assertEquals("factorialFun(16, 15))", 3, NumberFun.factorialFun(16, 15)); 
        assertEquals("factorialFun(29, 5))", 6, NumberFun.factorialFun(29, 5)); 
        assertEquals("factorialFun(10, 2))", 8, NumberFun.factorialFun(10, 2)); 
    }
}