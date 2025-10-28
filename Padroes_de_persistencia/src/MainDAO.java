import java.util.*;

public class MainDAO {
    public static void main(String[] args) {
        Map<String, String> db = new HashMap<>();

        db.put("Ana", "ana@email");
        db.put("Bruno", "bruno@email");

        System.out.println("db: " + db);               
        System.out.println("chaves: " + db.keySet()); 
        System.out.println("valores: " + db.values());

        List<String> listaDeEmails = new ArrayList<>(db.values());
        System.out.println("lista de emails: " + listaDeEmails);
    }
}
