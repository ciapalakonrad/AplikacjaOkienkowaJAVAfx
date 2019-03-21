package PROJECT;

import java.util.List;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ProjectController {
	private ProjectModel projectModel;
	private ProjectMainWindowView projectMainWindowView;
    private List<ProjectChildWindowView> openedWindows = new ArrayList<ProjectChildWindowView>(); 
    
    public ProjectController() {
    	projectModel = new ProjectModel(this);
    	projectMainWindowView = new ProjectMainWindowView(this);  
    }
 
  

	public void onButtonClick1(ActionEvent e) {
		
		ProjectChildWindowView newWindow = new ProjectChildWindowView(this);
		newWindow.setVisible(true);
		openedWindows.add(newWindow); 		//dodajê okna do listy okien 
		
	
	}
	public void onButtonClick2(ActionEvent e, ProjectChildWindowView windowWithButtonClicked) {
		
		String str = windowWithButtonClicked.jTextField.getText();
		//System.out.println(str);
		if (str.equals("")) return;
		
		
		String fullText = "";
		
		projectModel.addData(str);		//dodajê do modelu tekst wprowadzony w jTextField
		
		for(ProjectType takeData : projectModel.getData()) {		//zapêtlam pobieranie danych z modelu 
			fullText = fullText + "\n" + takeData.getMessage();		//z pobranych pobieram Message i zapisuje to w Stringu 
		}
		
		for(ProjectChildWindowView loop : openedWindows) {		//przejscie przez Listê otwartych okien 
			loop.jTextArea.setText(fullText);					//ustawiam tekst(w JtextArea) we Wszystkich otwartych oknach 
			
		}
		
		
	}
}
