package adapter.pattern;

public class InsuranceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalForm hform = new HospitalForm("Patient record");		  
		JsonData iform = new InsuranceForm("Patient Record");
		JsonData hospitalForm = new HospitalFormAdapter(hform);
		
		iform.jsonString();
		hospitalForm.jsonString();
		

	}

}
