
public class Package<T> extends Item<T> {

	private T sender;
	private T reciever;
	private T amount;
	
	
	public Package(T weight, T name, T sender, T reciever, T amount) {
		super(weight, name);
		this.setSender(sender);
		this.reciever=reciever;
		this.amount=amount;
	}

	public T getSender() {
		return sender;
	}


	public T getReciever() {
		return reciever;
	}


	public T getAmount() {
		return amount;
	}


	public void setSender(T sender) {
		this.sender = sender;
	}


	public void setReciever(T reciever) {
		this.reciever = reciever;
	}


	public void setAmount(T amount) {
		this.amount = amount;
	}


	public String toString() {
		String s=(String)name+" "+weight+" "+sender+" "+reciever+" "+amount;
		return s;
	}
	
}
