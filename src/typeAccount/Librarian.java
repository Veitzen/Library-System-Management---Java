package typeAccount;

import java.util.ArrayList;
import java.beans.PropertyChangeEvent;
import resources.Resource;

public class Librarian extends Account {

	public Librarian(String username, String password, String name, String mailAdress) {
		super(username, password, name, mailAdress);
		// TODO Auto-generated constructor stub
	}
	
	// Methods - Features
	public void addResource(Resource newResource) {
		ArrayList<Resource> previousList = null;
		System.arraycopy(this.getLibrary().getResourceList(), 0, previousList, 0, this.getLibrary().getResourceList().size());
		this.getLibrary().getResourceList().add(newResource);
		this.getLibrary().getPcs().firePropertyChange(new PropertyChangeEvent(this.getLibrary().getResourceList(), "Add Resource to Library", previousList, this.getLibrary().getResourceList()));
	}
	
	public void removeResource(Resource deleteResource) {
		ArrayList<Resource> previousList = null;
		System.arraycopy(this.getLibrary().getResourceList(), 0, previousList, 0, this.getLibrary().getResourceList().size());
		this.getLibrary().getResourceList().remove(deleteResource);
		this.getLibrary().getPcs().firePropertyChange(new PropertyChangeEvent(this.getLibrary().getResourceList(), "Delete Resource to Library", previousList, this.getLibrary().getResourceList()));
	}
	
	public void updateResource(Resource previousResource, Resource updatedResource) {
		ArrayList<Resource> previousList = null;
		System.arraycopy(this.getLibrary().getResourceList(), 0, previousList, 0, this.getLibrary().getResourceList().size());
		for(int i=0; i<this.getLibrary().getResourceList().size(); i++) {
			if(this.getLibrary().getResourceList().get(i).getId()==updatedResource.getId()) {
				Resource selectedResource = this.getLibrary().getResourceList().get(i);
				selectedResource = updatedResource;
			}
		}
		this.getLibrary().getPcs().firePropertyChange(new PropertyChangeEvent(this.getLibrary().getResourceList(), "Update Resource to Library", previousList, this.getLibrary().getResourceList()));
	}
}
