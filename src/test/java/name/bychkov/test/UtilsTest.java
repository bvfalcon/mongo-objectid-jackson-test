package name.bychkov.test;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

class UtilsTest
{
	@Test
	void testConvertToDocument() throws JsonProcessingException
	{
		ObjectId id = new ObjectId();
		
		MongoEntity entity = new MongoEntity();
		entity.setId(id);
		
		Document document = Utils.convert(entity);
		
		Assertions.assertEquals(id, document.getObjectId("_id"));
	}
	
	@Test
	void testConvertFromDocument() throws JsonProcessingException
	{
		ObjectId id = new ObjectId();
		
		Document  document = new Document();
		document.put("_id", id);
		
		MongoEntity entity = Utils.convert(document);
		Assertions.assertEquals(id.toString(), entity.getId());
	}
}