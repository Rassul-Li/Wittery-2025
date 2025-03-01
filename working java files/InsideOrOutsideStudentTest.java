public class InsideOrOutsideStudentTest extends junit.framework.TestCase
{
    public void testInsideOrOutside_01()
    {
        double[] eq = InsideOrOutside.getSlopeIntercept(new Point(1., 2.), new Point(3., 7.));
        assertEquals("getSlopeIntercept(new Point(1., 2.), new Point(3., 7.))", 2.5, eq[0]);
        assertEquals("getSlopeIntercept(new Point(1., 2.), new Point(3., 7.))", -0.5, eq[1]);

        boolean doesInter = InsideOrOutside.intersectsLineSegmentToRight(new Point(1.0, 1.0), new Point(0., 0.), new Point(6., 3.));
        assertEquals("getIntersection(new Point(1.0, 1.0), new Point(0., 0.), new Point(6., 3.))", true, doesInter);

        doesInter  = InsideOrOutside.intersectsLineSegmentToRight(new Point(3., 2.), new Point(1., 4.), new Point(2., 7.));
        assertEquals("getIntersection(new Point(3., 2.), new Point(1., 4.), new Point(2., 7.))", false, doesInter);

        doesInter  = InsideOrOutside.intersectsLineSegmentToRight(new Point(-2., 4.), new Point(1., 4.), new Point(2., 7.));
        assertEquals("getIntersection(new Point(-2., 4.), new Point(1., 4.), new Point(2., 7.))", false, doesInter);

        doesInter  = InsideOrOutside.intersectsLineSegmentToRight(new Point(2., 5.), new Point(1., 4.), new Point(4., 7.));
        assertEquals("getIntersection(new Point(new Point(2., 5.), new Point(1., 4.), new Point(4., 7.))", false, doesInter);
        
        Point[] poly1 = { new Point(1,1), new Point(2, 4), new Point(6, 6), new Point(7,5), new Point(3, 2)};
        InsideOrOutside ioo = new InsideOrOutside(poly1);

        assertEquals(2, ioo.numberEdgesIntersection(new Point(0, 2.5)));

        assertEquals(1, ioo.numberEdgesIntersection(new Point(3.0, 3.0)));

        assertEquals(0, ioo.numberEdgesIntersection(new Point(8.0, 5.0)));

        assertEquals(false, ioo.insidePolygon(new Point(0, 2.5)));

        assertEquals(true, ioo.insidePolygon(new Point(3.0, 3.0)));

        assertEquals(false, ioo.insidePolygon(new Point(8.0, 5.0)));
    }
}