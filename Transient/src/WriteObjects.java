import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writting objects...");

		
		//try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs);) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));) {	
		
			Person person = new Person(5, "Bob");
			Person.setCount(88);
			os.writeObject(person);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
