package org.mrlem.test.tiledmap.desktop;

import org.mrlem.test.tiledmap.TiledMapTestGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher
{
	public static void main (String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TiledMapTestGame(), config);
	}
}
