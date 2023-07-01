package Final;
/**
 * This represents a guestSpeaker
 */
public class GuestSpeakers extends Groups
{
	private static final int priority = 3;
	public String guestSpeakerName;
	
	/**
	 * constructs a guest speaker
	 */
	public GuestSpeakers()
	{
		super();
		this.guestSpeakerName = "No Guest Speaker";
	}
	
	/**
	 * This constructs a guestSpeaker object
	 * @param availableTime duration of meeting
	 * @param startTime start time
	 * @param roomNumber room number
	 * @param guestSpeakerName name of guestSpeaker.
	 */
	public GuestSpeakers(int availableTime, Time startTime, int roomNumber, String guestSpeakerName)
	{
		super(availableTime, startTime, roomNumber);
		this.guestSpeakerName = guestSpeakerName;
	}
	
	/**
	 * gets the priority
	 */
	public int getPriority()
	{
		return GuestSpeakers.priority;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		return (super.toString() + "\r" + "Guest Speaker Name: " + this.guestSpeakerName);
	}
}
