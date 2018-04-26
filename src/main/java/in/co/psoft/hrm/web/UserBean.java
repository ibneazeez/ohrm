package in.co.psoft.hrm.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import javax.servlet.http.Part;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.User;
import in.co.psoft.hrm.repo.UserRepo;
import in.co.psoft.hrm.web.UserDaoImplementation;



@RequestScopedComponent("userBean")

@ManagedBean
public class UserBean {


	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserDaoImplementation userDAO;
	@Autowired
	private User user;
	private List<User> users;

	
	public User getUser() {
		return user;
		
	}

	public void setUser(User user) {
		
		this.user = user;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		if (users == null) {
			users = userRepo.findAll();
		}

		return users;
	}

	public String saveUser() throws IOException {
		String imgPath = this.uploadFile();
		user.setEmployeePhoto(imgPath);
		userDAO.save(user);
        return "userlist";
	}

	public String updateUser(User user) throws IOException {
		String imgPath = this.uploadFile();
		user.setEmployeePhoto(imgPath);

		System.out.println(user);
	userDAO.updateUser(user);
	return "userlist";
		}
	public String getUser(Long id) {
		user = userRepo.findById(id);	
		System.out.println(user);
		return "update"; 
	}
	@Transactional
	public String deleteUser(Long id) {
		//user=userRepo.findById(id);
		//System.out.println(user);
		userDAO.delete(id);
		addMessage("Success","User deleted successfully");
	return "userlist";
	}
	
	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	private Part file1;

	private String message;

	public Part getFile1() {
		return file1;
	}

	public void setFile1(Part file1) {
		this.file1 = file1;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String uploadFile() throws IOException {

		InputStream inputStream = null;
		OutputStream outputStream = null;
		FacesContext context = FacesContext.getCurrentInstance();

		ServletContext servletContext = (ServletContext) context.getExternalContext().getContext();

		String path = servletContext.getRealPath("");
		String fileName = null;
		boolean file1Success = false;

		if (file1.getSize() > 0) {
			fileName = Utils.getFileNameFromPart(file1);
			
			File f = new File(fileName);
			fileName = f.getName();

			/**
			 * destination where the file will be uploaded
			 */
					 
			File outputFile = new File(path+File.separator + "resources" + File.separator + "images" +File.separator+  fileName);
		 inputStream = file1.getInputStream();
			outputStream = new FileOutputStream(outputFile);
			byte[] buffer = new byte[Constants.BUFFER_SIZE];
			int bytesRead = 0;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
			if (outputStream != null) {
				outputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
			file1Success = true;
		}
		if (file1Success) {
			/**
			 * set the success message when the file upload is successful
			 */
			setMessage("File successfully uploaded to " + path);
			return "/resources/images/"+fileName;
			
		} else {
			/**
			 * set the error message when error occurs during the file upload
			 */
			setMessage("Error, select atleast one file!");
		}
		/**
		 * return to the same view
		 */
		return null;
	}

}
