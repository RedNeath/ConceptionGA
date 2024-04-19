public class SleepyWorkerState implements WorkerState {
    private final Worker worker;

    public SleepyWorkerState(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void work() {
        System.out.println("-- can't work now");
    }

    @Override
    public void drink() {
        System.out.println("-- good! can work now");
        this.worker.setWorkerState(new CaffeinatedWorkerState(this.worker));
    }

    @Override
    public WorkerStateEnum getState() {
        return WorkerStateEnum.SLEEPY;
    }
}
