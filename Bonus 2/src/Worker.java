// FIXME : use state pattern
public class Worker {
    WorkerState state;

    public Worker() {
        this.state = new SleepyWorkerState(this);
    }

    public WorkerStateEnum getState() {
        return this.state.getState();
    }

    public void setWorkerState(WorkerState state) {
        this.state = state;
    }

    public void work() {
        this.state.work();
    }

    public void drink() {
        this.state.drink();
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        System.out.println("trying to work");
        w.work();
        System.out.println("drinking coffee");
        w.drink();
        System.out.println("drinking coffee");
        w.drink();
        System.out.println("trying to work");
        w.work();
        System.out.println("trying to work");
        w.work();


    }
}
