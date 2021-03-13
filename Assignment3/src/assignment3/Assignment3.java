package assignment3;

import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;


public class Assignment3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Shapes
        //sky
        Rectangle sky = new Rectangle(750,750, Color.SKYBLUE);
        // grass
        Rectangle grass = new Rectangle(750, 700, Color.GREEN);
        grass.setLayoutY(250);
        // building
        Rectangle build = new Rectangle(500,500, Color.BROWN);
        build.setLayoutX(130);
        build.setLayoutY(150);
        build.setStroke(Color.BLACK);
        // roof platform
        Rectangle plat = new Rectangle(500, 40, Color.WHITE);
        plat.setLayoutX(130);
        plat.setLayoutY(175);
        plat.setStroke(Color.BLACK);
        // roof
        Polygon roof = new Polygon();
        roof.setFill(Color.WHITE);
        roof.getPoints().addAll(
                75.0,175.0,
                685.0,175.0,
                375.0,25.0);
        roof.setStroke(Color.BLACK);
        // Plate
        Rectangle plate = new Rectangle(75,50, Color.LIGHTGREY);
        plate.setLayoutX(345);
        plate.setLayoutY(285);
        plate.setStroke(Color.BLACK);
        // doors
            // middle
        Rectangle doorMiddle = new Rectangle(75, 150, Color.WHITE);
        doorMiddle.setLayoutX(345);
        doorMiddle.setLayoutY(400);
        doorMiddle.setStroke(Color.BLACK);
            // right
        Rectangle doorRight = new Rectangle(75, 125, Color.WHITE);
        doorRight.setLayoutX(500);
        doorRight.setLayoutY(420);
        doorRight.setStroke(Color.BLACK);
            // left
        Rectangle doorLeft = new Rectangle(75, 125, Color.WHITE);
        doorLeft.setLayoutX(200);
        doorLeft.setLayoutY(420);
        doorLeft.setStroke(Color.BLACK);
        // Pillar 
        // L -> R
        Rectangle pillar1 = new Rectangle(40,330, Color.WHITE);
        pillar1.setLayoutX(145);
        pillar1.setLayoutY(215);
        pillar1.setStroke(Color.BLACK);
        Rectangle pillar2 = new Rectangle(40,330, Color.WHITE);
        pillar2.setLayoutX(295);
        pillar2.setLayoutY(215);
        pillar2.setStroke(Color.BLACK);
        Rectangle pillar3 = new Rectangle(40,330, Color.WHITE);
        pillar3.setLayoutX(440);
        pillar3.setLayoutY(215);
        pillar3.setStroke(Color.BLACK);
        Rectangle pillar4 = new Rectangle(40,330, Color.WHITE);
        pillar4.setLayoutX(585);
        pillar4.setLayoutY(215);
        pillar4.setStroke(Color.BLACK);
        // pBase
        // L -> R
        Rectangle pBase1 = new Rectangle(50,15, Color.WHITE);
        pBase1.setLayoutX(140);
        pBase1.setLayoutY(530);
        pBase1.setStroke(Color.BLACK);
        Rectangle pBase2 = new Rectangle(50,15, Color.WHITE);
        pBase2.setLayoutX(290);
        pBase2.setLayoutY(530);
        pBase2.setStroke(Color.BLACK);
        Rectangle pBase3 = new Rectangle(50,15, Color.WHITE);
        pBase3.setLayoutX(435);
        pBase3.setLayoutY(530);
        pBase3.setStroke(Color.BLACK);
        Rectangle pBase4 = new Rectangle(50,15, Color.WHITE);
        pBase4.setLayoutX(580);
        pBase4.setLayoutY(530);
        pBase4.setStroke(Color.BLACK);
        // stairs
        /*
        Rectangle[] arrStair = new Rectangle[10];
        int width = 360, height=10, x = 525, y = 200;
        for (int i = 1; i <= 11; i++) {
            arrStair[i] = new Rectangle (x , y, width, 10 );
            gp.getChildren().add(arrStair[i]);    
        }
        */
        // Scene, and Group
        Group gp = new Group(
                sky,grass,build,plat,plate,doorMiddle,doorLeft,doorRight,roof,
                pillar1,pillar2,pillar3,pillar4,pBase1,pBase2,pBase3,pBase4);
        Scene sn = new Scene(gp, 750, 750);
        stage.setTitle("A House");
        stage.setScene(sn);
        stage.show();
        
    }
    
}
