package StringPractice;

public class FinfElementWhichhasLenth {

	public static void main(String[] args) {

		String[] a= {"asd","db","qddqwdq","ad","abcdefg"};


		String min_length=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i].length()<min_length.length())
			{
				min_length=a[i];

			}
		}
		for (int j = 0; j < a.length; j++) {


			if(min_length.length()==a[j].length())
			{
				System.out.println(a[j]);
			}

		}













	}

}
