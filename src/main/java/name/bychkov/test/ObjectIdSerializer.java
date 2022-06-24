package name.bychkov.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class ObjectIdSerializer extends JsonSerializer<String>
{
	@Override
	public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException
	{
		jgen.writeTree(JsonNodeFactory.instance.objectNode().put("$oid", value));
	}
}