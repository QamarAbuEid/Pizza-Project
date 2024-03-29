package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Main extends Application {

	// the array list that contain the created object
	ArrayList<PizzaOrder> orders = new ArrayList<PizzaOrder>();
	double totalPrice = 0;

	@Override
	public void start(Stage primaryStage) {
		try {
			// Define the gradient stops for the background  gardient >> تدرج
			//a stop class is used for defina a color stop in a gradient
			Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(0.5, Color.ORANGE), new Stop(1, Color.RED) };
			// 0, 0 is the start point of the gradient (x, y)
			// 1,0 is the end point of the gradient (x, y)
			LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

			Rectangle background = new Rectangle(0, 0, 200, 800);
			// Set the fill of the background with the gradient
			background.setFill(gradient);
			BorderPane root = new BorderPane();
			Pane pane = new Pane();
			HBox box1 = new HBox(10);
			HBox box2 = new HBox(10);
			HBox box3 = new HBox(10);
			HBox box4 = new HBox(10);
			VBox box5 = new VBox(10);
			// to creat a font we use this syntax Font.font(String family_name ,
			// Font_posture , double size);
			Font font = Font.font("Jokerman", FontPosture.ITALIC, 40);
			// to do shadow
			DropShadow drop = new DropShadow(5, 4, 4, Color.ORANGE);
			Text word = new Text("           Pizza is not a trend, it's a way of life.       ");

			word.setFont(font);
			word.setFill(gradient);
			word.setEffect(drop);
			root.setTop(word);
			
			Font font2 = Font.font("Open Sans", FontPosture.ITALIC, 25);
			Label l1 = new Label("please enter your name :");
			l1.setStyle("-fx-background-color: DarkOrange;");
			l1.setFont(font2);
			TextField textfield = new TextField();

			box1.getChildren().addAll(l1, textfield);
			// here the define some label
			Label t1 = new Label("orderType :");
			Label t2 = new Label("pizzaSize :");
			Label t3 = new Label("List of Toppings :");
			
			// to design the label and give them a color
			t1.setFont(font2);
			t1.setStyle("-fx-background-color: DarkOrange;");
			t2.setFont(font2);
			t2.setStyle("-fx-background-color: DarkOrange;");
			t3.setFont(font2);
			t3.setStyle("-fx-background-color: DarkOrange;");

			CheckBox chbox1 = new CheckBox("Delivery");
			CheckBox chbox3 = new CheckBox("ToGo");
			CheckBox chbox2 = new CheckBox("Seated");
			chbox3.setSelected(true);
			box2.getChildren().addAll(t1, chbox1, chbox2, chbox3);
			// ..................................................
			RadioButton radioButton1 = new RadioButton("SMALL");
			RadioButton radioButton2 = new RadioButton("MEDIUM");
			RadioButton radioButton3 = new RadioButton("LARGE");
			ToggleGroup tg = new ToggleGroup();
			// RadioButton is used to provide the user with a set of options where only one
			// option can be selected at a time.
			// ToggleGroup to ensure that only one RadioButton within the same group can be
			// selected at a time.
			radioButton1.setToggleGroup(tg);
			radioButton2.setToggleGroup(tg);
			radioButton3.setToggleGroup(tg);
			radioButton1.setSelected(true);

			box3.getChildren().addAll(t2, radioButton1, radioButton2, radioButton3);
			// ....................................................
			RadioButton radioButton4 = new RadioButton(" Onions :");
			RadioButton radioButton5 = new RadioButton("Olives");
			RadioButton radioButton6 = new RadioButton("Green Peppers ");

			box4.getChildren().addAll(t3, radioButton4, radioButton5, radioButton6);
			// ......................................................
			//the padding is used to determine
			box1.setPadding(new Insets(10)); // Adjust the padding as needed
			box2.setPadding(new Insets(10));
			box3.setPadding(new Insets(10));
			box4.setPadding(new Insets(10));
			HBox hbimage = new HBox(10);
			Image image2 = new Image("C:\\Users\\DELL\\eclipse-workspace\\Pizza\\coins.png"); // Replace with the path
																								// to your image file

			// Create an ImageView for the image
			ImageView imageView2 = new ImageView(image2);

			Label lb = new Label("TOPPINGS PRICE");
			//.............................................................................
			lb.setFont(font2);
			hbimage.getChildren().addAll(lb, imageView2);
			HBox Hprices = new HBox(15);
			HBox Hprice1 = new HBox(15);
			HBox Hprice2 = new HBox(15);
			HBox Hprice3 = new HBox(15);
			Label price1 = new Label("Onion topping");
			price1.setStyle("-fx-font-weight: bold;");
			price1.setTextFill(Color.BROWN);
			Label price2 = new Label("Olive topping");
			price2.setStyle("-fx-font-weight: bold;");
			price2.setTextFill(Color.BROWN);
			Label price3 = new Label("Green Papper");
			price3.setStyle("-fx-font-weight: bold;");
			price3.setTextFill(Color.BROWN);

			TextField tf1 = new TextField("10");
			TextField tf2 = new TextField("10");
			TextField tf3 = new TextField("10");
			Hprice1.getChildren().addAll(price1, tf1);
			Hprice2.getChildren().addAll(price2, tf2);
			Hprice3.getChildren().addAll(price3, tf3);
			Hprices.getChildren().addAll(Hprice1, Hprice2, Hprice3);

			//the total price field
			HBox totalPrice = new HBox(15);
			Label totalLb = new Label("Order Price : ");
			TextField totaltf = new TextField("0.0");
			totalPrice.getChildren().addAll(totalLb, totaltf);
			totalLb.setStyle("-fx-font-weight: bold;");
			totalLb.setTextFill(Color.BROWN);
 
			//.............................................هذول يا قمر عشان ما تضيعي ركككزي
			
			HBox tripRate = new HBox(15);
			HBox zone = new HBox(15);
			HBox serviceCharge = new HBox(15);
			HBox numberOfPeople = new HBox(15);
			Label tripLb = new Label("trip Rate");
			tripLb.setStyle("-fx-font-weight: bold;");
			tripLb.setTextFill(Color.BROWN);
			Label zoneLb = new Label("zone");
			zoneLb.setStyle("-fx-font-weight: bold;");
			zoneLb.setTextFill(Color.BROWN);
			Label serviceChargeLb = new Label("service Charge");
			serviceChargeLb.setStyle("-fx-font-weight: bold;");
			serviceChargeLb.setTextFill(Color.BROWN);
			Label numberOfPeopleLb = new Label("Number of people");
			numberOfPeopleLb.setStyle("-fx-font-weight: bold;");
			numberOfPeopleLb.setTextFill(Color.BROWN);
			TextField triptf = new TextField();
			TextField zonetf = new TextField();
			TextField servicetf = new TextField();
			TextField numOfPeopletf = new TextField();

			tripRate.getChildren().addAll(tripLb, triptf);
			zone.getChildren().addAll(zoneLb, zonetf);
			serviceCharge.getChildren().addAll(serviceChargeLb, servicetf);
			numberOfPeople.getChildren().addAll(numberOfPeopleLb, numOfPeopletf);

			box5.getChildren().addAll(box1, box2, box3, box4, hbimage, Hprices, totalPrice);
			root.setCenter(box5);

			chbox1.setOnAction(event -> {// chbox1 is Delivery
				if (chbox1.isSelected()) {
					// Perform your action here when the CheckBox is selected
					chbox2.setSelected(false); // the same of toggle group
					chbox3.setSelected(false);
					if (box5.getChildren().size() == 8) {// box5 ... vertical
						box5.getChildren().remove(7);
					}

					VBox vb1 = new VBox(10);
					vb1.getChildren().addAll(tripRate, zone);
					box5.getChildren().add(vb1);
				} else {
					// Perform your action here when the CheckBox is deselected
					System.out.println("CheckBox is deselected.");
				}
			});

			chbox2.setOnAction(event -> {
				if (chbox2.isSelected()) {
					// Perform your action here when the CheckBox is selected
					chbox1.setSelected(false); // the same of toggle group
					chbox3.setSelected(false);

					if (box5.getChildren().size() == 8) {
						box5.getChildren().remove(7);
					}

					VBox vb1 = new VBox(10);
					vb1.getChildren().addAll(serviceCharge, numberOfPeople);
					box5.getChildren().add(vb1);
				} else {
					// Perform your action here when the CheckBox is deselected
					System.out.println("CheckBox is deselected.");
				}
			});

			chbox3.setOnAction(event -> {
				if (chbox3.isSelected()) {
					// Perform your action here when the CheckBox is selected
					chbox1.setSelected(false); // the same of toggle group
					chbox2.setSelected(false);
					if (box5.getChildren().size() == 8) {
						box5.getChildren().remove(7);
					}
					Random random = new Random();

					// Generate a random number between 1 and 2 (inclusive)
					int randomNumber = random.nextInt(2) + 1;

					if (randomNumber == 1) {
						VBox vb1 = new VBox(10);
						vb1.getChildren().addAll(tripRate, zone);
						box5.getChildren().add(vb1);
					} else if (randomNumber == 2) {
						VBox vb1 = new VBox(10);
						vb1.getChildren().addAll(serviceCharge, numberOfPeople);
						box5.getChildren().add(vb1);
					}

				} else {
					// Perform your action here when the CheckBox is deselected
					System.out.println("CheckBox is deselected.");
				}
			});

			// creating the bottom buttons
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			// the buttons field
			HBox buttons = new HBox(25);
			Button btn1 = new Button("Process Order");
			Button btn2 = new Button("Print Orders");
			Button btn3 = new Button("Reset");

			buttons.getChildren().addAll(btn1, btn2, btn3);
			// we use the set padding To take a certain distance to move away from the
			// parties
			buttons.setPadding(new Insets(40, 40, 40, 40));

			root.setBottom(buttons);
			// the buttons Action .................

			btn1.setOnAction(event -> {

				if (chbox1.isSelected()) {
					Delivery delv = new Delivery();
					delv.setCustomerName(textfield.getText());
					if (radioButton3.isSelected()) {
						delv.setPizzaSize(3);
					} else if (radioButton2.isSelected()) {
						delv.setPizzaSize(2);
					} else if (radioButton1.isSelected()) {
						delv.setPizzaSize(1);
					}

					if (radioButton4.isSelected() && radioButton5.isSelected() && radioButton6.isSelected()) {
						delv.setNumberOfTopings(3);
					}

					else if (radioButton4.isSelected() && radioButton5.isSelected()
							&& radioButton6.isSelected() == false) {
						delv.setNumberOfTopings(2);

					} else if (radioButton4.isSelected() && radioButton6.isSelected()
							&& radioButton5.isSelected() == false) {
						delv.setNumberOfTopings(2);
					} else if (radioButton5.isSelected() && radioButton6.isSelected()
							&& radioButton4.isSelected() == false) {
						delv.setNumberOfTopings(2);
					}

					else if (radioButton4.isSelected() && radioButton5.isSelected() == false
							&& radioButton6.isSelected() == false) {
						delv.setNumberOfTopings(1);
					} else if (radioButton4.isSelected() == false && radioButton5.isSelected()
							&& radioButton6.isSelected() == false) {
						delv.setNumberOfTopings(1);
					} else if (radioButton4.isSelected() == false && radioButton5.isSelected() == false
							&& radioButton6.isSelected()) {
						delv.setNumberOfTopings(1);
					} else {
						delv.setNumberOfTopings(0);
					}

					// calculate the total price
					double onionPrice = Double.parseDouble(tf1.getText());
					double olivePrice = Double.parseDouble(tf2.getText());
					double greenPaperPrice = Double.parseDouble(tf3.getText());

					delv.setToppingPrice(onionPrice + olivePrice + greenPaperPrice);
					delv.setTripRate(Double.parseDouble(triptf.getText()));
					delv.setZone(Integer.parseInt(zonetf.getText()));
					orders.add(delv);

					double total = delv.calculateOrderPrice();
					totaltf.setText(String.valueOf(total));

				}
				// qamar you are here
				else if (chbox2.isSelected()) {

					Seated seated = new Seated();// create object of seated customer

					// here we get the name of the customer from the textField of the name
					seated.setCustomerName(textfield.getText());
					//to determine the pizza size 

					if (radioButton3.isSelected()) { // radioButton3 large
						seated.setPizzaSize(3);
					} else if (radioButton2.isSelected()) {
						seated.setPizzaSize(2);
					} else if (radioButton1.isSelected()) {
						seated.setPizzaSize(1);
					}
					//to determine the number of toppings 
					if (radioButton4.isSelected() && radioButton5.isSelected() && radioButton6.isSelected()) {
						seated.setNumberOfTopings(3);
					}

					else if (radioButton4.isSelected() && radioButton5.isSelected()
							&& radioButton6.isSelected() == false) {
						seated.setNumberOfTopings(2);

					} else if (radioButton4.isSelected() && radioButton6.isSelected()
							&& radioButton5.isSelected() == false) {
						seated.setNumberOfTopings(2);
					} else if (radioButton5.isSelected() && radioButton6.isSelected()
							&& radioButton4.isSelected() == false) {
						seated.setNumberOfTopings(2);
					}

					else if (radioButton4.isSelected() && radioButton5.isSelected() == false
							&& radioButton6.isSelected() == false) {
						seated.setNumberOfTopings(1);
					} else if (radioButton4.isSelected() == false && radioButton5.isSelected()
							&& radioButton6.isSelected() == false) {
						seated.setNumberOfTopings(1);
					} else if (radioButton4.isSelected() == false && radioButton5.isSelected() == false
							&& radioButton6.isSelected()) {
						seated.setNumberOfTopings(1);
					} else {
						seated.setNumberOfTopings(0);
					}

					// calculate the total price
					double onionPrice = Double.parseDouble(tf1.getText());
					double olivePrice = Double.parseDouble(tf2.getText());
					double greenPaperPrice = Double.parseDouble(tf3.getText());

					seated.setToppingPrice(onionPrice + olivePrice + greenPaperPrice);

					seated.setServiceCharge(Double.parseDouble(servicetf.getText()));
					seated.setNumberOfPeople(Integer.parseInt(numOfPeopletf.getText()));
					orders.add(seated);

					double total = seated.calculateOrderPrice();
					totaltf.setText(String.valueOf(total));

				}

				else if (chbox3.isSelected()) {
					// creat a ToGo object
					ToGo togo = new ToGo();
					// the customer name
					togo.setCustomerName(textfield.getText());
					// these if statment to decide the pizza size . 3 it is mean large . 2 it is
					// mean medium . 1 mean small
					if (radioButton3.isSelected()) { // radioButton3 large
						togo.setPizzaSize(3);
					} else if (radioButton2.isSelected()) {
						togo.setPizzaSize(2);
					} else if (radioButton1.isSelected()) {
						togo.setPizzaSize(1);
					}
					// the following if statment is to decide the number of toppings
					if (radioButton4.isSelected() && radioButton5.isSelected() && radioButton6.isSelected()) {
						togo.setNumberOfTopings(3);
					}

					else if (radioButton4.isSelected() && radioButton5.isSelected()
							&& radioButton6.isSelected() == false) {
						togo.setNumberOfTopings(2);

					} else if (radioButton4.isSelected() && radioButton6.isSelected()
							&& radioButton5.isSelected() == false) {
						togo.setNumberOfTopings(2);
					} else if (radioButton5.isSelected() && radioButton6.isSelected()
							&& radioButton4.isSelected() == false) {
						togo.setNumberOfTopings(2);
					}

					else if (radioButton4.isSelected() && radioButton5.isSelected() == false
							&& radioButton6.isSelected() == false) {
						togo.setNumberOfTopings(1);
					} else if (radioButton4.isSelected() == false && radioButton5.isSelected()
							&& radioButton6.isSelected() == false) {
						togo.setNumberOfTopings(1);
					} else if (radioButton4.isSelected() == false && radioButton5.isSelected() == false
							&& radioButton6.isSelected()) {
						togo.setNumberOfTopings(1);
					} else {
						togo.setNumberOfTopings(0);
					}
					// calculate the total price
					// and we convert from string to double because the value that return from the
					// text field is string
					double onionPrice = Double.parseDouble(tf1.getText());
					double olivePrice = Double.parseDouble(tf2.getText());
					double greenPaperPrice = Double.parseDouble(tf3.getText());

					togo.setToppingPrice(onionPrice + olivePrice + greenPaperPrice);

					orders.add(togo); // add the togo orders on the arrays

					double total = togo.calculateOrderPrice();
					totaltf.setText(String.valueOf(total));

				}

			});

			// btn2 is a button that print all the orders on a separate stage
			btn2.setOnAction(event -> {

				// here we defined a new stage to displaying restaurant orders.
				Stage newStage = new Stage();

				VBox layout = new VBox();
				Label title = new Label("Resturant Orders :");//this label is for the title
				title.setStyle("-fx-background-color: DarkOrange;");
				title.setFont(font);

				Label viewOrder = new Label("");// It is used to display text

				viewOrder.setStyle("-fx-font-weight: bold;");
				// this code is setting the text color of the viewOrder element to the color or
				// gradient defined by the gradient variable.
				viewOrder.setTextFill(gradient);
				layout.getChildren().addAll(title, viewOrder);

				sort(orders);
				for (int i = 0; i < orders.size(); i++) {

					viewOrder.setText(viewOrder.getText().concat(orders.get(i).toString()));

				}
				Image fire = new Image("C:\\Users\\DELL\\eclipse-workspace\\Pizza\\fire.png"); // Replace with the path
																								// to your image file

				// Create an ImageView for the image
				ImageView fireview = new ImageView(fire);
				fireview.setFitHeight(130);

				layout.getChildren().add(fireview);

				Scene scene = new Scene(layout, 600, 400);
				newStage.setScene(scene);

				// Show the new stage
				newStage.show();
			});

			// this button is to reset all the value for the default value
			btn3.setOnAction(event -> {

				textfield.clear();
				radioButton1.setSelected(true);
				radioButton2.setSelected(false);
				radioButton3.setSelected(false);
				radioButton4.setSelected(false);
				radioButton5.setSelected(false);
				radioButton6.setSelected(false);
				chbox1.setSelected(false);
				chbox2.setSelected(false);
				chbox3.setSelected(true);
				tf1.setText(Integer.toString(10));
				tf2.setText(Integer.toString(10));
				tf3.setText(Integer.toString(10));
				totaltf.setText("");
				triptf.setText("");
				zonetf.setText("");
				servicetf.setText("");
				numOfPeopletf.setText("");

				orders.clear();

			});

			// Load an image
			Image image = new Image("C:\\Users\\DELL\\eclipse-workspace\\Pizza\\pizza.png"); // Replace with the path to
																								// your image file

			// Create an ImageView for the image
			ImageView imageView = new ImageView(image);
			imageView.setFitHeight(660);
			imageView.setFitWidth(600);
			root.setRight(imageView);

			// Set the right side in the BorderPane
			// root.setRight(background);

			Scene scene = new Scene(root, 1450, 790);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// these nested loop is for sort and print the array 

	public void sort(ArrayList<PizzaOrder> order) {
		int n;
		PizzaOrder temp;
		for (int i = 0; i < order.size(); i++) {
			for (int j = i + 1; j < order.size(); j++) {
				if (order.get(i) instanceof PizzaOrder && order.get(j) instanceof PizzaOrder) {
					n = ((PizzaOrder) order.get(i)).compareTo((PizzaOrder) order.get(j));// i ...this j...v
					if (n == -1) {
						temp = order.get(i);
						order.set(i, order.get(j)); // Put the value from index 2 into index 1
						order.set(j, temp);
					}

				}
			}
		}
		for (int i = 0; i < order.size(); i++) {
			System.out.println(order.get(i).toString());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
