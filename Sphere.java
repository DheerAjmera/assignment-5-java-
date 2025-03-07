class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 0;  // Spheres don't have a perimeter
    }
