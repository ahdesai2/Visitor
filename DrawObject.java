public abstract class DrawObject {
    String name;
    public abstract void draw();
    public abstract void accept(Visitor visitor);
    public String getName() {
        return name;
    }
}
