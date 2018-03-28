package engineTester;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;

public class MainGameLoop {
	
	// Create a display and then continuously updates the display untile the user tries to close it.
	public static void main(String[] args) {
		
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()) {
			// game logic
			// render geometry
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
	}

}
