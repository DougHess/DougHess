import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver2 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static <T> void main(String args[]) throws IOException {
		ExtendedQueueInterface<String> myQueue = new DEQ<String>();
		
		System.out.println("Select from the following menu\r\n" +
				"	0. Exit.\r\n"+
				"	1. insert back of queue.\r\n" + 
				"	2. insert front of queue.\r\n" + 
				"	3. remove item from front.\r\n" + 
				"	4. remove item from back.\r\n" + 
				"	5. Display front.\r\n"+
				"	6. Display back.\r\n"+
				"	7. Clear Collection\r\n"+
				"	8. Display collection\r\n");
		
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
					System.out.print(s);
					break;
			case"2": 
					System.out.println("Enter item");
					s = in.readLine().trim();
					try {
					myQueue.enqueueFirst(s);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "3":
					try {
					myQueue.dequeue();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "4":
					try {
					myQueue.dequeueLast();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "5":
					try {
					System.out.println(myQueue.peek());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "6":
					try {
					System.out.println(myQueue.peekLast());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "7":
				myQueue.dequeueAll();
				System.out.println("Queue emptied");
				s = in.readLine().trim();
				System.out.print(s);
				break;
			case "8":
				System.out.println("The Array has :"+myQueue.toString());
				System.out.println("Make selection now");
				s = in.readLine().trim();
				System.out.print(s);
				break;
			}
		}
		System.out.println("You have left the program goodbye");
	}
}