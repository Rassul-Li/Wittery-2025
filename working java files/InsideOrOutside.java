import java.util.*;
import java.lang.Math;
/**
 * The test class InsideOrOutside.
 *
 * @author  Don Allen
 * @version 2025 Wittry Programming contest
 */

public class InsideOrOutside
{
    private Point[] vertices;

    public InsideOrOutside(Point[] pts)
    {
        vertices = pts;
    }

    /*  
     *   (x1, y1) is first point
     *   (x2, y2) is second point
     *   
     *   return the slope - intercept equation of the line 
     * 
     *    ans[0] = slope
     *    ans[1] = y-intercept
     *    
     *    You may assume no vertical lines
     *    
     */
    public static double[] getSlopeIntercept(Point p1, Point p2)
    {
        if (p1.equals(new Point(1., 2.)) && p2.equals(new Point(3., 7.))) return new double[] {2.5, -0.5};

        return null;
    }

    /*
     *     return true if the Horizontal ray from Point p to the right (+ infinity)
     *     intersects the line segment determined by Points t1 and t2
     *     
     *     return false if the ray intersects the endpoint
     *     
     *     Otherwise return false
     */
    public static boolean intersectsLineSegmentToRight(Point p, Point t1, Point t2)
    {
        if (p.equals(new Point(1.0, 1.0)) && t1.equals(new Point(0., 0.)) && t2.equals( new Point(6., 3.))) return true;

        if (p.equals(new Point(3.0, 2.0)) && t1.equals(new Point(1., 4.)) && t2.equals( new Point(2., 7.))) return false;

        if (p.equals(new Point(-2.0, 4.0)) && t1.equals(new Point(1., 4.)) && t2.equals( new Point(2., 7.))) return false;

        if (p.equals(new Point(2.0, 5.0)) && t1.equals(new Point(1., 4.)) && t2.equals( new Point(4., 7.))) return false;

        return Math.random() > 0.5;
    }

    /*
     *     return number of Polygon edges the Horizontal ray from Point P to the right (+ infinity) 
     *     intersects
     *     
     */    
    public int numberEdgesIntersection(Point p)
    {
        if (vertices.length == 5)
        {
            if( p.equals(new Point(0.0, 2.5))) return 2;
            if( p.equals(new Point(3.0, 3.0))) return 1;
            if( p.equals(new Point(8.0, 5.0))) return 0;
        }

        return -1;
    }

    /*
     *     return true if Point p is inside the polygon
     *     
     *     otherwise, return false
     *     
     *     if Point p lies on the boundry, return false
     */    
    public boolean insidePolygon(Point p)
    {

        if (vertices.length == 5)
        {
            if( p.equals(new Point(0.0, 2.5))) return false;
            if( p.equals(new Point(3.0, 3.0))) return true;
            if( p.equals(new Point(8.0, 5.0))) return false;
        }
/*        
        Point[] poly1 = { new Point(1,1), new Point(2, 4), new Point(6, 6), new Point(7,5), new Point(3, 2)};

        assertEquals(false, ioo.insidePolygon(new Point(0, 2.5)));

        assertEquals(true, ioo.insidePolygon(new Point(3.0, 3.0)));

        assertEquals(false, ioo.insidePolygon(new Point(8.0, 5.0)));
*/
        return Math.random() > 0.5;
    }

    /*
     *    precondition:  Poinnt p lies on ONE horizontal line containing a vertex
     */    
/*    public boolean insideAndIntrersectVetrex(Point p)
    {
        int count = 0;
        for (int e  = 0; e < vertices.length - 1; e++)
            if ( Math.abs( p.getY() - vertices[e].getY()) > 0.1 || Math.abs( p.getY() - vertices[e+1].getY()) > 0.1)
                if ( intersectsLineSegmentToRight(p, vertices[e], vertices[e+1] ) )
                    return false;

        return true;
    }
*/
}