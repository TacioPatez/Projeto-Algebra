import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLAllController implements Initializable{

    @FXML
    private Label TransformacaoLabel;

    @FXML
    private AnchorPane anchorpane1;

    @FXML
    private AnchorPane anchorpane2;

    @FXML
    private Button calcularBaseButton;

    @FXML
    private Button calcularImagemButton;

    @FXML
    private ChoiceBox<String> conjuntoDominioChoiceBox;
    private String[] conjuntoRealDominio = {"ℝ¹","ℝ²","ℝ³"};

    @FXML
    private ChoiceBox<String> conjuntoImagemChoiceBox;
    private String[] conjuntoRealImagem = {"ℝ¹","ℝ²","ℝ³","ℝ⁴"};


    @FXML
    private Label dominioLabel;

    @FXML
    private Label dominioRealLabel;

    @FXML
    private Label errorLabel;

    @FXML
    private Label error1Label;

    @FXML
    private Label imagemLabel;

    @FXML
    private Label imagemRealLabel;

    @FXML
    private Button voltarButton;

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
    private TextField xTransTextField1;

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
    private TextField yTransTextField1;

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

    @FXML
    private TextField zTransTextField1;

    @FXML
    void voltar(ActionEvent event) {
        try{
            anchorpane1.setVisible(false);
            anchorpane2.setVisible(true);

            dominioLabel.setText("");
            imagemLabel.setText("");
            error1Label.setText("");

            } catch(Exception e){
                System.out.println(e.toString());
            }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //Dominio Tela1
        conjuntoDominioChoiceBox.getItems().addAll(conjuntoRealDominio);

            conjuntoDominioChoiceBox.setOnAction(this::disableDominio);

        conjuntoImagemChoiceBox.getItems().addAll(conjuntoRealImagem);

            conjuntoImagemChoiceBox.setOnAction(this::disableImagem);

        // Tela2

        
    }

    @FXML
    public void calcular(ActionEvent event){

        try{
            BigDecimal x1 = new BigDecimal(x1ImTextField.getText());
            BigDecimal x2 = new BigDecimal(x2ImTextField.getText());
            BigDecimal x3 = new BigDecimal(x3ImTextField.getText());
            BigDecimal x4 = new BigDecimal(x4ImTextField.getText());
            BigDecimal y1 = new BigDecimal(y1ImTextField.getText());
            BigDecimal y2 = new BigDecimal(y2ImTextField.getText());
            BigDecimal y3 = new BigDecimal(y3ImTextField.getText());
            BigDecimal y4 = new BigDecimal(y4ImTextField.getText());
            BigDecimal z1 = new BigDecimal(z1ImTextField.getText());
            BigDecimal z2 = new BigDecimal(z2ImTextField.getText());
            BigDecimal z3 = new BigDecimal(z3ImTextField.getText());
            BigDecimal z4 = new BigDecimal(z4ImTextField.getText());

        anchorpane1.setVisible(true);
        anchorpane2.setVisible(false);
            errorLabel.setText("");
            dominioRealLabel.setText(conjuntoDominioChoiceBox.getValue());
            imagemRealLabel.setText(conjuntoImagemChoiceBox.getValue());

            if(dominioRealLabel.getText().equals("ℝ¹")){
                yTransTextField1.setDisable(true);
                yTransTextField1.setText("0");
                zTransTextField1.setDisable(true);
                zTransTextField1.setText("0");
            } else if(dominioRealLabel.getText().equals("ℝ²")){
                yTransTextField1.setDisable(false);
                zTransTextField1.setDisable(true);
                zTransTextField1.setText("0");
            } else {
                yTransTextField1.setDisable(false);
                zTransTextField1.setDisable(false);
            }

            disableImagem(event);

        } catch(Exception e){
            errorLabel.setText("ERROR!");
            System.out.print(e.toString());
        }
    }

    public void calcularImagem(ActionEvent event){
    try{
        BigDecimal x1 = new BigDecimal(x1ImTextField.getText());
        BigDecimal x2 = new BigDecimal(x2ImTextField.getText());
        BigDecimal x3 = new BigDecimal(x3ImTextField.getText());
        BigDecimal x4 = new BigDecimal(x4ImTextField.getText());
        BigDecimal y1 = new BigDecimal(y1ImTextField.getText());
        BigDecimal y2 = new BigDecimal(y2ImTextField.getText());
        BigDecimal y3 = new BigDecimal(y3ImTextField.getText());
        BigDecimal y4 = new BigDecimal(y4ImTextField.getText());
        BigDecimal z1 = new BigDecimal(z1ImTextField.getText());
        BigDecimal z2 = new BigDecimal(z2ImTextField.getText());
        BigDecimal z3 = new BigDecimal(z3ImTextField.getText());
        BigDecimal z4 = new BigDecimal(z4ImTextField.getText());

        BigDecimal xDominio = new BigDecimal(xTransTextField1.getText());
        BigDecimal yDominio = new BigDecimal(yTransTextField1.getText());
        BigDecimal zDominio = new BigDecimal(zTransTextField1.getText());

        BigDecimal xImagem = new BigDecimal("0");
        BigDecimal yImagem = new BigDecimal("0");
        BigDecimal zImagem = new BigDecimal("0");
        BigDecimal wImagem = new BigDecimal("0");

        x1 = x1.multiply(xDominio);
        x2 = x2.multiply(xDominio);
        x3 = x3.multiply(xDominio);
        x4 = x4.multiply(xDominio);

        y1 = y1.multiply(yDominio);
        y2 = y2.multiply(yDominio);
        y3 = y3.multiply(yDominio);
        y4 = y4.multiply(yDominio);

        z1 = z1.multiply(zDominio);
        z2 = z2.multiply(zDominio);
        z3 = z3.multiply(zDominio);
        z4 = z4.multiply(zDominio);

        xImagem = x1.add(y1.add(z1));
        yImagem = x2.add(y2.add(z2));
        zImagem = x3.add(y3.add(z3));
        wImagem = x4.add(y4.add(z4));

        if(dominioRealLabel.getText().equals("ℝ¹")){
            dominioLabel.setText("      ( "+ xDominio +" )");
        } else if(dominioRealLabel.getText().equals("ℝ²")){
            dominioLabel.setText("     ( "+ xDominio +","+ yDominio + " )");
        } else {
            dominioLabel.setText("   ( "+ xDominio +","+ yDominio +","+zDominio+ " )");
        }

        if(imagemRealLabel.getText().equals("ℝ¹")){
            imagemLabel.setText("("+xImagem+")");
        } else if(imagemRealLabel.getText().equals("ℝ²")){
            imagemLabel.setText("("+ xImagem +","+ yImagem + ")");
        } else if(imagemRealLabel.getText().equals("ℝ³")){
            imagemLabel.setText("("+ xImagem +","+ yImagem +","+zImagem+ ")");
        } else {
            imagemLabel.setText("("+ xImagem +","+ yImagem +","+zImagem+","+wImagem+ ")");
        }





        } catch(Exception e){
            error1Label.setText("ERROR!!!");
            System.out.print(e.toString());
        }
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

        String x1 = x1ImTextField.getText();
        String x2 = x2ImTextField.getText();
        String x3 = x3ImTextField.getText();
        String x4 = x4ImTextField.getText();
        String y1 = y1ImTextField.getText();
        String y2 = y2ImTextField.getText();
        String y3 = y3ImTextField.getText();
        String y4 = y4ImTextField.getText();
        String z1 = z1ImTextField.getText();
        String z2 = z2ImTextField.getText();
        String z3 = z3ImTextField.getText();
        String z4 = z4ImTextField.getText();

        String choiceDominio = conjuntoDominioChoiceBox.getValue();
        String choiceImagem = conjuntoImagemChoiceBox.getValue();

        if(choiceDominio == conjuntoRealDominio[0]){ // R1
             if(choiceImagem == conjuntoRealImagem[0]){ // -->R1
                    x1ImTextField.setDisable(false);
                    x2ImTextField.setDisable(true);
                    x2ImTextField.setText("0");
                    x3ImTextField.setDisable(true);
                    x3ImTextField.setText("0");
                    x4ImTextField.setDisable(true);
                    x4ImTextField.setText("0");

                    y1ImTextField.setDisable(true);
                    y1ImTextField.setText("0");
                    y2ImTextField.setDisable(true);
                    y2ImTextField.setText("0");
                    y3ImTextField.setDisable(true);
                    y3ImTextField.setText("0");
                    y4ImTextField.setDisable(true);
                    y4ImTextField.setText("0");

                    z1ImTextField.setDisable(true);
                    z1ImTextField.setText("0");
                    z2ImTextField.setDisable(true);
                    z2ImTextField.setText("0");
                    z3ImTextField.setDisable(true);
                    z3ImTextField.setText("0");
                    z4ImTextField.setDisable(true);
                    z4ImTextField.setText("0");

                    TransformacaoLabel.setText("T:(x) = x("+x1+")");
             }

             if(choiceImagem == conjuntoRealImagem[1]){ // -->R2
                x1ImTextField.setDisable(false);
                x2ImTextField.setDisable(false);
                x3ImTextField.setDisable(true);
                x3ImTextField.setText("0");
                x4ImTextField.setDisable(true);
                x4ImTextField.setText("0");

                y1ImTextField.setDisable(true);
                y1ImTextField.setText("0");
                y2ImTextField.setDisable(true);
                y2ImTextField.setText("0");
                y3ImTextField.setDisable(true);
                y3ImTextField.setText("0");
                y4ImTextField.setDisable(true);
                y4ImTextField.setText("0");

                z1ImTextField.setDisable(true);
                z1ImTextField.setText("0");
                z2ImTextField.setDisable(true);
                z2ImTextField.setText("0");
                z3ImTextField.setDisable(true);
                z3ImTextField.setText("0");
                z4ImTextField.setDisable(true);
                z4ImTextField.setText("0");

                TransformacaoLabel.setText("T:(x) = x("+x1+","+x2+")");
            }

            if(choiceImagem == conjuntoRealImagem[2]){ // -->R3
                x1ImTextField.setDisable(false);
                x2ImTextField.setDisable(false);
                x3ImTextField.setDisable(false);
                x4ImTextField.setDisable(true);
                x4ImTextField.setText("0");

                y1ImTextField.setDisable(true);
                y1ImTextField.setText("0");
                y2ImTextField.setDisable(true);
                y2ImTextField.setText("0");
                y3ImTextField.setDisable(true);
                y3ImTextField.setText("0");
                y4ImTextField.setDisable(true);
                y4ImTextField.setText("0");

                z1ImTextField.setDisable(true);
                z1ImTextField.setText("0");
                z2ImTextField.setDisable(true);
                z2ImTextField.setText("0");
                z3ImTextField.setDisable(true);
                z3ImTextField.setText("0");
                z4ImTextField.setDisable(true);
                z4ImTextField.setText("0");

                TransformacaoLabel.setText("T:(x) = x("+x1+","+x2+","+x3+")");
            }

            if(choiceImagem == conjuntoRealImagem[3]){ // -->R4
                x1ImTextField.setDisable(false);
                x2ImTextField.setDisable(false);
                x3ImTextField.setDisable(false);
                x4ImTextField.setDisable(false);

                y1ImTextField.setDisable(true);
                y1ImTextField.setText("0");
                y2ImTextField.setDisable(true);
                y2ImTextField.setText("0");
                y3ImTextField.setDisable(true);
                y3ImTextField.setText("0");
                y4ImTextField.setDisable(true);
                y4ImTextField.setText("0");

                z1ImTextField.setDisable(true);
                z1ImTextField.setText("0");
                z2ImTextField.setDisable(true);
                z2ImTextField.setText("0");
                z3ImTextField.setDisable(true);
                z3ImTextField.setText("0");
                z4ImTextField.setDisable(true);
                z4ImTextField.setText("0");

                TransformacaoLabel.setText("T:(x) = x("+x1+","+x2+","+x3+","+x4+")");
            }
        }

        if(choiceDominio == conjuntoRealDominio[1]){ // R2
            if(choiceImagem == conjuntoRealImagem[0]){ // -->R1
                   x1ImTextField.setDisable(false);
                   x2ImTextField.setDisable(true);
                   x2ImTextField.setText("0");
                   x3ImTextField.setDisable(true);
                   x3ImTextField.setText("0");
                   x4ImTextField.setDisable(true);
                   x4ImTextField.setText("0");

                   y1ImTextField.setDisable(false);
                   y2ImTextField.setDisable(true);
                   y2ImTextField.setText("0");
                   y3ImTextField.setDisable(true);
                   y3ImTextField.setText("0");
                   y4ImTextField.setDisable(true);
                   y4ImTextField.setText("0");

                   z1ImTextField.setDisable(true);
                   z1ImTextField.setText("0");
                   z2ImTextField.setDisable(true);
                   z2ImTextField.setText("0");
                   z3ImTextField.setDisable(true);
                   z3ImTextField.setText("0");
                   z4ImTextField.setDisable(true);
                   z4ImTextField.setText("0");

                   TransformacaoLabel.setText("T:(x,y) = x("+x1+") + y("+y1+")");
            }

            if(choiceImagem == conjuntoRealImagem[1]){ // -->R2
               x1ImTextField.setDisable(false);
               x2ImTextField.setDisable(false);
               x3ImTextField.setDisable(true);
               x3ImTextField.setText("0");
               x4ImTextField.setDisable(true);
               x4ImTextField.setText("0");

               y1ImTextField.setDisable(false);
               y2ImTextField.setDisable(false);
               y3ImTextField.setDisable(true);
               y3ImTextField.setText("0");
               y4ImTextField.setDisable(true);
               y4ImTextField.setText("0");

               z1ImTextField.setDisable(true);
               z1ImTextField.setText("0");
               z2ImTextField.setDisable(true);
               z2ImTextField.setText("0");
               z3ImTextField.setDisable(true);
               z3ImTextField.setText("0");
               z4ImTextField.setDisable(true);
               z4ImTextField.setText("0");

               TransformacaoLabel.setText("T:(x,y) = x("+x1+","+x2+") + y("+y1+","+y2+")");
           }

           if(choiceImagem == conjuntoRealImagem[2]){ // -->R3
               x1ImTextField.setDisable(false);
               x2ImTextField.setDisable(false);
               x3ImTextField.setDisable(false);
               x4ImTextField.setDisable(true);
               x4ImTextField.setText("0");

               y1ImTextField.setDisable(false);
               y2ImTextField.setDisable(false);
               y3ImTextField.setDisable(false);
               y4ImTextField.setDisable(true);
               y4ImTextField.setText("0");

               z1ImTextField.setDisable(true);
               z1ImTextField.setText("0");
               z2ImTextField.setDisable(true);
               z2ImTextField.setText("0");
               z3ImTextField.setDisable(true);
               z3ImTextField.setText("0");
               z4ImTextField.setDisable(true);
               z4ImTextField.setText("0");

               TransformacaoLabel.setText("T:(x,y) = x("+x1+","+x2+","+x3+") + y("+y1+","+y2+","+y3+")");
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
               z1ImTextField.setText("0");
               z2ImTextField.setDisable(true);
               z2ImTextField.setText("0");
               z3ImTextField.setDisable(true);
               z3ImTextField.setText("0");
               z4ImTextField.setDisable(true);
               z4ImTextField.setText("0");

               TransformacaoLabel.setText("T:(x,y) = x("+x1+","+x2+","+x3+","+x4+") + y("+y1+","+y2+","+y3+","+y4+")");
           }
       }

       if(choiceDominio == conjuntoRealDominio[2]){ // R3
        if(choiceImagem == conjuntoRealImagem[0]){ // -->R1
            x1ImTextField.setDisable(false);
            x2ImTextField.setDisable(true);
            x2ImTextField.setText("0");
            x3ImTextField.setDisable(true);
            x3ImTextField.setText("0");
            x4ImTextField.setDisable(true);
            x4ImTextField.setText("0");

            y1ImTextField.setDisable(false);
            y2ImTextField.setDisable(true);
            y2ImTextField.setText("0");
            y3ImTextField.setDisable(true);
            y3ImTextField.setText("0");
            y4ImTextField.setDisable(true);
            y4ImTextField.setText("0");

            z1ImTextField.setDisable(false);
            z2ImTextField.setDisable(true);
            z2ImTextField.setText("0");
            z3ImTextField.setDisable(true);
            z3ImTextField.setText("0");
            z4ImTextField.setDisable(true);
            z4ImTextField.setText("0");

            TransformacaoLabel.setText("T:(x,y,z) = x("+x1+") + y("+y1+") + z("+z1+")");
        }

        if(choiceImagem == conjuntoRealImagem[1]){ // -->R2
            x1ImTextField.setDisable(false);
            x2ImTextField.setDisable(false);
            x3ImTextField.setDisable(true);
            x3ImTextField.setText("0");
            x4ImTextField.setDisable(true);
            x4ImTextField.setText("0");

            y1ImTextField.setDisable(false);
            y2ImTextField.setDisable(false);
            y3ImTextField.setDisable(true);
            y3ImTextField.setText("0");
            y4ImTextField.setDisable(true);
            y4ImTextField.setText("0");

            z1ImTextField.setDisable(false);
            z2ImTextField.setDisable(false);
            z3ImTextField.setDisable(true);
            z3ImTextField.setText("0");
            z4ImTextField.setDisable(true);
            z4ImTextField.setText("0");

            TransformacaoLabel.setText("T:(x,y,z) = x("+x1+","+x2+") + y("+y1+","+y2+") + z("+z1+","+z2+")");
       }

        if(choiceImagem == conjuntoRealImagem[2]){ // -->R3
            x1ImTextField.setDisable(false);
            x2ImTextField.setDisable(false);
            x3ImTextField.setDisable(false);
            x4ImTextField.setDisable(true);
            x4ImTextField.setText("0");

            y1ImTextField.setDisable(false);
            y2ImTextField.setDisable(false);
            y3ImTextField.setDisable(false);
            y4ImTextField.setDisable(true);
            y4ImTextField.setText("0");

            z1ImTextField.setDisable(false);
            z2ImTextField.setDisable(false);
            z3ImTextField.setDisable(false);
            z4ImTextField.setDisable(true);
            z4ImTextField.setText("0");

            TransformacaoLabel.setText("T:(x,y,z) = x("+x1+","+x2+","+x3+") + y("+y1+","+y2+","+y3+") + z("+z1+","+z2+","+z3+")");
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

           TransformacaoLabel.setText("T:(x,y,z) = x("+x1+","+x2+","+x3+","+x4+") + y("+y1+","+y2+","+y3+","+y4+") + z("+z1+","+z2+","+z3+","+z4+")");
       }
   }
}
}
