public class testT {
	
	private String name;
	private int age;
	
	public testT(String nameIn, int ageIn){
		name = nameIn;
		age = ageIn;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	
	public static void main(String args[]){
		testT obj =  testT("Michail", 100);
		System.out.println(obj.getName() + " "        + obj.getAge());
	}
}
