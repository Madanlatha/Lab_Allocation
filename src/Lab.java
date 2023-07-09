import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();

        int dfX=Math.abs(x-n);
        int dfY=Math.abs(y-n);
        int dfZ=Math.abs(z-n);
        if(dfX<=dfY && dfX<=dfZ){
            System.out.println("l1");
        }
        else if(dfY<=dfX && dfY<=dfX){
            System.out.println("l2");
        }
        else{
            System.out.println("l3");
        }
    }
}
