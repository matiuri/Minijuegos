package minigames.tictactoe;

import minigames.Games;
import minigames.screens.ScreenAdapter;
import minigames.utils.fonts.Font;
import minigames.utils.fonts.FontActor;
import minigames.utils.trowables.exceptions.AssetLoaderException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TicTacToe extends ScreenAdapter {
	public static final String BLUE_KEY = "blue", RED_KEY = "red";
	
	private Stage stage;
	private Board board;
	
	private FontActor arial;
	
	public TicTacToe(Games game) {
		super(game);
	}
	
	@Override
	public void show() {
		Input.unlock();
		try {
			Games.tex_loader.load("Tic-Tac-Toe/blue.png", BLUE_KEY);
			Games.tex_loader.load("Tic-Tac-Toe/red.png", RED_KEY);
		} catch (AssetLoaderException e) {
			// TEST: do nothing
		}
		
		stage = new Stage(new ScreenViewport());
		board = new Board(stage);
		arial = new FontActor(Font.arial(72), "Nobody Wins");
		arial.setPosition(100, 100);
		Gdx.input.setInputProcessor(stage);
	}
	
	@Override
	public void render(float delta) {
		Games.clearScreen(Color.GRAY, 1);
		if (Gdx.input.isKeyJustPressed(Keys.R)) {
			game.setScreen(this);
		}
		stage.act(delta);
		stage.draw();
		
		if (board.blueCheck()) {
			Input.lock();
			arial.getFont().setColor(Color.BLUE);
			arial.setMessage("Blue Wins");
			stage.addActor(arial);
		} else if (board.redCheck()) {
			Input.lock();
			arial.getFont().setColor(Color.RED);
			arial.setMessage("Red Wins");
			stage.addActor(arial);
		} else if (board.allFullCheck()) {
			Input.lock();
			arial.getFont().setColor(Color.BLACK);
			stage.addActor(arial);
		}
	}
	
	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height);
	}
	
	@Override
	public void hide() {
		board = null;
		stage.dispose();
		arial.dispose();
		// FIXME
		// Games.tex_loader.remove(BLUE_KEY);
		// Games.tex_loader.remove(RED_KEY);
	}
}
