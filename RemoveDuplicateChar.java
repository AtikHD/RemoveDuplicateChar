import java.util.Scanner;
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        System.out.println("Input something");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String result="";
        for(int i=0; i<input.length(); i++){
            char CurrentChar=input.charAt(i);
            boolean found=false;
            for(int j=0; j<result.length(); j++){
                if(CurrentChar==result.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                result+=CurrentChar;
            }
        }
        System.out.println(result);
    }
}
