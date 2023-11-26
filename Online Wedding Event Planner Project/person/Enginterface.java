package person;

public interface Enginterface
{
	public void addPlanner(PlannerClass obj);
	public PlannerClass getPlanner(String nam);
	public void removePlanner(PlannerClass obj);
	public void showPlanner();
	public void addUser(UserClass obj);
	public void addUserRecord(UserClass obj);
	public UserClass getUser(int id);
	public void removeUser(UserClass obj);
	public void showCurrentUser();
	public void showUserRecord();
	public void showOrderRecord();
}