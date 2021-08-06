import swing.GenerateSwing;
import swing.generate_swing;

import javax.swing.JFrame;

class Runner {
    public static void main(String[] args) {
        final JFrame jFrame = generate_swing.giveFrame();
        GenerateSwing.edt();
        jFrame.requestFocus();
    }
}
