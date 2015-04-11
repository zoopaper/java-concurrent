package com.concurrent.demo04;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/4/11
 * Time: 14:21
 */
public class IndexThread extends Thread {

    private final BlockingQueue<File> queue;

    public IndexThread(BlockingQueue<File> queue) {
        super();
        this.queue = queue;
    }


    @Override
    public void run() {

        while (true) {
            try {
                File file = queue.take();
                index(file);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void index(File file) {
        System.out.println(Thread.currentThread().getName() + " Index file " + file.getAbsolutePath() + " ................");
    }

}
