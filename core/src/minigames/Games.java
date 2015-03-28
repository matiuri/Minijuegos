package minigames;

import minigames.utils.assets.AssetLoader;
import minigames.utils.fonts.FontLoader;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Games extends Game {
	public static final String TITLE = "Minigames", VERSION = "Alpha 0.0", VENDOR = "Matías Steinberg";
	public static final int FPS_F = 0, FPS_B = -1;
	public static int width, height;
	public static final boolean RESIZABLE = true, FULLSCREEN = true, VSYNC = true, DEBUG = false;
	
	public static AssetLoader<Texture> tex_loader = new AssetLoader<>(Texture.class);
	public static AssetLoader<Sound> snd_loader = new AssetLoader<>(Sound.class);
	public static AssetLoader<Music> mus_loader = new AssetLoader<>(Music.class);
	
	private SpriteBatch sb;
	
	@Override
	public void create() {
		sb = new SpriteBatch();
	}
	
	@Override
	public void render() {
		super.render();
		clearScreen(Color.BLUE, 1);
		sb.begin();
		FontLoader.STENCIL_36.draw(sb, "Probando Stencil.ttf", 50, 50);
		FontLoader.SEASIDE_RESORT_NF_36.draw(sb, "Probando SeasideResortNF.ttf", 150, 150);
		FontLoader.ARIAL_36.draw(sb, "Probando Arial.ttf", 250, 250);
		sb.end();
	}
	
	@Override
	public void dispose() {
		tex_loader.dispose();
		snd_loader.dispose();
		mus_loader.dispose();
		
		sb.dispose();
	}
	
	public static void clearScreen() {
		Gdx.graphics.getGL20().glClearColor(0, 0, 0, 1);
		Gdx.graphics.getGL20().glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	/**
	 * Clears the screen
	 * 
	 * @param r
	 *            red
	 * @param g
	 *            green
	 * @param b
	 *            blue
	 * @param a
	 *            alpha
	 */
	public static void clearScreen(float r, float g, float b, float a) {
		Gdx.graphics.getGL20().glClearColor(r, g, b, a);
		Gdx.graphics.getGL20().glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	/**
	 * Clears the screen
	 * 
	 * @param color
	 *            {@link Color}
	 * @param a
	 *            alpha
	 */
	public static void clearScreen(Color color, float a) {
		Gdx.graphics.getGL20().glClearColor(color.r, color.g, color.b, a);
		Gdx.graphics.getGL20().glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	/**
	 * Set {@link Batch}'s color to default
	 * 
	 * @param batch
	 *            {@link Batch}
	 */
	public static void setDefaultColor(Batch batch) {
		batch.setColor(1, 1, 1, 1);
	}
}
