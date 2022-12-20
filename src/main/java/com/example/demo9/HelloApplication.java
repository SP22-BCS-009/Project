package com.example.demo9;

import com.example.project_pharmacy.LoggedIn;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;


import java.util.List;



public class HelloApplication extends Application {
    public static int bill = 0;


    @Override
    public void start(Stage stage)   {

        ArrayList<String> arr=new ArrayList<String>();

        //SCENE 1
        stage.setTitle("PHARMACY");
        GridPane gridpane=new GridPane();
        gridpane.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY,CornerRadii.EMPTY,Insets.EMPTY)));
        Scene scene1=new Scene(gridpane,500,500);
        stage.setScene(scene1);
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        gridpane.setPadding(new Insets(10,10,10,10));
        gridpane.setAlignment(Pos.CENTER);
//        Text text=new Text("Enter your Username and Password to Login: ");
//        gridpane.add(text,0,0);
        Text loginText=new Text("LOGIN");
        loginText.setFill(Color.DARKBLUE);
        loginText.setFont(Font.font("Impact",FontWeight.BOLD,40));
        loginText.setUnderline(true);
        loginText.setTextAlignment(TextAlignment.CENTER);
//        loginText.setStroke(Color.BLACK);
        gridpane.add(loginText,1,0);
        Label loginUsername=new Label("Username:");
        gridpane.add(loginUsername,0,1);
        TextField textfield = new TextField();
        textfield.setPromptText("Your Username");
        gridpane.add(textfield,1,1);
        Label password=new Label("Password:");
        gridpane.add(password,0,2);
        PasswordField passwordField=new PasswordField();
        passwordField.setPromptText("Your Password");
        gridpane.add(passwordField,1,2);
        Button login=new Button("LOGIN");
        login.setStyle("-fx-background-color:#357EC7");
        login.setCursor(Cursor.HAND);
        gridpane.add(login,1,3);
        Button signup=new Button("SIGNUP");
        signup.setStyle("-fx-background-color:Transparent");
        signup.setUnderline(true);
        signup.setTextFill(Color.DARKBLUE);
        signup.setCursor(Cursor.HAND);
        gridpane.add(signup,1,6);
        HBox loginHBox=new HBox();
        loginHBox.getChildren().add(login);
        loginHBox.setAlignment(Pos.BOTTOM_RIGHT);
        gridpane.add(loginHBox,0,3);
        HBox signUpHBox=new HBox();
        signUpHBox.getChildren().add(signup);
        signUpHBox.setAlignment(Pos.BOTTOM_RIGHT);
        gridpane.add(signUpHBox,1,3);




        //SCENE 2
        GridPane grid1=new GridPane();
        grid1.setHgap(12);
        grid1.setVgap(12);
        grid1.setPadding(new Insets(12,12,12,12));
        grid1.setAlignment(Pos.CENTER);
        grid1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY,CornerRadii.EMPTY,Insets.EMPTY)));
        Text text1=new Text("Enter your Username and Password to SignUp: ");
        grid1.add(text1,0,0);
        Scene scene2=new Scene(grid1,500,500);
        Label signupUsername=new Label("Username:");
        grid1.add(signupUsername,0,1);
        TextField signupTextField = new TextField();
        grid1.add(signupTextField,1,1);
        Label signupPassword=new Label("Password:");
        grid1.add(signupPassword,0,2);
        PasswordField signupPasswordField=new PasswordField();
        grid1.add(signupPasswordField,1,2);
        Button signUp2=new Button("SignUp");
        signUp2.setStyle("-fx-background-color:#357EC7");
        grid1.add(signUp2,1,3);

        //SCENE 3
        GridPane grid2=new GridPane();
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(10,10,10,10));
//        grid2.setAlignment(Pos.CENTER);
        grid2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY,CornerRadii.EMPTY,Insets.EMPTY)));
        Text medicineText=new Text("MEDICINES ");
