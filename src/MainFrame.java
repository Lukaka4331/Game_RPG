import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame extends JFrame{
    private int ScreenW = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int ScreenH = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int frmW = 1000,frmH = 1000,personX = 500,personY = 820;
    private ImageIcon personStandup =new ImageIcon("Image/personStandup.png");
    private ImageIcon personStandupWalk =new ImageIcon("Image/personStandupWalk.png");
    private ImageIcon personRight =new ImageIcon("Image/personRight.png");
    private ImageIcon personRightRun =new ImageIcon("Image/personRightRun.png");
    private ImageIcon personLeft =new ImageIcon("Image/personLeft.png");
    private ImageIcon personLeftRun =new ImageIcon("Image/personLeftRun.png");
    private ImageIcon personStandupTurn =new ImageIcon("Image/personStandupTurn.png");
    private ImageIcon personStandupWalkTurn =new ImageIcon("Image/personStandupWalkTurn.png");

    private  Image imageData[]=new Image[4];

    private JLabel jlabperson=new JLabel(personStandup);
    private ImageIcon ball =new ImageIcon("Image/test3.png");
    private JLabel jlabBall=new JLabel(ball);
    private Timer t1;



    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setTitle("Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(ScreenW/2-frmW/2,ScreenH/2-frmH/2,frmW,frmH);
        this.setLayout(null);
        this.add(jlabperson);
        this.add(jlabBall);
        Container cp ;
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        jlabperson.setBounds(personX,personY,80,80);
        jlabperson.setOpaque(true);
        jlabperson.setBackground(new Color(200, 0, 0));
        cp.setBackground(new Color(200, 0, 0));

        t1=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
//                switch (e.getKeyCode()){
//                    case KeyEvent.VK_Q:
//                        jlabBall.setOpaque(true);
//                        jlabBall.setBackground(new Color(200,0,0));
//                        jlabBall.setBounds(personX+5,personY+5,50,50);
//                        jlabBall.setIcon(ball);
//
//                }


            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_RIGHT:
                        personX+=10;
                        jlabperson.setIcon(personRightRun);
                        jlabperson.setLocation(personX,personY);
                        break;



                    case KeyEvent.VK_LEFT:
                        personX-=10;
                        jlabperson.setIcon(personLeftRun);
                        jlabperson.setLocation(personX,personY);
                        break;
                    case KeyEvent.VK_UP:
                        personY-=10;
                        jlabperson.setIcon(personStandupWalkTurn);
                        jlabperson.setLocation(personX,personY);
                        break;
                    case KeyEvent.VK_DOWN:
                        personY+=10;
                        jlabperson.setIcon(personStandupWalk);
                        jlabperson.setLocation(personX,personY);
                        break;




                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_LEFT:
                        jlabperson.setIcon(personLeft);
                        jlabperson.setLocation(personX,personY);
                        break;
                    case KeyEvent.VK_RIGHT:

                        jlabperson.setIcon(personRight);
                        jlabperson.setLocation(personX,personY);
                        break;
                    case KeyEvent.VK_UP:

                        jlabperson.setIcon(personStandupTurn);
                        jlabperson.setLocation(personX,personY);
                        break;
                    case KeyEvent.VK_DOWN:

                        jlabperson.setIcon(personStandup);
                        jlabperson.setLocation(personX,personY);
                        break;

                }


            }
        });

//        Timer tmr=new Timer(5, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for(int i=0;i<move.length;i++){
//                    imageData[i]=Toolkit.getDefaultToolkit().getImage(move[i]);
//                    i++;
//
//                }
//
//            }
//        });











    }




}