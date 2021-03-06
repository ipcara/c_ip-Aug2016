package textExcel;

public class PercentCell implements Cell {

private String text;
private double doubleValue; 
	
public PercentCell(String value){
	super(value);
	doubleValue = Double.parseDouble(value);
	text = value;
	doubleValue = doubleValue/100.0;
}
	
	public String abbreviatedCellText() {
		String abv = text;
		if(abv.indexOf(".")>=0){
			abv = abv.substring(0, abv.indexOf("."))+"%";
		}
		while(abv.length()<10){
			abv = abv + " ";
		}
		return abv;
	}

	public String fullCellText() { 
		return (doubleValue+"");
	}
	
	public double getDoubleValue(){
		return doubleValue;
	}
	


}








