

public class sample {
	
	public int doSomething(String num) {
		int i= Integer.parseInt(num);
		return i;
	}
	 public static void main(String args[]) {
		 sample  per = new sample();
		
		 System.out.println( per.doSomething("23"));
	 }
}
