package sec01_selectscontrolstatement.EX01;

public class IfControlStatement {
	public static void main(String[] args) {
		
		//if
		//type1
		int value1 = 5;
		if(value1>3) {
			System.out.println("실행1");
		}
		if(value1<5) {
			System.out.println("실행2");//false이므로 실행되지 않는다 
		}

		boolean bool1 = true;
		boolean bool2 = false;
		if(bool1) {
			System.out.println("실행3");
			
		}
		
		if(bool2) {
			System.out.println("실행4");//불리언값 자체가false 이므로실행되지 않는다 
		}
		
		//type2 if else
		
		int value2 = 5;
		if(value2>3) {
			System.out.println("실행5");//실행 
		}
		else {
			System.out.println("실행6");//if문에서 트루값이므로 계산조차 안함 
		}
		
		
		
		//삼항연산자
		System.out.println(value2>3? "실행가능 ": "실패 ");//if문과 왔다갔
		
		
		
		
		
		//type3 if -else if... else
		
		int value3 = 85;
		if(value3>=90) {
			System.out.println("A");
		}
		
		else if(value3>=80) {
			System.out.println("B");//실행 
		}
		
		else if(value3>=70) {
			System.out.println("C");
		}
		
		else {
			System.out.println("F");
		}
		
		
		//중요한사항
		int value4 = 85;
		if(value4>=70) {
			System.out.println("C");//순차적으로 진행해서 트루값나와서 if탈출 
		}
		
		else if(value4>=80) {
			System.out.println("B");//실행xxxx
		}
		
		else if(value4>=90) {
			System.out.println("A");
		}
		
		else {
			System.out.println("F");
		}
		//중요사항22
		
		if(value4>=70 && value4<80) {//순서와 상관없이
			System.out.println("C");//범위가 구체적으로 되면서 둘다 만족시켜야한다_false 
		}
		
		else if(value4>=8 && value4<90) {
			System.out.println("B");//실행!! if문 탈출 
		}
		
		else if(value4>=90) {
			System.out.println("A");
		}
		
		else {
			System.out.println("F");
		}
		
		//삼항연산자2
		
		System.out.println(value4>=80 && value4<90? "B ":"F");
		
	}
}
