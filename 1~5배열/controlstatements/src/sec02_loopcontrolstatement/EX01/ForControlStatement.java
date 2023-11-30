package sec02_loopcontrolstatement.EX01;

public class ForControlStatement{
	public static void main(String[] args) {
		
		//for기본
		
		int a;
		for(a=0; a<3; a++) {
			System.out.print(a+ " ");
		}
		
		for(int i=0; i<3; i++) { //선언값을 안으로 
			System.out.println(i+ " ");
		}
		
		//for무한루프 
		
		/*for(;;) {
			System.out.println();
		}
		System.out.println();
		*/
		
		//무한루프 탈출 
		for(int i=0;;i++) {
		 if(i>5) {
			break;
		
			}
		 System.out.println("탈출");
		}
		
	
	}}

