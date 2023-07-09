import java.util.HashMap;
import java.util.Map;

public class First {

    public static void main(String[] args) {
        Map<String, String> db = new HashMap<>();
        String str = "Nikita";
        db.put("564654", "Nikita");
        db.put("45348", "Nikita");
        db.put("4538387", "Nikita");
        db.put("54789654", "Anton");
        db.put("654", "Panton");
        db.put("4122", "Igor");
        db.put("512", "Georgiy");
        db.put("123123", "Igor");
        db.put("7527256", "Mustafa");
        System.out.println(db);
        
        for (var string : db.entrySet()) {
            if (string.getValue().equals(str)) {
                System.out.println(string.getKey());
            }
        }
    }
}