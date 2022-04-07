package Ex;

public class Ex09 {

	public static void main(String[] args) {
		int[] array=new int[10];
		double sum=0;
		System.out.print("·£´ýÇÑ Á¤¼öµé: ");
		for (int j = 0; j < array.length; j++) {
			int i  = (int)(Math.random()*10+1);
			array[j]=i;
			sum+=array[j];
			System.out.print(array[j]+" ");
		}
		System.out.println("\nÆò±ÕÀº "+sum/10);
	}

}
