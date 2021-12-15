import swing.GenerateSwing;
import swing.generate_swing;

import javax.swing.*;

class Runner {
    public static void main(String[] args) {
        JFrame jFrame = generate_swing.giveFrame();
        GenerateSwing.edt();
        jFrame.requestFocus();
    }
}
