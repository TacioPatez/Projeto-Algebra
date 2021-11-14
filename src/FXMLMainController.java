import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class FXMLMainController implements Initializable{

    @FXML
    private Button calcularBaseButton;

    @FXML
    private ChoiceBox<String> conjuntoDominioChoiceBox;
    private String[] conjuntoRealDominio = {"ℝ¹","ℝ²","ℝ³"};

    @FXML
    private ChoiceBox<String> conjuntoImagemChoiceBox;
    private String[] conjuntoRealImagem = {"ℝ¹","ℝ²","ℝ³","ℝ⁴"};

    @FXML
    private TextField x1ImTextField;

    @FXML
    private TextField x2ImTextField;

    @FXML
    private TextField x3ImTextField;

    @FXML
    private TextField x4ImTextField;

    @FXML
    private TextField xDominioTextField;

    @FXML
    private TextField xTransTextField;

    @FXML
    private TextField y1ImTextField;

    @FXML
    private TextField y2ImTextField;

    @FXML
    private TextField y3ImTextField;

    @FXML
    private TextField y4ImTextField;

    @FXML
    private TextField yDominioTextField;

    @FXML
    private TextField yTransTextField;

    @FXML
    private TextField z1ImTextField;

    @FXML
    private TextField z2ImTextField;

    @FXML
    private TextField z3ImTextField;

    @FXML
    private TextField z4ImTextField;

    @FXML
    private TextField zDominioTextField;

    @FXML
    private TextField zTransTextField;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //Dominio
        conjuntoDominioChoiceBox.getItems().addAll(conjuntoRealDominio);

            conjuntoDominioChoiceBox.setOnAction(this::disableDominio);

        conjuntoImagemChoiceBox.getItems().addAll(conjuntoRealImagem);

            conjuntoImagemChoiceBox.setOnAction(this::disableImagem);

    }

    public void disableDominio(ActionEvent event){
        String choice = conjuntoDominioChoiceBox.getValue();
        if(choice == conjuntoRealDominio[0]){
            xDominioTextField.setDisable(false);
            xTransTextField.setDisable(false);
            yDominioTextField.setDisable(true);
            yTransTextField.setDisable(true);
            zDominioTextField.setDisable(true);
            zTransTextField.setDisable(true);
        }
        if(choice == conjuntoRealDominio[1]){
            xDominioTextField.setDisable(false);
            xTransTextField.setDisable(false);
            yDominioTextField.setDisable(false);
            yTransTextField.setDisable(false);
            zDominioTextField.setDisable(true);
            zTransTextField.setDisable(true);
        } 
        if(choice == conjuntoRealDominio[2]){
            xDominioTextField.setDisable(false);
            xTransTextField.setDisable(false);
            yDominioTextField.setDisable(false);
            yTransTextField.setDisable(false);
            zDominioTextField.setDisable(false);
            zTransTextField.setDisable(false);
        } 

        disableImagem(event);
    }

    public void disableImagem(ActionEvent event){
        String choiceDominio = conjuntoDominioChoiceBox.getValue();
        String choiceImagem = conjuntoImagemChoiceBox.getValue();

        if(choiceDominio == conjuntoRealDominio[0]){ // R1
             if(choiceImagem == conjuntoRealImagem[0]){ // -->R1
                    x1ImTextField.setDisable(false);
                    x2ImTextField.setDisable(true);
                    x2ImTextField.setText("");
                    x3ImTextField.setDisable(true);
                    x3ImTextField.setText("");
                    x4ImTextField.setDisable(true);
                    x4ImTextField.setText("");

                    y1ImTextField.setDisable(true);
                    y1ImTextField.setText("");
                    y2ImTextField.setDisable(true);
                    y2ImTextField.setText("");
                    y3ImTextField.setDisable(true);
                    y3ImTextField.setText("");
                    y4ImTextField.setDisable(true);
                    y4ImTextField.setText("");

                    z1ImTextField.setDisable(true);
                    z1ImTextField.setText("");
                    z2ImTextField.setDisable(true);
                    z2ImTextField.setText("");
                    z3ImTextField.setDisable(true);
                    z3ImTextField.setText("");
                    z4ImTextField.setDisable(true);
                    z4ImTextField.setText("");
             }

             if(choiceImagem == conjuntoRealImagem[1]){ // -->R2
                x1ImTextField.setDisable(false);
                x2ImTextField.setDisable(false);
                x3ImTextField.setDisable(true);
                x3ImTextField.setText("");
                x4ImTextField.setDisable(true);
                x4ImTextField.setText("");

                y1ImTextField.setDisable(true);
                y1ImTextField.setText("");
                y2ImTextField.setDisable(true);
                y2ImTextField.setText("");
                y3ImTextField.setDisable(true);
                y3ImTextField.setText("");
                y4ImTextField.setDisable(true);
                y4ImTextField.setText("");

                z1ImTextField.setDisable(true);
                z1ImTextField.setText("");
                z2ImTextField.setDisable(true);
                z2ImTextField.setText("");
                z3ImTextField.setDisable(true);
                z3ImTextField.setText("");
                z4ImTextField.setDisable(true);
                z4ImTextField.setText("");
            }

            if(choiceImagem == conjuntoRealImagem[2]){ // -->R3
                x1ImTextField.setDisable(false);
                x2ImTextField.setDisable(false);
                x3ImTextField.setDisable(false);
                x4ImTextField.setDisable(true);
                x4ImTextField.setText("");

                y1ImTextField.setDisable(true);
                y1ImTextField.setText("");
                y2ImTextField.setDisable(true);
                y2ImTextField.setText("");
                y3ImTextField.setDisable(true);
                y3ImTextField.setText("");
                y4ImTextField.setDisable(true);
                y4ImTextField.setText("");

                z1ImTextField.setDisable(true);
                z1ImTextField.setText("");
                z2ImTextField.setDisable(true);
                z2ImTextField.setText("");
                z3ImTextField.setDisable(true);
                z3ImTextField.setText("");
                z4ImTextField.setDisable(true);
                z4ImTextField.setText("");
            }

            if(choiceImagem == conjuntoRealImagem[3]){ // -->R4
                x1ImTextField.setDisable(false);
                x2ImTextField.setDisable(false);
                x3ImTextField.setDisable(false);
                x4ImTextField.setDisable(false);

                y1ImTextField.setDisable(true);
                y1ImTextField.setText("");
                y2ImTextField.setDisable(true);
                y2ImTextField.setText("");
                y3ImTextField.setDisable(true);
                y3ImTextField.setText("");
                y4ImTextField.setDisable(true);
                y4ImTextField.setText("");

                z1ImTextField.setDisable(true);
                z1ImTextField.setText("");
                z2ImTextField.setDisable(true);
                z2ImTextField.setText("");
                z3ImTextField.setDisable(true);
                z3ImTextField.setText("");
                z4ImTextField.setDisable(true);
                z4ImTextField.setText("");
            }
        }

        if(choiceDominio == conjuntoRealDominio[1]){ // R2
            if(choiceImagem == conjuntoRealImagem[0]){ // -->R1
                   x1ImTextField.setDisable(false);
                   x2ImTextField.setDisable(true);
                   x2ImTextField.setText("");
                   x3ImTextField.setDisable(true);
                   x3ImTextField.setText("");
                   x4ImTextField.setDisable(true);
                   x4ImTextField.setText("");

                   y1ImTextField.setDisable(false);
                   y2ImTextField.setDisable(true);
                   y2ImTextField.setText("");
                   y3ImTextField.setDisable(true);
                   y3ImTextField.setText("");
                   y4ImTextField.setDisable(true);
                   y4ImTextField.setText("");

                   z1ImTextField.setDisable(true);
                   z1ImTextField.setText("");
                   z2ImTextField.setDisable(true);
                   z2ImTextField.setText("");
                   z3ImTextField.setDisable(true);
                   z3ImTextField.setText("");
                   z4ImTextField.setDisable(true);
                   z4ImTextField.setText("");
            }

            if(choiceImagem == conjuntoRealImagem[1]){ // -->R2
               x1ImTextField.setDisable(false);
               x2ImTextField.setDisable(false);
               x3ImTextField.setDisable(true);
               x3ImTextField.setText("");
               x4ImTextField.setDisable(true);
               x4ImTextField.setText("");

               y1ImTextField.setDisable(false);
               y2ImTextField.setDisable(false);
               y3ImTextField.setDisable(true);
               y3ImTextField.setText("");
               y4ImTextField.setDisable(true);
               y4ImTextField.setText("");

               z1ImTextField.setDisable(true);
               z1ImTextField.setText("");
               z2ImTextField.setDisable(true);
               z2ImTextField.setText("");
               z3ImTextField.setDisable(true);
               z3ImTextField.setText("");
               z4ImTextField.setDisable(true);
               z4ImTextField.setText("");
           }

           if(choiceImagem == conjuntoRealImagem[2]){ // -->R3
               x1ImTextField.setDisable(false);
               x2ImTextField.setDisable(false);
               x3ImTextField.setDisable(false);
               x4ImTextField.setDisable(true);
               x4ImTextField.setText("");

               y1ImTextField.setDisable(false);
               y2ImTextField.setDisable(false);
               y3ImTextField.setDisable(false);
               y4ImTextField.setDisable(true);
               y4ImTextField.setText("");

               z1ImTextField.setDisable(true);
               z1ImTextField.setText("");
               z2ImTextField.setDisable(true);
               z2ImTextField.setText("");
               z3ImTextField.setDisable(true);
               z3ImTextField.setText("");
               z4ImTextField.setDisable(true);
               z4ImTextField.setText("");
           }

           if(choiceImagem == conjuntoRealImagem[3]){ // -->R4
               x1ImTextField.setDisable(false);
               x2ImTextField.setDisable(false);
               x3ImTextField.setDisable(false);
               x4ImTextField.setDisable(false);

               y1ImTextField.setDisable(false);
               y2ImTextField.setDisable(false);
               y3ImTextField.setDisable(false);
               y4ImTextField.setDisable(false);

               z1ImTextField.setDisable(true);
               z1ImTextField.setText("");
               z2ImTextField.setDisable(true);
               z2ImTextField.setText("");
               z3ImTextField.setDisable(true);
               z3ImTextField.setText("");
               z4ImTextField.setDisable(true);
               z4ImTextField.setText("");
           }
       }

       if(choiceDominio == conjuntoRealDominio[2]){ // R3
        if(choiceImagem == conjuntoRealImagem[0]){ // -->R1
            x1ImTextField.setDisable(false);
            x2ImTextField.setDisable(true);
            x2ImTextField.setText("");
            x3ImTextField.setDisable(true);
            x3ImTextField.setText("");
            x4ImTextField.setDisable(true);
            x4ImTextField.setText("");

            y1ImTextField.setDisable(false);
            y2ImTextField.setDisable(true);
            y2ImTextField.setText("");
            y3ImTextField.setDisable(true);
            y3ImTextField.setText("");
            y4ImTextField.setDisable(true);
            y4ImTextField.setText("");

            z1ImTextField.setDisable(false);
            z2ImTextField.setDisable(true);
            z2ImTextField.setText("");
            z3ImTextField.setDisable(true);
            z3ImTextField.setText("");
            z4ImTextField.setDisable(true);
            z4ImTextField.setText("");
        }

        if(choiceImagem == conjuntoRealImagem[1]){ // -->R2
            x1ImTextField.setDisable(false);
            x2ImTextField.setDisable(false);
            x3ImTextField.setDisable(true);
            x3ImTextField.setText("");
            x4ImTextField.setDisable(true);
            x4ImTextField.setText("");

            y1ImTextField.setDisable(false);
            y2ImTextField.setDisable(false);
            y3ImTextField.setDisable(true);
            y3ImTextField.setText("");
            y4ImTextField.setDisable(true);
            y4ImTextField.setText("");

            z1ImTextField.setDisable(false);
            z2ImTextField.setDisable(false);
            z3ImTextField.setDisable(true);
            z3ImTextField.setText("");
            z4ImTextField.setDisable(true);
            z4ImTextField.setText("");
       }

       if(choiceImagem == conjuntoRealImagem[2]){ // -->R3
        x1ImTextField.setDisable(false);
        x2ImTextField.setDisable(false);
        x3ImTextField.setDisable(false);
        x4ImTextField.setDisable(true);
        x4ImTextField.setText("");

        y1ImTextField.setDisable(false);
        y2ImTextField.setDisable(false);
        y3ImTextField.setDisable(false);
        y4ImTextField.setDisable(true);
        y4ImTextField.setText("");

        z1ImTextField.setDisable(false);
        z2ImTextField.setDisable(false);
        z3ImTextField.setDisable(false);
        z4ImTextField.setDisable(true);
        z4ImTextField.setText("");
       }

       if(choiceImagem == conjuntoRealImagem[3]){ // -->R4
           x1ImTextField.setDisable(false);
           x2ImTextField.setDisable(false);
           x3ImTextField.setDisable(false);
           x4ImTextField.setDisable(false);

           y1ImTextField.setDisable(false);
           y2ImTextField.setDisable(false);
           y3ImTextField.setDisable(false);
           y4ImTextField.setDisable(false);

           z1ImTextField.setDisable(false);
           z2ImTextField.setDisable(false);
           z3ImTextField.setDisable(false);
           z4ImTextField.setDisable(false);
       }
   }


    }

        

}
