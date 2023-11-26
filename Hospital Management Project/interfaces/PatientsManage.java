package interfaces;
import hms.*;

public interface PatientsManage
{
	public void addPatient(PatientsInfo p);
	public void removePatient(PatientsInfo p);
	public PatientsInfo getPatient(String name);
	public void showPatientsInfo();

}
