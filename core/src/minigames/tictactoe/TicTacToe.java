package minigames.tictactoe;

import minigames.Games;
import minigames.screens.ScreenAdapter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TicTacToe extends ScreenAdapter {
	public static final String BLUE_KEY = "blue", RED_KEY = "red";
	
	private Stage stage;
	private Board board;
	
	public TicTacToe(Games game) {
		super(game);
	}
	
	@Override
	public void show() {
		Games.tex_loader.load("Tic-Tac-Toe/blue.png", BLUE_KEY);
		Games.tex_loader.load("Tic-Tac-Toe/red.png", RED_KEY);
		
		stage = new Stage(new ScreenViewport());
		board = new Board(stage);
		Gdx.input.setInputProcessor(stage);
	}
	
	@Override
	public void render(float delta) {
		Games.clearScreen(Color.GRAY, 1);
		stage.act(delta);
		stage.draw();
	}
	
	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height);
	}
	
	@Override
	public void hide() {
		board = null;
		stage.dispose();
		Games.tex_loader.remove(BLUE_KEY);
		Games.tex_loader.remove(RED_KEY);
	}
}
