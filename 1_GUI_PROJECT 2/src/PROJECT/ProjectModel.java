package PROJECT;

import java.util.ArrayList;
import java.util.List;

public class ProjectModel {
	private final ProjectController ctrl;
    private List<ProjectType> data;

    public ProjectModel(ProjectController projectController) {
        this.ctrl = projectController;
        this.data = new ArrayList<>();		//tworz� now� ArrayList�
    }

    public void addData(String str) {				//dodaj� do Listy elementy 
        data.add(new ProjectType(str));       
    }

    public List<ProjectType> getData() {			//pobieram zawarto�� listy
        return data;
    }
    
}
