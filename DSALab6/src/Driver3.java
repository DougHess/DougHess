import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver3 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static <T> void main(String args[]) throws IOException {
		ExtendedQueueInterface<Package> bag = new DEQ<Package>();
		QueueInterface<Item> sample = new QueueRA<Item>();
		
		System.out.println("Select from the following menu\r\n" +
				"	0. Exit.\r\n"+
				"	1. insert back of queue(pick up reg order).\r\n" + 
				"	2. drop off an order.\r\n" + 
				"	3. display number of packages and weight.\r\n" + 
				"	4. display number of items and weight.\r\n" + 
				"	5. enjoy an item form the bag.\r\n"+
				"	6. clear all samples.\r\n"+
				"	7. pick up an express order\r\n");
		
		String s = in.readLine().trim();
		while(!s.equals("0")) {
			switch(s) {
			case "1" :
				System.out.println("Enter item");
				String item = in.readLine().trim();
				System.out.println("Enter item weight");
				String weight = in.readLine().trim();
				System.out.println("Enter numer of items");
				String num = in.readLine().trim();
				System.out.println("Enter name of sender");
				String send = in.readLine().trim();
				System.out.println("Enter name of recipient");
				String rec = in.readLine().trim();
				Package<T> i = new Package<T>((T)item, (T)weight, (T)num, (T)send, (T)rec);
					try {
					bag.enqueue(i);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println(i);
					System.out.println("Make selection now");
					s = in.readLine().trim();
					System.out.print(s);
					break;
			case"2": 
					System.out.println("May I keep a sample?");
					String keep = in.readLine().trim();
					try {
						if (keep.equals('Y')) {
					 sample.enqueue(bag.dequeue());
				
					}
						else {
							bag.dequeue();
						}
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "3":
					try {
					bag.toString();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "4":
					try {
					sample.toString();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "5":
					try {
					sample.dequeue();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "6":
					try {
					sample.dequeueAll();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Make selection now");
					s = in.readLine().trim();
					break;
			case "7":
					System.out.println("Enter item");
					String q = in.readLine().trim();
					System.out.println("Enter item weight");
					String w = in.readLine().trim();
					System.out.println("Enter numer of items");
					String e = in.readLine().trim();
					System.out.println("Enter name of sender");
					String r = in.readLine().trim();
					System.out.println("Enter name of recipient");
					String t = in.readLine().trim();
					Package<T> j = new Package<T>((T)q, (T)w, (T)e, (T)r, (T)t);
					try {
					 bag.enqueueFirst(j);
					}
					catch(Exception p) {
						System.out.println(p.getMessage());
					}
					System.out.println(j);
					System.out.println("Make selection now");
					s = in.readLine().trim();
					System.out.print(s);
					break;

			}
		}
		System.out.println("You have left the program goodbye");
	}
}