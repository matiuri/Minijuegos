package minigames.utils.assets;

import java.util.ArrayList;
import java.util.HashMap;

import minigames.utils.trowables.errors.AssetLoaderError;
import minigames.utils.trowables.exceptions.AssetLoaderException;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.utils.Disposable;

public class AssetLoader<T extends Disposable> implements Disposable {
	private final Class<T> CLASS;
	
	private boolean disposed = false;
	
	private AssetManager manager;
	private HashMap<String, T> map;
	private int max;
	private ArrayList<String> keys;
	
	public AssetLoader(Class<T> c) {
		this(20, c);
	}
	
	public AssetLoader(int max, Class<T> c) {
		CLASS = c;
		this.max = max;
		
		manager = new AssetManager();
		map = new HashMap<>(max);
		keys = new ArrayList<>();
	}
	
	public void load(String path, String key) {
		if (disposed)
			throw new AssetLoaderError("The AssetLoader has been disposed");
		if (keys.size() < max) {
			manager.load(path, CLASS);
			manager.finishLoading();
			if (keys.size() == 0) {
				map.put(key, manager.get(path, CLASS));
				keys.add(key);
			} else {
				for (String s : keys) {
					if (s.equals(key)) {
						throw new AssetLoaderException("The field " + key + " already exists");
					}
				}
				map.put(key, manager.get(path, CLASS));
				keys.add(key);
			}
		} else {
			throw new AssetLoaderException("The AssetLoader is full");
		}
	}
	
	public T get(String key) {
		if (disposed)
			throw new AssetLoaderError("The AssetLoader has been disposed");
		if (keys.size() == 0) {
			throw new AssetLoaderException("The AssetLoader is empty");
		} else {
			boolean get = false;
			for (String s : keys) {
				if (s.equals(key)) {
					get = true;
					break;
				}
			}
			if (get) {
				return map.get(key);
			} else {
				throw new AssetLoaderException("The field " + key + " doesn't exist");
			}
		}
	}
	
	public void remove(String key) {
		if (disposed)
			throw new AssetLoaderError("The AssetLoader has been disposed");
		if (keys.size() == 0) {
			throw new AssetLoaderException("The AssetLoader is empty");
		} else {
			boolean remove = false;
			for (String s : keys) {
				if (s.equals(key)) {
					remove = true;
					break;
				}
			}
			if (remove) {
				map.get(key).dispose();
				map.remove(key);
			} else {
				throw new AssetLoaderException("The field " + key + " doesn't exist");
			}
		}
	}
	
	public void clear() {
		if (disposed)
			throw new AssetLoaderError("The AssetLoader has been disposed");
		map.clear();
		manager.clear();
	}
	
	@Override
	public void dispose() {
		if (disposed)
			throw new AssetLoaderError("The AssetLoader has been disposed");
		clear();
		manager.dispose();
		disposed = true;
	}
}
