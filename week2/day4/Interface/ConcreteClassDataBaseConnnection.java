package week2.day4.Interface;

public class ConcreteClassDataBaseConnnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect() {
		System.out.println("Connecting database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting database");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}

}
