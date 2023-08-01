public abstract class Manager extends Employee {

    private int inc;

    public Manager(int id, String name, int sal, int inc) {
        super(id, name, sal);
        this.inc = inc;
    }

    @Override
    public void work() {
        System.out.println("Manager work!");
    }

    /*@Override
    public void calculatePerformance() {
        System.out.println("performance is to the mark...");
    }*/
}
