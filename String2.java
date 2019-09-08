import java.util.*;
class String2
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your line : ");
    String s = sc.nextLine();
    int length = s.length();
    int countconsonants = 0;
    int countvowel = 0;
    for (int i=0;i<length ;i++ ) {
        if (s.charAt(i) =='a' || s.charAt(i) == 'e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u') {
          countvowel = countvowel + 1;
        }
        else
          countconsonants = countconsonants + 1;
    }
    System.out.println(countvowel + " Vowels" );
    System.out.println(countconsonants + " Consonants");
  }
}
