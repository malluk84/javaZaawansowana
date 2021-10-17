package rozneklasy;

public class AnonymousClassShowcase {

    public static void main(String[] args) {
        someMethod();
    }

    public static void someMethod() {

        Soundy bird = new Soundy() {
            @Override
            public void playSound() {
                System.out.println("Tweet, tweet!");
            }
        };

        bird.playSound();
    }
}
