package lotem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HWLIST2 {
	public static void main(String[] args) {
	int x = 10; // תחילת התחום
    int y = 50; // סוף התחום

    // יצירת רשימה עם 20 מספרים אקראיים בתחום
    List<Integer> randomNumbers = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
        randomNumbers.add(random.nextInt(y - x + 1) + x);
    }

    System.out.println("רשימה של מספרים אקראיים:");
    System.out.println(randomNumbers);
}

}
