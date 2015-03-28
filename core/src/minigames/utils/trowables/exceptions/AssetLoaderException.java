package minigames.utils.trowables.exceptions;

public class AssetLoaderException extends RuntimeException {
	private static final long serialVersionUID = 3870368068683147005L;
	
	public AssetLoaderException() {
		super("Generic AssetLoader Error");
	}
	
	public AssetLoaderException(String arg0) {
		super(arg0);
	}
	
	public AssetLoaderException(Throwable arg0) {
		super(arg0);
	}
	
	public AssetLoaderException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
	public AssetLoaderException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
}
