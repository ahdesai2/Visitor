public interface Visitor {
    void visitLine(Line line);
    void visitRectangle(Rectangle rectangle);
    void visitPoint(Point point);
    void visitPicture(Picture picture);
}

