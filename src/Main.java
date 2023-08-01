public class Main {
    public static void main(String[] args) {

        Shape s = new Circle(100, 100, 100);
        s.draw();

        s = new Rect(200, 200, 10, 10);
        s.draw();

        //Shape s1 = new Shape();


        //3
        /*Shape s = new Circle(100, 100, 100);
        s.draw();

        //s.setR(50); //will not work
        //s.getR(); //will not work

        if (s instanceof Circle){
            ((Circle) s).setR(50);
            System.out.println(((Circle) s).getR());
            s.draw();
        }

        if(s instanceof Rect){
            ((Rect) s).setW(100);
            ((Rect) s).setH(100);
        }*/

        //2
       /* Shape s = new Circle(100, 100, 100);
        s.setY(200);
        s.setY(200);
        s.getX();
        s.getY();
        s.draw();
        //s.setR(50);
        //s.getR();

        s = new Rect(300, 300, 60, 80);
        s.draw();

        Screen.drawShape(new Circle(0, 0, 0));
        System.out.println();
        Screen.drawShape(new Rect(1, 1, 1, 1));*/

        //Circle c = new Circle(100, 100, 100);

        /*Circle c1 = new Circle(100, 100, 100);
        c1.draw();

        System.out.println();

        Rect r1 = new Rect(200, 200, 60, 80);
        r1.draw();*/

    }
}
