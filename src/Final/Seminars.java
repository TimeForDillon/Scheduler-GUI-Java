package Final;
/**
 * This represents a seminar
 */
public class Seminars extends Groups
{
	public static final int priority = 2;
	public String seminarName;
	
	/**
	 * Constructs a default seminar
	 */
	public Seminars()
	{
		super();
		this.seminarName = "No Seminar";
	}
	
	/**
	 * This constructs a seminar object
	 * @param availableTime duration of meeting
	 * @param startTime start time
	 * @param roomNumber room number
	 * @param seminarName name of seminar
	 */
	public Seminars(int availableTime, Time startTime, int roomNumber, String seminarName)
	{
		super(availableTime, startTime, roomNumber);
		this.seminarName = seminarName;
	}
	
	/**
	 * Returns the priority
	 */
	public int getPriority()
	{
		return Seminars.priority;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		return (super.toString() + "\r" + "Seminar Name: " + this.seminarName);
	}
}
