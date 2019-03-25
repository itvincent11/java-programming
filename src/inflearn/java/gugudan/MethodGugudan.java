package inflearn.java.gugudan;

public class MethodGugudan {

	//메소드 
	public static int[] calculate(int times){
		int [] result = new int[9];
		for(int i=0; i<result.length; i++){
			result[i] = times * (i+1);
		}
	
		return result;
	}
	  
	
	public static void main(String[] args) {

		
		for(int j=2; j<10; j++){
			int [] result = calculate(j);
			
			for(int i=0; i<result.length; i++){
				System.out.println(j+" * "+(i+1)+" => " +result[i]);
			}
		}

		
		System.out.println("깃헙에 푸쉬 ");
		
	}//end of main

}//end of class
