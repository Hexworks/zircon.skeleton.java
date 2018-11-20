import org.hexworks.zircon.api.*;
import org.hexworks.zircon.api.component.Label;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.screen.Screen;

public class Main {

    public static void main(String[] args) {

        TileGrid tileGrid = SwingApplications.startTileGrid(
                AppConfigs.newConfig()
                        .withSize(Sizes.create(60, 30))
                        .withDefaultTileset(CP437TilesetResources.rexPaint16x16())
                        .build());

        Screen screen = Screens.createScreenFor(tileGrid);

        Label label = Components.label()
                .withText("Hello, Zircon!")
                .withPosition(Positions.create(23, 10))
                .build();

        screen.addComponent(label);

        screen.display();
        screen.applyColorTheme(ColorThemes.arc());
    }
}
