import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianglesTest {
    Triangles triangle = new Triangles();

    @Test
    void triangleTypeScaleneFalse(){
        String actual = triangle.triangleType(4,4,5);
        String expected = "It's a scalene triangle mothafucker.";
        assertTrue(!actual.equals(expected));
    }

    @Test
    void triangleTypeScaleneTrue() {
        String actual = triangle.triangleType(4,5,6);
        String expected = "It's a scalene triangle mothafucker.";
        assertEquals(actual,expected);
    }

    @Test
    void triangleTypeIsoscelesTrue() {
        String actual = triangle.triangleType(4,4,9);
        String expected = "It's an isosceles triangle mothafucker.";
        assertEquals(actual,expected);
    }

    @Test
    void triangleTypeEquilateralTrue() {
        String actual = triangle.triangleType(4,4,4);
        String expected = "It's an equilateral triangle mothafucker.";
        assertEquals(actual,expected);
    }
}