public class Holydays {
  private String date;
  private String text;

  public Holydays(String date, String text){
    this.setDate(date);
    this.setText(text);
  }
  public Holydays(){

  }

  public Holydays(String date){
  }

  public void setDate(String date) {
    this.date = date;
  }
  public void setText(String text) {
    this.text = text;
  }
  public String getDate() {
    return date;
  }
  public String getText() {
    return text;
  }

 
}
