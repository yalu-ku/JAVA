import java.util.Calendar;

public class Ch06_Theo_12 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(Calendar.YEAR, 2020);
		date.set(Calendar.MONTH, 11);
		date.set(Calendar.DATE, 25);
		System.out.println("��� ��¥�� " + date.get(Calendar.YEAR) + "�� "
				+ (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE) + "��");
	}

}
