public class Rect extends Shape {
    private int w, h;

    public Rect() {
        System.out.println("Rect()");
        this.w = 0;
        this.h = 0;
    }

    public Rect(int x, int y, int w, int h) {
        super(x, y);
        System.out.println("Rect(int, int, int, int)");
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("x = " + getX()  + " y = " + getY());
        System.out.println("w = " + w + " h = " + h);
        //super.draw();
    }
}
