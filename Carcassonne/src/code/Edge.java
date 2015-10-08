package code;

public class Edge extends TileFeature {
	
	
	
	public Edge(Feature feature1, Feature feature2, Feature feature3){
		super(feature1, feature2, feature3);
		
	}
		
	@Override 
	public boolean equals(Object obj){
		Edge edge = (Edge) obj;
		if (edge.getSection1()!=getSection1()){
			return false;
		}
		if (edge.getSection2()!=getSection2()){
			return false;
		}
		if (edge.getSection3()!=getSection3()){
			return false;
		}
		return true; 
	}
	
} 
