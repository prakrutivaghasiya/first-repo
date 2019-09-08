import java.util.*;
class String1
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your string : ");
    String s = sc.nextLine();
    int length = s.length();
    for (int i=(length/2);i<length ;i++ ) {
      System.out.print(s.charAt(i));
    }
    System.out.println();
  }
}
