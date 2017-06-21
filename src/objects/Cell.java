package objects;

import java.awt.*;

/**
 * Created by Daniil on 21.06.2017.
 */
public class Cell extends Rectangle {

    public Color getColor() {
        return color;
    }

    private Color color;

    public Cell(double x, double y, double size, int color) {
        super(x, y, size, size);
        if(color == -1){
            this.color = Color.magenta;
        } else if (color % 2 == 0){
            this.color = Color.ORANGE;
        } else{
            this.color = Color.BLACK;
        }
    }
}
