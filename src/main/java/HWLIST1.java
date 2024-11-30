package lotem1;

import java.util.List;

public class HWLIST1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> h = List.of(10, 15, 20, 10, 25, 30, 10, 40, 50, 10);
        int x = 10; // המספר שאותו מחפשים

        // חישוב מספר הפעמים שהמספר מופיע ברשימה
        long count = h.stream().filter(num -> num == x).count();

        System.out.println("המספר " + x + " מופיע " + count + " פעמים ברשימה.");
    }

	}


