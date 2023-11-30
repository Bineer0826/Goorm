package sec01_controlstatement.EX02;

public class SwitchControlStatemetn {
	public static void main(String[] args) {
		
		//break 미포함
		
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");//순서대로 실행.BCD출력 
			
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		
		
		}
		
		//break 포함
		
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;//순서대로 실행X. B만 출력 
			
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}

		//if-else 바꾸기
		
		if(value2>2) {
			System.out.println("A");
		}
		
		else if(value2==2) {
			System.out.println("B");
			
		}
		else if(value2==1) {
			System.out.println("C");
			
		}
		else {
			System.out.println("D");
		}
		
}}
