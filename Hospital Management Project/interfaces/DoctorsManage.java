package interfaces;
import hms.*;



public interface DoctorsManage
{
public void addPatientsInfo(PatientsInfo p);	
public void showPatientsInfo();
public void addDocsInfo(DoctorsInfo d);
public void insertDoc(DoctorsInfo d);
public void removeDoc(DoctorsInfo d);
public DoctorsInfo getDoc(String id);
public void showDocsInfo();

}