//        Font medicineFont=new Font("verdana", FontWeight.BOLD, FontPosture.REGULAR,12);
        medicineText.setFont(Font.font("Verdana",FontWeight.BOLD,15));
        medicineText.setUnderline(true);
        medicineText.setFill(Color.DARKBLUE);
        grid2.add(medicineText,0,0);
        Scene scene3=new Scene(grid2,500,500);
        Button panadolButton=new Button("PANADOL");
        grid2.add(panadolButton,0,1);
        Button broufinButton = new Button("BROUFIN");
        grid2.add(broufinButton,0,2);
        Button augmentinButton=new Button("AUGMENTIN");
        grid2.add(augmentinButton,0,3);
        Button disprinButton=new Button("DISPRIN");
        grid2.add(disprinButton,0,4);
        Text surgicalEquipmentText=new Text("EQUIPMENTS");
        surgicalEquipmentText.setFont(Font.font("Verdana",FontWeight.BOLD,15));
        surgicalEquipmentText.setUnderline(true);
        surgicalEquipmentText.setFill(Color.DARKBLUE);
        grid2.add(surgicalEquipmentText,1,0);
        Button forcepButton=new Button("FORCEPS");
        grid2.add(forcepButton,1,1);
        Button bpApparatus=new Button("BP APPARATUS");
        grid2.add(bpApparatus,1,2);
        Button addButton=new Button("Add");
        grid2.add(addButton,0,6);
        Button showButton=new Button("Show");
        grid2.add(showButton,1,6);
        Button updateButton=new Button("Update");
        Button deleteButton=new Button("Delete");
        Button totalBill=new Button("Total Bill");
        grid2.add(totalBill,0,13);
        panadolButton.setMaxWidth(100);
        broufinButton.setMaxWidth(100);
        augmentinButton.setMaxWidth(100);
        disprinButton.setMaxWidth(100);
        forcepButton.setMaxWidth(100);
        bpApparatus.setMaxWidth(100);
        VBox topButtons=new VBox();
        topButtons.getChildren().addAll(medicineText,panadolButton,broufinButton,augmentinButton,disprinButton);
        topButtons.setSpacing(8);
        topButtons.setAlignment(Pos.TOP_LEFT);
        grid2.add(topButtons,0,0);
        VBox topButtons2=new VBox();
        topButtons2.getChildren().addAll(surgicalEquipmentText,forcepButton,bpApparatus);
        topButtons2.setSpacing(8);
        grid2.add(topButtons2,2,0);
        HBox bottomButtons=new HBox();
        bottomButtons.getChildren().addAll(addButton,showButton,updateButton,deleteButton);
        bottomButtons.setSpacing(5);
        grid2.add(bottomButtons,0,3);

