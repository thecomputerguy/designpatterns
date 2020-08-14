public class Context {

    private ISort sortingStrategy;

    public Context(ISort sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] numbers) {
        sortingStrategy.sort(numbers);
    }

    public void setSortingStrategy(ISort sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

}