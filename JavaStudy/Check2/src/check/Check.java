package check;

public class Check {
	
	private static String firstName = "朝熊";
	private static String lastName = "七彩";
	
	public static void main(String[] args) {
		
		printName(firstName,lastName);
		Pet pet = new Pet("java吉","hoge");
		RobotPet robotPet = new RobotPet("R202","ルーク");
		
		pet.introduce();
		robotPet.introduce();
		
	}
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド →" + firstName + lastName);
	}
	
}
