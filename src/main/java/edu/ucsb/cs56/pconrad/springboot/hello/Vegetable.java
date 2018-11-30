package edu.ucsb.cs56.pconrad.springboot.hello;

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

	public String getName(){return name;}
	public String getColor(){return color;}
	public String getSeason(){return season;}
	public String getImageURL(){return imageURL;}

	@Override
	public String toString(){
		return "Name: " + name + " Color: " + color + " Season: " + season + " URL: " + imageURL;
	}

	@Override
	public boolean equals(Object o){

	//	if (!isInstanceOf(Vegetable))
	//		return false;

		String str_1 = this.toString();
		String str_2 = o.toString();

		return str_1.equals(str_2);
	}

}
