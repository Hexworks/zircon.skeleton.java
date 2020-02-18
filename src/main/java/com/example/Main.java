package com.example;

import org.hexworks.zircon.api.CP437TilesetResources;
import org.hexworks.zircon.api.ColorThemes;
import org.hexworks.zircon.api.Components;
import org.hexworks.zircon.api.SwingApplications;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.component.Label;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.data.Size;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.screen.Screen;

public class Main {

    public static void main(String[] args) {

        TileGrid tileGrid = SwingApplications.startTileGrid(
                AppConfig.newBuilder()
                        .withSize(Size.create(60, 30))
                        .withDefaultTileset(CP437TilesetResources.rexPaint16x16())
                        .build());

        Screen screen = Screen.create(tileGrid);

        Label label = Components.label()
                .withText("Hello, Zircon!")
                .withPosition(Position.create(23, 10))
                .build();

        screen.addComponent(label);

        screen.display();
        screen.setTheme(ColorThemes.arc());
    }
}
