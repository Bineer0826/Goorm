package sec01_arry.EX01;

public class ArrayDefinition {
	public static void main(String[] args) {
		
		//배열 선언방법1
		
		int[] array1 = new int[3]; //int를 저장할 수 배열지정과 객체를 선언 적는 방법 
		
		int[] array2;//분리해서 적어주는 방법 
		array2 = new int[3];
		
		
		//배열 선언방법2
		
		int array3[] = new int[3];//[]가 오른 왼 바꿔줄 수 있다 
		
		int array4[]; //똑같이 분리시켜 작성 가능 
		array4 = new int[3];
		
		//다양한 배열 선언 (기본자료형(기본자료형으로 배열지정한 참조자료형 기억!), 참조 자료형(참조자료형으로 지정한 참조자료형 배열 기억!)
		//기본 
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[0];
		
		//참조
		String[] array8 = new String[9];//스트링타입의 배열을 힙메모리 9개의 방 만들어라
	}
}
