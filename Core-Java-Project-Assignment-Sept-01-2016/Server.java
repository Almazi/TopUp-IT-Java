import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;

class Server extends Thread{
  Server(String name){
    super(name);
  }
  public void run(){
    try{
      Random rn = new Random();
      int randomNumber = rn.nextInt(9);
      int last = randomNumber + 10;

      ServerSocket sersock = new ServerSocket(6000);
      Socket sock = sersock.accept();
      System.out.println(getName()+": You Are Connected");


      String fname = "Questions.txt";
      FileReader fr = new FileReader(fname);
      BufferedReader br = new BufferedReader(fr);
      OutputStream os = sock.getOutputStream();
      PrintWriter pw = new PrintWriter(os,true);

      FileReader fr2 = new FileReader("Answers.txt");
      DataInputStream dis = new DataInputStream(sock.getInputStream());
      BufferedReader br2 = new BufferedReader(fr2);

      String qus;
      String ans;
      char checkAns;
      String ansFromFile = "";
      int marks = 0;

      for(int i = 0; i < 10; i++){

      //System.out.println("Random Number: "+randomNumber); //Uncomment this line to see the randomNumber generated

          if(i >= randomNumber){
            for(int j = 0; j < 10; j++){
              qus = br.readLine();
              pw.println(qus);
              try{
                ansFromFile = br2.readLine();
                //System.out.println("Correct answer is: "+ansFromFile); //Uncomment this line to see the correct answer from server
                ans = dis.readLine();
                checkAns = ans.toCharArray()[0];
                //System.out.println("Given answer is: "+ans); //Uncomment this line to see the answer from client
                if(ansFromFile.charAt(0) == checkAns)
                  marks++;
              }
              catch(Exception exp){}
            }
            break;
          }
          else {
            br.readLine();
            br2.readLine();
          }
        }

      pw.println(getName()+" Your Total Marks: "+marks);
      if(marks >=6){
        pw.println("Good job!");
      }
      else{
        pw.println("Better luck next time!");
      }
  		pw.println("Correct answers:");

      BufferedReader br3 = new BufferedReader(fr2);
      OutputStream os2 = sock.getOutputStream();
      PrintWriter pw2 = new PrintWriter(os2,true);
      String sendAns="";

      for(int j = 0; j < 10; j++){
        sendAns = br2.readLine();
        //System.out.println("Correct answer is: "+sendAns); //Uncomment this line to see all the correct answer from server
        pw2.println(sendAns);
      }
      sock.close();
      sersock.close();
      pw.close();
    }
  catch(Exception e){}
  }
}
