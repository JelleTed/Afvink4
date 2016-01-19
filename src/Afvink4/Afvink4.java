
package Afvink4;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class Afvink4 extends JFrame {
    public static JTree tree;

    public Afvink4() {
    }

    public static void main(String[] args) {
        Afvink4 Frame = new Afvink4();
        Frame.CreateGui();
        Frame.setSize(300, 500);
        Frame.setVisible(true);
    }

    public void CreateGui() {
        JScrollPane treeView = new JScrollPane(tree);
        this.setDefaultCloseOperation(3);
        this.setTitle("tree");
        this.setContentPane(new MakeTree());
        this.add(treeView);
    }
}