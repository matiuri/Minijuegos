package minigames.desktop;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import minigames.Games;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main(String[] arg) {
		init();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Games.TITLE + " " + Games.VERSION;
		config.width = Games.width;
		config.height = Games.height;
		config.resizable = Games.RESIZABLE;
		config.fullscreen = Games.FULLSCREEN;
		config.vSyncEnabled = Games.VSYNC;
		config.foregroundFPS = Games.FPS_F;
		config.backgroundFPS = Games.FPS_B;
		new LwjglApplication(new Games(), config);
	}
	
	private static void init() {
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		try {
			Games.width = gd.getDisplayMode().getWidth();
			Games.height = gd.getDisplayMode().getHeight();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
