package name.bychkov.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ObjectIdSerializer extends JsonSerializer<String>
{
	@Override
	public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException
	{
		if (value != null)
		{
			jgen.writeRaw(": {\"$oid\": \"" + value + "\"}");
		}
	}
}