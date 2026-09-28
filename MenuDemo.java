import javax.swing.*;

public class MenuDemo {
    JFrame f;
    JMenuBar mb;
    JMenu edit;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;

    // Constructor name must match the class name
    MenuDemo() {
        f = new JFrame();

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        mb = new JMenuBar();
        edit = new JMenu("Edit");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        mb.add(edit);

        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);

        f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        cut.addActionListener(e -> ta.cut());
        copy.addActionListener(e -> ta.copy());
        paste.addActionListener(e -> ta.paste());
        selectAll.addActionListener(e -> ta.selectAll());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuDemo::new);
    }
}
