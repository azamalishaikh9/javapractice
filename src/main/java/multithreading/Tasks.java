package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasks implements Runnable {

    private String taskName;

    public Tasks(String task) {
        this.taskName = task;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
//                Date date = new Date();
//                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                if (i == 0) {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for the task name : " + taskName + "=" + sdf.format(date));
                } else {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Time of execution for the task name : " + taskName + "=" + sdf.format(date));
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName + " is complete.");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

