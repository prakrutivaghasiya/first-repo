import java.util.*;
class Stream
{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter string ");
    String s = sc.nextLine();
    int length = s.length();
    for(int i = 1; i<=length;i++)
    {
          for (int j=1;j<=length-i ;j++ ) {
                System.out.print(" ");
          }
          for (int j = 0;j<=i-1 ;j++ ) {
                System.out.print(s.charAt(j) + " ");
          }
          System.out.println();
    }
  }
}
