package experimentone;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * 第一次Java实验的主类，包含main函数，是所有实验的入口
 * @author 程时坤
 */


public class ExperimentOneMain {

    /**
     * 利用DrawCircle类的paint方法来画出一个圆
     * @return 画完圆之后的一个DrawCircle的引用
     */
    public DrawCircle drawCircle(){
        DrawCircle drawCircle = new DrawCircle();
        drawCircle.paint(new MyGraphics());
        return drawCircle;
    }

    /**
     * 利用HelloWorld类的paint方法来显示出hello world
     * @return 显示hello world之后返回一个HelloWorld的引用
     */

    public HelloWorld printHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.paint(new MyGraphics());
        return helloWorld;
    }

    /**
     * 实验一的入口。通过调用不同的函数来显示不同的实验结果
     * 直接看applet程序的效果不太方便
     * 查文档知applet继承自Panel，所以可以将applet加入到Frame里面
     * @param args 命令行参数，一般不用
     */
    public static void main(String[] args) {
        ExperimentOneMain experimentOneMain = new ExperimentOneMain();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(experimentOneMain.printHelloWorld());
//        frame.add(experimentOneMain.drawCircle());
        frame.setSize(new Dimension(500 , 500));
        frame.show();
    }
}
