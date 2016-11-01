package graphic.view;

import javax.swing.JFrame;
import graphic.controller.FirstGUIController;
import java.awt.Dimension;

public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new FirstPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Hello, wuz good fam.");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
