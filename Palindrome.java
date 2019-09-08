import java.util.*;
class Palindrome
{
  public static void string()
  {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter your String : ");
     String s = sc.nextLine();
     int length=s.length();
     String s1="";
     for(int i=length - 1; i>=0;i--)
     {
       s1 = s1 + s.charAt(i);
     }
     if(s.equals(s1))
        System.out.println("Palindrome");
     else
          System.out.println("Not Palindrome");
  }
  public static void number()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int number = sc.nextInt();
    int reverse_num = 0 , temp = number;
    while(number !=0)
    {
      reverse_num = reverse_num*10;
      reverse_num= reverse_num + (number%10);
      number = number/10;
    }
    if(reverse_num == temp)
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
              System.out.println("------ Select the choice to check Palindrome ------");
              System.out.println("1.  String  ");
              System.out.println("2.  Number  ");
              System.out.println("3.  Quit   ");
              choice = sc.nextInt();
              switch(choice)
              {
                      case 1 : string();    break;
                      case 2 : number();    break;
                      case 3 : break;
                      default : System.out.println("Enter valid choice");   break;
               }
      } while (choice != 3);
  }
}
