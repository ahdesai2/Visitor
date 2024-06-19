import java.util.Enumeration;
import java.util.Vector;

public class Picture extends DrawObject {
    Vector<DrawObject> elems = new Vector<DrawObject>();

    public Picture(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(name + " is created");
        Enumeration<DrawObject> objs = elems.elements();
        while (objs.hasMoreElements()) {
            objs.nextElement().draw();
        }
    }

    public void add(DrawObject o) {
        elems.addElement(o);
    }

    public Enumeration<DrawObject> getObjs() {
        return elems.elements();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPicture(this);
    }
}
