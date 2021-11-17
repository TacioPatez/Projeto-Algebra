import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main (String[] args) throws Exception{
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLAll.fxml"));
        Scene scene = new Scene(root);
        arg0.setTitle("Transformação Linear - Domínio e Imagem");
        arg0.setScene(scene);
        arg0.setResizable(false);
        arg0.show();
    }

}
