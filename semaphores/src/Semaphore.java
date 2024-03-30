import java.util.*;
import java.util.concurrent.TimeUnit;

class Semaphore {
    public enum Value { Zero, One }
    public Queue<Process> q = new LinkedList<Process>();
    public Value value = Value.One;

    public void P(Semaphore s, Process p)
    {
        if (s.value == Value.One) {
            s.value = Value.Zero;
        }
        else {
            // add the process to the waiting queue
            q.add(p);
            p.Sleep();
        }
    }

    public void V(Semaphore s)
    {
        if (s.q.isEmpty()) {
            s.value = Value.One;
        }
        else {
            // select a process from waiting queue
            Process p = q.peek();
            // remove the process from waiting as it has
            // been sent for CS
            q.remove();
            p.Wakeup();
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();

        Process process1 = new Process();
        Process process2 = new Process();

        // Calling P operation on semaphore with process1
        semaphore.P(semaphore, process1);

        // Calling V operation on semaphore
        semaphore.V(semaphore);

        // Calling P operation on semaphore with process2
        semaphore.P(semaphore, process2);

        // Calling V operation on semaphore
        semaphore.V(semaphore);
    }


}
class Process{
    public void Sleep() {
        try {
            // Simulate the process sleeping by pausing execution for a short time
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Process is sleeping");
    }

    public void Wakeup() {
        System.out.println("Process is waking up");
    }
}

