package swing;

import java.awt.Frame;

public class GenerateSwing {
    public static void edt() {
        final Frame frame = new Frame("Hello, Groovy!");

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
