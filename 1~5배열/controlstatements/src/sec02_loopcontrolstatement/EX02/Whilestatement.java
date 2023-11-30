package sec02_loopcontrolstatement.EX02;

public class Whilestatement {
	public static void main(String[] args) {
		
		//while 기본 
		
		int b=0;
		while(b<10) {
			System.out.print(b+"");
			b++;
		}
		//무한루프 
		
		/*while(true) {
			
			System.out.print("a");
			
		}*/
		
		//무한루프 탈출 
		System.out.println();
		int a=0;
		while(true) {
			if(a>3) { // a>3을 해줘야 나중에 추가를 한다....<3은 출력되지 않는
				break;
			}
			a++;
			System.out.print(a+" ");
			
		}
	}
}
