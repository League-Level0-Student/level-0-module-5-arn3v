package _02_nested_loops._3_for_loop_gauntlet;

public class gauntlet {
	
	public static void main(String[] args) {
	
		for(int i = 0; i < 101; i++) {
			System.out.println(i);
			}
		
		System.out.println("------------");
		
		for(int i = 100; i >= 0; i--) {
			System.out.println(i);
			}
		
		System.out.println("------------");
		
		for(int i = 2; i < 101; i+=2) {
			System.out.println(i);
			}
		
		System.out.println("------------");
		
		for(int i = 1; i <= 99; i+=2) {
			System.out.println(i);
		}
			
	}
}
