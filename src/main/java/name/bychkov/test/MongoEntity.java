package name.bychkov.test;

import org.bson.types.ObjectId;

public class MongoEntity
{
	private String id;
	
	public void setId(ObjectId id)
	{
		this.id = id != null ? id.toString() : null;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	
	/* other fields, get/set-ters, toString, hashcode, equals */
}