import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i, b=0,sayi,c=2;
        while (c>0){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tane sayi giriniz:");
         sayi=input.nextInt();
        for ( i=1;i<sayi;i++) {
            if(sayi%i==0) {

                b=i+b;
                //System.out.println(b);
            }}
        if (b==sayi){System.out.println(sayi+": Mükemmel sayidir");}
else {System.out.println(sayi+": Mükemmel sayi degildir");
    i=1;b=0;sayi=0;
        }
    }}}
