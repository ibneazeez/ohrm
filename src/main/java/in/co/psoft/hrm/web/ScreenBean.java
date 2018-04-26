package in.co.psoft.hrm.web;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.Screen;
import in.co.psoft.hrm.repo.ScreenRepo;


@RequestScopedComponent("screenBean")
@ManagedBean
public class ScreenBean {


	@Autowired
	private ScreenRepo screenRepo;

	@Autowired
	private ScreenDaoImplementation screenDAO;
	@Autowired
	private Screen screen;
	private List<Screen> screens;

	
	

	public List<Screen> getScreens() {
		if (screens == null) {
			screens = screenRepo.findAll();
		}

		return screens;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public String saveScreen(){
		screenDAO.save(screen);
        return "screenList";
	}

	
}
