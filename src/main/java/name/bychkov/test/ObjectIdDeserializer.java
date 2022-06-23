package name.bychkov.test;

import java.io.IOException;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class ObjectIdDeserializer extends JsonDeserializer<ObjectId>
{
	@Override
	public ObjectId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException
	{
		JsonNode oid = ((JsonNode) p.readValueAsTree()).get("$oid");
		return new ObjectId(oid.asText());
	}
}