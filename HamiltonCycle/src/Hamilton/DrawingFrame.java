package Hamilton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import static Hamilton.Graph_Panel.graphMatrix;
import static Hamilton.MainFrame.state;
import javax.swing.BorderFactory;


public class DrawingFrame implements ActionListener, MouseListener {

    public static JFrame frame = new JFrame();
    Graph_Panel G_panel = new Graph_Panel();
    final int NODE_CREATE = 0;
    final int EDGE_FIRST = 1;
    final int EDGE_SECOND = 2;
    final int NODE_REMOVE = 3;
    
    Node first = null;
    ArrayList<Node> node = new ArrayList<Node>();


    public DrawingFrame() {
        //custom drawning frame
        frame.setSize(796, 723);
        frame.setResizable(false);
        frame.setLocation(570, 0);

        frame.setLayout(new BorderLayout());
        frame.add(G_panel);
        G_panel.setBorder(BorderFactory.createTitledBorder("Drawing panel 🖊"));
        frame.setVisible(true);
        frame.setTitle("B1805911");
        G_panel.addMouseListener(this);

    }
    
    //layy gia tri canh
    public int showEdge() {
        return G_panel.showEdge();
    }
    //lay gia tri dinh
    public int showNode() {
        return G_panel.showNode();
    }
    
    //reset tat ca cac dinh tren panel
    public void reset() {
        G_panel.resetNode();
        
        frame.repaint();
        count = 0;
    }
    
    //ham export
    public void exportGraph(){
        G_panel.exportGraphPanel();
        frame.repaint();
        count=0;
    }
    //ham import
    public void importGraph(){
        G_panel.resetNode();
        G_panel.importGraphPanel();
        frame.repaint();
        count = G_panel.Vcount;
        G_panel.printAdjacency();
    }


    public static void findHamiltonCycle() {
        int[][] temp = new int[graphMatrix.length][graphMatrix.length];
        Hamilton_Algorithm hc = new Hamilton_Algorithm();
        for (int i = 0; i < graphMatrix.length; i++) {
            for (int j = 0; j < graphMatrix.length; j++) {
                temp[i][j] = graphMatrix[i][j];
            }
        }
        hc.findHamiltonianCycle(temp);
    }

        
    public static void checkConnectivity() {
        Connectivity cnComponents = new Connectivity(graphMatrix.length+1);
        
        int[][] temp = new int[graphMatrix.length][graphMatrix.length];
        for (int i = 0; i < graphMatrix.length; i++) {
            for (int j = 0; j < graphMatrix.length; j++) {
                temp[i][j] = graphMatrix[i][j];
                if(temp[i][j]==1){
                    cnComponents.addEdge(i+1,j+1);
                }
            }
        }
        System.out.println("\nMiền liên thông: \n");
        cnComponents.connectedComponents();
    }
    
    
    public void refreshRedline(){
        G_panel.refresh();
    }
    
    public void reDraw(){
        frame.repaint();
    }


    public int count = 0;

    @Override
    public void mouseReleased(MouseEvent e) {
        if (state == NODE_CREATE) {
            count++;
            G_panel.addNode(e.getX(), e.getY(), String.valueOf(count));
        } else if (state == EDGE_FIRST) {
            Node n = G_panel.getNode(e.getX(), e.getY());
            if (n != null) {
                first = n;
                state = EDGE_SECOND;
                n.setHighlighted(true);
            }
        } else if (state == EDGE_SECOND) {
            Node n = G_panel.getNode(e.getX(), e.getY());
            if (n != null && !first.equals(n)) {
                String s = String.valueOf(count);

                first.setHighlighted(false);
                G_panel.addEdge(first, n, ""); // trong so cua canh
                first = null;
                state = EDGE_FIRST;

            }
        }
//        else if (state == NODE_REMOVE){
//            Node n = G_panel.getNode(e.getX(), e.getY());
////            System.out.println("remove check!");
//            G_panel.removeNode(e.getX(), e.getY());
//            frame.repaint();
//        }
        frame.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
