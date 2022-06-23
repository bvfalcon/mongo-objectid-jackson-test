package name.bychkov.test;

import org.bson.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils
{
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	private Utils()
	{
	}
	
	public static MongoEntity convert(Document document) throws JsonProcessingException
	{
		String json = document.toJson();
		MongoEntity object = objectMapper.readValue(json, MongoEntity.class);
		return object;
	}
	
	public static Document convert(MongoEntity entity) throws JsonProcessingException
	{
		String json = objectMapper.writeValueAsString(entity);
		Document document = Document.parse(json);
		return document;
	}
}
