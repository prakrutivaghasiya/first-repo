import java.util.*;
class calculation{

  void addition(float num1,float num2){
    float answer = num1 + num2;
    System.out.println(answer);
  }
  void subtraction(float num1,float num2){
    float answer = num1 - num2;
    System.out.println(answer);
  }
  void multiplication(float num1,float num2){
    float answer = num1*num2;
    System.out.println(answer);
  }
  void division(float num1,float num2){
    float answer = num1/num2;
    System.out.println(answer);
  }
}

class Calculator{
  public static void main(String[] args) {
    calculation obj1 = new calculation();
    Scanner sc = new Scanner(System.in);
    char s = ' ';

    do{
      System.out.println("=== Calculator ===");
      System.out.println("First number <space> Operator <space> Second number");
      float num1 = sc.nextFloat();
      char choice = sc.next().charAt(0);
      float num2 = sc.nextFloat();
      switch (choice) {
        case '+': obj1.addition(num1,num2);
                break;
        case '-': obj1.subtraction(num1,num2);
                break;
        case '*': obj1.multiplication(num1,num2);
                break;
        case '/': obj1.division(num1,num2);
                  break;
        default: System.out.println("Enter valid choice.");
                    continue;
          }
          System.out.println("enter q to exit or any character to continue.");
          s = sc.next().charAt(0);
  }while(s != 'q');
}
}
