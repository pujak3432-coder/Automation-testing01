package Practice;

public class Switchvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='b';
		switch(ch) {
		case 'a':
		case 'e':	
		case 'i':
		case 'o':	
		case 'u':
			System.out.println("enter a letter");
		break;
		default:
			if(ch>='a' && ch<='z') {
				System.out.println("consonant");
				
			}else{
				System.out.println("invalid input!");
			}}
	}}