package edu.ucsb.cs56.gaucho_gardens.webapp;
import lombok.Data;
import lombok.NoArgsConstructor; // @NonNull property ignored by this constructor
import org.springframework.data.annotation.Id;
//All undefined methods are defined with lombok.Data
@Data
@NoArgsConstructor
public class Recipe{
	@Id private String id;
	private String url;
	private String name;
	private String imageURL;

}
