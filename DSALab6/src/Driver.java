import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static <T> void main(String args[]) throws IOException {
		QueueInterface<String> myQueue = new QueueRA<String>();
		
		System.out.println("Select from the following menu\r\n" +
				"   0. Exit.\r\n"+
				"	1. insert back of queue.\r\n" + 
				"	2. remove from front of queue\r\n" + 
				"	3. Display front item.\r\n" + 
				"	4. Clear queue.\r\n" + 
				"	5. Display queue.\r\n" );
		
		String s = in.readLine().trim();
		while(!s.equals("0")) {
			switch(s) {
			case "1" :
					System.out.println("Enter item");
					String item = in.readLine().trim();
					try {
					myQueue.enqueue(item);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case"2": 
					try {
					myQueue.dequeue();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "3":
					try {
					System.out.println(myQueue.peek());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "4":
					System.out.println("List has been removed");
					myQueue.dequeueAll();
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "5":
					System.out.println("The Array has :"+myQueue.toString());
					System.out.println("Make selection now");
					s = in.readLine().trim();	
					break;
			}
		}
		System.out.println("You have left the program goodbye");
	}
}

