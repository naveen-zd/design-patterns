package adapter.pattern;

public class InsuranceForm implements JsonData {
	private String formData;
	
	public InsuranceForm(String data) {
		// TODO Auto-generated constructor stub
		this.formData = data;
	}

	public void jsonString() {
		// TODO Auto-generated method stub
		System.out.println(formData+ " as JSON");
	}

}
