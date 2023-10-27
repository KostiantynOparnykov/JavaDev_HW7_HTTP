import java.util.Scanner;

public class HttpImageStatusCli {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new HttpImageStatusCli().askStatus();
    }
    public void askStatus(){
        System.out.println("Enter Http response code: ");
        int code;
        if(scanner.hasNextInt()){
            code = scanner.nextInt();
            try {
                HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                downloader.downloadStatusImage(code);
                System.out.println("Image for HTTP status " + code + " downloaded!");
            }catch(IllegalArgumentException e){
                System.out.printf("There is not image for HTTP status " + code);
            }
        }else{
            System.out.println("Please enter valid number.\n");
            scanner.next();
            askStatus();
        }
        scanner.close();
    }
}
