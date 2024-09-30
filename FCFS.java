import java.util.*;

class process{
 	int wait;
 	int submission;
 	int burst;
 	int turnAround;
 	int completionTime;
 	
 	//constructor to initialize process
 	process(int sub,int bur)
 	{
 	 	submission=sub;
 	 	burst=bur;
 	}
 	


}

   class FCFS{
   
    public static void main(String[] agrs){
    
           
         int x=0,wait=0;
          
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter Number of Processes");
          int n=sc.nextInt();
          process[] myprocess=new process[n];
          
          System.out.println("Enter arrival time and Burst Time");
          for(int i=0;i<n;i++)
          {
          	int sub=sc.nextInt();
          	int bur=sc.nextInt();
          	myprocess[i]=new process(sub,bur);
          }
          
          for(int i=0;i<myprocess.length;i++)
          {
          	x=x+myprocess[i].burst;
          	myprocess[i].completionTime=x;
          	myprocess[i].turnAround=myprocess[i].completionTime-myprocess[i].submission;//completion-Arrival
          	myprocess[i].wait=myprocess[i].turnAround-myprocess[i].burst;//service-execution
          	 
          	System.out.println("process"+i+":");
          	System.out.println("turnaround \t completiontime\t\\t waiting");
          	System.out.println( myprocess[i].turnAround+"\t\t\t"+myprocess[i].completionTime+"\t\t\t"+myprocess[i].wait);
          	
          }
    }
   }
