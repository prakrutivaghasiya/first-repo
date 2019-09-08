import java.util.*;
class Quit
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true)
    {
          System.out.println("Enter line");
          String s = sc.nextLine();
          int length = s.length();
          int vowels = 0;
          if (s.equals("quit") || s.equals("Quit") || s.equals("QUIT")) {
            break;
          }
          else
          {
              for(int i =0; i<length;i++)
              {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                    vowels++;
                }
              }
              System.out.println("Vowels : " +vowels);
          }
      }
  }
}
