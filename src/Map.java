import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

public class Map extends JPanel implements ActionListener, MouseWheelListener, MouseListener, MouseMotionListener {

    private JFrame frame;

    private JButton p1, p2, p3, p4, p5, p6, p7, p8, p9;
    private JButton r900, r901, r902, r903, r904, r905, r906, r907, r908, r909, r910, r911, r912, r913, r914, r915, r916, r917, r918, r919;
    private JButton r401, r402, r403, r404, r405, r406, r407, r408, r409, r410, r411, r412;
    private JButton r501, r502, r503, r504, r505, r506, r507;
    private JButton r301, r301a, r301b, r302, r303, r304,r305,r306, r307;
    private JButton r201, r202, r203, r204, r205, r206, r207, r208, r209, r210;
    private JButton r801, r802, r803;
    private JButton r516;
    private JButton r603, r604, r605, r606;
    private JButton r700, r701, r702, r703;

    private JButton gym1, gym2;
    private JButton l1, l2;
    private JButton boiler;
    private JButton weight;

    private JButton br1, br2, br3, br4, br5;
    private JButton s1, s2, s3, s4, s5, s6, s7;
    private JButton pl1, pl2, pl3, pl4;
    private JButton c1, c2;
    private JButton sp1;
    private JButton off1, off2, off3, off4, off5;
    private JButton r101, r102, r103, r104, r105;

    private JButton auditorium, stage;

    private JButton media, dark, copy, musicTech, studio, dell;

    private JButton BSAP, BK, english;

    private JButton cafeteria, kitchen, faculty;

    private JButton psych, counseling;

    private JButton front, front1, secretary, principal, health, kitchen1, pa;
    private JButton ap1, ap2, ap3;

    public String p1Teachers, p2Teachers, p3Teachers, p4Teachers, p5Teachers, p6Teachers, p7Teachers, p8Teachers, p9Teachers;
    public String r900Teachers, r901Teachers, r902Teachers, r903Teachers, r904Teachers, r905Teachers, r906Teachers, r907Teachers, r908Teachers, r909Teachers, r910Teachers, r911Teachers, r912Teachers, r913Teachers, r914Teachers, r915Teachers, r916Teachers, r917Teachers, r918Teachers, r919Teachers;
    public String r401Teachers, r402Teachers, r403Teachers, r404Teachers, r405Teachers, r406Teachers, r407Teachers, r408Teachers, r409Teachers, r410Teachers, r411Teachers, r412Teachers;
    public String r501Teachers, r502Teachers, r503Teachers, r504Teachers, r505Teachers, r506Teachers, r507Teachers;
    public String r301Teachers, r301aTeachers, r301bTeachers, r302Teachers, r303Teachers, r304Teachers,r305Teachers,r306Teachers, r307Teachers;
    public String r201Teachers, r202Teachers, r203Teachers, r204Teachers, r205Teachers, r206Teachers, r207Teachers, r208Teachers, r209Teachers, r210Teachers;
    public String r801Teachers, r802Teachers, r803Teachers;
    public String r516Teachers;
    public String r603Teachers, r604Teachers, r605Teachers, r606Teachers;
    public String r700Teachers, r701Teachers, r702Teachers, r703Teachers;




    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    private double zoomFactor = 1;

    private int xOffset = 100;
    private int yOffset = 50;

    private int xOffset1 = 20;
    private int yOffset1 = 20;

    private JPanel periodsTeacherLabel;

