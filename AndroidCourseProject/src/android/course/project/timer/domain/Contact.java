package android.course.project.timer.domain;

public class Contact {
	private String ID;
    private String name;
    private String phoneNumber;
    private boolean sms;
    private boolean email;
    private boolean phone;
    private boolean checked = false;

    public Contact() {

    }
    
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isSms() {
		return sms;
	}

	public void setSms(boolean sms) {
		this.sms = sms;
	}

	public boolean isEmail() {
		return email;
	}

	public void setEmail(boolean email) {
		this.email = email;
	}

	public boolean isPhone() {
		return phone;
	}

	public void setPhone(boolean phone) {
		this.phone = phone;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public boolean isChecked() {
		return checked;
	}

	public void toggleChecked() {
	      checked = !checked ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setChecked(boolean checked) {
	      this.checked = checked;
	    }

}
