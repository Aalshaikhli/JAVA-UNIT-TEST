import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextAnalyzer extends Application {
Public class JunitTesting {
Public int JunitTesting(int x){
   Return x;
}
}

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root=(Parent) FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Analyzer.");
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String [] args)
    {
        launch(args);
    }

}
