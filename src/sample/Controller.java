package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Calendar;

public class Controller {
    @FXML private Label day_of_week;
    @FXML private TextField day_field;
    @FXML private TextField month_field;
    @FXML private TextField year_field;

    @FXML protected void handleCalculate(ActionEvent event) throws Exception{
        Calendar cal = Calendar.getInstance();
        try {
            cal.set(Integer.parseInt(year_field.getText()), Integer.parseInt(month_field.getText()) - 1,
                    Integer.parseInt(day_field.getText()));
            int temp  = cal.get(Calendar.DAY_OF_WEEK);
            System.out.println(cal.getTime());
            switch (temp){
                case Calendar.SUNDAY:
                    day_of_week.setText("Sunday");
                    break;
                case Calendar.MONDAY:
                    day_of_week.setText("Monday");
                    break;
                case Calendar.TUESDAY:
                    day_of_week.setText("Tuesday");
                    break;
                case Calendar.WEDNESDAY:
                    day_of_week.setText("Wednesday");
                    break;
                case Calendar.THURSDAY:
                    day_of_week.setText("Thursday");
                    break;
                case Calendar.FRIDAY:
                    day_of_week.setText("Friday");
                    break;
                case Calendar.SATURDAY:
                    day_of_week.setText("Saturday");
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(":( Sad day");
            day_of_week.setText("Error!");
        }


    }

}
