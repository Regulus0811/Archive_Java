public class TelevisionTest {
    public static void main(String[] args) {
        Television myTV = new Television();

        myTV.channel = 7;
        myTV.volume = 9;
        myTV.isON = true;
        myTV.print();

        Television yourTV = new Television();
        yourTV.channel = 9;
        yourTV.volume = 12;
        yourTV.isON = true;
        yourTV.print();
    }
}
