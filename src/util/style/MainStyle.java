package util.style;

import java.nio.file.Paths;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import main.MonsterHunter;

public class MainStyle {

    public static Font customFont = Font
            .loadFont(Paths.get(MonsterHunter.PROPERTIES.getProperty("StylePolice")).toUri().toString(), 200);
    public static Font mainFont = Font
            .loadFont(Paths.get(MonsterHunter.PROPERTIES.getProperty("StylePolice")).toUri().toString(), 75);
    public static Font normalFont = Font
            .loadFont(Paths.get(MonsterHunter.PROPERTIES.getProperty("StylePolice")).toUri().toString(), 20);
    public static Font litleFont = Font
            .loadFont(Paths.get(MonsterHunter.PROPERTIES.getProperty("StylePolice")).toUri().toString(), 40);

    public static BackgroundImage mainbackgroundImage = new BackgroundImage(
            new Image(
                    Paths.get(MonsterHunter.PROPERTIES.getProperty("MenuBckgImage")).toUri().toString()),
            BackgroundRepeat.SPACE,
            BackgroundRepeat.SPACE,
            BackgroundPosition.CENTER,
            BackgroundSize.DEFAULT);

    public static BackgroundImage buttonbackground = new BackgroundImage(
            new Image(
                    Paths.get(MonsterHunter.PROPERTIES.getProperty("ButtonTexture")).toUri().toString()),
            BackgroundRepeat.SPACE,
            BackgroundRepeat.SPACE,
            BackgroundPosition.CENTER,
            BackgroundSize.DEFAULT);

    public static BackgroundImage choiceMenuBackgroundImage = new BackgroundImage(
            new Image(
                    Paths.get(MonsterHunter.PROPERTIES.getProperty("MenuOptionBkg")).toUri().toString()),
            BackgroundRepeat.SPACE,
            BackgroundRepeat.SPACE,
            BackgroundPosition.CENTER,
            BackgroundSize.DEFAULT);

    public static void applyMainButtonStyle(Button button) {
        button.setFont(mainFont);
        applyMainButtonStyle(button);
    }

    public static void applyLitleButtonStyle(Button button) {
        applyButtonStyle(button);
        button.setFont(litleFont);
    }

    public static void applyCustomButtonStyle(Button button) {
        button.setFont(customFont);
        applyButtonStyle(button);
    }

    private static void applyButtonStyle(Button button) {
        button.setBackground(new Background(buttonbackground));
        button.setTextFill(Color.rgb(0, 0, 0));
        button.setStyle("-fx-padding: 0;");
    }

    public static void applyTitleStyle(Text title) {
        title.setFont(customFont);
        title.setFill(Color.rgb(100, 41, 0));
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.rgb(0, 0, 0));
        title.setEffect(dropShadow);
        title.setStyle("-fx-padding: 0;");
    }
}
