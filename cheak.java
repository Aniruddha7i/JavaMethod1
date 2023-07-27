import java.util.Scanner;
public class cheak {
    public static void main(String[] args) {

    // q1
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 3 integer sepatate by enter: ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      System.out.println("The average is: "+av(a, b, c));
      
      
      //   q2 
      Scanner scc = new Scanner(System.in);
      System.out.println("Enter a string: ");
        String s= scc.nextLine();
        // s=s.toLowerCase;
        System.out.println("Number of vowels is: "+countvowel(s));

    }

    // q1 
    static int av(int a,int b,int c){
        return (a+b+c)/3;
    }

    // q2
    static int count=0;
    static int countvowel(String s){
        if(s.isEmpty()) return count;
        if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o'|| s.charAt(0)=='u'){
            count++;
        }
        if(s.charAt(0)=='A' || s.charAt(0)=='E' || s.charAt(0)=='I' || s.charAt(0)=='O'|| s.charAt(0)=='U'){
            count++;
        }
        return countvowel(s.substring(1));
    }
}
