package Hamilton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import static Hamilton.Graph_Panel.graphSolve;
import static Hamilton.MainFrame.state;
import javax.swing.BorderFactory;

public class DrawingFrame implements ActionListener, MouseListener {

    public static JFrame frame = new JFrame();
    Graph_Panel panel = new Graph_Panel();
    final int NODE_CREATE = 0;
    final int EDGE_FIRST = 1;
    final int EDGE_SECOND = 2;

    Node first = null;
    ArrayList<Node> hamilPath = new ArrayList<Node>();

    String hamilPathString = "";

    public DrawingFrame() {
        
        //custom drawning frame
        frame.setSize(796, 723);
        frame.setResizable(false);
        frame.setLocation(570, 0);

        frame.setLayout(new BorderLayout());
        frame.add(panel);
        panel.setBorder(BorderFactory.createTitledBorder("Drawing panel 🖊"));
        frame.setVisible(true);
        frame.setTitle("B1805911");
        panel.addMouseListener(this);

    }
    
    //layy gia tri canh
    public int showEdge() {
        return panel.showEdge();
    }
    //lay gia tri dinh
    public int showNode() {
        return panel.showNode();
    }
    
    //reset tat ca cac dinh tren panel
    public void reset() {
        panel.resetNode();
        frame.repaint();
        count = 0;
    }
    
    //ham export
    public void exportGraph(){
        panel.exportGraphPanel();
        frame.repaint();
    }
    //ham import
    public void importGraph(){
        panel.importGraphPanel();
        frame.repaint();
    }





    public static void findGraph() {
        int[][] temp = new int[graphSolve.length][graphSolve.length];
        Hamilton_Althorithm hc = new Hamilton_Althorithm();
        for (int i = 0; i < graphSolve.length; i++) {
            for (int j = 0; j < graphSolve.length; j++) {
                temp[i][j] = graphSolve[i][j];
            }
        }
        hc.findHamiltonianCycle(temp);
    }

        
    public static void checkConnectivity() {
        Connectivity graphConnected = new Connectivity(graphSolve.length+1);
        
        int[][] temp = new int[graphSolve.length][graphSolve.length];
        for (int i = 0; i < graphSolve.length; i++) {
            for (int j = 0; j < graphSolve.length; j++) {
                temp[i][j] = graphSolve[i][j];
//                System.out.print(temp[i][j] + " ");
                if(temp[i][j]==1){
                    System.out.println((i+1)+" "+(j+1));
                    graphConnected.addEdge(i+1,j+1);
                }
            }
        }
        System.out.println("Following are connected components");
        graphConnected.connectedComponents();
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

    public int count = 0;

    @Override
    public void mouseReleased(MouseEvent e) {
        if (state == NODE_CREATE) {
            count++;
            panel.addNode(e.getX(), e.getY(), String.valueOf(count));
        } else if (state == EDGE_FIRST) {
            Node n = panel.getNode(e.getX(), e.getY());
            if (n != null) {
                first = n;
                state = EDGE_SECOND;
                n.setHighlighted(true);
            }
        } else if (state == EDGE_SECOND) {
            Node n = panel.getNode(e.getX(), e.getY());
            if (n != null && !first.equals(n)) {
                String s = String.valueOf(count);

                first.setHighlighted(false);
                panel.addEdge(first, n, "");
                first = null;
                state = EDGE_FIRST;

            }
        }
        frame.repaint();
    }

    public void travelling(Node n, ArrayList<Node> path) {
        for (int i = 0; i < path.size(); i++) {
            hamilPath.add(path.get(i));
        }
    }

}
