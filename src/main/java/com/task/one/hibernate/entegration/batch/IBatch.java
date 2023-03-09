package com.task.one.hibernate.entegration.batch;

public interface IBatch {

    public void execute(int threadCount, int commitCount);
}
