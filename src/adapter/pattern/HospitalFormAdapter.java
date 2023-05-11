package adapter.pattern;

public class HospitalFormAdapter implements JsonData{
	
	private HospitalForm hospitalForm;
	
	public HospitalFormAdapter(HospitalForm hospitalForm) {
		// TODO Auto-generated constructor stub
		this.hospitalForm = hospitalForm;
	}

	@Override
	public void jsonString() {
		// TODO Auto-generated method stub
		System.out.println(hospitalForm.getFormData()+" converted from XML to JSON");
		
	}
	
	

}
