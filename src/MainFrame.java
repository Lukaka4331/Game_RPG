import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Icon{
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
//    private ImageIcon ball =new ImageIcon("Image/test3.png");
    private ImageIcon backgroundBottom =new ImageIcon("Image/grassAll.png");
    private JLabel bglb =new JLabel(backgroundBottom);

    private JPanel jpDraw=new JPanel(new GridLayout(1,4,3,3));
    private int width=49,height=50,mapRow=20,mapCol=20; //width:視窗寬、height:視窗長、mapRow:地圖row、mapCol:地圖col。
    private JLabel Imagelabel[][]=new JLabel[width][height]; //按鈕。
    private int map[][]=new int[mapRow][mapCol]; //地圖。
    private JPanel jpMap =new JPanel();
    private JPanel jpConfig =new JPanel();
    BackgroundPanel bgp;



    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setTitle("Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(ScreenW/2-frmW/2,ScreenH/2-frmH/2,frmW,frmH);
//        Container cp;
//        cp=this.getContentPane();
//        cp.setLayout(null);


//        bglb.setBounds(0, 0, backgroundBottom.getIconWidth(), backgroundBottom.getIconHeight());


        bgp=new BackgroundPanel((new ImageIcon("Image/grassAll.png")).getImage());
//        bgp.setBounds(0,0,100,100);
//        bgp.setPreferredSize(new Dimension(500,580));

        this.add(bgp,BorderLayout.CENTER);

//        this.add(jpConfig,BorderLayout.SOUTH);
//        bgp.setMinimumSize(new );
//        this.setMinimumSize(new java.awt.Dimension(1000, 1000));

//        this.setLocationRelativeTo(null);

//        jpConfig.setPreferredSize(new Dimension(100, 500));

//        jpMap.setLayout(new GridLayout(mapRow,mapCol));
//        for(int i=0;i<mapRow;i++){
//            for(int j=0;j<mapCol;j++){
//                Imagelabel[i][j]=new JLabel(new ImageIcon("Image/grass.png"));
//                Imagelabel[i][j].setOpaque(true);
//
//                jpMap.add(Imagelabel[i][j]);
//            }
//        }
//        cp.add(jpMap,BorderLayout.CENTER);


    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    class BackgroundPanel extends JPanel
    {
        Image bg;
        public BackgroundPanel(Image bg)
        {
            this.bg=bg;
            this.setOpaque(false);
        }
        //Draw the background.
        public void paintComponent(Graphics g)
        {
            super.paintComponents(g);
            g.drawImage(bg,0,0,bgp.getWidth(),bgp.getHeight(),bgp);


        }
    }




}