package JackSon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //序列化
        Object Target = new User("小白",12);
        String Result = mapper.writeValueAsString(Target);
        System.out.println(Result);

        //反序列化


    }
}
