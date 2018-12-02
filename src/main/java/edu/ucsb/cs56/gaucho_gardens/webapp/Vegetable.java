package edu.ucsb.cs56.gaucho_gardens.webapp;
import lombok.Data;
import lombok.NoArgsConstructor; // @NonNull property ignored by this constructor

//All undefined methods are defined with lombok.Data
@Data
@NoArgsConstructor
public class Vegetable{
	private String name;
	private String color;
	private String season;
	private String imageURL;

	public Vegetable(String name, String color, String season, String imageURL){
		this.name = name;
		this.color = color;
		this.season = season;
		this.imageURL = imageURL;
	}



}
