import canvas.DrawingCanvas;
import drawing.algorithms.DDALineDrawer;
import drawing.algorithms.LineDrawer;
import javax.swing.SwingUtilities;
import ui.MainWindow;
import ui.TestSceneFactory;


public class MainApp {
    
    public static void main(String[] args) {
        System.out.println("Starting DDA Line Drawing Application...");
        
        LineDrawer lineDrawer = new DDALineDrawer();
        
        DrawingCanvas canvas = new DrawingCanvas(500, 400, lineDrawer);
        
        TestSceneFactory.createTestScene(canvas);
        
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(canvas);
            window.setVisible(true);
            System.out.println("Application window created and displayed.");
        });
        
        System.out.println("Application started successfully!");
    }
}