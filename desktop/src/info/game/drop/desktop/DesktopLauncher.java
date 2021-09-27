package info.game.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import info.game.drop.GameScreen;
import info.game.drop.MyDrop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Drop";
		config.width=800;
		config.height=480;
		new LwjglApplication(new MyDrop(), config);
	}
}
