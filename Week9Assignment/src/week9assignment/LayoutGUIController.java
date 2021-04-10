package week9assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import java.lang.Math;
import static javafx.scene.shape.ArcType.ROUND;
import javafx.scene.shape.StrokeLineJoin;

public class LayoutGUIController {
    
    private Color selectedColor = Color.BLACK;
    double strtX = 0, strtY = 0, endX = 0, endY = 0;
    double distance, midX, midY, radius;
    
    @FXML
    private Canvas canvas;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnLinkPnts;

    @FXML
    private ColorPicker mColorPicker;

    @FXML
    private Slider mSlider;

    @FXML
    void canvasStartDraw(MouseEvent event) {
        // gets starting x position
        strtX = event.getX();
        // gets starting y position
        strtY = event.getY();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // sets color from color dropdown
        gc.setStroke(selectedColor);
        gc.setLineWidth(1);
        // starts the line
        gc.beginPath();
        gc.lineTo(strtX, strtY);
        gc.stroke();
    }
    
      @FXML
    void lineDraw(MouseEvent event) {
        // draws line by following cursor on drag
        endX = event.getX();
        endY = event.getY();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(selectedColor);
        // sets line as dashes to show difference before circle
        gc.setLineDashes(5.0);
        gc.lineTo(endX, endY);
        gc.stroke();
    }
    
    @FXML
    void canvasEndDraw(MouseEvent event) throws InterruptedException {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // clears the drawing line
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        // math
        // middle point x
        midX = (strtX + endX)/2;
        // middle point y
        midY = (strtY + endY)/2;
        // distance between for radius
        distance = Math.sqrt((Math.pow((endX - strtX),2) + Math.pow((endY - strtY),2)));
        radius = distance/2;
        
        // sets line to be solid
        gc.setLineDashes(0);
        // draws circle according to line size
        gc.setLineWidth(mSlider.getValue());
        gc.strokeOval(strtX, strtY, distance , distance);  
    }

    @FXML
    void linkPnts(ActionEvent event) {
        // attempt to make lines in circle
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeLine(strtX, strtY+100, endX-5, endY+100);
        gc.strokeLine(strtX, strtY+100, endX-5, endY+150);
        gc.strokeLine(endX, strtY+100, endX-5, endY+150);



    }

    @FXML
    void resetCanvas(ActionEvent event) {
        // clears screen between user drawing line, and circle output
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    @FXML
    private void selectColor(ActionEvent event) {
        // gets color value for lines and circle
        selectedColor = mColorPicker.getValue();
    }

}
