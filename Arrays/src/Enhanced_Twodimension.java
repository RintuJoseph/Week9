
public class Enhanced_Twodimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] rents = { {400, 450, 510}, 
				  {500, 560, 630},
				  {625, 676, 740},
				  {1000, 1250, 1600} };
	
for(int[] rent1:rents) {
	for(int rent2:rent1) {
		System.out.println(rent2);
	}
}

	}

}
