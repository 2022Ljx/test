package game2048;

import java.awt.Color;
import java.awt.Font;

public class Check {
    public int value;

    public Check() {
        clear();
    }

    public void clear() {
        value = 0;
    }

    public Color getForeground() {
        return switch (value) {
            case 0 -> new Color(0xcdc1b4);
            case 2, 4 -> Color.BLACK;
            default -> Color.WHITE;
        };
    }

    public Color getBackground() {
        return switch (value) {
            case 0 -> new Color(0xcdc1b4);
            case 2 -> new Color(0xeee4da);
            case 4 -> new Color(0xede0c8);
            case 8 -> new Color(0xf2b179);
            case 16 -> new Color(0xf59563);
            case 32 -> new Color(0xf67c5f);
            case 64 -> new Color(0xf65e3b);
            case 128 -> new Color(0xedcf72);
            case 256 -> new Color(0xedcc61);
            case 512 -> new Color(0xedc850);
            case 1024 -> new Color(0xedc53f);
            case 2048 -> new Color(0xedc22e);
            case 4096 -> new Color(0x65da92);
            case 8192 -> new Color(0x5abc65);
            default -> new Color(0x248c51);
        };
    }
    public Font getCheckFont() {
        if (value < 10) {
            return IBaseData.font1;
        }
        if (value < 100) {
            return IBaseData.font2;
        }
        if (value < 1000) {
            return IBaseData.font3;
        }
        if (value < 10000) {
            return IBaseData.font4;
        }

        return IBaseData.font5;
    }

}