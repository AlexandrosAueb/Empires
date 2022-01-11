import java.awt.Color;
import java.util.ArrayList;
public class Region {
	
	private String regionName;
	private int regionSoldiers;
	private Color regionColor;
	private ArrayList<String> borders = new ArrayList<String>();
	
	
	public Region(String regionName, int regionSoldiers, Color blue, ArrayList<String> borders) {
		this.regionName = regionName;
		this.regionSoldiers = regionSoldiers;
		this.regionColor = blue;
		this.borders = borders;
	}

	public String getRegionName() {
		return regionName;
	}
	
	public void setRegionName(String regionName ) {
		this.regionName = regionName;
	}
	
	public int getRegionSoldiers() {
		return regionSoldiers;
	}

	public void setRegionSoldiers(int regionSoldiers) {
		this.regionSoldiers = regionSoldiers;
	}

	public Color getRegionColor() {
		return regionColor;
	}

	public void setRegionColor(Color regionColor) {
		this.regionColor = regionColor;
	}

	public ArrayList<String> getBorders() {
		return borders;
	}

	public void setBorders(ArrayList<String> borders) {
		this.borders = borders;
	}

	@Override
	public String toString() {
		return "Welcome to " + regionName + ". Soldiers :" + regionSoldiers;
	}			
}
