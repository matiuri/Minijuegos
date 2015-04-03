package minigames.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Board {
	private Cell[][] cells;
	private int size = 3;
	private float x = 500, y = Gdx.graphics.getHeight() - 250;
	private boolean blueWins = false, redWins = false;
	
	public Board(Stage stage) {
		Input.setBlue(true);
		cells = new Cell[size][size];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				Cell temp = new Cell(x, y);
				temp.addListener(new Input(temp));
				stage.addActor(temp);
				cells[i][j] = temp;
				x += 70;
			}
			x = 500;
			y -= 70;
		}
	}
	
	public boolean blueCheck() {
		// TODO: improve this
		if (cells[0][0].getPiece() != null && cells[0][0].getPiece().isBlue()) {
			for (int i = 1; i < size; i++) {
				if (cells[0][i].getPiece() != null && cells[0][i].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
			
			for (int i = 1; i < size; i++) {
				if (cells[i][0].getPiece() != null && cells[i][0].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
			
			for (int i = 1; i < size; i++) {
				if (cells[i][i].getPiece() != null && cells[i][i].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
		}
		
		if (cells[0][1].getPiece() != null && cells[0][1].getPiece().isBlue()) {
			for (int i = 1; i < size; i++) {
				if (cells[i][1].getPiece() != null && cells[i][1].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
		}
		
		if (cells[0][2].getPiece() != null && cells[0][2].getPiece().isBlue()) {
			for (int i = 1; i < size; i++) {
				if (cells[i][2].getPiece() != null && cells[i][2].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
			
			for (int i = 1, j = 1; i < size; i++, j--) {
				if (cells[i][j].getPiece() != null && cells[i][j].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
		}
		
		if (cells[1][0].getPiece() != null && cells[1][0].getPiece().isBlue()) {
			for (int i = 1; i < size; i++) {
				if (cells[1][i].getPiece() != null && cells[1][i].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
		}
		
		if (cells[2][0].getPiece() != null && cells[2][0].getPiece().isBlue()) {
			for (int i = 1; i < size; i++) {
				if (cells[2][i].getPiece() != null && cells[2][i].getPiece().isBlue()) {
					blueWins = true;
				} else {
					blueWins = false;
					break;
				}
			}
			if (blueWins) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean redCheck() {
		// TODO: improve this
		if (cells[0][0].getPiece() != null && cells[0][0].getPiece().isRed()) {
			for (int i = 1; i < size; i++) {
				if (cells[0][i].getPiece() != null && cells[0][i].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
			
			for (int i = 1; i < size; i++) {
				if (cells[i][0].getPiece() != null && cells[i][0].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
			
			for (int i = 1; i < size; i++) {
				if (cells[i][i].getPiece() != null && cells[i][i].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
		}
		
		if (cells[0][1].getPiece() != null && cells[0][1].getPiece().isRed()) {
			for (int i = 1; i < size; i++) {
				if (cells[i][1].getPiece() != null && cells[i][1].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
		}
		
		if (cells[0][2].getPiece() != null && cells[0][2].getPiece().isRed()) {
			for (int i = 1; i < size; i++) {
				if (cells[i][2].getPiece() != null && cells[i][2].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
			
			for (int i = 1, j = 1; i < size; i++, j--) {
				if (cells[i][j].getPiece() != null && cells[i][j].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
		}
		
		if (cells[1][0].getPiece() != null && cells[1][0].getPiece().isRed()) {
			for (int i = 1; i < size; i++) {
				if (cells[1][i].getPiece() != null && cells[1][i].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
		}
		
		if (cells[2][0].getPiece() != null && cells[2][0].getPiece().isRed()) {
			for (int i = 1; i < size; i++) {
				if (cells[2][i].getPiece() != null && cells[2][i].getPiece().isRed()) {
					redWins = true;
				} else {
					redWins = false;
					break;
				}
			}
			if (redWins) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean allFullCheck() {
		for (Cell[] c1 : cells) {
			for (Cell c : c1) {
				if (c.getPiece() == null) {
					return false;
				}
			}
		}
		return true;
	}
}
