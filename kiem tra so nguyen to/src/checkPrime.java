import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao so can kiem tra:");
        int number = scanner.nextInt();
        if(number<2){
            System.out.println("Khong phai la so nguyen to");
        }else{
            boolean check = true;
            for( int i =2; i<=Math.sqrt(number);i++){
                if(number % i ==0){
                    check = false;
                    break;
                }else{
                    i++;
                }
            }
            if(check=true){
                System.out.println("La so nguyen to");
            }else{
                System.out.println("Khong phai la so nguyen to");
            }
        }
    }
}
