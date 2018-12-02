package edu.ucsb.cs56.gaucho_gardens.webapp;
import lombok.Data;
import lombok.NoArgsConstructor; // @NonNull property ignored by this constructor

//All undefined methods are defined with lombok.Data
@Data
@NoArgsConstructor
public class Recipe{
	private String url;
	private String name;
	private String imageURL;

}
