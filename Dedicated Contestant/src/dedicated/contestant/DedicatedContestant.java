
package dedicated.contestant;
import java.io.*;
import java.util.Scanner;
public class DedicatedContestant {

 static private final String INPUT = "tank.in";  
static private final String OUTPUT = "tank.output";
    
    public static void main(String[] args) {
     FileInputStream instream = null;  
     PrintStream outstream = null; 
     int cLine=0,Test,N,S,T;
     String output="";
     try {  
          instream = new FileInputStream(INPUT);  
          outstream = new PrintStream(new FileOutputStream(OUTPUT));  
          System.setIn(instream);  
          System.setOut(outstream);  
      } catch (Exception e) {  
          System.err.println("Error Occurred.");  
      }
     Scanner in = new Scanner(System.in);  
      for (;in.hasNext();) {  
          if(cLine==0){
             Test=Integer.parseInt( in.nextLine()); 
             cLine++;
          }
          else{
              N=in.nextInt();
              S=in.nextInt();
              T=in.nextInt();
              int remain=N;

              int cs=0,ct=0;
              if(S>T){
                  while(remain-S>=0){
                   remain-=S;
                   cs++;
                 }
                 if(remain>0)
                     if(remain%T==0)
                     ct=remain/T;
                     else ct=remain/T +1;
              }
              else{
                  while(remain-T>=0){
                   remain-=T;
                   ct++;
                 }
                 if(remain>0)
                     if(remain%S==0)
                     cs=remain/S;
                     else cs=remain/S +1;
              }

              output+= cs+" "+ct+"\n";
              
          }
          
      }  
      System.out.println(output);
      System.err.println("done.");
    }
    
    
}
