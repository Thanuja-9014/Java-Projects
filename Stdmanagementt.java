package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.*;

public class Stdmanagementt extends Application {

    Connection connection;

    @Override
    public void start(Stage stage) {
        connectToDatabase();

        // UI Components
        Label rollLabel = new Label("Roll Number:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label courseLabel = new Label("Course:");
        TextField courseField = new TextField();

        Label semesterLabel = new Label("Semester:");
        TextField semesterField = new TextField();

        Label messageLabel = new Label();

        // Buttons
        Button insertButton = new Button("Insert");
        insertButton.setStyle("-fx-background-color: #28a745; -fx-text-fill: white;");

        Button updateButton = new Button("Update");
        updateButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;");

        Button deleteButton = new Button("Delete");
        deleteButton.setStyle("-fx-background-color: #dc3545; -fx-text-fill: white;");

        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #ffc107; -fx-text-fill: black;");

        Button searchButton = new Button("Search");
        searchButton.setStyle("-fx-background-color: #17a2b8; -fx-text-fill: white;");

        // Grid Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setStyle("-fx-background-color: rgba(255, 255, 255, 0.85); -fx-border-radius: 10; -fx-background-radius: 10;");

        // Add components to Grid
        grid.add(rollLabel, 0, 0);      grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);      grid.add(nameField, 1, 1);
        grid.add(phoneLabel, 0, 2);     grid.add(phoneField, 1, 2);
        grid.add(emailLabel, 0, 3);     grid.add(emailField, 1, 3);
        grid.add(courseLabel, 0, 4);    grid.add(courseField, 1, 4);
        grid.add(semesterLabel, 0, 5);  grid.add(semesterField, 1, 5);

        HBox buttonBox = new HBox(10, insertButton, updateButton, deleteButton, searchButton, clearButton);
        buttonBox.setAlignment(Pos.CENTER);
        grid.add(buttonBox, 0, 6, 2, 1);

        grid.add(messageLabel, 0, 7, 2, 1);

        // Actions
        insertButton.setOnAction(e -> {
            try {
                String sql = "INSERT INTO stdmanagement (roll_number, name, course, semester, email, phone) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(rollField.getText()));
                ps.setString(2, nameField.getText());
                ps.setString(3, courseField.getText());
                ps.setString(4, semesterField.getText());
                ps.setString(5, emailField.getText());
                ps.setString(6, phoneField.getText());
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    messageLabel.setText("✅ Inserted successfully!");
                    messageLabel.setStyle("-fx-text-fill: green;");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                messageLabel.setText("❌ Insert failed.");
                messageLabel.setStyle("-fx-text-fill: red;");
            }
        });

        updateButton.setOnAction(e -> {
            try {
                String sql = "UPDATE stdmanagement SET name=?, course=?, semester=?, email=?, phone=? WHERE roll_number=?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, nameField.getText());
                ps.setString(2, courseField.getText());
                ps.setString(3, semesterField.getText());
                ps.setString(4, emailField.getText());
                ps.setString(5, phoneField.getText());
                ps.setInt(6, Integer.parseInt(rollField.getText()));
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    messageLabel.setText("✅ Updated successfully!");
                    messageLabel.setStyle("-fx-text-fill: blue;");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                messageLabel.setText("❌ Update failed.");
                messageLabel.setStyle("-fx-text-fill: red;");
            }
        });

        deleteButton.setOnAction(e -> {
            try {
                String sql = "DELETE FROM stdmanagement WHERE roll_number=?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(rollField.getText()));
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    messageLabel.setText("✅ Deleted successfully!");
                    messageLabel.setStyle("-fx-text-fill: red;");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                messageLabel.setText("❌ Delete failed.");
                messageLabel.setStyle("-fx-text-fill: red;");
            }
        });

        searchButton.setOnAction(e -> {
            try {
                String sql = "SELECT * FROM stdmanagement WHERE roll_number=?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(rollField.getText()));
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    nameField.setText(rs.getString("name"));
                    courseField.setText(rs.getString("course"));
                    semesterField.setText(rs.getString("semester"));
                    emailField.setText(rs.getString("email"));
                    phoneField.setText(rs.getString("phone"));
                    messageLabel.setText("✅ Record found.");
                    messageLabel.setStyle("-fx-text-fill: green;");
                } else {
                    messageLabel.setText("❌ No record found.");
                    messageLabel.setStyle("-fx-text-fill: red;");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                messageLabel.setText("❌ Error during search.");
                messageLabel.setStyle("-fx-text-fill: red;");
            }
        });

        clearButton.setOnAction(e -> {
            rollField.clear();
            nameField.clear();
            courseField.clear();
            semesterField.clear();
            emailField.clear();
            phoneField.clear();
            messageLabel.setText("");
        });

        // Background Pane with image and color overlay
        StackPane backgroundPane = new StackPane();
        backgroundPane.setStyle(
            "-fx-background-image: url('file:/C:/Users/kurub/OneDrive/Pictures/school-management-system.webp');" +
            "-fx-background-size: cover;"
        );

        Region colorOverlay = new Region();
        colorOverlay.setStyle("-fx-background-color: rgba(255, 255, 255, 0.5);"); // white with 50% opacity
        colorOverlay.setPrefSize(800, 600);

        backgroundPane.getChildren().addAll(colorOverlay, grid);

        Scene scene = new Scene(backgroundPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Student Management System - JavaFX + MySQL");
        stage.show();
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/stdmanagement?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "1234"; // Replace with your actual password
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connected.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Database connection failed.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
