package minigames.utils.fonts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.utils.Disposable;

public class FontLoader implements Disposable {
	// Fonts
	public static final BitmapFont STENCIL_36, SEASIDE_RESORT_NF_36, ARIAL_36;
	
	static {
		FreeTypeFontParameter par = new FreeTypeFontParameter();
		par.size = 36;
		
		FontLoader fl = new FontLoader("Fonts/Stencil.ttf", par);
		STENCIL_36 = fl.getFont();
		
		fl = new FontLoader("Fonts/SeasideResortNF.ttf", par);
		SEASIDE_RESORT_NF_36 = fl.getFont();
		
		fl = new FontLoader("Fonts/Arial.ttf", par);
		ARIAL_36 = fl.getFont();
	}
	
	private BitmapFont font;
	
	public FontLoader(String path, FreeTypeFontParameter parameter) {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(path));
		font = generator.generateFont(parameter);
		generator.dispose();
	}
	
	public BitmapFont getFont() {
		return font;
	}
	
	@Override
	public void dispose() {
		font.dispose();
	}
}
