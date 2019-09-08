import java.util.*;
class String3
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter line : ");
    String s = sc.nextLine();
    int length=s.length();
    int number_capital=0;
    for (int i = 0; i < length; i++ ) {
      if(Character.isUpperCase(s.charAt(i)))
        number_capital ++;
    }
    System.out.println("Capitals : " +number_capital);
  }
}
