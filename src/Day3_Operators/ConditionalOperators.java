package Day3_Operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Condition to this Operators
		
		// var=exp? result1: result2;

		/*int a=200, b=100;
		int x=(a<b)? a:b; //100
		System.out.println(x);
		
		int y=(a>b)? a:b; //200
		System.out.println(y);
		
		int c=(5==5)? 100:200; //100
		System.out.println(c);
		*/
		
		/*int Age=30;
		String res(Age>=18)? "Eligible" "Not Eligible";
		System.out.println(res);
		*/
		
	    int person_age=30;
		String res=(person_age>=18)? "Eligible" : "NotEligible"; //ERROR
		System.out.println(res);
		
		
		/*int person_age=30;
		String res=(person_age>=20)? "Eligible":"NotEligible";
		System.out.println(res);
		*/
		
		
	}

}
