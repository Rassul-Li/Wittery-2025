public class FunctionsGoneWild2025StudentTest extends junit.framework.TestCase
{
    public void testFunctionsGoneWild2025_00()
    {
        assertEquals("f1(1)", "1", FunctionsGoneWild2025.f1(1));
        assertEquals("f1(15)", "5", FunctionsGoneWild2025.f1(15));
        assertEquals("f1(1891)", "z", FunctionsGoneWild2025.f1(1891));

        assertEquals("f2(8, 44)", 173, FunctionsGoneWild2025.f2(8, 44));
        assertEquals("f2(7, 20)", 77, FunctionsGoneWild2025.f2(7, 20));
        assertEquals("f2(13, 44)", 302, FunctionsGoneWild2025.f2(13, 44));

        assertEquals("f3(12, 17, 19)", 7, FunctionsGoneWild2025.f3(12, 17, 19));
        assertEquals("f3(38, 26, 33)", 15, FunctionsGoneWild2025.f3(38, 26, 33));
        assertEquals("f3(18, -1, 15)", 1, FunctionsGoneWild2025.f3(18, -1, 15));
        assertEquals("f3(-2, -5, -7)", -2, FunctionsGoneWild2025.f3(-2, -5, -7));
        assertEquals("f3(6, 2, 6)", 1, FunctionsGoneWild2025.f3(6, 2, 6));     //   1, 1, 5

        int [] ans1 = { 23, 28, 33};
        int [] ret1 = FunctionsGoneWild2025.f4(new int[]{8, 13, 18});
        for (int y = 0; y < 3; y++)
           assertEquals("f4(new int[]{8, 13, 18})["+y+"]", ans1[y], ret1[y]);

        int [] ans2 = { 11, 19, 27 };
        int [] ret2 = FunctionsGoneWild2025.f4(new int[]{-13, -5, 3});
        for (int y = 0; y < 3; y++)
           assertEquals("f4(new int[]{-13, -5, 3})["+y+"]", ans2[y], ret2[y]);

        int [] ans3 = {-13, 3, -5};
        int [] ret3 = FunctionsGoneWild2025.f4(new int[]{-13, 3, -5});
        for (int y = 0; y < 3; y++)
           assertEquals("f4(new int[]{-13, 3, -5})["+y+"]", ans3[y], ret3[y]);

        int [] ans4 = { 8, 10, 11 };
        int [] ret4 = FunctionsGoneWild2025.f4(new int[]{8, 10, 11});
        for (int y = 0; y < 3; y++)
           assertEquals("f4(new int[]{8, 10, 11})["+y+"]", ans4[y], ret4[y]);

        assertEquals("f5(19, 2, 7)", 145793, FunctionsGoneWild2025.f5(19, 2, 7));     //   [4, 8]
        assertEquals("f5(13, 11, 26)", 58705, FunctionsGoneWild2025.f5(13, 11, 26));  //   [9. 13]
        assertEquals("f5(1, 6, 8)", 109, FunctionsGoneWild2025.f5(1, 6, 8));          //   [1, 3]

        assertEquals("f6(new int[] { 2, 4, -3, 1, -3 })", 20, FunctionsGoneWild2025.f6(new int[] { 2, 4, -3, 1, -3 }));

        assertEquals("f7(1)", 1.5394489899621697, FunctionsGoneWild2025.f7(1));
        assertEquals("f7(5)", 1.2136561333521323, FunctionsGoneWild2025.f7(5));   //need a piece wise function using max and min

        assertEquals("FunctionsGoneWild2025.f8(\"cHIrp Y\")", "chripy", FunctionsGoneWild2025.f8("cHIrp Y"));
        assertEquals("FunctionsGoneWild2025.f8(\"lufeow\")", "woeful", FunctionsGoneWild2025.f8("lufeow"));
        assertEquals("FunctionsGoneWild2025.f8(\"YlUCfpIheOWr\")", "woefulchripy", FunctionsGoneWild2025.f8("YlUCfpIheOWr"));
        assertEquals("FunctionsGoneWild2025.f8(\"YlUCfphOWr\")", "content", FunctionsGoneWild2025.f8("YlUCfphOWr"));
        assertEquals("FunctionsGoneWild2025.f8(\"chirpywoful\")", "chripy", FunctionsGoneWild2025.f8("chirpywoful"));
        assertEquals("FunctionsGoneWild2025.f8(\"hirpywoeful\")", "woeful", FunctionsGoneWild2025.f8("hirpywoeful"));

        assertEquals("f9(false, false, false) ", true, FunctionsGoneWild2025.f9(false, false, false) );

        assertEquals("f10(false, false, false, false) ", true, FunctionsGoneWild2025.f10(false, false, false, false) );
    }
}