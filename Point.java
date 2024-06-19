public class Point extends DrawObject {
    public Point(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(name + " is created");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPoint(this);
    }
}
