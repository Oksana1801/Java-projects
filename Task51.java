package work51;

public class Task51 {
    public static void main(String[] args) {
        String text = ">>>>>>>>>>hjkjgvbnmnbv"+
                ">>>>>>>>>>>>>>>>> ghjnb nbhgytrc njhgf"+
                ">>>>>>>>>>>>>>>>> njhyujhvgf nmkjh897";

        int size = text.length() / 2;
        String subText = text.substring(size);
        System.out.println(subText);
    }
}
