/* This program uses a bar chart to display the percent- ages of the overall grade 
 * represented by projects, quizzes, midterm exams, and the final exam, as shown in Figure 14.46b. 
 * Suppose that projects take 20 percent and are displayed in red, quizzes take 10 percent 
 * and are displayed in blue, midterm exams take 30 percent and are displayed in green, 
 * and the final exam takes 40 percent and is displayed in orange. Use the Rectangle class to display the bars. 
 * Interested readers may explore the JavaFX BarChart class for further study. */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class C14E12 extends Application {
	public void start(Stage primaryStage) {
		// Create a HBox
		HBox box = new HBox(15);
		box.setAlignment(Pos.BOTTOM_CENTER);

		double[] grade = {20, 10, 30, 40};

		double height = 200;
		double width = 150;

		// create a GridPane
		StackPane pane = new StackPane();
		pane.setPadding(new Insets(10,10,10,10));
		
		// Create four rectangles and fill in the color
		Rectangle r1 = new Rectangle(0, 0, width, height * grade[0]/50 );
		r1.setFill(Color.RED);
		Rectangle r2 = new Rectangle(0, 0, width, height * grade[1]/50 );
		r2.setFill(Color.BLUE);
		Rectangle r3 = new Rectangle(0, 0, width, height * grade[2]/50 );
		r3.setFill(Color.GREEN);
		Rectangle r4 = new Rectangle(0, 0, width, height * grade[3]/50 );
		r4.setFill(Color.ORANGE);

		// Create text labels
		Text t1 = new Text(0, 0, "Project -- " + grade[0] + "%");
		Text t2 = new Text(0, 0, "Quiz -- " + grade[1] + "%");
		Text t3 = new Text(0, 0, "Midterm -- " + grade[2] + "%");
		Text t4 = new Text(0, 0, "Final -- " + grade[3] + "%");
		
		box.getChildren().addAll(getVBox(t1, r1), getVBox(t2, r2), getVBox(t3, r3), getVBox(t4, r4));
		pane.getChildren().add(box);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_12"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public VBox getVBox(Text t, Rectangle r) {
		VBox vBox = new VBox(5);
		vBox.setAlignment(Pos.BOTTOM_LEFT);
		vBox.getChildren().addAll(t, r);
		return vBox;
	}
	
	public static void main(String[] args) {
		System.out.println("This program will displays bar charts in a grid pane.");
		Application.launch(args);
	}
}
