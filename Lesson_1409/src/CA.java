public class CA {
    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;
    public static final int TRIANGLE = 3;

    public double calculateArea(int shapeType, double... params) {
        return switch (shapeType) {
            case CIRCLE -> // 1 - круг
                    calculateCircleArea(params[0]);
            case SQUARE -> // 2 - квадрат
                    calculateSquareArea(params[0]);
            case TRIANGLE -> // 3 - треугольник
                    calculateTriangleArea(params[0], params[1], params[2]);
            default -> 0.0;
        };
    }

    private double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private double calculateSquareArea(double side) {
        return side * side;
    }

    private double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

/*
public class CA {
    public double calculateArea(int shapeType, double... params) {
        if (shapeType == 1) { // 1 - круг
            double radius = params[0];
            return Math.PI * radius * radius;
        } else if (shapeType == 2) { // 2 - квадрат
            double side = params[0];
            return side * side;
        } else if (shapeType == 3) { // 3 - треугольник
            double a = params[0];
            double b = params[1];
            double c = params[2];
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0.0;
    }
}
*/