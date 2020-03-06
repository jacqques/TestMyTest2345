public class Triangles {

    public String triangleType(int x, int y, int z){
        if (x == y && z == y){
            return("It's an equilateral triangle mothafucker.");
        }
        else if (z == y || x == y || x == z){
            return("It's an isosceles triangle mothafucker.");
        }
        else {
            return("It's a scalene triangle mothafucker.");
        }

    }

}
