import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        HolydaysList holydays = new HolydaysList();
        System.out.println("Digite uma data no formato XX/XX/2023: ");
        Scanner day = new Scanner(System.in);
        String dayText = day.nextLine();
        holydays.getHolyday(dayText);
        day.close();
    }
}
