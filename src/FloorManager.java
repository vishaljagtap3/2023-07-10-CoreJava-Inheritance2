public class FloorManager extends Manager {

    private int workHours;

    public FloorManager(int id, String name, int sal, int inc, int workHours) {
        super(id, name, sal, inc);
        this.workHours = workHours;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Floor management!");
    }

    @Override
    public void calculatePerformance() {
        System.out.println("Performance is great!");
    }
}
