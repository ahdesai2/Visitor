import java.util.Enumeration;
import java.util.Vector;

public abstract class Shape extends DrawObject {
    Vector<Point> elems = new Vector<Point>();

    public void add(Point p) {
        elems.addElement(p);
    }

    public Enumeration<Point> getPts() {
        return elems.elements();
    }
}

