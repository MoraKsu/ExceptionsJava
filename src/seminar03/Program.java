package seminar03;

import seminar03.controllers.AppController;
import seminar03.views.AppView;

public class Program {
    public static void main(String[] args) {
        AppView view = new AppView();
        AppController controller = new AppController(view);
        controller.start();
    }
}
