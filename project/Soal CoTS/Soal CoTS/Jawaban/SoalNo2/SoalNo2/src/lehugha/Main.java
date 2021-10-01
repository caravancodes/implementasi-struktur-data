package lehugha;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        BalanceChecker cek = new BalanceChecker();
        boolean ulang = true;
        do{
            System.out.println("Masukkan suatu ekspresi:");
            String ekspresi = in.nextLine();
            boolean hasil = cek.checkBalance(ekspresi);
            if (hasil==false){
                System.out.println("Ekspresi "+ekspresi+" tidak seimbang");
            } else {
                System.out.println("Ekspresi "+ekspresi+" seimbang");
            }
            System.out.println();
            System.out.println("Ingin mencoba lagi? (y/n)");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("y")){
                in.nextLine();
                continue;
            } else {
                ulang = false;
                System.out.println("good bye");
            }
        } while (ulang);
    }
}
