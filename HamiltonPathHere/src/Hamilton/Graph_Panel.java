package Hamilton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Type;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Graph_Panel extends JPanel {
	
	ArrayList<Node> nodeList = new ArrayList<Node>();
	ArrayList<Edge> edgeList = new ArrayList<Edge>();
	int circleRadius = 20;
	
	ArrayList<ArrayList<Boolean>> adjacency = new ArrayList<ArrayList<Boolean>>();
        
        
	public Graph_Panel() {
		super();
	}
	
	public ArrayList<String> getConnected(String label) {
		ArrayList<String> toReturn = new ArrayList<String>();
		int j = getIndex(label);
		for (int i = 0; i < adjacency.size(); i++) {
			if (adjacency.get(j).get(i) && !nodeList.get(i).getLabel().equals(label)) {
				toReturn.add(nodeList.get(i).getLabel());
			}
		}
		return toReturn;
	}
        

        public void resetNode(){
            nodeList = new ArrayList<Node>();
            edgeList = new ArrayList<Edge>();
            adjacency = new ArrayList<ArrayList<Boolean>>();
        }
        
        public String expNode;
        public  String expEdge;
        public String expAdj;
        
        public void exportGraphPanel(){
            Gson json = new  Gson();
            expNode = json.toJson(nodeList); // xuat ra txt
            expEdge = json.toJson(edgeList); // xuat ra txt
            expAdj = json.toJson(adjacency); // xuat ra txt
            resetNode();
            
        }
     
        
        public void importGraphPanel(){
            Gson json = new  Gson();
            
            
            
            System.out.println(expNode+"\n"+expEdge+"\n"+expAdj+"n");
            Type NodeType = new TypeToken<ArrayList<Node>>(){}.getType();
            Type EdgeType = new TypeToken<ArrayList<Edge>>(){}.getType();
            Type AdjType = new TypeToken<ArrayList<ArrayList<Boolean>>>(){}.getType();
            nodeList = new  ArrayList<Node>(json.fromJson(expNode,NodeType)); 
            edgeList = new  ArrayList<Edge>(json.fromJson(expEdge,EdgeType)); 
            adjacency = new   ArrayList<ArrayList<Boolean>>(json.fromJson(expAdj,AdjType)); 
        }
   
        public int showEdge(){
            return edgeList.size();
        }
	public int showNode(){
            return nodeList.size();
        }
        
        public void inCanh(){
//            System.out.println("this is list of edges: " +egdeList );
        }

        public static int[][] graphSolve;
        
	public void printAdjacency() {            
                graphSolve = new int[adjacency.size()][adjacency.size()];
		for (int i = 0; i < adjacency.size(); i++) {
			for (int j = 0; j < adjacency.size(); j++) {
                                int temp = 0;
                                if(adjacency.get(i).get(j)){
                                    temp=1;
                                }
                                graphSolve[i][j]=temp;
			}
		} 
                
                
                
	}
        

	
	public void addNode(int newX, int newY, String newLabel) {
		nodeList.add(new Node(newX, newY, newLabel));
		adjacency.add(new ArrayList<Boolean>());
		for (int i = 0; i < adjacency.size() - 1; i++) {
			adjacency.get(i).add(false);
		}
		for (int i = 0; i < adjacency.size(); i++) {
			adjacency.get(adjacency.size() - 1).add(false);
		}
		printAdjacency();
	}
	
	public Node getNode(int x, int y) {
		for (int i = 0; i < nodeList.size(); i++) {
			Node node = nodeList.get(i);
			// a^2 + b^2 = c^2
			double radius = Math.sqrt(Math.pow(x - node.getX(), 2) + Math.pow(y - node.getY(), 2));
			if (radius < circleRadius) {
				return nodeList.get(i);
			}
		}
		return null;
	}
	
	public Node getNode(String s) {
		for (int i = 0; i < nodeList.size(); i++) {
			Node node = nodeList.get(i);
			if (s.equals(node.getLabel())) {
				return node;
			}
		}
		return null;
	}
	
	public int getIndex(String s) {
		for (int i = 0; i < nodeList.size(); i++) {
			Node node = nodeList.get(i);
			if (s.equals(node.getLabel())) {
				return i;
			}
		}
		return -1;
	}
	
	public void addEdge(Node first, Node second, String newLabel) {
		edgeList.add(new Edge(first, second, newLabel));
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0; i < nodeList.size(); i++) {
			if (first.equals(nodeList.get(i))) {
				firstIndex = i;
			}
			if (second.equals(nodeList.get(i))) {
				secondIndex = i;
			}
		}
		adjacency.get(firstIndex).set(secondIndex, true);
		adjacency.get(secondIndex).set(firstIndex, true);
		
		printAdjacency();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
                
		for (int i = 0; i < edgeList.size(); i++) {
			g.setColor(Color.BLACK);
			g.drawLine(edgeList.get(i).getFirst().getX(), edgeList.get(i).getFirst().getY(), edgeList.get(i).getSecond().getX(), edgeList.get(i).getSecond().getY());
			int x1 = edgeList.get(i).getFirst().getX();
			int y1 = edgeList.get(i).getFirst().getY();
			int x2 = edgeList.get(i).getSecond().getX();
			int y2 = edgeList.get(i).getSecond().getY();
			
			g.drawString(edgeList.get(i).getLabel(),
						 Math.min(x1, x2) + Math.abs(x2 - x1) / 2,
						 Math.min(y1, y2) + Math.abs(y2 - y1) / 2);
		}
                
		for (int i = 0; i < nodeList.size(); i++) {
			
                        //to mau vong tron
                        g.setColor(Color.WHITE);
			g.fillOval(nodeList.get(i).getX() - circleRadius, nodeList.get(i).getY() - circleRadius, circleRadius*2, circleRadius*2);
			if (nodeList.get(i).getHighlighted()) {
				g.setColor(Color.RED); // mau khi Add egde
			}
			else {
				g.setColor(Color.BLACK);
			}
                        // ve vong tron
			g.drawOval(nodeList.get(i).getX() - circleRadius, nodeList.get(i).getY() - circleRadius, circleRadius*2, circleRadius*2);
                        //can chinh So trong vong tron
			g.drawString(nodeList.get(i).getLabel(), nodeList.get(i).getX() - (g.getFontMetrics().stringWidth(nodeList.get(i).getLabel()) / 2), nodeList.get(i).getY() + (g.getFontMetrics().getHeight() / 4));
		}
		
	}

	public void stopHighlighting() {
		for (int i = 0; i < nodeList.size(); i++) {
			nodeList.get(i).setHighlighted(false);
		}
	}
        
//        public void pathDisplay(Graphics h) {
//        
//		for (int i = 0; i < edgeList.size(); i++) {
//			h.setColor(Color.BLACK);
//			h.drawLine(edgeList.get(i).getFirst().getX(), edgeList.get(i).getFirst().getY(), edgeList.get(i).getSecond().getX(), edgeList.get(i).getSecond().getY());
//		}
//	}
        

}

