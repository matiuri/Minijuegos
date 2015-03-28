package minigames.utils.trowables.errors;

public class AssetLoaderError extends Error {
	private static final long serialVersionUID = 3870368068683147005L;
	
	public AssetLoaderError() {
		super("Generic AssetLoader Error");
	}
	
	public AssetLoaderError(String arg0) {
		super(arg0);
	}
	
	public AssetLoaderError(Throwable arg0) {
		super(arg0);
	}
	
	public AssetLoaderError(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
	public AssetLoaderError(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
}
