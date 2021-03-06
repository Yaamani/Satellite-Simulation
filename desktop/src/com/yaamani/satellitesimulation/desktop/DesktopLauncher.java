package com.yaamani.satellitesimulation.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.yaamani.satellitesimulation.SatelliteSimulationGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = 800;
		config.height = 640;
		config.samples = 2;

		new LwjglApplication(new SatelliteSimulationGame(), config);
	}
}
