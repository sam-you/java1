 import java.util.Timer;
 import java.util.TimerTask;
public class Task {
    static int taskNo=0;
    public String taskName;
    public boolean isDone;
    public Task(String taskName){
        this.taskName=taskName;
        taskNo++;
    }
//    class runTask extends TimerTask {
//        public void run() {
//            System.out.println("Hello World!");
//        }
//    }
    public void runTask(){
        long start = System.currentTimeMillis();
        long end = start + (5 * 1000); // 60 seconds * 1000 ms/sec
        while (System.currentTimeMillis() <  end) {
            System.out.println(this.taskName + "is running");
        }
        this.isDone=true;
        System.out.println(this.taskName+ "is Done");

    }
    public void modifyTask(String taskName){
        this.taskName=taskName;

    }
    public static void main (String[] args){
        Task task=new Task("swimming");
        task.runTask();
    }

}
