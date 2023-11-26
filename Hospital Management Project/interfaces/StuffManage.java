package interfaces;
import java.lang.*;
import hms.*;
import employee.*;



public interface StuffManage
{
	
  public void addReceiptionist(ReceiptionistStaff R);
  public void removeReceiptionist(ReceiptionistStaff R);
  public ReceiptionistStaff getReceiptionist(String name);
  public void showReceiptionists();
  
  public void addGuard(SecurityGuard G);
  public void removeGuard(SecurityGuard G);
  public SecurityGuard getSecurityGuard(String name);
  public void showSecurityGuards();
  
  public void addTechnicalStaff(TechnicalStaff T);
  public void removeTechnicalStaff(TechnicalStaff T);
  public TechnicalStaff getTechnicalStaff(String name);
  public void showTechnicalStaffs ();
  
  public void addAdministrativeStaff(AdministrativeStaff A);
  public void removeAdministrativeStaff(AdministrativeStaff A);
  public AdministrativeStaff getAdministrativeStaff(String name);
  public void showAdministrativeStaffs();
  
  public void addCleaner(Cleaner C);
  public void removeCleaner(Cleaner C);
  public Cleaner getCleaner(String name);
  public void showCleaners();
 
  public void addNurse(Nurse N);
  public void removeNurse(Nurse N);
  public Nurse getNurse(String name);
  public void showNurses();
  

}