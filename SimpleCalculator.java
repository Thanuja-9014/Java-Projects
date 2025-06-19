package abc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

    private TextField display = new TextField();
    private String operator = "";
    private double firstOperand = 0;
    private boolean startNewInput = true;
    private boolean operatorPressed = false;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("📱 Phone Style Calculator");

        display.setFont(Font.font("Consolas", 24));
        display.setEditable(true); // Make editable for blinking cursor
        display.setFocusTraversable(true);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-cursor: text;");
        display.setPrefHeight(60);

        // Hover effect
        display.addEventFilter(MouseEvent.MOUSE_ENTERED, e -> display.setStyle(
                "-fx-background-color: #f0f8ff; -fx-text-fill: black; -fx-cursor: text;"
        ));
        display.addEventFilter(MouseEvent.MOUSE_EXITED, e -> display.setStyle(
                "-fx-background-color: white; -fx-text-fill: black; -fx-cursor: text;"
        ));

        GridPane grid = createKeypad();

        VBox root = new VBox(10, display, grid);
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: #e6f2ff;");
        Scene scene = new Scene(root, 360, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        display.requestFocus(); // Focus so cursor blinks
    }

    private GridPane createKeypad() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        String[][] buttons = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", ".", "=", "+"},
            {"%", "√", "^", "AC"}
        };

        for (int row = 0; row < buttons.length; row++) {
            for (int col = 0; col < buttons[row].length; col++) {
                String text = buttons[row][col];
                Button btn = createButton(text);
                grid.add(btn, col, row);
            }
        }

        return grid;
    }

    private Button createButton(String text) {
        Button btn = new Button(text);
        btn.setPrefSize(70, 60);
        btn.setFont(Font.font(18));
        btn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");

        btn.setOnAction(e -> handleInput(text));
        return btn;
    }

    private void handleInput(String input) {
        switch (input) {
            case "AC":
                display.clear();
                operator = "";
                firstOperand = 0;
                startNewInput = true;
                operatorPressed = false;
                break;

            case "=":
                try {
                    String expression = display.getText();
                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(result));
                    startNewInput = true;
                    operatorPressed = false;
                } catch (Exception e) {
                    display.setText("Error");
                }
                break;

            case "+": case "-": case "*": case "/": case "^": case "%":
                if (!display.getText().isEmpty()) {
                    display.appendText(input);
                    operatorPressed = true;
                }
                break;

            case "√":
                try {
                    double value = Double.parseDouble(display.getText());
                    double result = Math.sqrt(value);
                    display.setText(String.valueOf(result));
                    startNewInput = true;
                    operatorPressed = false;
                } catch (Exception e) {
                    display.setText("Error");
                }
                break;

            default: // number or .
                if (startNewInput) {
                    display.clear();
                    startNewInput = false;
                }
                display.appendText(input);
        }
    }

    private double evaluateExpression(String expression) {
        if (expression.contains("^")) {
            String[] parts = expression.split("\\^");
            return Math.pow(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
        }
        if (expression.contains("%")) {
            String[] parts = expression.split("%");
            return (Double.parseDouble(parts[0]) * Double.parseDouble(parts[1])) / 100;
        }
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        }
        if (expression.contains("-")) {
            String[] parts = expression.split("-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        }
        if (expression.contains("*")) {
            String[] parts = expression.split("\\*");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        }
        if (expression.contains("/")) {
            String[] parts = expression.split("/");
            double divisor = Double.parseDouble(parts[1]);
            return divisor != 0 ? Double.parseDouble(parts[0]) / divisor : Double.NaN;
        }
        return Double.parseDouble(expression);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
