public class Window {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Picture p1 = new Picture("picture1");
        Line l1 = new Line("line1");
        Line l2 = new Line("line2");
        Point pt1 = new Point("point1");
        Point pt2 = new Point("point2");
        Point pt3 = new Point("point3");
        Point pt4 = new Point("point4");

        l1.add(pt1);
        l1.add(pt2);
        l2.add(pt3);
        l2.add(pt4);
        p1.add(l1);
        p1.add(l2);
        os.add(p1);

        System.out.println("The object structure contains:");
        DrawVisitor visitor = new DrawVisitor();
        os.accept(visitor);
    }
}

