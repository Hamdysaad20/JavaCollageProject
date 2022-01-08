import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import javafx.application.Application;  
import javafx.geometry.Pos;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.Group;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;  
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;  
import javafx.scene.paint.Color;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.*;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;



public class Main extends Application {  
  
      
public static void main(String[] args) {  
launch(args);     
}  

@Override  
public void start(Stage primaryStage) throws FileNotFoundException {  
  
    
    
   Image image = new Image(new FileInputStream("C.gif"));  
      
      //Setting the image view 
      ImageView imageView = new ImageView(image); 
      
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(45); 
      imageView.setFitWidth(50); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
 
    
    Text t =new Text("Hamdy Hamada (20-01689)");
    TextField tf1=new TextField();  
    TextField tf2=new TextField(); 
    TextField tf3=new TextField();  
    TextField tf4=new TextField();  
    TextField tf5=new TextField();  
    TextField tf6=new TextField();  
    TextField tf7=new TextField();  
    TextField tf8=new TextField();  
    
    Button b1 = new Button("=");  
    Button b2 = new Button("=");  
    Button b3 = new Button("=");  
    Button b4 = new Button("=");  

    GridPane rootMain = new GridPane();  
    GridPane  text = new GridPane(); 

    Group  IconImage = new Group(imageView); 

    GridPane  simbol1 = new GridPane(); 
    GridPane  simbol2 = new GridPane(); 
    GridPane  simbol3 = new GridPane(); 
    GridPane  simbol4 = new GridPane(); 

    
    GridPane  Val1 = new GridPane(); 
    GridPane  val2 = new GridPane(); 
    GridPane  val3 = new GridPane(); 
    GridPane  val4 = new GridPane(); 
        Label valf2 =new Label ("Result here");
        Label valf3 =new Label("Result here");
        Label valf4 =new Label("Result here");
        Label valf =new Label("Result here");

    
    text.getChildren().add(t);
    GridPane root = new GridPane();  

        Text Sum =new Text("+");
        Text Sub =new Text("-");
        Text Mult =new Text("*");
        Text Devid =new Text("/");

        

Val1.getChildren().add(valf);
val2.getChildren().add(valf2);
val3.getChildren().add(valf3);
val4.getChildren().add(valf4);
  
valf2.setPadding(new Insets(15, 5, 5, 5));
valf.setPadding(new Insets(15, 5, 5, 5));
valf3.setPadding(new Insets(15, 5, 5, 5));
valf4.setPadding(new Insets(15, 5, 5, 5));

simbol1.getChildren().add(Sum);
simbol2.getChildren().add(Sub);
simbol3.getChildren().add(Mult);
simbol4.getChildren().add(Devid);

   text.setAlignment(Pos.CENTER);
  text.setHgap(10);
text.setVgap(10);
   rootMain.setAlignment(Pos.CENTER);
    rootMain.addColumn(1,text , root);  
    rootMain.addColumn(0,IconImage);  


  root.setHgap(10);
root.setVgap(10);
     t.setFill(Color.BLACK);
     t.setStyle("-fx-font: 24 arial;");
     String PropmptString= "Put A number";





     tf1.setPromptText(PropmptString);
     tf2.setPromptText(PropmptString);
     tf3.setPromptText(PropmptString);
     tf4.setPromptText(PropmptString);
     tf5.setPromptText(PropmptString);
     tf6.setPromptText(PropmptString);
     tf7.setPromptText(PropmptString);
     tf8.setPromptText(PropmptString);

    root.setAlignment(Pos.CENTER);
    root.addRow(1, tf5,simbol1, tf1,b1,Val1);  
    root.addRow(2, tf6,simbol2, tf2,b2,val2);  
    root.addRow(3, tf7,simbol3,tf3,b3,val3);  
    root.addRow(4, tf8,simbol4,tf4,b4,val4);  




b1.setOnMouseClicked(e -> {
            String Num1 = tf1.getText();
            String Num2 = tf5.getText();

  
if(Num1.matches("^\\d+(\\.\\d+)?") && Num2.matches("^\\d+(\\.\\d+)?")) {
       
    double Num1f = Double.parseDouble(Num1);
    double Num2f = Double.parseDouble(Num2);
   double result =Num1f+Num2f;
valf.setText(String.valueOf(result));
   
} else {
 
}
    
});




b2.setOnMouseClicked(e -> {
            String Num1 = tf2.getText();
            String Num2 = tf6.getText();

  
if(Num1.matches("^\\d+(\\.\\d+)?") && Num2.matches("^\\d+(\\.\\d+)?")) {
       
    double Num1f = Double.parseDouble(Num1);
    double Num2f = Double.parseDouble(Num2);

    
       double result =Num2f-Num1f;
valf2.setText(String.valueOf(result));
} else {
 
}
    
});







b3.setOnMouseClicked(e -> {
            String Num1 = tf3.getText();
            String Num2 = tf7.getText();

  
if(Num1.matches("^\\d+(\\.\\d+)?") && Num2.matches("^\\d+(\\.\\d+)?")) {
       
    double Num1f = Double.parseDouble(Num1);
    double Num2f = Double.parseDouble(Num2);

   
           double result =Num1f*Num2f;
valf3.setText(String.valueOf(result));
} else {
 
}
    
});












b4.setOnMouseClicked((MouseEvent ex) -> {

    String num1 = tf4.getText();
    String num2 = tf8.getText();
    
    
    if(num1.matches("^\\d+(\\.\\d+)?") && num2.matches("^\\d+(\\.\\d+)?")) {
        
        
        double num1f = Double.parseDouble(num1);
        double num2f = Double.parseDouble(num2);
        double result = num2f / num1f;
        
        if (Double.isInfinite(result)) { 
            valf4.setText("You can't do that !");
        } else {
            valf4.setText(String.valueOf(result));
        }
    } else {
        
    }

});









 
































    Scene scene=new Scene(rootMain,800,600);  
  

    
    
    
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Text Field Example");  
    primaryStage.show();  
  

       primaryStage.setTitle("Simple Calculator");
       primaryStage.setScene(scene);
       primaryStage.show(); 
       primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("calculator.png")));

        StackPane holder = new StackPane();

        rootMain.setStyle("-fx-background-color:#121212");
