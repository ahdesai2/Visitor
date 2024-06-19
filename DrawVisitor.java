import java.util.Enumeration;

public class DrawVisitor implements Visitor {
    @Override
    public void visitLine(Line line) {
        System.out.println(line.getName() + " is created");
        Enumeration<Point> pts = line.getPts();
        while (pts.hasMoreElements()) {
            pts.nextElement().accept(this);
        }
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println(rectangle.getName() + " is created");
        Enumeration<Point> pts = rectangle.getPts();
        while (pts.hasMoreElements()) {
            pts.nextElement().accept(this);
        }
    }

    @Override
    public void visitPoint(Point point) {
        System.out.println(point.getName() + " is created");
    }

    @Override
    public void visitPicture(Picture picture) {
        System.out.println(picture.getName() + " is created");
        Enumeration<DrawObject> objs = picture.getObjs();
        while (objs.hasMoreElements()) {
            objs.nextElement().accept(this);
        }
    }
}
