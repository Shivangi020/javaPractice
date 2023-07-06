package flowControl;

/* Switch case statement is used when we have number of options (or choices) 
 * and we may need to perform a different task for each choice */

/* Break statements are used when you want your program-flow to come out of the switch body. 
 * Whenever a break statement is encountered in the switch body, 
 * the execution flow would directly come out of the switch, ignoring rest of the cases */

public class SwitchCase {
 
	static void isNum(int num) {
		switch(num%10) {
		
		case 0:
			System.out.println("Remainder is 0");	
			break;
		case 1:
			System.out.println("Remainder is 1");
			break;
		case 2:
			System.out.println("Remainder is 2");
			break;
		case 3:
			System.out.println("Remainder is 3");
			break;
		case 4:
			System.out.println("Remainder is 4");
			break;
		case 5:
			System.out.println("Remainder is 5");
			break;
		 default:
			   System.out.println("Default ");
		
		}
	}
	
	public static void main(String[] args) {
         isNum(10);
	}

}


/** Without Break keyword*/
/* isNum(10) 
 * OUTPUT --> Remainder is 0
 *            Remainder is 1
 *            Remainder is 2
 *            Remainder is 3
 *            Remainder is 4
 *            Remainder is 5
 * */


/** With Break keyword*/
/* isNum(10) 
 * OUTPUT --> Remainder is 0
 * */
