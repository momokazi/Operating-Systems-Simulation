import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.table.*;


class PCB {
    private static int processIDCounter = 1;
    private int processID;
    private int priority;
    private int completionTime;
    private int arrivalTime;  // Added field
    private int burstTime;
    private int turnaroundTime;
    private int waitingTime;


    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }


    public int getProcessID() {
        return processID;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int setPriority(int pri) {
        this.priority = pri;
        return pri;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int calcTurnaroundTime(List<PCB> readyProcesses) {
        int completionTime = calcCompletionTime(readyProcesses);
        setTurnaroundTime(completionTime - getArrivalTime());
        return getTurnaroundTime();
    }

    public int calcWaitingTime(List<PCB> readyProcesses) {
        int turnaroundTime = calcTurnaroundTime(readyProcesses);
        int waitingTime = turnaroundTime - getBurstTime();

        // Ensure waiting time is non-negative
        return Math.max(0, waitingTime);
    }

    public int calcCompletionTime(List<PCB> readyProcesses) {
        int index = readyProcesses.indexOf(this);

        if (index >= 0) {
            // If the process is found in the list, use its arrival time + burst time
            if (index == 0) {
                return getArrivalTime() + getBurstTime();
            } else {
                // If the process is not the first one, use the completion time of the previous process + burst time
                PCB previousProcess = readyProcesses.get(index - 1);
                return previousProcess.getCompletionTime() + getBurstTime();
            }
        } else {
            // Handle the case where the process is not found in the list
            // This may happen when the process has already been dispatched
            // and moved to the runningProcesses list
            return getCompletionTime(); // Return the precalculated completion time
        }
    }

    public PCB(int burstTime, int arrivalTime) {
        processID = processIDCounter++;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
    }
}



class ProcessManagement extends JDialog {
    public List<PCB> readyProcesses;
    public List<PCB> runningProcesses;
    public List<PCB> suspendedProcesses;
    public List<PCB> blockedProcesses;


    public ProcessManagement(Frame owner) {
        super(owner, "Momo OS", true);
        setSize(400, 300);
        setLocationRelativeTo(owner);
        setFocusable(true);

        readyProcesses = new ArrayList<>();
        runningProcesses = new ArrayList<>();
        suspendedProcesses = new ArrayList<>();
        blockedProcesses = new ArrayList<>();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        String[] processActions = {
                "Create a process",
                "Destroy a process",
                "Dispatch a process",
                "Display Processes",
                "Suspend a Process",
                "Block a Process",
                "Wakeup a Process"
        };

        for (String action : processActions) {
            JButton button = new JButton(action);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.addActionListener(e -> handleProcessAction(action));
            panel.add(button);
        }

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        okButton.addActionListener(e -> dispose());
        cancelButton.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void handleProcessAction(String action) {
        if (action.equals("Create a process")) {
            int numProcesses = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of processes to create:"));

            for (int i = 0; i < numProcesses; i++) {
                int burstTime = Integer.parseInt(JOptionPane.showInputDialog("Enter burst time for process " + (i + 1) + ":"));
                int arrivalTime = Integer.parseInt(JOptionPane.showInputDialog("Enter arrival time for process " + (i + 1) + ":"));
                int priority = Integer.parseInt(JOptionPane.showInputDialog("Enter Priority for process " + (i + 1) + ":"));

                PCB newProcess = new PCB(burstTime, arrivalTime);
                newProcess.setPriority(priority);
                readyProcesses.add(newProcess);

                System.out.println("New process created with ID: " + newProcess.getProcessID() +
                        ", Arrival Time: " + newProcess.getArrivalTime() +
                        ", Burst Time: " + newProcess.getBurstTime() +
                        ", Priority: " + newProcess.getPriority());

                // Calculate completion time, turnaround time, and waiting time
                int completionTime = newProcess.calcCompletionTime(readyProcesses);
                int turnaroundTime = newProcess.calcTurnaroundTime(readyProcesses);
                int waitingTime = newProcess.calcWaitingTime(readyProcesses);

                newProcess.setCompletionTime(completionTime);
                newProcess.setTurnaroundTime(turnaroundTime);
                newProcess.setWaitingTime(waitingTime);
            }

        } else if (action.equals("Destroy a process")) {
            destroyProcess();
        } else if (action.equals("Dispatch a process")) {
            dispatchProcess();
        } else if (action.equals("Display Processes")) {
            displayProcesses();
        } else if (action.equals("Block a Process")) {
            blockProcess();
        } else if (action.equals("Suspend a Process")) {
            suspendProcess();
        } else if (action.equals("Wakeup a Process")) {
            wakeupProcess();
        }
    }

    private void wakeupProcess() {
        if (!suspendedProcesses.isEmpty() || !blockedProcesses.isEmpty()) {
            int processID = Integer.parseInt(JOptionPane.showInputDialog("Enter the process ID to Wakeup:"));

            for (Iterator<PCB> iterator = suspendedProcesses.iterator(); iterator.hasNext();) {
                PCB process = iterator.next();
                if (process.getProcessID() == processID) {
                    iterator.remove();
                    readyProcesses.add(process);
                    JOptionPane.showMessageDialog(this,
                            "Process ID " + processID + " has been woken up.");
                    return;
                }
            }

            for (Iterator<PCB> iterator = blockedProcesses.iterator(); iterator.hasNext();) {
                PCB process = iterator.next();
                if (process.getProcessID() == processID) {
                    iterator.remove();
                    readyProcesses.add(process);
                    JOptionPane.showMessageDialog(this,
                            "Process ID " + processID + " has been woken up.");
                    return;
                }
            }

            JOptionPane.showMessageDialog(this, "Process ID " + processID + " not found in Suspended or Blocked arrays.");
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "No processes available in the Suspended and Blocked array to destroy.");
        }
    }

    private void suspendProcess() {
        int processID = Integer.parseInt(JOptionPane.showInputDialog("Enter the process ID to Suspend:"));

        for (PCB process : runningProcesses) {
            if (process.getProcessID() == processID) {
                suspendedProcesses.add(process);
                runningProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " Suspended.");
                return;
            }
        }

        for (PCB process : readyProcesses) {
            if (process.getProcessID() == processID) {
                suspendedProcesses.add(process);
                readyProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " Suspended.");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Process ID " + processID + " not found in the running or ready arrays.");
    }


    private void blockProcess() {
        int processID = Integer.parseInt(JOptionPane.showInputDialog("Enter the process ID to Block:"));

        for (PCB process : runningProcesses) {
            if (process.getProcessID() == processID) {
                blockedProcesses.add(process);
                runningProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " blocked.");
                return;
            }
        }

        for (PCB process : readyProcesses) {
            if (process.getProcessID() == processID) {
                blockedProcesses.add(process);
                readyProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " blocked.");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Process ID " + processID + " not found.");
    }



    private void destroyProcess() {
        int processID = Integer.parseInt(JOptionPane.showInputDialog("Enter the process ID to destroy:"));

        for (PCB process : runningProcesses) {
            if (process.getProcessID() == processID) {
                runningProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " destroyed.");
                return;
            }
        }

        for (PCB process : readyProcesses) {
            if (process.getProcessID() == processID) {
                readyProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " destroyed.");
                return;
            }
        }

        for (PCB process : blockedProcesses) {
            if (process.getProcessID() == processID) {
                blockedProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " destroyed.");
                return;
            }
        }

        for (PCB process : suspendedProcesses) {
            if (process.getProcessID() == processID) {
                suspendedProcesses.remove(process);
                JOptionPane.showMessageDialog(this, "Process ID " + processID + " destroyed.");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Process ID " + processID + " not found in any process list.");
    }


    private void dispatchProcess() {
        PCB nextProcess = null; // Declare the variable outside the if block

        if (!readyProcesses.isEmpty() && runningProcesses.isEmpty()) {
            int schedulingMethod = Integer.parseInt(JOptionPane.showInputDialog("Choose a scheduling method for dispatching:\n1- FCFS\n2- Priority Scheduling"));

            if (schedulingMethod == 1) {
                PCB firstProcess = readyProcesses.get(0);

                for (int i = 1; i < readyProcesses.size(); i++) {
                    PCB process = readyProcesses.get(i);
                    if (process.getArrivalTime() < firstProcess.getArrivalTime()) {
                        firstProcess = process;
                    }
                }

                nextProcess = firstProcess; // assuming FCFS
                readyProcesses.remove(nextProcess);
                runningProcesses.add(nextProcess);

                System.out.println("Process ID " + nextProcess.getProcessID() + " dispatched using FCFS.");
            } else if (schedulingMethod == 2) {
                PCB highestPriority = readyProcesses.get(0);
                for (PCB process : readyProcesses) {
                    if (process.getPriority() < highestPriority.getPriority()) {
                        highestPriority = process;
                    }
                }

                nextProcess = highestPriority;
                readyProcesses.remove(nextProcess);
                runningProcesses.add(nextProcess);

                System.out.println("Process ID " + nextProcess.getProcessID() + " dispatched using Priority Scheduling.");
            } else {
                System.out.println("Invalid scheduling method selected.");
                return;
            }
        } else {
            System.out.println("No processes available to dispatch or a process is already running.");
            return;
        }
    }



    private void displayProcesses() {
        if (!readyProcesses.isEmpty() || !runningProcesses.isEmpty() || !blockedProcesses.isEmpty() || !suspendedProcesses.isEmpty()) {
            new ProcessDisplay(this, readyProcesses, runningProcesses,
                    blockedProcesses, suspendedProcesses).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No processes available.");
        }
    }
}

