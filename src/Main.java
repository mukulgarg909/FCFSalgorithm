import java.util.Scanner;
public class Main {
  public static void main(String[] args)
  {
  int p[][] = new int[4][5]; // 4x4 array matrix
  Scanner sc = new Scanner(System.in);
  // loop for entering burst-time value at p[1][0]
  for(int i=1;i<4;i++)
  {
       System.out.println("Enter the Arrival time for process " +i +":");
       p[i][0]= sc.nextInt();
       System.out.println("Enter the Burst time for process " +i +":");
       p[i][1] = sc.nextInt();
          
     
  }
  System.out.println();

  // to find the completion time = previous ka burst time + apna burst time
  for(int i=1; i<4; i++)
  {
      //for(int j=1; j<3; j++)
      {
          p[i][2] = p[i-1][2] + p[i][1];
      }
  }
  // to find the turnaround time = CT - AT
  for(int i=1; i<4; i++)
  {
      //for(int j=1; j<3; j++)
      {
          p[i][3] = p[i][2] - p[i][0];
      }
  }
//to find the waiting time = TAT - BT
 for(int i=1; i<4; i++)
 {
     //for(int j=1; j<3; j++)
     {
         p[i][4] = p[i][3] - p[i][1];
     }
 }

  // printing 2D array
  System.out.println("Process No" +"\t" +"Arrival time" +"\t" +"Burst Time" +"\t" +"CompletionTime" +"\t" +"TurnAroundTime" +"\t" +"WaitingTime" );
       for(int i=1;i<4;i++)
       {
       
       System.out.print(i +"\t \t"); // to print the index of process
       for(int j=0;j<5;j++)
       {
          
          System.out.print(" " +p[i][j] +"\t\t"); // to find the completion time
          
       }

       System.out.println();
  }
       // Calculating average time
       // for TAT
       double sum1 = p[1][3] +p[2][3]  + p[3][3];
       double avg1 = sum1/3;
       
       // for WT
       double sum2 = p[1][4] +p[2][4]  + p[3][4];
       double avg2 = sum2/3;
       
       System.out.println("\nAverage Turn around time: " +avg1);
       System.out.println("Average Waiting time: " +avg2);
  }

}
