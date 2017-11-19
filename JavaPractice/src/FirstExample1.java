import java.util.ArrayList;
import java.util.List;

public class FirstExample1 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for(String item : items){
			if(item.contains("A"))
			System.out.println(item);
		}

	}

}