class ProcessDisplay extends JDialog {
    public ProcessDisplay(JDialog owner, List<PCB> readyProcesses, List<PCB> runningProcesses, List<PCB> blockedProcesses, List<PCB> suspendedProcesses) {
        super(owner, "Process Display", true);
        setTitle("Process Display");
        setSize(900, 400);
        setLocationRelativeTo(owner);

        // Create a table for running processes
        DefaultTableModel runningTableModel = new DefaultTableModel();
        JTable runningTable = new JTable(runningTableModel);

        runningTableModel.addColumn("Process ID");
        runningTableModel.addColumn("Arrival Time");
        runningTableModel.addColumn("Burst Time");
        runningTableModel.addColumn("Completion Time");
        runningTableModel.addColumn("Turnaround Time");
        runningTableModel.addColumn("Waiting Time");
        runningTableModel.addColumn("Priority");

        // Display running processes without calculating metrics
        for (PCB process : runningProcesses) {
            Object[] rowData = getProcessRowData(process, "Running", readyProcesses);
            runningTableModel.addRow(rowData);
        }

        // Create a table for ready, blocked, and suspended processes
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);

        tableModel.addColumn("Process ID");
        tableModel.addColumn("Arrival Time");
        tableModel.addColumn("Burst Time");
        tableModel.addColumn("Completion Time");
        tableModel.addColumn("Turnaround Time");
        tableModel.addColumn("Waiting Time");
        tableModel.addColumn("Priority");
        tableModel.addColumn("Status");

