//Name : Rayan Ahmad Ghnimat.
// My number: 1211073.
// A quick idea about this project :
/* we have a file that contains a Country name with the percentage of people who use internet in that country 
 * so we did a lot of operations such as insert new record , delete record , search and display .
 */
//#######################################################################################################################################################################################
//#######################################################################################################################################################################################
//#######################################################################################################################################################################################

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class RayanPhase0 extends Application {// the name of class that extends the apllication class for javafx project

	private Stage primaryStage;
	private File selectedFile;

	private Scene deleteScene;// define my scenes
	private Scene SearchScene;
	private Scene DisplayScene;
	private Scene InsertScene;

	// private int currentSceneIndex;
	private Button nextButton1;// uses a buttons such that i can move between scenes, next to move to the next
								// scene and prev to move to the previous scene
	private Button nextButton2;
	private Button nextButton3;
	private Button nextButton4;
	private Button nextButton5;
	private Button prevButton1;
	private Button prevButton2;
	private Button prevButton3;
	private Button prevButton4;
	private Button prevButton5;
	private Button previousButton1;
	private Button previousButton2;
	private Button previousButton3;

	IndividualsList[] IndividualsListes = new IndividualsList[16];
	private TextArea indiviualTextArea;
	private TextArea indiviualTextArea2;
	private TextArea indiviualTextArea3;
	private TextArea indiviualTextArea4;
	private TextArea indiviualTextArea5;
	private TextArea indiviualTextArea6;
	private TextArea countryTextArea;
	private TextArea percentageTextArea;
	private TextArea recordTextArea;
	private TextArea textArea;
	// TabPane tabPane = new TabPane();

	// private IndividualsList IndividualsLists = new IndividualsList();

	private TextField nameField = new TextField();// Text fields allow users to input text or numbers into your
													// application
	private TextField populationField = new TextField();
	private TextField capitalField = new TextField();
	private TextField countryField = new TextField();
	private TextField percentageField = new TextField();
	private TextField SearchText = new TextField();
	private TextField searchField = new TextField();
	private TextField percentageInput;
	private Label SearchlabelText = new Label("Enter Country to Search :");

	private ImageView RayanProjImage;// ImageView component is used to display images within your application's
										// graphical user interface (GUI).
	private ImageView RayanProjImage1;
	private ImageView RayanProjImage2;
	private ImageView RayanDelete;
	private ImageView RayanDelete1;
	private ImageView RayanInsert;
	private ImageView RayanInsert1;
	private ImageView RayanSearch1;
	private ImageView RayanSearch2;
	private ImageView RayanDisplay1;
	private ImageView RayanDisplay2;

//###########################################################################################################################################################3
	public static void main(String[] args) {
		launch(args);
	}

//############################################################# Start method  ##########################################################################################################################################3
	@Override
	public void start(Stage primaryStage) {

		recordTextArea = new TextArea();
		recordTextArea.setEditable(false);// setEditable the user cannot change the text content in the control.
		textArea = new TextArea();
		percentageInput = new TextField();
		indiviualTextArea = new TextArea();
		indiviualTextArea.setWrapText(true);
		indiviualTextArea.setEditable(false);// setEditable the user cannot change the text content in the control.
		indiviualTextArea.setPrefRowCount(20);// This method specifies how many rows should be visible in the TextArea
		indiviualTextArea.setPrefColumnCount(40);// This method specifies how many columns should be visible in the
													// TextArea
		indiviualTextArea2 = new TextArea();
		indiviualTextArea2.setWrapText(true);
		indiviualTextArea2.setEditable(false);// setEditable the user cannot change the text content in the control.
		indiviualTextArea2.setPrefRowCount(20);
		indiviualTextArea2.setPrefColumnCount(40);
		indiviualTextArea3 = new TextArea();
		indiviualTextArea3.setWrapText(true);
		indiviualTextArea3.setEditable(false);// setEditable the user cannot change the text content in the control.
		indiviualTextArea3.setPrefRowCount(20);
		indiviualTextArea3.setPrefColumnCount(40);
		indiviualTextArea4 = new TextArea();
		indiviualTextArea4.setWrapText(true);
		indiviualTextArea4.setEditable(false);// setEditable the user cannot change the text content in the control.
		indiviualTextArea4.setPrefRowCount(40);
		indiviualTextArea4.setPrefColumnCount(40);
		indiviualTextArea5 = new TextArea();
		indiviualTextArea5.setWrapText(true);
		indiviualTextArea5.setEditable(false);// setEditable the user cannot change the text content in the control.
		indiviualTextArea5.setPrefRowCount(20);
		indiviualTextArea5.setPrefColumnCount(40);
		indiviualTextArea6 = new TextArea();
		indiviualTextArea6.setWrapText(true);
		indiviualTextArea6.setEditable(false);// setEditable the user cannot change the text content in the control.
		indiviualTextArea6.setPrefRowCount(20);
		indiviualTextArea6.setPrefColumnCount(40);

		TextArea dataTextArea = new TextArea();
		dataTextArea.setEditable(false);
		TextArea filteredTextArea = new TextArea();
		filteredTextArea.setEditable(false);
		// Image image = new Image("maxresdefault1.jpg");

		Image GazaImage = new Image("projimage.jpg");// The Image class in JavaFX is used for representing images,
		Image GazaImage1 = new Image("rayandataproj.jpg");// The Image class in JavaFX is used for representing images,
		Image GazaImage2 = new Image("rayandataaa.jpg");// The Image class in JavaFX is used for representing images,
		Image GazaImage3 = new Image("rayandelete.jpg");// The Image class in JavaFX is used for representing images,
		Image GazaImage4 = new Image("ghnimatrayaninsert.jpg");// The Image class in JavaFX is used for representing
																// images,
		Image GazaImage5 = new Image("rayansearch.jpg");// The Image class in JavaFX is used for representing images,
		Image GazaImage6 = new Image("Search-1200x1200.jpg");// The Image class in JavaFX is used for representing
																// images,
		Image GazaImage7 = new Image("Search-1200x1200.jpg");// The Image class in JavaFX is used for representing
																// images,
		Image GazaImage8 = new Image("OIP (4).jpg");// The Image class in JavaFX is used for representing images,
		Image GazaImage9 = new Image("OIP (6).jpg");
		Image GazaImage10 = new Image("user_delete.png");
		Image GazaImage11 = new Image("businessman_add.png");
		Image iconImage2 = new Image("icons8-palestinian-territories-96.png");
		// DataImage = new ImageView(image);
		// DataImage.setFitHeight(200);
		// DataImage.setFitWidth(200);

		RayanProjImage = new ImageView(GazaImage);
		RayanProjImage.setFitHeight(300);// set the height for image
		RayanProjImage.setFitWidth(500);// set the width for image
		RayanProjImage1 = new ImageView(GazaImage1);
		RayanProjImage1.setFitHeight(100);// set the height for image
		RayanProjImage1.setFitWidth(150);// set the width for image
		RayanProjImage2 = new ImageView(GazaImage2);
		RayanProjImage2.setFitHeight(100);// set the height for image
		RayanProjImage2.setFitWidth(150);
		RayanDelete = new ImageView(GazaImage3);
		RayanDelete.setFitHeight(150);// set the height for image
		RayanDelete.setFitWidth(200);
		RayanInsert = new ImageView(GazaImage4);
		RayanInsert.setFitHeight(150);// set the height for image
		RayanInsert.setFitWidth(200);
		RayanSearch1 = new ImageView(GazaImage5);
		RayanSearch1.setFitHeight(150);// set the height for image
		RayanSearch1.setFitWidth(200);
		RayanSearch2 = new ImageView(GazaImage6);
		RayanSearch2.setFitHeight(150);// set the height for image
		RayanSearch2.setFitWidth(200);
		RayanDisplay1 = new ImageView(GazaImage8);
		RayanDisplay1.setFitHeight(100);// set the height for image
		RayanDisplay1.setFitWidth(150);
		RayanDisplay2 = new ImageView(GazaImage9);
		RayanDisplay2.setFitHeight(100);// set the height for image
		RayanDisplay2.setFitWidth(150);
		RayanDelete1 = new ImageView(GazaImage10);
		RayanDelete1.setFitHeight(150);// set the height for image
		RayanDelete1.setFitWidth(200);
		RayanInsert1 = new ImageView(GazaImage11);
		RayanInsert1.setFitHeight(150);// set the height for image
		RayanInsert1.setFitWidth(200);

		// Data Structures (COMP242)

		Label rayanprojectlabel = new Label(" Data Structures Project. ");
		rayanprojectlabel.setFont(Font.font("System", FontWeight.BOLD, 24));// the name of the font, which is set to
																			// "System." It means that the label will
																			// use the default system font for the text.
		// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
		// enumeration in JavaFX that represents different font weights.
		// 24: This sets the font size to 24 points.
		Label rayanprojectlabe2 = new Label("Name : Rayan Hamayel.");
		rayanprojectlabe2.setFont(Font.font("System", FontWeight.BOLD, 18));
		Label rayanprojectlabe3 = new Label("Dr : Murad Njoum. ");
		rayanprojectlabe3.setFont(Font.font("System", FontWeight.BOLD, 18));

		Button DELETEBUTTON1 = new Button("Delete Scene");
		Button INSERTBUTTON1 = new Button("Insert Scene");
		Button SEARCHBUTTON1 = new Button("Search Scene");
		Button DISPLAYBUTTON1 = new Button("Display Scene");

		nextButton1 = new Button("Next");
		nextButton2 = new Button("Next");
		nextButton3 = new Button("Next");
		nextButton4 = new Button("Next");
		nextButton5 = new Button("Next");
		prevButton1 = new Button("Previous");
		prevButton2 = new Button("Previous");
		prevButton3 = new Button("Previous");
		prevButton4 = new Button("Previous");
		prevButton5 = new Button("Previous");

		DELETEBUTTON1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
		INSERTBUTTON1.setStyle("-fx-background-color: red; -fx-text-fill: white;");
		SEARCHBUTTON1.setStyle("-fx-background-color: white; -fx-text-fill: black;");
		SEARCHBUTTON1.setFont(Font.font("System", FontWeight.BOLD, 14));// the name of the font, which is set to
																		// "System." It means that the label will use
																		// the default system font for the text.
		// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
		// enumeration in JavaFX that represents different font weights.
		// 24: This sets the font size to 14 points.
		DISPLAYBUTTON1.setStyle("-fx-background-color: darkgreen; -fx-text-fill: black;");

		VBox vbox2 = new VBox(rayanprojectlabel, rayanprojectlabe2, rayanprojectlabe3);// a layout container that
																						// arranges its child nodes in a
																						// single vertical column
		vbox2.setSpacing(45);
		vbox2.setAlignment(Pos.TOP_CENTER);

		HBox hbox3 = new HBox(150);// a layout container that arranges its child nodes in a single horizontal row
		hbox3.getChildren().addAll(RayanProjImage1, vbox2, RayanProjImage2);
		hbox3.setAlignment(Pos.TOP_LEFT);

		HBox hbox2 = new HBox(50);
		hbox2.getChildren().addAll(prevButton5, DELETEBUTTON1, INSERTBUTTON1, SEARCHBUTTON1, DISPLAYBUTTON1,
				nextButton1);
		hbox2.setAlignment(Pos.CENTER);

		VBox vbox = new VBox(hbox3, RayanProjImage, hbox2);
		vbox.setSpacing(40);
		vbox.setAlignment(Pos.CENTER);
		// HBox hbox = new HBox(vbox);
		// hbox.setSpacing(100);
		// vbox.setStyle("-fx-background-color: skyblue;");

		Scene scene = new Scene(vbox, 900, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Rayan First Project");
		primaryStage.getIcons().add(iconImage2);// used to add icons
		primaryStage.setResizable(false);// make the size to be fix can not change
		primaryStage.show();

		TextField deleteText = new TextField();
		Label labelText = new Label("Enter Country to delete: ");
		labelText.setStyle("-fx-font-weight: bold; -fx-font-size: 16; -fx-font-family: 'Arial';");// the name of the
																									// font, which is
																									// set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		Button delete = new Button("Delete Country");
		delete.setStyle("-fx-font-weight: bold; -fx-font-size: 14; -fx-font-family: 'Arial';");// the name of the font,
																								// which is set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		HBox deleteHBox2 = new HBox(labelText, deleteText);
		deleteHBox2.setSpacing(10);
		HBox deleteHBox = new HBox(RayanDelete, deleteHBox2, RayanDelete1);
		deleteHBox.setSpacing(77);
		deleteHBox.setAlignment(Pos.TOP_LEFT);
		Button openButton3 = new Button("Read File");

		openButton3.setStyle("-fx-font-weight: bold; -fx-font-size: 12; -fx-font-family: 'Arial';");
		// the name of the font, which is set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		VBox deleteVBox = new VBox(deleteHBox, delete, indiviualTextArea2, openButton3, nextButton3, prevButton1);
		deleteVBox.setAlignment(Pos.CENTER);
		deleteVBox.setSpacing(10);
		deleteScene = new Scene(deleteVBox, 900, 600);

		deleteVBox.setStyle("-fx-background-color:darkgray;");
		primaryStage.setTitle("Rayan Delete Scene");

		SearchlabelText.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Arial';");
		// the name of the font, which is set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		Button Search = new Button("Search Country");
		Search.setStyle("-fx-font-weight: bold; -fx-font-size: 12; -fx-font-family: 'Arial';");
		// the name of the font, which is set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		HBox SearchHBox = new HBox(SearchlabelText, SearchText);
		SearchHBox.setSpacing(20);
		// SearchHBox.setAlignment(Pos.CENTER);
		Button openButton2 = new Button("Read File");
		openButton2.setStyle("-fx-font-weight: bold; -fx-font-size: 12; -fx-font-family: 'Arial';");
		openButton2.setStyle("-fx-background-color: #b30000; -fx-text-fill: white;");
		VBox SearchVBox = new VBox(SearchHBox, Search, indiviualTextArea3, openButton2, nextButton4, prevButton3);
		SearchVBox.setAlignment(Pos.CENTER);
		SearchVBox.setSpacing(40);// to give a distance between vboxese nodes
		HBox hboxSearch = new HBox(RayanSearch1, SearchVBox, RayanSearch2);
		hboxSearch.setSpacing(60);
		hboxSearch.setAlignment(Pos.TOP_LEFT);
		SearchScene = new Scene(hboxSearch, 900, 600);
		primaryStage.setTitle("Rayan Search Scene");
		TextField DisplayText = new TextField();

		Label DisplaylabelText = new Label("Enter Percentage : ");
		DisplaylabelText.setStyle("-fx-font-weight: bold; -fx-font-size: 16; -fx-font-family: 'Arial';");
		Button Display = new Button("Display");
		Display.setStyle("-fx-font-weight: bold; -fx-font-size: 14; -fx-font-family: 'Arial';");
		// the name of the font, which is set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		Button openButton4 = new Button("Read File");
		openButton4.setStyle("-fx-font-weight: bold; -fx-font-size: 14; -fx-font-family: 'Arial';");
		HBox DisplayHBox = new HBox(DisplaylabelText, DisplayText);
		DisplayHBox.setSpacing(10);
		DisplayHBox.setAlignment(Pos.CENTER);
		VBox DisplayVBox = new VBox(DisplayHBox, indiviualTextArea5, openButton4, indiviualTextArea6, Display,
				nextButton5, prevButton4);
		DisplayVBox.setAlignment(Pos.TOP_CENTER);
		DisplayVBox.setSpacing(20);
		HBox hboxFinal2 = new HBox(80);
		hboxFinal2.getChildren().addAll(RayanDisplay1, DisplayVBox, RayanDisplay2);
		DisplayScene = new Scene(hboxFinal2, 900, 600);
		primaryStage.setTitle("Rayan Display Scene");
		hboxFinal2.setStyle("-fx-background-color: #009900;");

		TextField INsertText = new TextField();
		Label INsertLabel = new Label("Enter Country to Insert:");
		INsertLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16; -fx-font-family: 'Arial';");
		Image icon = new Image("icons8-insert-key-100.png");
		Button INsert = new Button("Insert Country");
		INsert.setStyle("-fx-font-weight: bold; -fx-font-size: 12; -fx-font-family: 'Arial';");
		TextField PercentageinsertText = new TextField();
		Label PercentagINsertLabel = new Label("Enter Percentage to Insert:");
		PercentagINsertLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16; -fx-font-family: 'Arial';");
		HBox inserte = new HBox(INsertLabel, INsertText);
		inserte.setAlignment(Pos.TOP_CENTER);
		inserte.setSpacing(28);

		HBox PercentageHBox = new HBox(PercentagINsertLabel, PercentageinsertText);
		PercentageHBox.setSpacing(10);
		PercentageHBox.setAlignment(Pos.TOP_CENTER);
		// INsertHBox.setSpacing(20);
		// INsertHBox.setAlignment(Pos.CENTER);
		Button openButton = new Button("Read File");
		openButton.setStyle("-fx-font-weight: bold; -fx-font-size: 12; -fx-font-family: 'Arial';");
		// the name of the font, which is set to
		// "System." It means that the label will use
		// the default system font for the text.
// FontWeight.BOLD: This sets the font weight to bold. FontWeight is an
// enumeration in JavaFX that represents different font weights.
		VBox INsertVBox = new VBox(inserte, PercentageHBox, INsert, indiviualTextArea4, openButton, nextButton2,
				prevButton2);
		INsertVBox.setAlignment(Pos.CENTER);
		INsertVBox.setSpacing(20);
		HBox hboxfinal = new HBox(RayanInsert, INsertVBox, RayanInsert1);
		hboxfinal.setSpacing(50);
		hboxfinal.setAlignment(Pos.TOP_LEFT);
		InsertScene = new Scene(hboxfinal, 900, 600);
		primaryStage.setTitle("Rayan Insert Scene");
		hboxfinal.setStyle("-fx-background-color: #ff3333;");

//################################################# ACTIONS ################################################################################################################################################################3

		openButton.setOnAction(e -> READFILE(primaryStage));
		openButton2.setOnAction(e -> ReadFile2(primaryStage));
		openButton2.setOnAction(e -> ReadFile2(primaryStage));
		openButton3.setOnAction(e -> ReadFile3(primaryStage));

		nextButton1.setOnAction(e -> {
			if (deleteScene != null) {
				primaryStage.setScene(deleteScene);
			} else {
				System.out.println("ohhh noo the deleteScene not exixt!!!try again");
			}
		});
		nextButton2.setOnAction(e -> {
			if (SearchScene != null) {
				primaryStage.setScene(SearchScene);
			} else {
				System.out.println("ohhh noo the SearchScene not exixt!!!try again");
			}
		});
		nextButton3.setOnAction(e -> {
			if (InsertScene != null) {
				primaryStage.setScene(InsertScene);
			} else {
				System.out.println("ohhh noo the InsertScene not exixt!!!try again");
			}
		});
		nextButton4.setOnAction(e -> {
			if (DisplayScene != null) {
				primaryStage.setScene(DisplayScene);
			} else {
				System.out.println("ohhh noo the DisplayScene not exixt!!!try again");
			}
		});

		nextButton5.setOnAction(e -> {
			if (scene != null) {
				primaryStage.setScene(scene);
			} else {
				System.out.println("ohhh noo the  scene not exixt!!!try again");
			}
		});
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		prevButton1.setOnAction(e -> {
			if (scene != null) {
				primaryStage.setScene(scene);
			} else {
				System.out.println("ohhh noo the scene not exixt!!!try again");
			}
		});
		prevButton2.setOnAction(e -> {
			if (deleteScene != null) {
				primaryStage.setScene(deleteScene);
			} else {
				System.out.println("ohhh noo the deleteScene not exixt!!!try again");
			}
		});

		prevButton3.setOnAction(e -> {
			if (InsertScene != null) {
				primaryStage.setScene(InsertScene);
			} else {
				System.out.println("ohhh noo the InsertScene not exixt!!!try again");
			}
		});
		prevButton4.setOnAction(e -> {
			if (SearchScene != null) {
				primaryStage.setScene(SearchScene);
			} else {
				System.out.println("ohhh noo the SearchScene not exixt!!!try again");
			}
		});
		prevButton5.setOnAction(e -> {
			if (DisplayScene != null) {
				primaryStage.setScene(DisplayScene);
			} else {
				System.out.println("ohhh noo the DisplayScene not exixt!!!try again");
			}
		});
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		INSERTBUTTON1.setOnAction(e -> {
			primaryStage.setScene(InsertScene);
			primaryStage.getIcons().add(icon);

		});

		INsert.setOnAction(event -> {
			String RayanCountry = INsertText.getText();
			String PercentageNum = PercentageinsertText.getText();

			if (!RayanCountry.isEmpty() && !PercentageNum.isEmpty()) {
				String record = RayanCountry + " , " + PercentageNum + "\n";
				indiviualTextArea4.appendText(record);
				INsertText.clear();
				PercentageinsertText.clear();
			}
		});
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Display.setOnAction(e -> {
			String displayPercent = DisplayText.getText();
			try {
				double doublePercentage = Double.parseDouble(displayPercent);

				// Get the data from IndiviualTextArea4
				String RayanData = indiviualTextArea5.getText();

				// Split the data into lines
				String[] splits = RayanData.split("\n");

				// Initialize a variable to store the filtered data
				String filteredData = "";

				for (String line : splits) {
					String[] splitsStrings = line.split(",");
					if (splitsStrings.length == 2) {
						String COUNTRYNAME = splitsStrings[0].trim();
						double COUNTRYPERCENTAGE = Double.parseDouble(splitsStrings[1].trim());

						if (COUNTRYPERCENTAGE > doublePercentage) {
							// Append the line to the filtered data
							filteredData += line + "\n";
						}
					}
				}

				// Display the filtered results in IndiviualTextArea5
				indiviualTextArea6.setText(filteredData);
			} catch (NumberFormatException ew) {
				// Handle the case where the user enters an invalid percentage
				indiviualTextArea6.setText("ohhh nooo !!!!!!!!! False input try again ");
			}
		});

		DISPLAYBUTTON1.setOnAction(e -> {
			primaryStage.setScene(DisplayScene);

		});
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		openButton4.setOnAction(e -> rayanFile());
		openButton4.setOnAction(e -> ReadFile4(primaryStage));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		SEARCHBUTTON1.setOnAction(e -> {
			primaryStage.setScene(SearchScene);
			// SearchVBox.setStyle("-fx-background-color: skyblue;");

		});
		Search.setOnAction(event -> {
			searchRecord();
		});
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		DELETEBUTTON1.setOnAction(e -> {
			primaryStage.setScene(deleteScene);

		});
		delete.setOnAction(e -> {
			String DELETECOUNTRY = deleteText.getText().trim();
			if (!DELETECOUNTRY.isEmpty()) {
				boolean cuts = DeleteCountry(DELETECOUNTRY);
				if (cuts) {
					indiviualTextArea2.setText("Country: " + DELETECOUNTRY + " is deleted.");
				} else {
					indiviualTextArea2.setText("Country: " + DELETECOUNTRY + " not found reenter again!!.");
				}
			} else {
				indiviualTextArea2.setText("Please enter a country ti delete .");
			}

		});

	}

//##########################################################################################################################
	private void READFILE(Stage primaryStage) {

		FileChooser chooser = new FileChooser();
		chooser.setTitle("Open File to read ");
		chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

		java.io.File selectedFile = chooser.showOpenDialog(primaryStage);

		if (selectedFile != null) {
			try {
				java.io.BufferedReader buffer = new java.io.BufferedReader(new java.io.FileReader(selectedFile));
				String parts;
				StringBuilder content = new StringBuilder();

				while ((parts = buffer.readLine()) != null) {
					content.append(parts).append('\n');
				}

				indiviualTextArea4.setText(content.toString());
				buffer.close();
			} catch (Exception e) {
				e.printStackTrace();
				indiviualTextArea4.setText("Error!!!!!!!!!!1 tryyy agaaainnn");
			}
//##########################################################################################################################

		}
	}

	private void ReadFile2(Stage primaryStage) {

		FileChooser RayanChooserr = new FileChooser();
		RayanChooserr.setTitle("Open Text File");
		RayanChooserr.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

		java.io.File selectedFile = RayanChooserr.showOpenDialog(primaryStage);

		if (selectedFile != null) {
			try {
				java.io.BufferedReader buffers = new java.io.BufferedReader(new java.io.FileReader(selectedFile));
				String cutss;
				StringBuilder content = new StringBuilder();

				while ((cutss = buffers.readLine()) != null) {
					content.append(cutss).append('\n');
				}

				indiviualTextArea3.setText(content.toString());
				buffers.close();
			} catch (Exception e) {
				e.printStackTrace();
				indiviualTextArea3.setText("Error!!!!!!!!!!1 tryyy agaaainnn");
			}
//##########################################################################################################################

		}
	}

	private void ReadFile3(Stage primaryStage) {

		FileChooser RayanChhoser = new FileChooser();
		RayanChhoser.setTitle("Read File");
		RayanChhoser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

		java.io.File selectedFile = RayanChhoser.showOpenDialog(primaryStage);

		if (selectedFile != null) {
			try {
				java.io.BufferedReader buffferes = new java.io.BufferedReader(new java.io.FileReader(selectedFile));
				String cutts;
				StringBuilder content = new StringBuilder();

				while ((cutts = buffferes.readLine()) != null) {
					content.append(cutts).append('\n');
				}

				indiviualTextArea2.setText(content.toString());
				buffferes.close();
			} catch (Exception e) {
				e.printStackTrace();
				indiviualTextArea2.setText("Error!!!!!!!!!!1 tryyy agaaainnn");
			}
//##########################################################################################################################

		}
	}

	private void insertFile22(String RayanName, String RayanPercentage) {
		if (!RayanName.isEmpty() && !RayanPercentage.isEmpty()) {
			String newRecord = String.format("CountryName: %s, the Percentage: %s%n", RayanName, RayanPercentage);
			recordTextArea.appendText(newRecord);

			countryField.clear();
			percentageField.clear();
		} else {
			recordTextArea.appendText("Please enter country and percentage.%n");
		}

	}

	private void searchRecord() {
		String serches = SearchText.getText().trim();

		boolean isfound = false;
		indiviualTextArea3.clear();

		try (BufferedReader buffers = new BufferedReader(new FileReader("rayanphase0.txt"))) {
			String partss;
			while ((partss = buffers.readLine()) != null) {
				String[] parts = partss.split(",");
				if (parts.length == 2) {
					String country = parts[0].trim();
					if (country.equalsIgnoreCase(serches)) {
						indiviualTextArea3.setText("Country: " + country + "\nPopulation: " + parts[1].trim());
						isfound = true;
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (!isfound) {
			indiviualTextArea3.setText("No country record found for: " + serches);
		}
	}
	// ###############################################################################################################################################################################

	private File ReadFileas() {
		FileChooser choosers = new FileChooser();
		choosers.setTitle("Read Files");
		choosers.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"),
				new FileChooser.ExtensionFilter("All Files", "*.*"));
		return choosers.showOpenDialog(null);
	}
//###############################################################################################################################################################################
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3
	// ###########################################################################################################################################################3

	private boolean DeleteCountry(String delete) {
		File files = new File("rayanphase0.txt");
		File outs = new File("temp.txt");

		try (BufferedReader rayansrederds = new BufferedReader(new FileReader(files));
				BufferedWriter rayanwriter = new BufferedWriter(new FileWriter(outs))) {

			String outss;
			boolean isFound = false;

			while ((outss = rayansrederds.readLine()) != null) {
				String[] parts = outss.split(",");
				if (parts.length == 2) {
					String country = parts[0].trim();
					if (country.equalsIgnoreCase(delete)) {
						isFound = true;
						continue;
					}
				}
				rayanwriter.write(outss + System.lineSeparator());
			}

			files.delete();
			outs.renameTo(files);

			return isFound;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
//###############################################################################################################################################################################

	private void ReadFile4(Stage primaryStage) {
		FileChooser chhoser = new FileChooser();
		chhoser.setTitle("Open Text File");
		chhoser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

		java.io.File selectedFile = chhoser.showOpenDialog(primaryStage);

		if (selectedFile != null) {
			try {
				BufferedReader RayanReader = new BufferedReader(new FileReader(selectedFile));
				String partes;
				StringBuilder content = new StringBuilder();

				while ((partes = RayanReader.readLine()) != null) {
					content.append(partes).append('\n');
				}

				indiviualTextArea5.setText(content.toString());
				RayanReader.close();

				RayandIsplaay(indiviualTextArea5.getText());
			} catch (Exception e) {
				e.printStackTrace();
				indiviualTextArea5.setText("Error !!!!!!!!!!!!!! trryyy agaain");
			}
		}
	}
//###############################################################################################################################################################################

	private void RayandIsplaay(String fileContent) {
		String stringss = percentageInput.getText().trim();

		if (stringss.isEmpty()) {
			textArea.setText("You dont entered any thing try again please!!!!!");
			return;
		}

		try {
			double percentss = Double.parseDouble(stringss);
			boolean IsFound = false;

			textArea.clear();

			String[] outss = fileContent.split("\n");
			for (String reads : outss) {
				String[] rayax = reads.split(",");
				if (rayax.length == 2) {
					String namesss = rayax[0].trim();
					double percentessss = Double.parseDouble(rayax[1].trim());

					if (percentessss > percentss) {
						textArea.appendText(namesss + "\n");
						IsFound = true;
					}
				}
			}

			if (!IsFound) {
				indiviualTextArea6.setText("No countries found with a percentage greater than " + percentss + "%.");
			}
		} catch (NumberFormatException e) {
			indiviualTextArea6.setText("error valuee!!!!!!");
		}
	}
//###############################################################################################################################################################################

	private File rayanFile() {
		FileChooser choosers = new FileChooser();
		choosers.setTitle("Read File ");
		choosers.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

		return choosers.showOpenDialog(null);
	}

//###############################################################################################################################################################################
	private void Show(String rayanContent, String word) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle(rayanContent);
		alert.setHeaderText(null);
		alert.setContentText(word);
		alert.showAndWait();
	}
//#######################################################################################################################################################################
}
