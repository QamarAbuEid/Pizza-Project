package application;
/*import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ActivityThree extends Application {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    GridPane gp = new GridPane();
    GregorianCalendar g = new GregorianCalendar();
    BorderPane bp = new BorderPane();

    @Override
    public void start(Stage stage) throws Exception {
        gp.setHgap(10);
        gp.setVgap(10);
        printCalendar(0);
        Button prior = new Button("Prior"), next = new Button("Next");
        HBox hBox = new HBox(10, prior, next);
        hBox.setAlignment(Pos.CENTER);

        next.setOnAction(e -> {
            printCalendar(1);
        });

        prior.setOnAction(e -> {
            printCalendar(-1);
        });

        bp.setCenter(gp);
        bp.setBottom(hBox);
        bp.setAlignment(gp, Pos.CENTER);
       

        Scene scene = new Scene(bp);
        stage.setTitle("Calendar");
        stage.setScene(scene);
        stage.show();
    }

    private void printCalendar(int x) {
        gp.getChildren().clear();
        g.set(Calendar.DATE, 1);
        g.set(Calendar.MONTH, g.get(Calendar.MONTH) + x);
        Label monthLabel = new Label(month[g.get(Calendar.MONTH)] + ", " + g.get(Calendar.YEAR));
        bp.setTop(monthLabel);
        bp.setAlignment(monthLabel, Pos.CENTER);

        int j = 1;
        for (int i = 0; i < 49; i++) {
            if (i < days.length) {
                Label l = new Label(days[i]);
                gp.add(l, i, 0);
            } else if (j <= g.getActualMaximum(Calendar.DAY_OF_MONTH) && (i - 6) >= g.get(Calendar.DAY_OF_WEEK)) {
                Label l = new Label(j + "");
                j++;
                gp.add(l, i % 7, i / 7);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ActivityThree extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a ComboBox for months
        ComboBox<String> monthComboBox = new ComboBox<>();
        monthComboBox.getItems().addAll(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        // Create a ComboBox for years
        ComboBox<String> yearComboBox = new ComboBox<>();
        yearComboBox.getItems().addAll("2017", "2018", "2019", "2020", "2021", "2022", "2023");

        // Create a custom button (arrow button)
        CustomArrowButton arrowButton = new CustomArrowButton();
        arrowButton.setOnAction(event -> {
            // Toggle showing/hiding the dropdown
            monthComboBox.show();
            yearComboBox.show();
        });

        // Create an HBox to hold the ComboBoxes and the custom button
        HBox hbox = new HBox(monthComboBox, yearComboBox, arrowButton);

        // Set up the scene
        Scene scene = new Scene(hbox, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dropdown Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Custom ArrowButton class (you can customize this further)
    private static class CustomArrowButton extends javafx.scene.control.Button {
        public CustomArrowButton() {
            setGraphic(new javafx.scene.image.ImageView("path/to/your/arrow-image.png"));
            setMaxSize(20, 20);
            setMinSize(20, 20);
        }
    }
}

