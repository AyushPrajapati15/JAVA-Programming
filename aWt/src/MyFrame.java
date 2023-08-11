import java.awt.*;
public class MyFrame extends Frame
{
    public MyFrame(){
//        this.setVisible(true);
//        this.setSize(400,400);
        this.setTitle("My Frame");
//        create color
//        Color c=new Color(255,54,74);
        Color c=Color.yellow;
        this.setBackground(c);
//    }
//    public void paint(Graphics g){
//        g.drawString("Ayush",50,80);
//        g.drawRect(50,80,80,40);
//        g.drawArc(150,80,45,45,0,360);
//        g.fillRect(200,80,80,40);
//        g.drawOval(150,200,80,50);
//        g.drawLine(250,150,150,350);
//    }
        Label l1=new Label("User Name");
        Label l2=new Label("Password");
        l1.setBounds(50,100,100,30);
        l2.setBounds(50,150,100,30);
        this.add(l1);
        this.add(l2);
        this.setSize(500,500);
        this.setVisible(true);

    }


    public static void main(String[] args) {
        MyFrame f=new MyFrame();

    }

}
