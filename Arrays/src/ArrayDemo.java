
public class ArrayDemo {

	public static void main(String[] args) {
		final int SIZE=10;
		double[] sales=new double[10];
		//sales=new double[SIZE];
		for(int i=0;i<sales.length;i++) {
			System.out.println(sales[i]);
		}
		//initialization list
		int[] numbers= {3,5,6,7,8,9,6};
		int[]numbers2=numbers;//address of numbers is copied to numbers2
		numbers[2]=56;
		//enhanced for loop
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println("\n");
		for(int num1:numbers2) {
			System.out.print(num1+" ");
		}
		String[] strings= {"Java","Javascript"};//array of string objects
		
	}

}
