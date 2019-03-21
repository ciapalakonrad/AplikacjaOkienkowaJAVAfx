package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProjectChildWindowView extends JFrame {
	private final ProjectController ctrl;
	public JTextField jTextField;
	public JTextArea jTextArea;  
	public JScrollPane jsp;
	public JPanel jPanel;
	
    public ProjectChildWindowView(ProjectController projectController) {
        this.ctrl = projectController;
        setVisible(false); 		
        //setPreferredSize(new Dimension(500, 500));
        setLayout(new FlowLayout());
        
        jPanel = new JPanel(); 
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        
        
        jTextField = new JTextField("DODAJ ELEMENT"); 
        jTextField.setPreferredSize(new Dimension(390, 30));;
        
        jTextArea = new JTextArea();  
        jTextArea.setEditable(false); 
        	
        jsp = new JScrollPane(jTextArea); 
        jsp.setPreferredSize(new Dimension(470, 500));
        
        JButton jbutton = new JButton("Add");
		jbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ctrl.onButtonClick2(e, ProjectChildWindowView.this);
				
			}
		});
		
		add(jsp);
		add(jPanel);
		
		add(jTextField);
        add(jbutton);
 
		pack();
		setSize(500, 600);
        
    }

	public void start() {
        setVisible(false);
    }
}
