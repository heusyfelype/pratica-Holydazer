import java.util.ArrayList;
import java.util.List;

public class HolydaysList {
  List<Holydays> list = new ArrayList<Holydays>();

  public HolydaysList() {
    this.setList();
  }

  public HolydaysList(String day) {
    this.getHolyday(day);
  }

  String[] days = new String[] {
      "01/01/2023",
      "21/02/2023",
      "17/04/2023",
      "21/04/2023",
      "01/05/2023",
      "08/06/2023",
      "07/09/2023",
      "12/10/2023",
      "02/11/2023",
      "15/11/2023",
      "25/12/2023"
  };

  String[] holydaysText = new String[] {
      "Confraternização mundial",
      "Carnaval",
      "Páscoa",
      "Tiradentes",
      "Dia do trabalho",
      "Corpus Christi",
      "Independência do Brasil",
      "Nossa Senhora Aparecida",
      "Finados",
      "Proclamação da República",
      "Natal"
  };

  public void setList() {
    for (int i = 0; i < days.length; i++) {
      list.add(i, new Holydays(days[i], holydaysText[i]));
    }
  }

  public void getHolyday(String day) {
    for (int i = 0; i < days.length; i++) {
      if (day.equals(list.get(i).getDate())) {
        System.out.println("feriado: " + list.get(i).getDate() + " => " + list.get(i).getText());
        return;
      }
    }
    System.out.println("Não há nenhum feriado nesta data");
  }

}
