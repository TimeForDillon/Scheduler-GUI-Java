package Final;
/**
 * This class represents a classroom.
 */
public class Classroom
{
	private static final int MAX_SIZE = 30;
	private static int RUNNING_ROOM_NUMBER = 1;
	private int roomNumber;
	private int size;
	private String amenities;
	private boolean comfySeats;
	private String description;
	
	/**
	 * This constructs a defualt classroom with size of 30 and with no amenities or comfy seats.
	 */
	public Classroom()
	{
		this.size = 30;
		this.amenities = "Whiteboard, Projector, Television";
		this.comfySeats = false;
		this.roomNumber = Classroom.RUNNING_ROOM_NUMBER;
		Classroom.RUNNING_ROOM_NUMBER++;
	}
	
	/**
	 * This constructs a classroom with given size, amenities and comfy seats.
	 */
	public Classroom(int size, String amenities, boolean comfySeats, int roomNumber)
	{
		if(size>MAX_SIZE)
		{
			this.size = MAX_SIZE;
		}
		else this.size = size;
		this.amenities = amenities;
		this.comfySeats = comfySeats;
		this.roomNumber = roomNumber;
	}
	
	/**
	 * sets the size of the classroom
	 * @param size size of classroom
	 */
	public void setSize(int size)
	{
		this.size = size;
	}
	
	/**
	 * gets the size of the classroom
	 * @return size of the classroom
	 */
	public int getSize()
	{
		return this.size;
	}
	
	/**
	 * sets the amenities of the classroom
	 * @param amenities of the classroom
	 */
	public void setAmenities(String amenities)
	{
		this.amenities = amenities;
	}
	
	/**
	 * gets the amenities of the classroom
	 * @return the amenities of the classroom
	 */
	public String getAmenities()
	{
		return this.amenities;
	}
	
	/**
	 * sets the comfortable seats
	 * @param the comfortable seats
	 */
	public void setComfortableSeats(boolean comfySeats)
	{
		this.comfySeats = comfySeats;
	}
	
	/**
	 * returns the comfy seats
	 * @return true for comfy seats
	 */
	public boolean getComfortableSeats()
	{
		return this.comfySeats;
	}
	
	/**
	 * Sets the room number to the given number
	 * @param num the room number 
	 */
	public void setRoomNum(int num)
	{
		this.roomNumber = num;
	}
	
	/**
	 * Gets the room number
	 * @return the room number
	 */
	public int getRoomNum()
	{
		return this.roomNumber;
	}
	
	/**
	 * Sets the description of the classroom
	 * @param description of the classroom
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * Gets the description of the classroom
	 * @return the description of classroom
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		String answer;
		if(this.comfySeats) answer = "Yes";
		else answer = "No";
		return ("Room Number: " + this.roomNumber + "\r" +
				"Room size: " + this.size + "\r" +
				"Amenities: " + this.amenities + "\r" +
				"Comfy Chairs: " + answer + "\r");
	}
}
