import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int number = service.numberOfSquares(200, 500);
        System.out.println(number);
    }
}
