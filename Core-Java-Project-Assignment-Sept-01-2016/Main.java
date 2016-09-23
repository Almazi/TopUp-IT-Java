
import java.util.*;
class Main extends Thread{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String name;
    System.out.print("Give Your Name: ");
    name = scan.nextLine();
    Thread server = new Server(name);
    Thread client = new Client();
    server.start();
    client.start();
  }
}
