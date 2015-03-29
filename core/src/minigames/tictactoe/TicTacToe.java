package minigames.tictactoe;

import minigames.Games;
import minigames.screens.ScreenAdapter;
import minigames.tictactoe.players.Player;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TicTacToe extends ScreenAdapter {
	public static final String BLUE_KEY = "blue", RED_KEY = "red";
	
	private Stage stage;
	private Player[][] cells;
	private int size = 3;
	
	public TicTacToe(Games game) {
		super(game);
		cells = new Player[size][size];
	}
	
	@Override
	public void show() {
		Games.tex_loader.load("Tic-Tac-Toe/blue.png", BLUE_KEY);
		Games.tex_loader.load("Tic-Tac-Toe/red.png", RED_KEY);
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				cells[i][j] = null;
			}
		}
		
		stage = new Stage(new ScreenViewport());
		
		cells[1][1] = new Player(true);
		cells[1][1].setPosition(100, 100);
		stage.addActor(cells[1][1]);
		
		cells[2][2] = new Player(false);
		cells[2][2].setPosition(200, 200);
		stage.addActor(cells[2][2]);
	}
	
	@Override
	public void render(float delta) {
		Games.clearScreen(Color.GRAY, 1);
		stage.act(delta);
		stage.draw();
	}
	
	@Override
	public void resize(int width, int height) {
		// TODO
	}
	
	@Override
	public void hide() {
		stage.dispose();
		Games.tex_loader.remove(BLUE_KEY);
		Games.tex_loader.remove(RED_KEY);
	}
}