tf1.setStyle("-fx-background-color:#302AE6");
tf2.setStyle("-fx-background-color:#302AE6");
tf3.setStyle("-fx-background-color:#302AE6");
tf4.setStyle("-fx-background-color:#302AE6");
tf5.setStyle("-fx-background-color:#302AE6");
tf6.setStyle("-fx-background-color:#302AE6");
tf7.setStyle("-fx-background-color:#302AE6");
tf8.setStyle("-fx-background-color:#302AE6");
 











valf.setFont(Font.font ("Verdana", 16));
valf.setTextFill(Color.WHEAT);

valf2.setFont(Font.font ("Verdana", 16));
valf2.setTextFill(Color.WHEAT);

valf3.setFont(Font.font ("Verdana", 16));
valf3.setTextFill(Color.WHEAT);

valf4.setFont(Font.font ("Verdana", 16));
valf4.setTextFill(Color.WHEAT);




t.setFont(Font.font ("Verdana", 20));
t.setFill(Color.WHEAT);
 
Sum.setFont(Font.font ("Verdana", 20));
Sum.setFill(Color.WHEAT);

Sub.setFont(Font.font ("Verdana", 20));
Sub.setFill(Color.WHEAT);

Mult.setFont(Font.font ("Verdana", 20));
Mult.setFill(Color.WHEAT);

Devid.setFont(Font.font ("Verdana", 20));
Devid.setFill(Color.WHEAT);




tf1.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );


tf2.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );
tf3.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );
tf4.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );
tf5.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );


tf6.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );



tf7.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );

tf8.setStyle(""
        + "-fx-font-size: 20px;"
        + "-fx-font-style: italic;"
        + "-fx-font-weight: bold;"
        + "-fx-font-family: fantasy;"
        + "-fx-text-fill: black;"
        );


}

    private void setPromptText(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class simbol {

        private static Object getChildren() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public simbol() {
        }
    }



   


    }



    
