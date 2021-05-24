//import java.util.Random;

public class Chap03_Prac_07 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int sum = 0;
		double avr = 0;
//		Random rd = new Random();
		//rd.setSeed(System.currentTimeMillis());
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<10; i++) {
//			arr[i] = rd.nextInt(10) + 1;
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		avr = (double)sum/arr.length;
		System.out.println("\nÆò±ÕÀº " + avr);
		
	}

}

//import java.util.Random;
//
//public class Chap03_Prac_07 {
//
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            rand();
//        }
//    }
//
//    final public static void rand() {
//        Random rnd = new Random(10);
//        for(int i = 0; i < 10; i++) {
//            System.out.printf("%d   ",rnd.nextInt(10));
//        }
//        rnd = null;
//        System.out.println();
//    }
//}