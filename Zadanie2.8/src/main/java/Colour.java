public class Colour {
    public static void main(String[] args) {
        ColourEnum chosenColour = ColourEnum.B;

        switch (chosenColour) {
            case B:
                System.out.println("Blue");
                break;
            case G:
                System.out.println("Green");
                break;
            case Y:
                System.out.println("Yellow");
                break;
            case P:
                System.out.println("Pink");
                break;
        }
    }
}
