import io.smacs.simuduck.Duck;
import io.smacs.simuduck.MallardDuck;
import io.smacs.simuduck.ModelDuck;
import io.smacs.simuduck.RocketPoweredFly;

public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new RocketPoweredFly());
        model.performFly();
    }
}