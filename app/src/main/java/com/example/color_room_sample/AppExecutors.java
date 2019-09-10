package com.example.color_room_sample;

import android.os.Handler;
import android.os.Looper;

import androidx.annotation.MainThread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppExecutors {

    private Executor diskIO = Executors.newSingleThreadExecutor();
    private Executor networkIO = Executors.newFixedThreadPool(3);
    private Executor mainthread = new MainThreadExecutor();

    public Executor getDiskIO() {
        return diskIO;
    }

    public void setDiskIO(Executor diskIO) {
        this.diskIO = diskIO;
    }

    public Executor getNetworkIO() {
        return networkIO;
    }

    public void setNetworkIO(Executor networkIO) {
        this.networkIO = networkIO;
    }

    public Executor getMainthread() {
        return mainthread;
    }

    public void setMainthread(Executor mainthread) {
        this.mainthread = mainthread;
    }

    private class MainThreadExecutor implements Executor {

        private final Handler mainthreadHandler = new Handler(Looper.getMainLooper());

        @Override
        public void execute(Runnable runnable) {
            mainthreadHandler.post(runnable);
        }
    }

}
