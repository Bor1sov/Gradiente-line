package ui;

import canvas.CanvasPanel;
import canvas.DrawingCanvas;
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainWindow extends JFrame {
    

    public MainWindow(DrawingCanvas canvas) {
        super("DDA Line Drawing with Color Interpolation");
        
        if (canvas == null) {
            throw new IllegalArgumentException("Canvas cannot be null");
        }
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        

        CanvasPanel panel = new CanvasPanel(canvas);
        add(panel, BorderLayout.CENTER);
        

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }
}