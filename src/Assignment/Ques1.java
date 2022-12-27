package Assignment;

public class Ques1 {
	
	public static void main(String[] args) {

		String str ="This   is    a   practice     question";
		String noSpaceStr = str.replaceAll("\\s+"," ");  
		System.out.println(noSpaceStr); 

	}

}
