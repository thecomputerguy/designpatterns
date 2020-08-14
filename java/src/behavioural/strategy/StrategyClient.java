public class StrategyClient {

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        fillNumbersArray(numbers);
        ISort mergeSortStrategy = new MergeSortStrategy();
        Context context = new Context(mergeSortStrategy);
        context.sort(numbers);
    }

    public static void fillNumbersArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.random();
        }

    }
}