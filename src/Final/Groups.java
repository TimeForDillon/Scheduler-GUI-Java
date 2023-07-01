package Final;
/**
 * This class represents a group
 */
public abstract class Groups 
{
	private int avaliabeTime;
	private Time startTime;
	private int roomNumber;
	
	/**
	 * This constructs a default group with default availability, start time and room number.
	 */
	public Groups()
	{
		this.avaliabeTime = 30; //default 30 min grouptime
		this.startTime = new Time(); //default 10am
		this.roomNumber = 0; // no room by default
	}
	
	/**
	 * This construct a group with the given information.
	 * @param avaliabeTime available time for given group
	 * @param startTime time group is starting work
	 * @param roomNumber room number of given group
	 */
	public Groups(int availableTime, Time startTime, int roomNumber)
	{
		this.avaliabeTime = availableTime;
		this.startTime = startTime;
		this.roomNumber = roomNumber;
	}
	
	/**
	 * This sets the available time for the gorup
	 * @param availableTime available time
	 * @param startTime start time
	 */
	public void setTimeAvaliable(int availableTime, Time startTime)
	{
		this.avaliabeTime = availableTime;
		this.startTime = startTime;
	}
	
	/**
	 * This returns the groups priority
	 * @return priority
	 */
	public abstract int getPriority();
	
	/**
	 * Sets the room number for the group
	 * @param roomNum room number
	 */
	public void setRoomNum(int roomNum)
	{
		this.roomNumber = roomNum;
	}
	
	/**
	 * Retrieves the room number 
	 * @return room number
	 */
	public int getRoomNum()
	{
		return this.roomNumber;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		return("Room Number: " + this.roomNumber +
				"\rStart Time: " + this.startTime.toString() +
				"\rDuration: " + this.avaliabeTime);
	}
	
	/**
	 * Returns a 1 of 34 time blocks 30 min time block depending on the time. 
	 */
	public int getTimeBlock()
	{
		return this.startTime.timeBlock(this.startTime);
	}
}
