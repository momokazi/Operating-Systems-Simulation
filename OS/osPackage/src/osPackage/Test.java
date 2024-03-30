package osPackage;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Test {
    
    
 
     
    OS obj[] = new OS[10];
    int i=0;
    int j=0;
    public void CreateProcess(int pid, String pname,  int priority, int arivalTime, int burstTime, int memorySize){
        obj[i] = new OS( pid,  pname,   priority, arivalTime,  burstTime , memorySize);
        
        i++;
    }

     
   
    int n = obj.length;
    public boolean delete(int pid ){
       
        for(int m=0; m < i ; m++){
            if(pid == obj[m].pid){
                
                for(int k = m ; k < i; k++){
                    
                    if(k == i-1){
                            obj[k].pid = 0;
                            obj[k].pname="";
                            obj[k].state="";
                            obj[k].priority=0;
                            obj[k].AT=0;
                            obj[k].BT=0;
                            obj[k].CT=0;
                            obj[k].RT=0;
                            obj[k].TAT=0;
                            obj[k].memorySize=0;
                            obj[k].WT=0;
                            i--;
                            return true;
                    }
                    else{
                           obj[k].pid = obj[k+1].pid;
                          obj[k].pname=obj[k+1].pname;
                          obj[k].state=obj[k+1].state;
                          obj[k].priority=obj[k+1].priority;
                          obj[k].AT=obj[k+1].AT;
                          obj[k].BT=obj[k+1].BT;
                          obj[k].CT=obj[k+1].CT;
                          obj[k].RT=obj[k+1].RT;
                          obj[k].TAT=obj[k+1].TAT;
                          obj[k].memorySize=obj[k+1].memorySize;
                          obj[k].WT=obj[k+1].WT;
                          i--;
                          return true;
                    }
          
               
              }
                                   
            }
        }
        return false;
    }
    
    //function to waxkup the process
     public int wackup(int pid){
       for(int m =0; m < i;m++){
           if(obj[m].pid == pid){
               if(obj[m].state == "block"){
                   obj[m].state="ready";
                   return 1;
               }
               else {
                   return 2;
               }
           }
       }
        return 3;
   }
     public int suspend(int pid){
       for(int m =0; m < i;m++){
           if(obj[m].pid == pid){
               if(obj[m].state == "block"){
                   obj[m].state="suspend";
                   return 1;
               }
               else{
                   return 2;
               }
           }
       }
        return 3;
   }
     
   public int block(int pid){
       for(int m =0; m < i ;m++){
           if(obj[m].pid == pid){
               
               if(obj[m].state == "running"){
                   obj[m].state="block";
                   return 1;
               }
               else{
                   return 2;
               }
           }
       }
       return 3;
   }
   public int dispatch(int pid){
       for(int m =0; m < i;m++){
           if(pid == obj[m].pid){
               if(obj[m].state == "ready"){
                   obj[m].state="running";
                   return 1;
               }
               else{
                   return 2;
               }
           }
       }
       return 3;
   }
   public int resume(int pid){
       for(int m =0;m < i ;m++){
           if(pid == obj[m].pid ){
               if(obj[m].state == "suspend"){
                   obj[m].state="running";
                   return 1;
               }
               else {
                   return 2;
               }
               
           }
       }
       return 3;
   }

  
   public int changePriority(int pid, int priority){
       for(int m =0;m < i ;m++){
           if(pid == obj[m].pid ){
                obj[m].priority = priority ;
                   return 1;
               }
     
       }
       return 3;
   }

   public void display(JTable t){
            DefaultTableModel mod=(DefaultTableModel) t.getModel();
            Object[] row;
            mod.setRowCount(0);
            for(int k=0; k<i; k++)
            {
                row=new Object[6];
                row[0]=obj[k].pid;
                row[1]=obj[k].pname;
                row[2]=obj[k].AT;
                row[3]=obj[k].BT; 
                row[4]=obj[k].state;
                row[5]=obj[k].priority;
             
                mod.addRow(row);
            }
         }
    
   
public void FCFS() {
    int time = 0;
    for (int i = 0; i < obj.length; i++) {
        if (obj[i] != null) {
            if (time < obj[i].AT) {
                time = obj[i].AT;
            }
            obj[i].CT = time + obj[i].BT;
            obj[i].TAT = obj[i].CT - obj[i].AT;
            obj[i].WT = obj[i].TAT - obj[i].BT;
            time += obj[i].BT;
        }
    }
}
  public void displayFCFS(JTable t){
            DefaultTableModel mod=(DefaultTableModel) t.getModel();
            Object[] row;
            mod.setRowCount(0);
            for(int k=0; k<i; k++)
            {
                row=new Object[6];
                row[0]=obj[k].pid;
                row[1]=obj[k].AT;
                row[2]=obj[k].BT;
                row[3]=obj[k].WT;
                row[4]=obj[k].TAT;
                row[5]=obj[k].CT;
                mod.addRow(row);
            }
         }
      

public void Priority() {
    int time = 0;
    for (int i = 0; i < obj.length; i++) {
        int min = i;
        for (int j = i + 1; j < obj.length; j++) {
            if (obj[j] != null) {
                if (obj[j].priority > obj[min].priority) {
                    min = j;
                }
            }
        }
        OS temp = obj[min];
        obj[min] = obj[i];
        obj[i] = temp;
    }

    for (int i = 0; i < obj.length; i++) {
        if (obj[i] != null) {
            if (time < obj[i].AT) {
                time = obj[i].AT;
            }
            obj[i].CT = time + obj[i].BT;
            obj[i].TAT = obj[i].CT - obj[i].AT;
            obj[i].WT = obj[i].TAT - obj[i].BT;
            time += obj[i].BT;
        }
    }
}

  public void displayPriority(JTable t){
            DefaultTableModel mod=(DefaultTableModel) t.getModel();
            Object[] row;
            mod.setRowCount(0);
            for(int k=0; k<i; k++)
            {
                row=new Object[6];
                row[0]=obj[k].pid;
                row[1]=obj[k].AT;
                row[2]=obj[k].BT;
                row[3]=obj[k].WT;
                row[4]=obj[k].TAT;
                row[5]=obj[k].CT;
                
                mod.addRow(row);
            }
         }
 
 
 
 

}