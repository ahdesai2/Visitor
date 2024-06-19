import java.util.Enumeration;
import java.util.Vector;

public class ObjectStructure {
    Vector<DrawObject> os = new Vector<DrawObject>();

    public void add(DrawObject o) {
        os.addElement(o);
    }

    public void remove(DrawObject o) {
        os.removeElement(o);
    }

    public Vector<DrawObject> getObjectStructure() {
        return os;
    }

    public void accept(Visitor visitor) {
        Enumeration<DrawObject> elems = os.elements();
        while (elems.hasMoreElements()) {
            elems.nextElement().accept(visitor);
        }
    }
}

