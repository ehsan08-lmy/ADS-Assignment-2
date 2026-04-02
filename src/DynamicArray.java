import java.util.*;

class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.equals("add")) {
                arr.add(sc.nextInt());
            } else if (op.equals("remove")) {
                int index = sc.nextInt();
                if (index >= 0 && index < arr.size())
                    arr.remove(index);
            } else if (op.equals("get")) {
                int index = sc.nextInt();
                System.out.println(arr.get(index));
            }
        }
    }
}