        // Calculate metrics only for ready processes
        for (PCB process : readyProcesses) {
            Object[] rowData = getProcessRowData(process, "Ready", readyProcesses);
            tableModel.addRow(rowData);
        }
        for (PCB process : blockedProcesses) {
            Object[] rowData = getProcessRowData(process, "Blocked", readyProcesses);
            tableModel.addRow(rowData);
        }
        for (PCB process : suspendedProcesses) {
            Object[] rowData = getProcessRowData(process, "Suspended", readyProcesses);
            tableModel.addRow(rowData);
        }

        // Add tables to a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Running Processes", new JScrollPane(runningTable));
        tabbedPane.addTab("Other Processes", new JScrollPane(table));

        add(tabbedPane, BorderLayout.CENTER);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(closeButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private Object[] getProcessRowData(PCB process, String status, List<PCB> readyProcesses) {
        int completionTime;
        int turnaroundTime;
        int waitingTime;

        // Calculate metrics only for ready processes
        if (readyProcesses.contains(process)) {
            completionTime = process.calcCompletionTime(readyProcesses);
            turnaroundTime = process.calcTurnaroundTime(readyProcesses);
            waitingTime = process.calcWaitingTime(readyProcesses);
        } else {
            // For processes in other lists, use the precalculated values
            completionTime = process.getCompletionTime();
            turnaroundTime = process.getTurnaroundTime();
            waitingTime = process.getWaitingTime();
        }

        return new Object[]{
                process.getProcessID(),
                process.getArrivalTime(),
                process.getBurstTime(),
                completionTime,
                turnaroundTime,
                waitingTime,
                process.getPriority(),
                status
        };
    }
}




class Configuration extends JDialog {
    public Configuration(Frame owner) {
        super(owner, "Configuration", true);
        setSize(200, 300);
        setLocationRelativeTo(owner);

        JButton setParametersButton = new JButton("Set Parameters");
        // Set a smaller size for the button
        setParametersButton.setPreferredSize(new Dimension(150, 30));
        setParametersButton.addActionListener(e -> {
          //  System.out.println("Set Parameters button clicked!");


            // Start the server on button click
            startServer();
        });

        add(setParametersButton);
    }

