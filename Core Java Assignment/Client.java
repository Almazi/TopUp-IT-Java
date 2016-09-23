import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;

class Client extends Thread{
  public void run(){
    Scanner scan = new Scanner(System.in);
    try{
      Socket sock = new Socket("localhost",6000);
      InputStream is = sock.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);

      DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
			PrintStream ps = new PrintStream(dos);

      String qus;
      String ans;
      String[] answer = new String[10];
      String ansFromServer;
      for(int j = 0; j < 10; j++){
        qus=br.readLine();
        System.out.println((j+1)+". "+qus);
        System.out.println("Give answer: ");
        while(true){
						ans = scan.nextLine();
						answer[j] = ans.toLowerCase();
						if(answer[j].equals("a") || answer[j].equals("b") || answer[j].equals("c") || answer[j].equals("d")){
              ps.println(answer[j]);
							break;
						}else {
							System.out.println("Invalid Input. Input a or b or c or d ONLY. Try Again");
							continue;
						}

				}
      }

      for(int j = 0; j < 13; j++){
        ansFromServer = br.readLine();
        System.out.println(ansFromServer);

      }
      sock.close();
      ps.close();
    }
    catch(Exception e){}
  }
}
