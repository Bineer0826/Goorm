package sec01_arry.EX02;

public class ValueAssignment {
	public static void main(String[] args) {
		
		//배열의 원소값 대입 방법1 
		int [] array1 = new int[3]; //강제 초기값으로 0,0,0 값이 들어가 있는다 
		
		array1[0]=3;
		array1[1]=4;
		array1[2]=5;
		
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]+" ");
		
		int [] array2;
		array2 = new int[3]; 
		
		array2[0]=3;
		array2[1]=4;
		array2[2]=5;
		
		System.out.println(array2[0]+" "+array2[1]+" "+array2[2]+" ");
		
		//방법2
		// int[] array3 = new int[]; 오류: 몇개 만들건지 정해줘야함  
		
		int[] array3 = new int[] {3,4,5};
		System.out.println(array3[0]+" "+array3[1]+" "+array3[2]+" ");

	}
}
