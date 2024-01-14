import java.util.ArrayList;

public class MainContact {
    public static void main(String[] args) {
      ArrayList<Contact> contacts = new ArrayList<>();
      contacts.add(new Contact("Анатолий" ,"1234556"));
        contacts.add(new Contact("Василий" ,"8904556"));
        contacts.add(new Contact("Мария" ,"4324556"));
        contacts.add(new Contact("Татьяна" ,"3234556"));
        contacts.add(new Contact("Сергей" ,"1234556"));
        for (Contact contact : contacts){
            System.out.println(contact.info());
        }
    }
}
