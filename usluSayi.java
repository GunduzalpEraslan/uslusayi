import java.util.Scanner;

public class usluSayi {
    static int result =1;
    static int us(int x, int y ){
        if ( x==0) {
            return 1;
        }
        result*= y;
        us(x-1,y);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y ;

        System.out.println("Tabandaki sayıyı giriniz : ");
        y = input.nextInt();
        System.out.println("Üstteki sayıyı giriniz: ");
        x = input.nextInt();
        System.out.println(us(x,y));

    }
}
