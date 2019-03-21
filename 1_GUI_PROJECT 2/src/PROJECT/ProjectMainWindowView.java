package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProjectMainWindowView extends JFrame {
	private final ProjectController ctrl;
	
	public ProjectMainWindowView(ProjectController projectController) {
        this.ctrl = projectController;
        setVisible(true); 
        setTitle("Start Window");
        setSize(300, 200);		
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel jPanel = new JPanel(); 
        
        JLabel jLabel1= new JLabel("Hello in my GUI application"); 
        
        JButton jbutton = new JButton("Open Window");
		jbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ctrl.onButtonClick1(e);								
			}
		});
		jPanel.add(jLabel1); 
		jPanel.add(jbutton);
		jbutton.setPreferredSize(new Dimension(130, 20));
		
		add(jPanel); 
    }

	public void start() {
        setVisible(true);
    }

	public void showData(List<ProjectType> data) {
	}
}
