package adapter.pattern;

public class HospitalForm {
	
	private String formData;
	
	public HospitalForm(String data) {
		// TODO Auto-generated constructor stub
		this.formData = data;
	}

	public void xmlString() {
		// TODO Auto-generated method stub
		System.out.println(formData+ " as XML");
	}

	public String getFormData() {
		return formData;
	}
}
