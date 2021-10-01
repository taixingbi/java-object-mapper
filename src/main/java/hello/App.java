package hello;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("----------app----------");
        json2Object();

        System.out.println("----------app end----------");
    }

    static void object2Json() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1, "hunter", "hunter@gmail.com");
        objectMapper.writeValue(new File("user.json"), user);
    }

    static void json2Object() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"id\":1,\"name\":\"hunter\",\"email\":\"hunter@gmail.com\"}";
//        User user = objectMapper.readValue(json, User.class);
//        System.out.println(user.toString());
    }
}
