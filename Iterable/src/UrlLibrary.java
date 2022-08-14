import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<>();
	
	private class UrlIterator implements Iterator<String> {
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			
			StringBuilder sb = new StringBuilder();
			
			try {
				URL url = new URL(urls.get(index));
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line = null;
				
				while( (line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
					//sb.append("kuku");
				}
				
				br.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			return sb.toString();
		}
		
		public void remove() {
			urls.remove(index);
		}
		
	}
	
	public UrlLibrary() {
		urls.add("https://www.google.com");
		urls.add("https://www.doodle.com");
		//urls.add("https://news.bbs.co.uk");
		//urls.add("https://uk.wikipedia.org/wiki/%D0%A8%D0%B2%D0%B8%D0%B4%D0%BA%D1%96%D1%81%D1%82%D1%8C_%D1%81%D0%B2%D1%96%D1%82%D0%BB%D0%B0");
	}

	/*@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}*/
	
	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}
}