    private void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Momo OS listening on port 8080...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Momo OS Listening!");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received: " + inputLine);
                out.println(inputLine); // Echo back to the Client
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MemoryManagement extends Dialog {
    public MemoryManagement(Frame owner) {
        super(owner, "Memory Management", true);
        setSize(300, 150);
        setLocationRelativeTo(owner);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton fifoButton = new JButton("FIFO");
        JButton lruButton = new JButton("LRU");
        JButton Paging= new JButton("Paging");

        fifoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        lruButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        Paging.setAlignmentX(Component.CENTER_ALIGNMENT);

        fifoButton.addActionListener(e -> handleMemoryManagementAction("FIFO"));
        lruButton.addActionListener(e -> handleMemoryManagementAction("LRU"));

        panel.add(fifoButton);
        panel.add(lruButton);
        panel.add(Paging);

        JButton closeButton = new JButton("Close");
        closeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        closeButton.addActionListener(e -> dispose());

        panel.add(Box.createVerticalStrut(10));
        panel.add(closeButton);

        add(panel);
    }

    private void handleMemoryManagementAction(String action) {
        if (action.equals("FIFO")) {
            String RS = JOptionPane.showInputDialog("Enter Reference String");
            String[] rsStrings = RS.split(" ");
            int[] rs = new int[rsStrings.length];

            for (int i = 0; i < rsStrings.length; i++) {
                try {
                    rs[i] = Integer.parseInt(rsStrings[i]);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "Invalid input. Please enter integers separated by space.");
                    return;
                }
            }
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of frames"));
            int[] p = new int[n];
            int i1 = 0, k = 0, m = rs.length;
            int flag;

            for (int j = 0; j < n; j++)
                p[j] = 0;

            for (int i = 0; i < m; i++) {
                flag = 1;

                for (int j = 0; j < n; j++)
                    if (p[j] == rs[i]) {
                        JOptionPane.showMessageDialog(this, "Data already in page....");
                        flag = 0;
                        break;
                    }

                if (flag == 1) {
                    p[i1] = rs[i];
                    i1++;
                    k++;

                    if (i1 == n)
                        i1 = 0;

                    StringBuilder output = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        output.append("\n Page ").append(j + 1).append(": ").append(p[j]);
                        if (p[j] == rs[i])
                            output.append("*");
                    }
                    JOptionPane.showMessageDialog(this, output.toString());
                }
            }
            JOptionPane.showMessageDialog(this, "Total number of page faults: " + k);
        } else if (action.equals("LRU")) {
            String RS = JOptionPane.showInputDialog("Enter Reference String");
            String[] rsStrings = RS.split(" ");
            int[] rs = new int[rsStrings.length];

            for (int i = 0; i < rsStrings.length; i++) {
                try {
                    rs[i] = Integer.parseInt(rsStrings[i]);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "Invalid input. Please enter integers separated by space.");
                    return;
                }
            }
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of frames"));
            int[] p = new int[n];
            int[] indexes = new int[1000];
            int i1 = 0, k = 0, m = rs.length;
            int flag, nextIndex = 0;

            for (int j = 0; j < n; j++)
                p[j] = 0;

