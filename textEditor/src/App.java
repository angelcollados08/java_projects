
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

class App extends JFrame implements ActionListener {

    // menubar
    static JMenuBar mb;
 
    // JMenu
    static JMenu x,x2;
 
    // Menu items
    static JMenuItem m1, m2, m3, m4, m12 , m22 , m32, mc;
 
    // create a frame
    static JFrame f;

    App(){
                // creating instance of JFrame with name "first way"
        f=new JFrame("editor");

                    try {
                        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    } catch (ClassNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (UnsupportedLookAndFeelException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
 
            // Set theme to ocean
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());

        mb = new JMenuBar();
        x = new JMenu("File");
        m1 = new JMenuItem("open");
        m2 = new JMenuItem("save");
        m3 = new JMenuItem("print");
        m4 = new JMenuItem("new");
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);




        x2 = new JMenu("Edit");
        m12 = new JMenuItem("cut");
        m22 = new JMenuItem("copy");
        m32 = new JMenuItem("paste");
        m12.addActionListener(this);
        m22.addActionListener(this);
        m32.addActionListener(this);




        mc = new JMenuItem("close");

        x.add(m1);
        x.add(m2);
        x.add(m3);
        x.add(m4);

        x2.add(m12);
        x2.add(m22);
        x2.add(m32);


        mb.add(x);
        mb.add(x2);
        mb.add(mc);


        f.setJMenuBar(mb);


         
        // creates instance of JButton
        JButton button = new JButton("let's see");
 
        button.setBounds(200, 150, 90, 50);
         
        // setting close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // adds button in JFrame
        f.add(button);
 
        // sets 500 width and 600 height
        f.setSize(500, 600);
         
        // uses no layout managers
        f.setLayout(null);
         
        // makes the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
