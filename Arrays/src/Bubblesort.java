
public class Bubblesort {

	public static void main(String[] args) {
		int[] array1= {4,5,1,2,9,22};
		for(int i=0;i<array1.length-1;i++) {
			for(int j=0;j<array1.length-1;j++) {
				if(array1[j]>array1[j+1]) {
					int temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		for(int num:array1) {
			System.out.println(num);
		}

	}

}
//for array of strings :compare
//sort array of objects using bubble sort
//use  methods outside main and call it in main()
//bubble sort
