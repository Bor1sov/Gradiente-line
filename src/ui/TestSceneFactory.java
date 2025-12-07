package ui;

import canvas.DrawingCanvas;
import geometry.ColoredPoint;
import java.awt.Color;

public final class TestSceneFactory {
    
    private TestSceneFactory() {
        throw new AssertionError("Cannot instantiate factory class");
    }
    

    public static void createTestScene(DrawingCanvas canvas) {
        if (canvas == null) {
            throw new IllegalArgumentException("Canvas cannot be null");
        }
        
        System.out.println("Creating test scene with DDA algorithm...");
        
        // 1. Основной градиент: красный -> синий
        System.out.println("Drawing line 1: RED -> BLUE");
        ColoredPoint p1 = new ColoredPoint(50, 50, Color.RED);
        ColoredPoint p2 = new ColoredPoint(200, 150, Color.BLUE);
        canvas.drawLine(p1, p2);
        
        // 2. Обратный градиент: зеленый -> желтый
        System.out.println("Drawing line 2: GREEN -> YELLOW");
        p1 = new ColoredPoint(200, 50, Color.GREEN);
        p2 = new ColoredPoint(50, 150, Color.YELLOW);
        canvas.drawLine(p1, p2);
        
        // 3. Градиент от черного к белому
        System.out.println("Drawing line 3: BLACK -> WHITE");
        p1 = new ColoredPoint(50, 200, Color.BLACK);
        p2 = new ColoredPoint(200, 200, Color.WHITE);
        canvas.drawLine(p1, p2);
        
        // 4. Вертикальная линия: голубой -> пурпурный
        System.out.println("Drawing line 4: CYAN -> MAGENTA (vertical)");
        p1 = new ColoredPoint(300, 50, Color.CYAN);
        p2 = new ColoredPoint(300, 200, Color.MAGENTA);
        canvas.drawLine(p1, p2);
        
        // 5. Горизонтальная линия: розовый -> оранжевый
        System.out.println("Drawing line 5: PINK -> ORANGE (horizontal)");
        p1 = new ColoredPoint(350, 100, Color.PINK);
        p2 = new ColoredPoint(450, 100, Color.ORANGE);
        canvas.drawLine(p1, p2);
        
        // 6. Пользовательские цвета
        System.out.println("Drawing line 6: Custom colors");
        Color customColor1 = new Color(100, 200, 50);   // Зеленоватый
        Color customColor2 = new Color(200, 50, 150);   // Пурпурный
        p1 = new ColoredPoint(250, 250, customColor1);
        p2 = new ColoredPoint(450, 300, customColor2);
        canvas.drawLine(p1, p2);
        
        // 7. Вырожденный случай: точка (нулевая длина)
        System.out.println("Drawing line 7: Point (degenerate case)");
        p1 = new ColoredPoint(400, 200, Color.RED);
        p2 = new ColoredPoint(400, 200, Color.BLUE);
        canvas.drawLine(p1, p2);
        
        // 8. Линия с отрицательным наклоном
        System.out.println("Drawing line 8: Negative slope");
        p1 = new ColoredPoint(100, 300, new Color(255, 100, 100)); // Светло-красный
        p2 = new ColoredPoint(300, 350, new Color(100, 100, 255)); // Светло-синий
        canvas.drawLine(p1, p2);
        
        System.out.println("Test scene completed successfully!");
    }
}