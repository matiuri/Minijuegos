package minigames.screens;

import minigames.Games;
import minigames.utils.fonts.Font;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TitleScreen extends ScreenAdapter {
	private Stage stage;
	private Table table;
	private TextButton exit;
	
	public TitleScreen(Games game) {
		super(game);
	}
	
	@Override
	public void show() {
		stage = new Stage(new ScreenViewport());
		stage.addActor(table = new Table());
		table.setFillParent(true);
		table.add(new Label(Games.TITLE, new LabelStyle(Font.arial(72), Color.YELLOW))).colspan(2).center().row();
		table.add(new Label(Games.VENDOR, new LabelStyle(Font.arial(36), Color.BLUE))).colspan(2).center().row();
		table.add(new Label(Games.VERSION, new LabelStyle(Font.arial(24), Color.WHITE))).center();
		table.add(exit = new TextButton("Exit", new TextButtonStyle(null, null, null, Font.arial(36)))).center();
		exit.setColor(Color.RED);
		
		exit.addCaptureListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				Gdx.app.exit();
			}
		});
		Gdx.input.setInputProcessor(stage);
	}
	
	@Override
	public void render(float delta) {
		Games.clearScreen(Color.TEAL, 1);
		stage.act(delta);
		stage.draw();
	}
	
	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height);
	}
	
	@Override
	public void hide() {
		stage.dispose();
	}
}
