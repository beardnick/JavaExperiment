package experimentone;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 显示hello world 的applet
 * @author 程时坤
 */
public class HelloWorld extends Applet {

    /**
     * 显示hello world
     * @param g 一个Graphics对象
     */
    public void paint(Graphics g){
        g.drawString("Hello World !" , 25 , 25);
    }

}
