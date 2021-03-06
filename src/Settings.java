

import java.io.File;

public class Settings {
	public static String BASE_PATH = "";
	public static String EPISODES_PATH = "";
	public static String TILES_PATH = "";
	public static String SCENERY_PATH = "";
	public static String SPRITE_PATH = "/home/sapan/Documents/tools/godot/pekaakana/pekka-kana-2-1.2.4/data/sprites/";
	public static String MUSIC_PATH = "";
	public static String GFX_PATH = "";
	
	public static String DEFAULT_TILESET = "TILES01.bmp";
	public static String DEFAULT_BACKGROUND = "CASTLE.bmp";
	public static String DEFAULT_MUSIC = "song01.xm";

	public static boolean use14 = false;
	
	public static void setPaths() {
		EPISODES_PATH = BASE_PATH + File.separatorChar + "episodes" + File.separatorChar;
		TILES_PATH = BASE_PATH  + File.separatorChar + "gfx" + File.separatorChar + "tiles" + File.separatorChar;
		SCENERY_PATH = BASE_PATH + File.separatorChar + "gfx" + File.separatorChar + "scenery" + File.separatorChar;
		SPRITE_PATH = BASE_PATH + File.separatorChar + "sprites" + File.separatorChar;
		MUSIC_PATH = BASE_PATH + File.separatorChar + "music" + File.separatorChar;
		GFX_PATH = BASE_PATH + File.separatorChar + "gfx" + File.separatorChar;
	}
}
