package name.bychkov.test;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class MongoEntity
{
	@JsonProperty("_id")
	@JsonSerialize(using = ObjectIdSerializer.class)
	private String id;
	
	@JsonDeserialize(using = ObjectIdDeserializer.class)
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