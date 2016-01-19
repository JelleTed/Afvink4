//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Afvink4;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

class MakeTree extends JTree {
    private final DefaultTreeModel treeModel;

    MakeTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Derde Jaar");
        DefaultMutableTreeNode stage = new DefaultMutableTreeNode("Stage");
        DefaultMutableTreeNode minor = new DefaultMutableTreeNode("Minor");
        DefaultMutableTreeNode HAN = new DefaultMutableTreeNode("HAN");
        DefaultMutableTreeNode binnenland = new DefaultMutableTreeNode("Binnenland");
        DefaultMutableTreeNode buitenland = new DefaultMutableTreeNode("Buitenland");
        DefaultMutableTreeNode bio = new DefaultMutableTreeNode("Lab-Slaafje");
        DefaultMutableTreeNode technisch = new DefaultMutableTreeNode("Code-Monkey");
        DefaultMutableTreeNode Europa = new DefaultMutableTreeNode("Europa");
        root.add(stage);
        root.add(minor);
        stage.add(binnenland);
        stage.add(buitenland);
        binnenland.add(bio);
        binnenland.add(technisch);
        buitenland.add(Europa);
        minor.add(HAN);
        this.treeModel = new DefaultTreeModel(root);
        this.setModel(this.treeModel);
    }
}
