import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomExample {

	private Random random = new Random();
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Pepperoni");
		list.add("Mushroom");
		list.add("Cheese");
		list.add("Sausage");
		list.add("Onion");
	    list.add("Black olives");
	    list.add("Green pepper");
		list.add("Fresh garlic");
		list.add("Fresh basil");
		list.add("Pineapple");
		

		RandomExample obj = new RandomExample();
		for(int i = 0; i <= 50; i++){
			System.out.println(i + ": " + obj.getRandomList(list)+" + " + obj.getRandomList(list)+ " + " +obj.getRandomList(list)+ " + Tomato Sauce");
						
		}
		
	}

	public String getRandomList(List<String> list) {

	    //0-4
	    int index = random.nextInt(list.size());
	    return list.get(index);
	    
	}
	
}