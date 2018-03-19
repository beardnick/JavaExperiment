package experimentone;


import java.applet.Applet;
import java.awt.Graphics;

/**
 * 画圆的applet
 * @author 程时坤
 */
public class DrawCircle extends Applet {

    /**
     * 用‘*’画出一个圆
     * @param g 一个Graphics对象
     */
    public void paint(Graphics g){
        for(double i = 0 ; i < 360 ; i += 10) {
            //先转换成弧度才能让圆均匀
            double radians = Math.toRadians(i);
            double x = Math.cos(radians) * 50 + 60;
            double y = Math.sin(radians) * 50 + 70;
            g.drawString("*" , (int) x , (int) y);
        }
    }
}
