package Final;
import java.util.ArrayList;

/**
 * This class represents a schedule.
 */
public class Schedule
{
	private String[] classSchedule; // class schedule will contain 34 half hours from 5:00am to 9:30PM
	private ArrayList<Classroom> classes;
	private ArrayList<Groups> groups;
	
	/**
	 * Constructs a default schedule
	 */
	public Schedule()
	{
		classSchedule = new String[34];
		for(int i=0;i<classSchedule.length;i++)
		{
			classSchedule[i] = "";
		}
		classes = new ArrayList<Classroom>();
		groups = new ArrayList<Groups>();
	}
	
	/**
	 * Sets the scheduler with the list of classrooms.  
	 */
	public void setClassrooms(ArrayList<Classroom> classes)
	{
		this.classes = classes;
	}
	
	/**
	 * Sets the schedule to the passed information
	 * @param input schedule
	 */
	public void setSchedule(Groups group)
	{
		if(!classSchedule[group.getTimeBlock()].contains("Room Number: "+group.getRoomNum()))
		{
			classSchedule[group.getTimeBlock()] += group.toString() + "\r";
			groups.add(group);
		}
		else return;
	}
	
	/**
	 * Gets the schedule 
	 * @return the schedule
	 */
	public String getSchedule()
	{
		String output = "";
		for (int i=0; i< classSchedule.length; i++)
		{
			output += ("Time block #" + i + "\r");
			output += classSchedule[i] + "\r";
		}
		return output;
	}
}
