public interface WorkerState {
    void work();

    void drink();

    WorkerStateEnum getState();
}
