public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(20, 20, 4, new RedPen());
        Shape redSquare = new Square(20, 20, 4, new RedPen());

        redCircle.draw();
        redSquare.draw();

        Shape greenCircle = new Circle(4, 4, 2, new GreenPen());
        Shape greenSquare = new Square(4, 4, 2, new GreenPen());

        greenSquare.draw();
        greenCircle.draw();
    }
}
