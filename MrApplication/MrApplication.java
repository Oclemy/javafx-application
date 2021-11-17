import javafx.application.Application;
import javafx.stage.Stage;

public class MrApplication extends Application {

    @Override
        public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World JavaFX");

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }


}