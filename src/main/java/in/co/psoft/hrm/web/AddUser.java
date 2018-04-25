package in.co.psoft.hrm.web;


import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;



import in.co.psoft.hrm.bone.spring.RequestScopedComponent;

@RequestScopedComponent("addUser")
@ManagedBean
public class AddUser {
	
	private String uname;
	private String fname;
	private String lname;
	private String mname;
	private String sname;
	private String role;
	private Map<String,String> roles;
	private String status;
	private Map<String,String> status1;
	private String maritalstatus;
	private Map<String,String> maritalstatus1;
	private String nationality;
	private Map<String,String>nationalities;
    private String description;
    private Integer integer;
    private String gender;
   	private Double pnumber;
	private String password;
    private String regexText;
    private Date date;
    
    @PostConstruct
  public void init() {
        roles  = new HashMap<String, String>();
        roles.put("Admin", "Admin");
        roles.put("User", "User");
        
        status1 = new HashMap<String, String>();
        status1.put("Active", "Active");
        status1.put("InActive", "InActive");
        
        maritalstatus1 = new HashMap<String, String>();
        maritalstatus1.put("Single", "Single");
        maritalstatus1.put("Married", "Married");
        
        nationalities = new HashMap<String, String>();
        
        nationalities.put("Afghanistan", "Afghanistan");
        nationalities.put("Bahrain", "Bahrain");
        nationalities.put("Cambodia", "Cambodia	");
        nationalities.put("Denmark", "Denmark");
        nationalities.put("Egypt", "Egypt");
        nationalities.put("Finland", "Finland");
        nationalities.put("Georgia", "Georgia");
        nationalities.put("India", "India");
        nationalities.put("Korea", "Korea");
        nationalities.put("Zimbabwe ", "Zimbabwe");
             }
     
    public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return mname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
 
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Integer getInteger() {
        return integer;
    }
    public void setInteger(Integer integer) {
        this.integer = integer;
    }
 
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public Double getPnumber() {
        return pnumber;
    }
    public void setPnumber(Double pnumber) {
        this.pnumber = pnumber;
    }
 
    public String getRegexText() {
        return regexText;
    }
    public void setRegexText(String regexText) {
        this.regexText = regexText;
    }
 
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
  /*  public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }


*/

    public Map<String, String> getRoles() {
		return roles;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Map<String, String> getStatus1() {
		return status1;
	}

	public void setStatus1(Map<String, String> status1) {
		this.status1 = status1;
	}

	public void setRoles(Map<String, String> roles) {
		this.roles = roles;
	}

	
	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public Map<String, String> getMaritalstatus1() {
		return maritalstatus1;
	}

	public void setMaritalstatus1(Map<String, String> maritalstatus1) {
		this.maritalstatus1 = maritalstatus1;
	}

	
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Map<String, String> getNationalities() {
		return nationalities;
	}

	public void setNationalities(Map<String, String> nationalities) {
		this.nationalities = nationalities;
	}

	public void handleFileUpload(FileUploadEvent event) {
	        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }


    
}
