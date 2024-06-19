import java.util.Enumeration;

public class Line extends Shape {
    public Line(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(name + " is created");
        Enumeration<Point> pts = getPts();
        while (pts.hasMoreElements()) {
            pts.nextElement().draw();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLine(this);
    }
}

