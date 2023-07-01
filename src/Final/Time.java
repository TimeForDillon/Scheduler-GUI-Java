package Final;

/**
 * This class represents the time in the 24H format
 */
public class Time
{
	private int hour;
	private int minute;
	
	/**
	 * Construct a default time
	 */
	public Time()
	{
		this.hour = 17;
		this.minute = 00;
	}
	
	public Time(int hour)
	{
		this.hour = hour;
		this.minute = 00;
	}
	
	/**
	 * Constructs the time to the set hour and minute.
	 * @param hour hour
	 * @param minute minute
	 */
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	/**
	 * Returns the object data in string form. 
	 */
	public String toString()
	{
		return this.hour + ":" + String.format("%02d",this.minute);
	}
	
	/**
	 * Sets the minute in the time.
	 * @param minute Minute
	 */
	public void setMin(int minute)
	{
		this.minute = minute;
	}
	
	/**
	 * Gets the minute in the time.
	 * @return the minute in the time.
	 */
	public int getMin()
	{
		return this.minute;
	}
	
	/**
	 * Sets the hour in the time
	 * @param hour hour
	 */
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	/**
	 * Gets the hour in the time
	 * @return the hour in the time.
	 */
	public int getHour()
	{
		return this.hour;
	}
	
	/**
	 * gets the time block
	 * @param thisTime time
	 * @return time block
	 */
	public int timeBlock(Time thisTime)
	{
		if(thisTime.getHour() >= 5 && thisTime.getHour() < 22)
		{
			if(thisTime.getHour() == 5 && thisTime.getMin() == 0) return 100;
			if(thisTime.getMin() >= 0 && thisTime.getMin() < 30)
			{
				return (thisTime.getHour() - 5) * 2;
			}
			if(thisTime.getMin() >= 30 && thisTime.getMin() < 60)
			{
				return (thisTime.getHour() - 5) * 2 + 1;
			}
			else return 100;
		}
		else return 100;
	}
}
