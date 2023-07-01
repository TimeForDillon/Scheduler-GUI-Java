package Final;
/**
 * This represents a club class
 */
public class Clubs extends Groups
{
	private static final int priority = 4;
	private String clubName;
	
	/**
	 * Constructs a default clubs 
	 */
	public Clubs()
	{
		super();
		this.clubName = "No Club";
	}
	
	/**
	 * This constructs a club object
	 * @param availableTime duration of meeting
	 * @param startTime start time
	 * @param roomNumber room number
	 * @param clubName name of club
	 */
	public Clubs(int availableTime, Time startTime, int roomNumber, String clubName)
	{
		super(availableTime, startTime, roomNumber);
		this.clubName = clubName;
	}
	
	/**
	 * retrieves the priority
	 */
	public int getPriority()
	{
		return Clubs.priority;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		return (super.toString() + "\r" + "Club Name: " + this.clubName);
	}
}
