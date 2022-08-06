import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writting objects...");
		
		Person mike = new Person(452, "Mike");
		Person sue = new Person(471, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		// try with resources -- automatically closes fs nut not os
		try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(mike);
			os.writeObject(sue);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