            for (int i = 0; i < m; i++) {
                flag = 1;
                int page = rs[i];
                // Check if the set can hold more pages
                if (nextIndex < n) {
                    page = rs[i];
                    boolean found = false;

                    for (int j = 0; j < nextIndex; j++) {
                        if (p[j] == page) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        p[nextIndex] = page;
                        // increment page fault
                        k++;
                        nextIndex++;
                    }
                    // Display the pages
                    StringBuilder output = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        output.append("\n Page ").append(j + 1).append(": ").append(p[j]);
                        if (p[j] == page) {
                            output.append("*");
                        }
                    }
                    JOptionPane.showMessageDialog(this, output.toString());
            } else {
                    // Check if current page is not already present in the set
                    for (int j = 0; j < n; j++) {
                        if (p[j] == page) {
                            flag = 0;
                            JOptionPane.showMessageDialog(this, "Data already in page....");
                            break;
                        }
                    }
                    if (flag == 1) {
                        // Find the least recently used pages that is present in the set
                        int lru = Integer.MAX_VALUE, val = 0;
                        for (int j = 0; j < n; j++) {
                            if (indexes[p[j]] < lru) {
                                lru = indexes[p[j]];
                                val = p[j];
                            }
                        }
                        // Remove the indexes page
                        for (int j = 0; j < n; j++) {
                            if (p[j] == val) {
                                p[j] = page;
                                break;
                            }
                        }
                        // Increment page faults
                        k++;
                    }
                    // Update the current page index
                    indexes[page] = i;
                }
            }
            JOptionPane.showMessageDialog(this, "Total number of page faults: " + k);
        }
    }
}

class Semaphore {
    private List<Semaphore> wait;
    private List<Semaphore> running;
    private List<Semaphore> wake;
    public boolean value = true;

    public Semaphore() {
        wait = new ArrayList<>();
        wake = new ArrayList<>();
        running= new ArrayList<>();
    }

    public void Down(Semaphore s) {
        int inp = Integer.parseInt( JOptionPane.showInputDialog("Enter Value 0 or 1: "));
        if (inp==1) {
            s.value = false;
            running.add(s);
            JOptionPane.showMessageDialog(null, "Process sent to critical section");
        } else if(inp==0) {
            try {
                new Thread(() -> {
                    wait.add(s);
                }).sleep(2000);
                JOptionPane.showMessageDialog(null, "Process sent to Sleep");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Please Enter 0 or 1");
        }
    }

    public void Up(Semaphore s) {
        if (wait.isEmpty()) {
            s.value = true;
            JOptionPane.showMessageDialog(null, "Wait was empty");
        } else {
            wake.add(s);
            wait.remove(s);
            JOptionPane.showMessageDialog(null,"Removed from waiting and woken up");
        }
    }
}

class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Momo OS");
        setMinimumSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Momo OS");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(titleLabel);

        JButton processManagementButton = new JButton("Process Management");
        processManagementButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        Insets buttonInsets = new Insets(5, 10, 5, 10);
        processManagementButton.setMargin(buttonInsets);
        processManagementButton.addActionListener(e -> onProcessManagementClicked());
        mainPanel.add(processManagementButton);

        JButton memoryManagementButton= new JButton("Memory Management");
        memoryManagementButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonInsets = new Insets(5, 10, 5, 10);
        memoryManagementButton.setMargin(buttonInsets);
        memoryManagementButton.addActionListener(e -> onMemoryManagementClicked());
        mainPanel.add(memoryManagementButton);


            JButton otherOperations = new JButton("Other Operations");
            //JButton IOmanagement = new JButton("I/O Management");

            otherOperations.setAlignmentX(Component.CENTER_ALIGNMENT);
            otherOperations.setMargin(buttonInsets);
            otherOperations.addActionListener(e-> onOtherOperationsClicked());
            mainPanel.add(otherOperations);


        JButton configurationButton = new JButton("Configuration");
        configurationButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        configurationButton.setBackground(Color.GREEN);
        configurationButton.addActionListener(e -> onConfigurationClicked());
        mainPanel.add(configurationButton);

        setContentPane(mainPanel);
    }

    private void onProcessManagementClicked() {
        ProcessManagement dialog = new ProcessManagement(this);
        dialog.setVisible(true);
    }
    private void onMemoryManagementClicked() {
        MemoryManagement dialog = new MemoryManagement(this);
        dialog.setVisible(true);
    }
    private void onConfigurationClicked() {
        Configuration conf = new Configuration(this);
        conf.setVisible(true);
    }
    private void onOtherOperationsClicked() {
        Semaphore ioSemaphore = new Semaphore();
        try {
           ioSemaphore.Down(ioSemaphore);
           ioSemaphore.Up(ioSemaphore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow mainWindow = new MainWindow();
            mainWindow.pack();
            mainWindow.setLocationRelativeTo(null);
            mainWindow.setVisible(true);
        });
    }
}