//        list view
        ObservableList<String> names= FXCollections.observableArrayList("medicine","bp","syringe");
        ListView<String> listView=new ListView<String>(names);
        listView.setMaxSize(200,100);

        totalBill.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String totBill=Integer.toString(bill);
                Text bill=new Text(totBill);
                bill.setFont(Font.font("Verdana",FontWeight.BOLD,13));
                bill.setUnderline(true);
                grid2.add(bill,1,13);
            }
        });

        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String[] e=new String[1000];
                e= convertToArray(arr);
                try {
                    writeInFile(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        showButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String[] o=new String[1000];
                o= convertToArray(arr);
                ObservableList<String> names = FXCollections.observableArrayList(o);
                ListView<String> listView = new ListView<String>(names);
                listView.setMaxSize(200, 100);
                grid2.add(listView, 0, 8);
            }
        });

        deleteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Text text4 = new Text("Enter the name of product you want to delete:");
                TextField text5 = new TextField();
                grid2.add(text4, 0, 7);
                grid2.add(text5, 1, 7);
                Button done = new Button("Done");
                grid2.add(done, 2, 7);
                done.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (text5.getText().equals(disprinButton.getText())) {
                            disprinButton.setVisible(false);
                        } else if (text5.getText().equals(broufinButton.getText())) {
                            broufinButton.setVisible(false);
                        }else if(text5.getText().equals(panadolButton.getText())){
                            panadolButton.setVisible(false);
                        } else if (text5.getText().equals(augmentinButton.getText())) {
                            augmentinButton.setVisible(false);
                        } else if (text5.getText().equals(forcepButton.getText())) {
                            forcepButton.setVisible(false);
                        } else if (text5.getText().equals(bpApparatus.getText())) {
                            bpApparatus.setVisible(false);

                        } else {
                            text5.getText();
                            Text notFound = new Text("Product entered not found");
                            grid2.add(notFound, 3, 8);
                        }
                    }
                });
            }});

        updateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label updateLabel=new Label("Enter the product:");
                TextField updateTextField=new TextField();
                Button showUpdate=new Button("Done");
                HBox updateHBox=new HBox();
                updateHBox.getChildren().addAll(updateLabel,updateTextField);
                updateHBox.setSpacing(5);
                grid2.add(updateHBox,0,9);
                EventHandler<MouseEvent> mouseEventEventHandler=new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        grid2.add(showUpdate,2,10);
                    }
                };
                updateTextField.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEventEventHandler);
                showUpdate.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        String t=updateTextField.getText();
                        arr.add(t);
                        String[] s=new String[1000];
                        s=convertToArray(arr);
                        ObservableList<String> names = FXCollections.observableArrayList(s);
                        ListView<String> listView = new ListView<String>(names);
                        listView.setMaxSize(200, 100);
                        grid2.add(listView, 0, 11);
                    }
                });
            }
        });


        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                List<String> list=new ArrayList<String>();

                try {
                    BufferedReader bf=new BufferedReader(new FileReader("signup.txt"));
                    String line=bf.readLine();
                    while(line!=null){
                        list.add(line);
                        line=bf.readLine();
                    }
                    bf.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                String[] arr=list.toArray(new String[0]);

                for(String s:arr){
                    System.out.println(s);
                }

                for(int i=0;i<LoggedIn.userName.length;i++)
                    if(textfield.getText().equals(LoggedIn.userName[i]) && passwordField.getText().equals(LoggedIn.passWord[i])) {
                        stage.setScene(scene3);
                    }
                for (int j=0;j<arr.length;j++)
                    if(textfield.getText().equals(arr[j])){
                        stage.setScene(scene3);
                    }else {
                        Text errorText=new Text("You need to signup");
                        errorText.setFill(Color.RED);
                        gridpane.add(errorText,1,4);
                    }
            }
        });


        bpApparatus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int rate=1000;
                bill+=rate;
                arr.add("BpApparatus");
                for(String a:arr){
                    System.out.println(arr);
                }
                Text bpAparatusText=new Text("BpApparatus");
                grid2.add(bpAparatusText,0,6);
            }
        });

        forcepButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int rate=1000;
                bill+=rate;
                arr.add("Forceps");
                for(String a:arr){
                    System.out.println(arr);
                }
                Text bpAparatusText=new Text("Forceps");
                grid2.add(bpAparatusText,1,6);
            }
        });

        panadolButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int rate=1000;
                bill+=rate;
                arr.add("Panadol");
                for(String a:arr){
                    System.out.println(arr);
                }
                Text panadolText=new Text("Panadol");
                grid2.add(panadolText,0,5);
            }
        });

        broufinButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int rate=1000;
                bill+=rate;
                arr.add("Broufin");
                for(String a:arr){
                    System.out.println(arr);
                }
                Text broufinText=new Text("Broufin");
                grid2.add(broufinText,1,5);
            }
        });

        augmentinButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int rate=1000;
                bill+=rate;
                arr.add("Augmentin");
                for(String a:arr){
                    System.out.println(arr);
                }
                Text augmentinText=new Text("Augmentin");
                grid2.add(augmentinText,2,5);
            }
        });

        disprinButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int rate=1000;
                bill+=rate;
                arr.add("Disprin");
                for(String a:arr){
                    System.out.println(arr);
                }
                Text disprinText=new Text("Disprin");
                grid2.add(disprinText,3,5);
            }
        });

        signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(scene2);

            }
        });

        signUp2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String u;
                u=signupTextField.getText();
                String p;
                p=signupPasswordField.getText();
                try {
                    writeInFile1(u);
                    writeInFile1(p);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage.setScene(scene3);
            }
        });


//        signUp2.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                String e;
//                e= signupTextField.getText();
//                int i;
//                for(i=userName.length;i<= userName.length+1;i++){
//                    LoggedIn.userName[i]=e;}
//                String m;
//                m=signupPasswordField.getText();
//                int j;
//                for(j= passWord.length;j<=passWord.length+1;j++){
//                    LoggedIn.passWord[j]=m;
//                }
//                stage.setScene(scene3);
//
//            }
//
//
//
//        });

//        signUp2.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                String u;
//                u=signupTextField.getText();
//                String p;
//                p=passwordField.getText().toString();
//                signedInArrayList.add(new SignedIn(u,p));
//                for(SignedIn s:signedInArrayList){
//                    System.out.println(s);
//                }
//                stage.setScene(scene3);
//            }
//        });

//        signUp2.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                stage.setScene(scene3);
//            }
//        });

        stage.show();







    }

    public static void main(String[] args) throws IOException {launch();
    }


    public static String[] convertToArray(ArrayList<String> s){
        String[] str=new String[s.size()];
        for(int i=0;i<s.size();i++){
            str[i]=s.get(i);
        }
        for(String l:str){
            System.out.println(l);
        }
        return str;
    }

    public static String[] read() throws IOException {
        File file = new File("data.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String data[] = new String[1000];
        int i = 0;
        while ((data[i] = br.readLine()) != null)
            System.out.println(data[i]);
        i++;
        br.close();
        fr.close();
        return data;
    }

    public static void writeInFile(String[] input) throws IOException {
        // File declaration
        File file = new File("data.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<input.length;i++){
            bw.write(input[i]+"");
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public static void writeInFile1(String input) throws IOException {
        // File declaration
        File file = new File("signup.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(input);
        bw.newLine();
        bw.close();
        fw.close();
    }

}
