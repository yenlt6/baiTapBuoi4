import java.lang.Math;

public class Circle {
    float radius;

    public Circle(float r) {
        radius = r;
    }

    public double circleArea(Circle cir) {
        double acreage = cir.radius * cir.radius * 3.14;
        return acreage;
    }

    public double circleCircuit(Circle cir) {
        double circuit = Math.PI * 2 * cir.radius;
        return circuit;

    }
}