    public Map(){
        frame = new JFrame();
        setLayout(null);
        setBackground(Color.WHITE);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBackground(Color.WHITE);

        frame.setSize(WIDTH,HEIGHT);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setTitle("Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scroll = new JScrollPane(this);
        JViewport vport = scroll.getViewport();
        MouseAdapter ma = new drag();
        vport.addMouseMotionListener(ma);
        vport.addMouseListener(ma);

        frame.add(vport);

        addMouseWheelListener(this);

        initializePortables();

        initialize900s();

        initialize400s();

        initialize500s();

        initializeGym();

        initialize300s();

        initialize200s();

        initializeTheatreRooms();

        initializeMediaRooms();

        initialize600s();

        initialize700s();

        initializeCafeteria();

        initialize100s();

        initializeFrontOffice();
    }

    public void initializePortables(){
        p1 = new JButton("P1");
        p1.setBounds(800 - xOffset, 100 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p1.setBackground(Color.BLACK);
        p1.setForeground(Color.WHITE);
        p1.addActionListener(this);
        p1.setActionCommand("p1Click");
        this.add(p1);
        p1Teachers = "Period1: ," +  "Period2: ," +"Period3: ," +"Period4: ," +"Period5: ," +"Period6: ,";
        System.out.println(p1Teachers);
        p2 = new JButton("P2");
        p2.setBounds(875 - xOffset, 150 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p2.setBackground(Color.BLACK);
        p2.setForeground(Color.WHITE);
        p2.addActionListener(this);
        p2.setActionCommand("p2Click");
        this.add(p2);

        p3 = new JButton("P3");
        p3.setBounds(875 - xOffset, 100 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p3.setBackground(Color.BLACK);
        p3.setForeground(Color.WHITE);
        p3.addActionListener(this);
        p3.setActionCommand("p3Click");
        this.add(p3);

        p4 = new JButton("P4");
        p4.setBounds(950 - xOffset, 100 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p4.setBackground(Color.BLACK);
        p4.setForeground(Color.WHITE);
        p4.addActionListener(this);
        p4.setActionCommand("p4Click");
        this.add(p4);

        p5 = new JButton("P5");
        p5.setBounds(950 - xOffset, 50 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p5.setBackground(Color.BLACK);
        p5.setForeground(Color.WHITE);
        p5.addActionListener(this);
        p5.setActionCommand("p5Click");
        this.add(p5);

        p6 = new JButton("P6");
        p6.setBounds(1025 - xOffset, 100 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p6.setBackground(Color.BLACK);
        p6.setForeground(Color.WHITE);
        p6.addActionListener(this);
        p6.setActionCommand("p6Click");
        this.add(p6);

        p7 = new JButton("P7");
        p7.setBounds(1025 - xOffset, 50 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p7.setBackground(Color.BLACK);
        p7.setForeground(Color.WHITE);
        p7.addActionListener(this);
        p7.setActionCommand("p7Click");
        this.add(p7);

        p8 = new JButton("P8");
        p8.setBounds(1100 - xOffset, 100 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p8.setBackground(Color.BLACK);
        p8.setForeground(Color.WHITE);
        p8.addActionListener(this);
        p8.setActionCommand("p8Click");
        this.add(p8);

        p9 = new JButton("P9");
        p9.setBounds(1100 - xOffset, 50 + yOffset, (int) (50 * zoomFactor), (int) (30 * zoomFactor));
        p9.setBackground(Color.BLACK);
        p9.setForeground(Color.WHITE);
        p9.addActionListener(this);
        p9.setActionCommand("p9Click");
        this.add(p9);

        validate();
        repaint();
    }

    public void removePortables(){
        this.remove(p1);
        this.remove(p2);
        this.remove(p3);
        this.remove(p4);
        this.remove(p5);
        this.remove(p6);
        this.remove(p7);
        this.remove(p8);
        this.remove(p9);

        validate();
        repaint();
    }

    public void initialize900s(){
        r902 = new JButton("902");
        r902.setBounds(580 - xOffset1, 270, 60, 50);
        r902.setBackground(Color.BLACK);
        r902.setForeground(Color.WHITE);
        r902.addActionListener(this);
        r902.setActionCommand("r902Click");
        this.add(r902);

        s4 = new JButton("Storage");
        s4.setBounds(580 - xOffset1, 320, 60, 50);
        s4.setBackground(Color.BLACK);
        s4.setForeground(Color.WHITE);
        s4.addActionListener(this);
        s4.setActionCommand("s4Click");
        s4.setMargin(new Insets(0, 0, 0, 0));
        this.add(s4);

        r903 = new JButton("903");
        r903.setBounds(580 - xOffset1, 220, 60, 50);
        r903.setBackground(Color.BLACK);
        r903.setForeground(Color.WHITE);
        r903.addActionListener(this);
        r903.setActionCommand("r903Click");
        this.add(r903);

        r904 = new JButton("904");
        r904.setBounds(580 - xOffset1, 170, 60, 50);
        r904.setBackground(Color.BLACK);
        r904.setForeground(Color.WHITE);
        r904.addActionListener(this);
        r904.setActionCommand("r904Click");
        this.add(r904);

        r905 = new JButton("905");
        r905.setBounds(580 - xOffset1, 120, 60, 50);
        r905.setBackground(Color.BLACK);
        r905.setForeground(Color.WHITE);
        r905.addActionListener(this);
        r905.setActionCommand("r905Click");
        this.add(r905);

        r906 = new JButton("906");
        r906.setBounds(500 - xOffset1, 120, 60, 50);
        r906.setBackground(Color.BLACK);
        r906.setForeground(Color.WHITE);
        r906.addActionListener(this);
        r906.setActionCommand("r906Click");
        this.add(r906);

        r907 = new JButton("907");
        r907.setBounds(420 - xOffset1, 120, 80, 50);
        r907.setBackground(Color.BLACK);
        r907.setForeground(Color.WHITE);
        r907.addActionListener(this);
        r907.setActionCommand("r907Click");
        this.add(r907);

        r908 = new JButton("908");
        r908.setBounds(360 - xOffset1, 120, 60, 50);
        r908.setBackground(Color.BLACK);
        r908.setForeground(Color.WHITE);
        r908.addActionListener(this);
        r908.setActionCommand("r908Click");
        this.add(r908);

        JLabel constituionAve = new JLabel("Consitution Ave.");
        constituionAve.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        constituionAve.setBounds(350, 65, 250, 250);
        this.add(constituionAve);

        r909 = new JButton("909");
        r909.setBounds(300 - xOffset1, 120, 60, 50);
        r909.setBackground(Color.BLACK);
        r909.setForeground(Color.WHITE);
        r909.addActionListener(this);
        r909.setActionCommand("r909Click");
        this.add(r909);

        r910 = new JButton("910");
        r910.setBounds(200 - xOffset1, 120, 80, 50);
        r910.setBackground(Color.BLACK);
        r910.setForeground(Color.WHITE);
        r910.addActionListener(this);
        r910.setActionCommand("r910Click");
        this.add(r910);

        JLabel wallStreet = new RotatedJLabel("Wall Street");
        wallStreet.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        wallStreet.setBounds(150, 200, 250, 250);
        this.add(wallStreet);

        r911 = new JButton("911");
        r911.setBounds(200 - xOffset1, 170, 80, 70);
        r911.setBackground(Color.BLACK);
        r911.setForeground(Color.WHITE);
        r911.addActionListener(this);
        r911.setActionCommand("r911Click");
        this.add(r911);

        r912 = new JButton("912");
        r912.setBounds(200 - xOffset1, 240, 80, 50);
        r912.setBackground(Color.BLACK);
        r912.setForeground(Color.WHITE);
        r912.addActionListener(this);
        r912.setActionCommand("r912Click");
        this.add(r912);

        r913 = new JButton("913");
        r913.setBounds(200 - xOffset1, 290, 80, 40);
        r913.setBackground(Color.BLACK);
        r913.setForeground(Color.WHITE);
        r913.addActionListener(this);
        r913.setActionCommand("r913Click");
        this.add(r913);

        r914 = new JButton("914");
        r914.setBounds(390 - xOffset1, 300 + yOffset1, 70, 50);
        r914.setBackground(Color.BLACK);
        r914.setForeground(Color.WHITE);
        r914.addActionListener(this);
        r914.setActionCommand("r914Click");
        this.add(r914);

        JLabel pemdasStreet = new JLabel("PEMDAS Street");
        pemdasStreet.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        pemdasStreet.setBounds(350, 260, 250, 250);
        this.add(pemdasStreet);

        r915 = new JButton("915");
        r915.setBounds(460 - xOffset1, 300 + yOffset1, 100, 50);
        r915.setBackground(Color.BLACK);
        r915.setForeground(Color.WHITE);
        r915.addActionListener(this);
        r915.setActionCommand("r915Click");
        this.add(r915);

        br1 = new JButton("BR");
        br1.setBounds(300 - xOffset1, 300 + yOffset1, 90, 50);
        br1.setBackground(Color.BLACK);
        br1.setForeground(Color.WHITE);
        br1.addActionListener(this);
        br1.setActionCommand("br1Click");
        this.add(br1);

        r916 = new JButton("916");
        r916.setBounds(410 - xOffset1, 260 + yOffset1, 150, 40);
        r916.setBackground(Color.BLACK);
        r916.setForeground(Color.WHITE);
        r916.addActionListener(this);
        r916.setActionCommand("r916Click");
        this.add(r916);

        r917 = new JButton("917");
        r917.setBounds(410 - xOffset1, 180 + yOffset1, 150, 80);
        r917.setBackground(Color.BLACK);
        r917.setForeground(Color.WHITE);
        r917.addActionListener(this);
        r917.setActionCommand("r917Click");
        this.add(r917);

        JLabel zachingLn = new RotatedJLabel("Zaching Lane");
        zachingLn.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        zachingLn.setBounds(305, 200, 500, 500);
        this.add(zachingLn);

        JLabel fortunadoDr = new RotatedJLabel("Fortunado Drive");
        fortunadoDr.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        fortunadoDr.setBounds(380, 200, 500, 500);
        this.add(fortunadoDr);


        r918 = new JButton("918");
        r918.setBounds(300 - xOffset1, 225 + yOffset1, 55, 75);
        r918.setBackground(Color.BLACK);
        r918.setForeground(Color.WHITE);
        r918.addActionListener(this);
        r918.setActionCommand("r918Click");
        this.add(r918);

        s1 = new JButton("Storage");
        s1.setBounds(300 - xOffset1, 180 + yOffset1, 110, 45);
        s1.setBackground(Color.BLACK);
        s1.setForeground(Color.WHITE);
        s1.addActionListener(this);
        s1.setActionCommand("s1Click");
        this.add(s1);

        pl1 = new JButton("Planning");
        pl1.setBounds(355 - xOffset1, 225 + yOffset1, 55, 75);
        pl1.setBackground(Color.BLACK);
        pl1.setForeground(Color.WHITE);
        pl1.addActionListener(this);
        pl1.setActionCommand("pl1Click");
        pl1.setBorder(null);
        pl1.setMargin(new Insets(0, 0, 0, 0));
        this.add(pl1);

        validate();
        repaint();
    }

    public void initialize400s(){
        r401 = new JButton("401");
        r401.setBounds(450, 440, 70, 50);
        r401.setBackground(Color.BLACK);
        r401.setForeground(Color.WHITE);
        r401.addActionListener(this);
        r401.setActionCommand("r401Click");
        this.add(r401);

        r402 = new JButton("402");
        r402.setBounds(395, 440, 55, 50);
        r402.setBackground(Color.BLACK);
        r402.setForeground(Color.WHITE);
        r402.addActionListener(this);
        r402.setActionCommand("r402Click");
        this.add(r402);

        r403 = new JButton("403");
        r403.setBounds(340, 440, 55, 50);
        r403.setBackground(Color.BLACK);
        r403.setForeground(Color.WHITE);
        r403.addActionListener(this);
        r403.setActionCommand("r403Click");
        this.add(r403);

        r404 = new JButton("404");
        r404.setBounds(285, 440, 55, 50);
        r404.setBackground(Color.BLACK);
        r404.setForeground(Color.WHITE);
        r404.addActionListener(this);
        r404.setActionCommand("r404Click");
        this.add(r404);

        r405 = new JButton("405");
        r405.setBounds(225, 400, 60, 90);
        r405.setBackground(Color.BLACK);
        r405.setForeground(Color.WHITE);
        r405.addActionListener(this);
        r405.setActionCommand("r405Click");
        this.add(r405);

        r406 = new JButton("406");
        r406.setBounds(170, 430, 55, 60);
        r406.setBackground(Color.BLACK);
        r406.setForeground(Color.WHITE);
        r406.addActionListener(this);
        r406.setActionCommand("r406Click");
        this.add(r406);

        r407 = new JButton("407");
        r407.setBounds(170, 400, 55, 30);
        r407.setBackground(Color.BLACK);
        r407.setForeground(Color.WHITE);
        r407.addActionListener(this);
        r407.setActionCommand("r407Click");
        this.add(r407);

        r408 = new JButton("408");
        r408.setBounds(285, 400, 55, 40);
        r408.setBackground(Color.BLACK);
        r408.setForeground(Color.WHITE);
        r408.addActionListener(this);
        r408.setActionCommand("r408Click");
        this.add(r408);

        r409 = new JButton("409");
        r409.setBounds(340, 400, 55, 40);
        r409.setBackground(Color.BLACK);
        r409.setForeground(Color.WHITE);
        r409.addActionListener(this);
        r409.setActionCommand("r409Click");
        this.add(r409);

        r410 = new JButton("410");
        r410.setBounds(395, 400, 55, 40);
        r410.setBackground(Color.BLACK);
        r410.setForeground(Color.WHITE);
        r410.addActionListener(this);
        r410.setActionCommand("r401Click");
        this.add(r410);

        r411 = new JButton("411");
        r411.setBounds(450, 400, 70, 40);
        r411.setBackground(Color.BLACK);
        r411.setForeground(Color.WHITE);
        r411.addActionListener(this);
        r411.setActionCommand("r411Click");
        this.add(r411);

        r412 = new JButton("412");
        r412.setBounds(520, 400, 65, 40);
        r412.setBackground(Color.BLACK);
        r412.setForeground(Color.WHITE);
        r412.addActionListener(this);
        r412.setActionCommand("r412Click");
        this.add(r412);

        JLabel eaglesNest = new RotatedJLabel("Eagle's Nest");
        eaglesNest.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        eaglesNest.setBounds(365, 400, 500, 500);
        this.add(eaglesNest);

        JLabel centennialBlvd = new JLabel("Centennial Blvd");
        centennialBlvd.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        centennialBlvd.setBounds(500, 375, 250, 250);
        this.add(centennialBlvd);


        s2 = new JButton("Storage");
        s2.setBounds(520, 440, 65, 20);
        s2.setBackground(Color.BLACK);
        s2.setForeground(Color.WHITE);
        s2.addActionListener(this);
        s2.setActionCommand("s2Click");
        s2.setMargin(new Insets(0, 0, 0, 0));
        this.add(s2);

        br2 = new JButton("Bathroom");
        br2.setBounds(520, 460, 65, 30);
        br2.setBackground(Color.BLACK);
        br2.setForeground(Color.WHITE);
        br2.addActionListener(this);
        br2.setActionCommand("br2Click");
        br2.setMargin(new Insets(0, 0, 0, 0));
        this.add(br2);

        validate();
        repaint();
    }

    public void initialize500s(){
        r501 = new JButton("501");
        r501.setBounds(425, 555, 95, 40);
        r501.setBackground(Color.BLACK);
        r501.setForeground(Color.WHITE);
        r501.addActionListener(this);
        r501.setActionCommand("r501Click");
        this.add(r501);

        r502 = new JButton("502");
        r502.setBounds(345, 565, 80, 30);
        r502.setBackground(Color.BLACK);
        r502.setForeground(Color.WHITE);
        r502.addActionListener(this);
        r502.setActionCommand("r502Click");
        this.add(r502);

        r503 = new JButton("503");
        r503.setBounds(250, 555, 95, 40);
        r503.setBackground(Color.BLACK);
        r503.setForeground(Color.WHITE);
        r503.addActionListener(this);
        r503.setActionCommand("r503Click");
        this.add(r503);

        JLabel periodicDr = new JLabel("Periodic Drive");
        periodicDr.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        periodicDr.setBounds(300, 475, 250, 250);
        this.add(periodicDr);


        r504 = new JButton("504");
        r504.setBounds(170, 555, 80, 40);
        r504.setBackground(Color.BLACK);
        r504.setForeground(Color.WHITE);
        r504.addActionListener(this);
        r504.setActionCommand("r504Click");
        this.add(r504);

        r505 = new JButton("505");
        r505.setBounds(170, 515, 80, 40);
        r505.setBackground(Color.BLACK);
        r505.setForeground(Color.WHITE);
        r505.addActionListener(this);
        r505.setActionCommand("r505Click");
        this.add(r505);

        r506 = new JButton("506");
        r506.setBounds(250, 515, 95, 40);
        r506.setBackground(Color.BLACK);
        r506.setForeground(Color.WHITE);
        r506.addActionListener(this);
        r506.setActionCommand("r506Click");
        this.add(r506);

        pl2 = new JButton("Planning");
        pl2.setBounds(345, 515, 80, 50);
        pl2.setBackground(Color.BLACK);
        pl2.setForeground(Color.WHITE);
        pl2.addActionListener(this);
        pl2.setActionCommand("pl2Click");
        pl2.setMargin(new Insets(0, 0, 0, 0));
        this.add(pl2);

        r507 = new JButton("507");
        r507.setBounds(425, 515, 95, 40);
        r507.setBackground(Color.BLACK);
        r507.setForeground(Color.WHITE);
        r507.addActionListener(this);
        r507.setActionCommand("r507Click");
        this.add(r507);

        validate();
        repaint();
    }

    public void initializeGym(){
        gym1 = new JButton("Gym");
        gym1.setBounds(950 - xOffset, 260 + yOffset, 175, 180);
        gym1.setBackground(Color.BLACK);
        gym1.setForeground(Color.WHITE);
        gym1.addActionListener(this);
        gym1.setActionCommand("gym1Click");
        this.add(gym1);

        gym2 = new JButton("Auxillary Gym");
        gym2.setBounds(950 - xOffset, 150 + yOffset, 175, 110);
        gym2.setBackground(Color.BLACK);
        gym2.setForeground(Color.WHITE);
        gym2.addActionListener(this);
        gym2.setActionCommand("gym2Click");
        this.add(gym2);

        l1 = new JButton("Boys' Locker Room");
        l1.setBounds(800 - xOffset, 200 + yOffset, 150, 240);
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.WHITE);
        l1.addActionListener(this);
        l1.setActionCommand("l1Click");
        this.add(l1);

        l2 = new JButton("Girls' Locker Room");
        l2.setBounds(1125 - xOffset, 175 + yOffset, 125, 265);
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.WHITE);
        l2.addActionListener(this);
        l2.setActionCommand("l2Click");
        l2.setMargin(new Insets(0, 0, 0, 0));
        this.add(l2);

        r900 = new JButton("900");
        r900.setBounds(750 - xOffset, 390 + yOffset, 50, 50);
        r900.setBackground(Color.BLACK);
        r900.setForeground(Color.WHITE);
        r900.addActionListener(this);
        r900.setActionCommand("r900Click");
        r900.setMargin(new Insets(0, 0, 0, 0));
        this.add(r900);

        weight = new JButton("WR");
        weight.setBounds(750 - xOffset, 290 + yOffset, 50, 100);
        weight.setBackground(Color.BLACK);
        weight.setForeground(Color.WHITE);
        weight.addActionListener(this);
        weight.setActionCommand("weightClick");
        weight.setMargin(new Insets(0, 0, 0, 0));
        weight.setBorder(null);
        this.add(weight);

        r901 = new JButton("901");
        r901.setBounds(750 - xOffset, 240 + yOffset, 50, 50);
        r901.setBackground(Color.BLACK);
        r901.setForeground(Color.WHITE);
        r901.addActionListener(this);
        r901.setActionCommand("r901Click");
        r901.setMargin(new Insets(0, 0, 0, 0));
        this.add(r901);

        sp1 = new JButton("Sp. Ed.");
        sp1.setBounds(750 - xOffset, 180 + yOffset, 50, 60);
        sp1.setBackground(Color.BLACK);
        sp1.setForeground(Color.WHITE);
        sp1.addActionListener(this);
        sp1.setActionCommand("sp1Click");
        sp1.setMargin(new Insets(0, 0, 0, 0));
        this.add(sp1);

        boiler = new JButton("Boiler Room");
        boiler.setBounds(1250 - xOffset, 230 + yOffset, 125, 150);
        boiler.setBackground(Color.BLACK);
        boiler.setForeground(Color.WHITE);
        boiler.addActionListener(this);
        boiler.setActionCommand("boilerClick");
        boiler.setMargin(new Insets(0, 0, 0, 0));
        this.add(boiler);

        s6 = new JButton("Storage");
        s6.setBounds(1250 - xOffset, 380 + yOffset, 80, 30);
        s6.setBackground(Color.BLACK);
        s6.setForeground(Color.WHITE);
        s6.addActionListener(this);
        s6.setActionCommand("s6Click");
        s6.setMargin(new Insets(0, 0, 0, 0));
        this.add(s6);

        off4 = new JButton("Office");
        off4.setBounds(1250 - xOffset, 410 + yOffset, 80, 30);
        off4.setBackground(Color.BLACK);
        off4.setForeground(Color.WHITE);
        off4.addActionListener(this);
        off4.setActionCommand("off4Click");
        off4.setMargin(new Insets(0, 0, 0, 0));
        this.add(off4);

        validate();
        repaint();
    }

    public void initialize300s(){
        r301 = new JButton("301");
        r301.setBounds(765, 540, 65, 35);
        r301.setBackground(Color.BLACK);
        r301.setForeground(Color.WHITE);
        r301.addActionListener(this);
        r301.setActionCommand("r301Click");
        this.add(r301);

        r301a = new JButton("301A");
        r301a.setBounds(705, 557, 60, 18);
        r301a.setBackground(Color.BLACK);
        r301a.setForeground(Color.WHITE);
        r301a.addActionListener(this);
        r301a.setActionCommand("r301aClick");
        r301a.setMargin(new Insets(0, 0, 0, 0));
        this.add(r301a);

        pl3 = new JButton("Planning");
        pl3.setBounds(705, 540, 60, 17);
        pl3.setBackground(Color.BLACK);
        pl3.setForeground(Color.WHITE);
        pl3.addActionListener(this);
        pl3.setActionCommand("pl3Click");
        pl3.setMargin(new Insets(0, 0, 0, 0));
        this.add(pl3);

        r301b = new JButton("301B");
        r301b.setBounds(705, 515, 125, 25);
        r301b.setBackground(Color.BLACK);
        r301b.setForeground(Color.WHITE);
        r301b.addActionListener(this);
        r301b.setActionCommand("r301bClick");
        this.add(r301b);

        r302 = new JButton("302");
        r302.setBounds(615, 535, 90, 20);
        r302.setBackground(Color.BLACK);
        r302.setForeground(Color.WHITE);
        r302.addActionListener(this);
        this.add(r302);

        r303 = new JButton("303");
        r303.setBounds(615, 555, 90, 20);
        r303.setBackground(Color.BLACK);
        r303.setForeground(Color.WHITE);
        r303.addActionListener(this);
        r303.setActionCommand("r303Click");
        this.add(r303);

        JLabel bardAve = new JLabel("Bard Ave");
        bardAve.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        bardAve.setBounds(590, 460, 250, 250);
        this.add(bardAve);

        r304 = new JButton("304");
        r304.setBounds(550, 555, 65, 20);
        r304.setBackground(Color.BLACK);
        r304.setForeground(Color.WHITE);
        r304.addActionListener(this);
        r304.setActionCommand("r304Click");
        this.add(r304);

        r305 = new JButton("305");
        r305.setBounds(550, 535, 65, 20);
        r305.setBackground(Color.BLACK);
        r305.setForeground(Color.WHITE);
        r305.addActionListener(this);
        r305.setActionCommand("r305Click");
        this.add(r305);

        r306 = new JButton("306");
        r306.setBounds(550, 515, 65, 20);
        r306.setBackground(Color.BLACK);
        r306.setForeground(Color.WHITE);
        r306.addActionListener(this);
        r306.setActionCommand("r306Click");
        this.add(r306);

        r307 = new JButton("307");
        r307.setBounds(615, 515, 90, 20);
        r307.setBackground(Color.BLACK);
        r307.setForeground(Color.WHITE);
        r307.addActionListener(this);
        r307.setActionCommand("r307Click");
        this.add(r307);

        validate();
        repaint();
    }

    public void initialize200s(){
        r201 = new JButton("201");
        r201.setBounds(770, 665, 60, 70);
        r201.setBackground(Color.BLACK);
        r201.setForeground(Color.WHITE);
        r201.addActionListener(this);
        r201.setActionCommand("r201Click");
        this.add(r201);

        r202 = new JButton("202");
        r202.setBounds(710, 665, 60, 70);
        r202.setBackground(Color.BLACK);
        r202.setForeground(Color.WHITE);
        r202.addActionListener(this);
        r202.setActionCommand("r202Click");
        this.add(r202);

        r203 = new JButton("203");
        r203.setBounds(650, 665, 60, 70);
        r203.setBackground(Color.BLACK);
        r203.setForeground(Color.WHITE);
        r203.addActionListener(this);
        r203.setActionCommand("r203Click");
        this.add(r203);

        r204 = new JButton("204");
        r204.setBounds(600, 665, 50, 70);
        r204.setBackground(Color.BLACK);
        r204.setForeground(Color.WHITE);
        r204.addActionListener(this);
        r204.setActionCommand("r204Click");
        r204.setMargin(new Insets(0, 0, 0, 0));
        this.add(r204);

        JLabel internationalWay = new JLabel("International Way");
        internationalWay.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        internationalWay.setBounds(590, 560, 250, 250);
        this.add(internationalWay);

        r205 = new JButton("205");
        r205.setBounds(550, 665, 60, 70);
        r205.setBackground(Color.BLACK);
        r205.setForeground(Color.WHITE);
        r205.addActionListener(this);
        r205.setActionCommand("r205Click");
        this.add(r205);

        r206 = new JButton("206");
        r206.setBounds(550, 605, 50, 40);
        r206.setBackground(Color.BLACK);
        r206.setForeground(Color.WHITE);
        r206.addActionListener(this);
        r206.setActionCommand("r206Click");
        r206.setMargin(new Insets(0, 0, 0, 0));
        this.add(r206);

        s3 = new JButton("Storage");
        s3.setBounds(550, 645, 50, 20);
        s3.setBackground(Color.BLACK);
        s3.setForeground(Color.WHITE);
        s3.addActionListener(this);
        s3.setActionCommand("s3Click");
        s3.setMargin(new Insets(0, 0, 0, 0));
        s3.setBorder(null);
        this.add(s3);

        r207 = new JButton("207");
        r207.setBounds(600, 605, 50, 60);
        r207.setBackground(Color.BLACK);
        r207.setForeground(Color.WHITE);
        r207.addActionListener(this);
        r207.setActionCommand("r207Click");
        r207.setMargin(new Insets(0, 0, 0, 0));
        this.add(r207);

        r208 = new JButton("208");
        r208.setBounds(650, 605, 60, 60);
        r208.setBackground(Color.BLACK);
        r208.setForeground(Color.WHITE);
        r208.addActionListener(this);
        r208.setActionCommand("r208Click");
        this.add(r208);

        r209 = new JButton("209");
        r209.setBounds(710, 605, 60, 60);
        r209.setBackground(Color.BLACK);
        r209.setForeground(Color.WHITE);
        r209.addActionListener(this);
        r209.setActionCommand("r209Click");
        this.add(r209);

        r210 = new JButton("210");
        r210.setBounds(770, 605, 60, 60);
        r210.setBackground(Color.BLACK);
        r210.setForeground(Color.WHITE);
        r210.addActionListener(this);
        r210.setActionCommand("r210Click");
        this.add(r210);

        validate();
        repaint();
    }

    public void initializeTheatreRooms(){
        auditorium = new JButton("Auditorium");
        auditorium.setBounds(850, 515, 140, 120);
        auditorium.setBackground(Color.BLACK);
        auditorium.setForeground(Color.WHITE);
        auditorium.addActionListener(this);
        auditorium.setActionCommand("auditoriumClick");
        this.add(auditorium);

        stage = new JButton("Stage");
        stage.setBounds(990, 515, 90, 120);
        stage.setBackground(Color.BLACK);
        stage.setForeground(Color.WHITE);
        stage.addActionListener(this);
        stage.setActionCommand("stageClick");
        this.add(stage);

        r801 = new JButton("801");
        r801.setBounds(1080, 595, 40, 40);
        r801.setBackground(Color.BLACK);
        r801.setForeground(Color.WHITE);
        r801.addActionListener(this);
        r801.setActionCommand("r801Click");
        r801.setMargin(new Insets(0, 0, 0, 0));
        this.add(r801);

        r802 = new JButton("802");
        r802.setBounds(1080, 515, 40, 80);
        r802.setBackground(Color.BLACK);
        r802.setForeground(Color.WHITE);
        r802.addActionListener(this);
        r802.setActionCommand("r802Click");
        r802.setMargin(new Insets(0, 0, 0, 0));
        this.add(r802);

        r803 = new JButton("803");
        r803.setBounds(1120, 515, 60, 80);
        r803.setBackground(Color.BLACK);
        r803.setForeground(Color.WHITE);
        r803.addActionListener(this);
        r803.setActionCommand("r803Click");
        this.add(r803);

        s4 = new JButton("Storage");
        s4.setBounds(1050, 635, 70, 45);
        s4.setBackground(Color.BLACK);
        s4.setForeground(Color.WHITE);
        s4.addActionListener(this);
        s4.setActionCommand("s4Click");
        s4.setMargin(new Insets(0, 0, 0, 0));
        this.add(s4);

        validate();
        repaint();
    }

    public void initializeMediaRooms(){
        media = new JButton("Media Center");
        media.setBounds(370, 620, 150, 180);
        media.setBackground(Color.BLACK);
        media.setForeground(Color.WHITE);
        media.addActionListener(this);
        media.setActionCommand("mediaClick");
        this.add(media);

        off1 = new JButton("Office");
        off1.setBounds(310, 750, 60, 50);
        off1.setBackground(Color.BLACK);
        off1.setForeground(Color.WHITE);
        off1.addActionListener(this);
        off1.setActionCommand("off1Click");
        off1.setMargin(new Insets(0, 0, 0, 0));
        this.add(off1);

        studio = new JButton("TV Studio");
        studio.setBounds(230, 750, 80, 50);
        studio.setBackground(Color.BLACK);
        studio.setForeground(Color.WHITE);
        studio.addActionListener(this);
        studio.setActionCommand("studioClick");
        studio.setMargin(new Insets(0, 0, 0, 0));
        this.add(studio);

        dell = new JButton("Dell Lab");
        dell.setBounds(170, 720, 60, 80);
        dell.setBackground(Color.BLACK);
        dell.setForeground(Color.WHITE);
        dell.addActionListener(this);
        dell.setActionCommand("dellClick");
        dell.setMargin(new Insets(0, 0, 0, 0));
        this.add(dell);

        copy = new JButton("Copy Room");
        copy.setBounds(170, 660, 60, 60);
        copy.setBackground(Color.BLACK);
        copy.setForeground(Color.WHITE);
        copy.addActionListener(this);
        copy.setActionCommand("copyClick");
        copy.setMargin(new Insets(0, 0, 0, 0));
        this.add(copy);

        br3 = new JButton("Bathroom");
        br3.setBounds(170, 620, 60, 40);
        br3.setBackground(Color.BLACK);
        br3.setForeground(Color.WHITE);
        br3.addActionListener(this);
        br3.setActionCommand("br3Click");
        br3.setMargin(new Insets(0, 0, 0, 0));
        br3.setBorder(null);
        this.add(br3);

        dark = new JButton("Darkroom");
        dark.setBounds(230, 680, 85, 70);
        dark.setBackground(Color.BLACK);
        dark.setForeground(Color.WHITE);
        dark.addActionListener(this);
        dark.setActionCommand("darkClick");
        dark.setMargin(new Insets(0, 0, 0, 0));
        dark.setBorder(null);
        this.add(dark);

        s5 = new JButton("Storage");
        s5.setBounds(315, 680, 55, 70);
        s5.setBackground(Color.BLACK);
        s5.setForeground(Color.WHITE);
        s5.setMargin(new Insets(0, 0, 0, 0));
        s5.addActionListener(this);
        s5.setActionCommand("s5Click");
        this.add(s5);

        r516 = new JButton("516");
        r516.setBounds(230, 620, 85, 60);
        r516.setBackground(Color.BLACK);
        r516.setForeground(Color.WHITE);
        r516.addActionListener(this);
        r516.setActionCommand("r516Click");
        this.add(r516);

        musicTech = new JButton("M. Tech");
        musicTech.setBounds(315, 620, 55, 60);
        musicTech.setBackground(Color.BLACK);
        musicTech.setForeground(Color.WHITE);
        musicTech.setMargin(new Insets(0, 0, 0, 0));
        musicTech.addActionListener(this);
        musicTech.setActionCommand("musicTechClick");
        this.add(musicTech);

        validate();
        repaint();
    }

    public void initialize600s(){
        r603 = new JButton("603");
        r603.setBounds(420, 830, 65, 70);
        r603.setBackground(Color.BLACK);
        r603.setForeground(Color.WHITE);
        r603.addActionListener(this);
        r603.setActionCommand("r603Click");
        this.add(r603);

        r604 = new JButton("604");
        r604.setBounds(330, 830, 90, 110);
        r604.setBackground(Color.BLACK);
        r604.setForeground(Color.WHITE);
        r604.addActionListener(this);
        r604.setActionCommand("r604Click");
        r604.setMargin(new Insets(0, 0, 0, 0));
        this.add(r604);

        r605 = new JButton("605");
        r605.setBounds(290, 940, 65, 55);
        r605.setBackground(Color.BLACK);
        r605.setForeground(Color.WHITE);
        r605.addActionListener(this);
        r605.setActionCommand("r605Click");
        r605.setMargin(new Insets(0, 0, 0, 0));
        this.add(r605);

        r606 = new JButton("606");
        r606.setBounds(190, 830, 140, 110);
        r606.setBackground(Color.BLACK);
        r606.setForeground(Color.WHITE);
        r606.addActionListener(this);
        r606.setActionCommand("r606Click");
        r606.setMargin(new Insets(0, 0, 0, 0));
        this.add(r606);

        BK = new JButton("BK");
        BK.setBounds(485, 830, 35, 70);
        BK.setBackground(Color.BLACK);
        BK.setForeground(Color.WHITE);
        BK.addActionListener(this);
        BK.setActionCommand("BKClick");
        BK.setMargin(new Insets(0, 0, 0, 0));
        this.add(BK);

        BSAP = new JButton("BSAP");
        BSAP.setBounds(470, 900, 50, 55);
        BSAP.setBackground(Color.BLACK);
        BSAP.setForeground(Color.WHITE);
        BSAP.addActionListener(this);
        BSAP.setActionCommand("BSAPClick");
        BSAP.setMargin(new Insets(0, 0, 0, 0));
        this.add(BSAP);

        english = new JButton("English");
        english.setBounds(470, 955, 50, 40);
        english.setBackground(Color.BLACK);
        english.setForeground(Color.WHITE);
        english.setMargin(new Insets(0, 0, 0, 0));
        english.addActionListener(this);
        english.setActionCommand("englishClick");
        this.add(english);

        pl4 = new JButton("Planning");
        pl4.setBounds(420, 900, 50, 95);
        pl4.setBackground(Color.BLACK);
        pl4.setForeground(Color.WHITE);
        pl4.addActionListener(this);
        pl4.setActionCommand("pl4");
        pl4.setMargin(new Insets(0, 0, 0, 0));
        pl4.setBorder(null);
        this.add(pl4);

        off2 = new JButton("Office");
        off2.setBounds(190, 940, 100, 55);
        off2.setBackground(Color.BLACK);
        off2.setForeground(Color.WHITE);
        off2.addActionListener(this);
        off2.setActionCommand("off2Click");
        off2.setMargin(new Insets(0, 0, 0, 0));
        this.add(off2);

        off3 = new JButton("Office");
        off3.setBounds(355, 940, 65, 55);
        off3.setBackground(Color.BLACK);
        off3.setForeground(Color.WHITE);
        off3.setMargin(new Insets(0, 0, 0, 0));
        off3.addActionListener(this);
        off3.setActionCommand("off3Click");
        this.add(off3);

        validate();
        repaint();
    }

    public void initialize700s(){
        r700 = new JButton("700");
        r700.setBounds(975, 760, 75, 40);
        r700.setBackground(Color.BLACK);
        r700.setForeground(Color.WHITE);
        r700.addActionListener(this);
        r700.setActionCommand("r700Click");
        this.add(r700);

        r701 = new JButton("701");
        r701.setBounds(975, 680, 75, 80);
        r701.setBackground(Color.BLACK);
        r701.setForeground(Color.WHITE);
        r701.addActionListener(this);
        r701.setActionCommand("r701Click");
        this.add(r701);

        r702 = new JButton("702");
        r702.setBounds(920, 680, 55, 120);
        r702.setBackground(Color.BLACK);
        r702.setForeground(Color.WHITE);
        r702.addActionListener(this);
        r702.setActionCommand("r702Click");
        r702.setMargin(new Insets(0, 0, 0, 0));
        this.add(r702);

        r703 = new JButton("703");
        r703.setBounds(850, 680, 35, 120);
        r703.setBackground(Color.BLACK);
        r703.setForeground(Color.WHITE);
        r703.addActionListener(this);
        r703.setActionCommand("r703Click");
        r703.setMargin(new Insets(0, 0, 0, 0));
        this.add(r703);

        off5 = new JButton("Off.");
        off5.setBounds(885, 680, 35, 120);
        off5.setBackground(Color.BLACK);
        off5.setForeground(Color.WHITE);
        off5.addActionListener(this);
        off5.setActionCommand("off5Click");
        off5.setMargin(new Insets(0, 0, 0, 0));
        this.add(off5);

        validate();
        repaint();
    }

    public void initializeCafeteria(){
        cafeteria = new JButton("Cafeteria");
        cafeteria.setBounds(850, 840, 100, 180);
        cafeteria.setBackground(Color.BLACK);
        cafeteria.setForeground(Color.WHITE);
        cafeteria.addActionListener(this);
        cafeteria.setActionCommand("cafeteriaClick");
        this.add(cafeteria);

        kitchen = new JButton("Kitchen");
        kitchen.setBounds(950, 840, 100, 120);
        kitchen.setBackground(Color.BLACK);
        kitchen.setForeground(Color.WHITE);
        kitchen.addActionListener(this);
        kitchen.setActionCommand("kitchenClick");
        this.add(kitchen);

        faculty = new JButton("Faculty D.");
        faculty.setBounds(950, 960, 65, 60);
        faculty.setBackground(Color.BLACK);
        faculty.setForeground(Color.WHITE);
        faculty.addActionListener(this);
        faculty.setActionCommand("facultyClick");
        faculty.setMargin(new Insets(0, 0, 0, 0));
        this.add(faculty);

        validate();
        repaint();
    }

    public void initialize100s(){
        r101 = new JButton("101");
        r101.setBounds(770, 760, 60, 75);
        r101.setBackground(Color.BLACK);
        r101.setForeground(Color.WHITE);
        r101.addActionListener(this);
        r101.setActionCommand("r101Click");
        this.add(r101);

        r102 = new JButton("102");
        r102.setBounds(720, 760, 50, 75);
        r102.setBackground(Color.BLACK);
        r102.setForeground(Color.WHITE);
        r102.addActionListener(this);
        r102.setActionCommand("r102Click");
        r102.setMargin(new Insets(0, 0, 0, 0));
        this.add(r102);

        r103 = new JButton("103");
        r103.setBounds(670, 760, 50, 75);
        r103.setBackground(Color.BLACK);
        r103.setForeground(Color.WHITE);
        r103.addActionListener(this);
        r103.setActionCommand("r103Click");
        r103.setMargin(new Insets(0, 0, 0, 0));
        this.add(r103);

        r104 = new JButton("104");
        r104.setBounds(620, 760, 50, 75);
        r104.setBackground(Color.BLACK);
        r104.setForeground(Color.WHITE);
        r104.addActionListener(this);
        r104.setActionCommand("r104Click");
        r104.setMargin(new Insets(0, 0, 0, 0));
        this.add(r104);

        r105 = new JButton("105");
        r105.setBounds(550, 760, 40, 75);
        r105.setBackground(Color.BLACK);
        r105.setForeground(Color.WHITE);
        r105.addActionListener(this);
        r105.setActionCommand("r105Click");
        r105.setMargin(new Insets(0, 0, 0, 0));
        this.add(r105);

        psych = new JButton("Psych.");
        psych.setBounds(550, 835, 40, 40);
        psych.setBackground(Color.BLACK);
        psych.setForeground(Color.WHITE);
        psych.addActionListener(this);
        psych.setActionCommand("psychClick");
        psych.setMargin(new Insets(0, 0, 0, 0));
        psych.setBorder(null);
        this.add(psych);

        counseling = new JButton("Counseling");
        counseling.setBounds(590, 835, 140, 40);
        counseling.setBackground(Color.BLACK);
        counseling.setForeground(Color.WHITE);
        counseling.addActionListener(this);
        counseling.setActionCommand("counselingClick");
        counseling.setMargin(new Insets(0, 0, 0, 0));
        this.add(counseling);

        c1 = new JButton("Conf.");
        c1.setBounds(730, 835, 40, 40);
        c1.setBackground(Color.BLACK);
        c1.setForeground(Color.WHITE);
        c1.addActionListener(this);
        c1.setActionCommand("c1Click");
        c1.setMargin(new Insets(0, 0, 0, 0));
        this.add(c1);

        br4 = new JButton("Bathroom");
        br4.setBounds(770, 835, 60, 40);
        br4.setBackground(Color.BLACK);
        br4.setForeground(Color.WHITE);
        br4.addActionListener(this);
        br4.setActionCommand("br4Click");
        br4.setMargin(new Insets(0, 0, 0, 0));
        br4.setBorder(null);
        this.add(br4);

        s7 = new JButton("Stor.");
        s7.setBounds(590, 760, 30, 75);
        s7.setBackground(Color.BLACK);
        s7.setForeground(Color.WHITE);
        s7.addActionListener(this);
        s7.setActionCommand("s7Click");
        s7.setMargin(new Insets(0, 0, 0, 0));
        s7.setBorder(null);
        this.add(s7);

        validate();
        repaint();
    }

    public void initializeFrontOffice(){
        front = new JButton("Front O.");
        front.setBounds(750, 900, 70, 35);
        front.setBackground(Color.BLACK);
        front.setForeground(Color.WHITE);
        front.addActionListener(this);
        front.setActionCommand("frontClick");
        front.setMargin(new Insets(0, 0, 0, 0));
        this.add(front);

        front1 = new JButton("Front O.");
        front1.setBounds(770, 960, 50, 35);
        front1.setBackground(Color.BLACK);
        front1.setForeground(Color.WHITE);
        front1.addActionListener(this);
        front1.setActionCommand("front1Click");
        front1.setMargin(new Insets(0, 0, 0, 0));
        this.add(front1);

        pa = new JButton("PA");
        pa.setBounds(750, 960, 20, 35);
        pa.setBackground(Color.BLACK);
        pa.setForeground(Color.WHITE);
        pa.addActionListener(this);
        pa.setActionCommand("paClick");
        pa.setMargin(new Insets(0, 0, 0, 0));
        pa.setBorder(null);
        this.add(pa);

        c2 = new JButton("Conf.");
        c2.setBounds(710, 960, 40, 35);
        c2.setBackground(Color.BLACK);
        c2.setForeground(Color.WHITE);
        c2.addActionListener(this);
        c2.setActionCommand("c2Click");
        c2.setMargin(new Insets(0, 0, 0, 0));
        this.add(c2);
//
        secretary = new JButton("Secr.");
        secretary.setBounds(700, 900, 50, 35);
        secretary.setBackground(Color.BLACK);
        secretary.setForeground(Color.WHITE);
        secretary.addActionListener(this);
        secretary.setActionCommand("secretaryClick");
        secretary.setMargin(new Insets(0, 0, 0, 0));
        this.add(secretary);

        ap1 = new JButton("AP");
        ap1.setBounds(590, 960, 40, 35);
        ap1.setBackground(Color.BLACK);
        ap1.setForeground(Color.WHITE);
        ap1.addActionListener(this);
        ap1.setActionCommand("ap1Click");
        ap1.setMargin(new Insets(0, 0, 0, 0));
        this.add(ap1);

        ap2 = new JButton("AP");
        ap2.setBounds(630, 960, 40, 35);
        ap2.setBackground(Color.BLACK);
        ap2.setForeground(Color.WHITE);
        ap2.addActionListener(this);
        ap2.setActionCommand("ap2Click");
        ap2.setMargin(new Insets(0, 0, 0, 0));
        this.add(ap2);

        kitchen1 = new JButton("Kitch.");
        kitchen1.setBounds(670, 960, 40, 35);
        kitchen1.setBackground(Color.BLACK);
        kitchen1.setForeground(Color.WHITE);
        kitchen1.addActionListener(this);
        kitchen1.setActionCommand("kitchen1Click");
        kitchen1.setMargin(new Insets(0, 0, 0, 0));
        kitchen1.setBorder(null);
        this.add(kitchen1);

        ap3 = new JButton("AP");
        ap3.setBounds(660, 900, 40, 35);
        ap3.setBackground(Color.BLACK);
        ap3.setForeground(Color.WHITE);
        ap3.addActionListener(this);
        ap3.setActionCommand("ap3Click");
        ap3.setMargin(new Insets(0, 0, 0, 0));
        this.add(ap3);

        principal = new JButton("Principal");
        principal.setBounds(605, 900, 55, 35);
        principal.setBackground(Color.BLACK);
        principal.setForeground(Color.WHITE);
        principal.addActionListener(this);
        principal.setActionCommand("principalClick");
        principal.setMargin(new Insets(0, 0, 0, 0));
        principal.setBorder(null);
        this.add(principal);

        health = new JButton("Health");
        health.setBounds(550, 930, 40, 65);
        health.setBackground(Color.BLACK);
        health.setForeground(Color.WHITE);
        health.addActionListener(this);
        health.setActionCommand("healthClick");
        health.setMargin(new Insets(0, 0, 0, 0));
        health.setBorder(null);
        this.add(health);

        br5 = new JButton("Bath.");
        br5.setBounds(550, 900, 40, 30);
        br5.setBackground(Color.BLACK);
        br5.setForeground(Color.WHITE);
        br5.addActionListener(this);
        br5.setActionCommand("br5Click");
        br5.setMargin(new Insets(0, 0, 0, 0));
        this.add(br5);

        validate();
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String eventName = event.getActionCommand();
        switch(eventName) {
            case "p1Click" :
                periodsTeacherLabel = new JPanel();
                periodsTeacherLabel.setLayout(new BoxLayout(periodsTeacherLabel, BoxLayout.PAGE_AXIS));
                periodsTeacherLabel.setBounds(0, 0, 150, 150);
                String[] p1TeachersSplit = p1Teachers.split(",");
                JLabel period1 = new JLabel(p1TeachersSplit[0]);
                period1.setSize(100, 100);
                period1.setFont(new Font(Font.SERIF, Font.BOLD, 16));
                periodsTeacherLabel.add(period1);
                JLabel period2 = new JLabel(p1TeachersSplit[1]);
                period2.setSize(100, 100);
                period2.setFont(new Font(Font.SERIF, Font.BOLD, 16));
                periodsTeacherLabel.add(period2);

                JLabel period3 = new JLabel(p1TeachersSplit[2]);
                period3.setSize(100, 100);
                period3.setFont(new Font(Font.SERIF, Font.BOLD, 16));
                periodsTeacherLabel.add(period3);

                JLabel period4 = new JLabel(p1TeachersSplit[3]);
                period4.setSize(100, 100);
                period4.setFont(new Font(Font.SERIF, Font.BOLD, 16));
                periodsTeacherLabel.add(period4);

                JLabel period5 = new JLabel(p1TeachersSplit[4]);
                period5.setSize(100, 100);
                period5.setFont(new Font(Font.SERIF, Font.BOLD, 16));
                periodsTeacherLabel.add(period5);

                JLabel period6 = new JLabel(p1TeachersSplit[5]);
                period6.setSize(100, 100);
                period6.setFont(new Font(Font.SERIF, Font.BOLD, 16));
                periodsTeacherLabel.add(period6);
                this.add(periodsTeacherLabel);
                repaint();

            case "p2Click" :
            case "p3Click" :
            case "p4Click" :
            case "p5Click" :
            case "p6Click" :
            case "p7Click" :
            case "p8Click" :
            case "p9Click" :
            case "r900Click" :
            case "r901Click" :
            case "r902Click" :
            case "r903Click" :
            case "r904Click" :
            case "r905Click" :
            case "r906Click" :
            case "r907Click" :
            case "r908Click" :
            case "r909Click" :
            case "r910Click" :
            case "r911Click" :
            case "r912Click" :
            case "r913Click" :
            case "r914Click" :
            case "r915Click" :
            case "r916Click" :
            case "r917Click" :
            case "r918Click" :
            case "r919Click" :
            case "r401Click" :
            case "r402Click" :
            case "r403Click" :
            case "r404Click" :
            case "r405Click" :
            case "r406Click" :
            case "r407Click" :
            case "r408Click" :
            case "r409Click" :
            case "r410Click" :
            case "r411Click" :
            case "r412Click" :
            case "r501Click" :
            case "r502Click" :
            case "r503Click" :
            case "r504Click" :
            case "r505Click" :
            case "r506Click" :
            case "r507Click" :
            case "r301Click" :
            case "r301aClick" :
            case "r301bClick" :
            case "r302Click" :
            case "r303Click" :
            case "r304Click" :
            case "r305Click" :
            case "r306Click" :
            case "r307Click" :
            case "r201Click" :
            case "r202Click" :
            case "r203Click" :
            case "r204Click" :
            case "r205Click" :
            case "r206Click" :
            case "r207Click" :
            case "r208Click" :
            case "r209Click" :
            case "r210Click" :
            case "r801Click" :
            case "r802Click" :
            case "r803Click" :
            case "r516Click" :
            case "r603Click" :
            case "r604Click" :
            case "r605Click" :
            case "r606Click" :
            case "r700Click" :
            case "r701Click" :
            case "r702Click" :
            case "r703Click" :
            case "gym1Click" :
            case "gym2Click" :
            case "l1Click" :
            case "l2Click" :
            case "boilerClick" :
            case "weightClick" :
            case "br1Click" :
            case "b2Click" :
            case "b3Click" :
            case "br4Click" :
            case "br5Click" :
            case "pl1Click" :
            case "pl2Click" :
            case "pl3Click" :
            case "pl4Click" :
            case "c1Click" :
            case "c2Click" :
            case "sp1Click" :
            case "off1Click" :
            case "off2Click" :
            case "off3Click" :
            case "off4Click" :
            case "off5Click" :
            case "r101Click" :
            case "r102Click" :
            case "r103Click" :
            case "r104Click" :
            case "r105Click" :
            case "auditoriumClick" :
            case "stageClick" :
            case "mediaClick" :
            case "darkClick" :
            case "copyClick" :
            case "musicTechClick" :
            case "studioClick" :
            case "dellClick" :
            case "BSAPClick" :
            case "BKClick" :
            case "englishClick" :
            case "cafeteriaClick" :
            case "kitchenClick" :
            case "facultyClick" :
            case "psychClick" :
            case "counselingClick" :
            case "frontClick" :
            case "front1Click" :
            case "secretaryClick" :
            case "principalClick" :
            case "healthClick" :
            case "kitchen1Click" :
            case "paClick" :
            case "ap1Click" :
            case "ap2Click" :
            case "ap3Click" :






        }

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getWheelRotation() < 0){
            zoomFactor *= 1.1;
            removePortables();
            initializePortables();
        }

        if (e.getWheelRotation() > 0){
            zoomFactor /= 1.1;
            removePortables();
            initializePortables();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}


