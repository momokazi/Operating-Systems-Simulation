package osPackage;

public class OS {
    
            
    public int pid;
    public String pname;
    public int priority;
    public String state;
    public int AT;
    public int BT;
    public int CT;
    public int RT;
    public int WT;
    public int TAT;
    public int memorySize;
    int IO;
    
    public OS() {
       
         pid = 0;
         pname = "";
         state = "";
         priority = 0;
         AT = 0;
         BT = 0;
         CT=0;
         RT=0;
         TAT=0;
         WT=0;
         memorySize=0;
         IO=0;
         
        
    }

   
    
    
    
    public OS(int pid, String pname,  int priority, int AT, int BT, int memorySize) {
        this.pid = pid;
        this.pname = pname;
        this.state = "ready";
        this.priority = priority;
        this.AT=AT;
        this.BT=BT;
        this.memorySize= memorySize;
    }
    
     public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }
}
