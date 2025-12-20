package ISP.avant_refactoring;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        System.out.println("l'on ne doit pas faire manger un robot");
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
    
}
