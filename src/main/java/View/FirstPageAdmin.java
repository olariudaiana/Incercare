package View;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstPageAdmin {
    private static VBox CurrentLayout;
    private static String CurrentUserName;
    static void display(String username) {

        Stage window = new Stage();
        window.setTitle("Pagina principala ADMIN " + username);
        CurrentLayout = new VBox();
        Scene scene = new Scene(CurrentLayout, 500, 700);
        window.setScene(scene);
        window.show();

        CurrentUserName=username;

        ///onCreate();
    }
}
