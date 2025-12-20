package ISP.avant_refactoring;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        robot.eat();
    }
}
