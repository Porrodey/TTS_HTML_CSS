package controlFlowForm;

public class AsciiChars {
	public static void main(String[] args) {
	
	printNumbers();
	printLowerCase();
	printUpperCase();
	}
  public static void printNumbers() {
	  int i;
	  System.out.println("Numbers are: \n");
	  for (i = 48; i < 58; i++) {
	  System.out.println((char)i);
	  System.out.print("\n");
	  }
  }

  public static void printLowerCase() {
	  int i;
	  System.out.println("Lower case Alphabets are: \n");
	  for (i = 97; i < 122; i++) {
	  System.out.println((char)i);
	  System.out.print("\n");
	  }
  }

  public static void printUpperCase() {
	  int i;
	  System.out.println("Upper case Alphabets are: \n");
	  for (i = 65; i < 90; i++) {
	  System.out.println((char)i);
	  System.out.print("\n");
	  }
	  }
  }

