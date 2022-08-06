import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writting objects...");

		Person[] people = { new Person(1, "Sue"), new Person(8, "Mike"), new Person(33, "Bob") };

		ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

		// now try with resources autoclothes fs & os
		try (FileOutputStream fs = new FileOutputStream("people.bin");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			// ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(people);

			os.writeObject(peopleList);

			int size = peopleList.size();
			os.writeInt(size);

			for (Person person : peopleList) {
				os.writeObject(person);
			}

			//os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
