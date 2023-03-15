import java.util.HashSet;

// 6. დაწერეთ საკუთარი მონაცემთა სტრუქტურა,
// რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ ელემენტი.
public class constantTimeDeletion {
        public static void main(String[] args) {
            // სეტის შექმნა
            HashSet<Integer> set = new HashSet<>();

            // ელემენტების დამატება
            set.add(16);
            set.add(33);
            set.add(45);

            // ელემენტების დაპრინტვა წაშლამდე
            System.out.println("სეტი წაშლამდე: " + set);

            // ელემენტების წაშლა
            int elementToDelete = 33;
            set.remove(elementToDelete);

            // დაპრინტვა წაშლის შემდეგ
            System.out.println("სეტი წაშლის შემდეგ: " + set);
        }
    }

