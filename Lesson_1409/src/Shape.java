public class Shape {
    private final Type type;
    
    public Shape(Type type) {
        this.type = type;
    }
    
    public double calculateArea(double number) {
        if (type == Type.CIRCLE) {
            return Math.PI * Math.pow(number, 2);
        } else if (type == Type.SQUARE) {
            return Math.pow(number, 2);
        }
        return 0.0;
    }
}


/*
public class Shape {

    public enum Type { CIRCLE, SQUARE }

    private Type type;

    public Shape(Type type) {
        this.type = type;
    }

    public double calculateArea() {
        if (type == Type.CIRCLE) {
        } else if (type == Type.SQUARE) {
        }
        return 0.0;
    }
}
*/