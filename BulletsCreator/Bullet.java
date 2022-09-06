package BulletsCreator;

public abstract class Bullet {
    private double weight;
    private double height;
    private double length;
    private double width;
    private Color color;
    private Vector3D vector;


    protected Bullet() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vector3D getVector() {
        return vector;
    }

    public void setVector(Vector3D vector) {
        this.vector = vector;
    }
}
