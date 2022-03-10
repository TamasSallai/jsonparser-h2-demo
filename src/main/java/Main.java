import com.fasterxml.jackson.databind.ObjectMapper;
import model.Person;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new File("json/person.json"), Person.class);

        System.out.println(person);
    }
}
