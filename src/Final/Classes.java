package Final;
/**
 * This represents a class.
 */
public class Classes extends Groups
{
	private static final int priority = 1;
	private String className;

	/**
	 * This constructs a classes object
	 */
	public Classes()
	{
		super();
		this.className = "No Class";
	}
	
	/**
	 * This constructs a classes object
	 * @param availableTime duration of meeting
	 * @param startTime start time
	 * @param roomNumber room number
	 * @param className name of class
	 */
	public Classes(int availableTime, Time startTime, int roomNumber, String className)
	{
		super(availableTime, startTime, roomNumber);
		this.className = className;
	}
	
	/**
	 * retrieves the name of a class
	 * @return name of class
	 */
	public String getClassName()
	{
		return this.className;
	}
	
	
	/**
	 * retrieves the classes priority.
	 */
	public int getPriority()
	{
		return Classes.priority;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		return (super.toString() + "\r" + "Class Name: " + this.className);
	}
}
