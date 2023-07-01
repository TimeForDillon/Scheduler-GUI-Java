package Final;
import java.util.ArrayList;

/**
 * This class represents a college building.
 */
public class Building
{
	private ArrayList<Classroom> classrooms;
	
	/**
	 * This constructs a default building object
	 */
	public Building()
	{
		this.classrooms = new ArrayList<Classroom>();
	}
	
	/**
	 * Adds a class to the building
	 */
	public void setClasses(Classroom newClassroom)
	{
		this.classrooms.add(newClassroom);
	}
	
	/**
	 * Returns a list of all classes within the building
	 * @return list of all classes within building
	 */
	public ArrayList<Classroom> getClasses()
	{
		return this.classrooms;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */
	public String toString()
	{
		return this.classrooms.toString();
	}
}
