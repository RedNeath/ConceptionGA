public class CaffeinatedWorkerState implements WorkerState {
    private final Worker worker;

    public CaffeinatedWorkerState(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void work() {
        System.out.println("-- working... tired now");
        this.worker.setWorkerState(new SleepyWorkerState(this.worker));
    }

    @Override
    public void drink() {
        System.out.println("-- good!");
    }

    public WorkerStateEnum getState() {
        return WorkerStateEnum.CAFFEINATED;
    }
}
