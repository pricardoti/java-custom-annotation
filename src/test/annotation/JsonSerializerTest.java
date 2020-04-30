import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonSerializerTest {

    @Test
    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        Person person = new Person("soufiane", "cheouati", "34");
        JsonSerializer.ObjectToJsonConverter serializer = new JsonSerializer.ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        assertEquals(
                "{\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\",\"age\":\"34\"}",
                jsonString);
    }
}
