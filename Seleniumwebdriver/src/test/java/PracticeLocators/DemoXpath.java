package PracticeLocators;

public class DemoXpath {

	public static void main(String[] args)
	{
	/*
	   Xpath - which is derived from xml,
	   xml means - extensible markup language
	   
	   Xpath works based on DOM, Dom which will loaded at run time, whenever we browse something
	   that time it will get created.
	   2 types are there
	   1)Absolute xpath 2)Relative xpath
	   
	   1) Absolute xpath - it will starts from root node of html and capture all the nodes or tags
	      till it reaches the element
	      Ex - /html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/div[1]/a[1]
	      it contains only tags and not attribute
	      
	   2) Relative xpath - it will directly jump into the element by using attribute
	      Ex - //a[@class='nav-menu-link']   
		  it contains both tag and attribute
		  
		  we prefer Relative xpath all the time because
		  sometime developer may add new element or delete something or alter something
		  that time it will affect the hierarchy or that it is difficult find out the element using 
		  Absolute xpath because it used only tags
		  but in relative xpath it uses attribute of an element so we prefer Relative xpath
		  
		Difference between absolute xpath and relative xpath
		1) AX - it starts from single slash /
		1) RX - It starts form double slash //
		
		2) AX - It does not contain any attribute, contains only tags
		2) RX - It contains both tags and attribute or works with attribute
		
		3) AX - It will capture each node till it reaches element
		3) RX - It will jump to element using attribute
		
		Relative xpath
		we can write in two ways
		1)Automatically - using Devtools and selectors hub
		  inspect element and Dom will open, right click on the locators or attribute and copy full path or
		  xpath
		2)Manually -> below are the examples
		syntax ->
				 //tagname[@attribute="value"]
				 //tagname[@attribute="value"][@attribute="value"]
				 //tagname[@attribute="value" and @attribute="value"]
				 //tagname[@attribute="value" or @attribute="value"]
			     //tagname[text()="innertext/linktext"]
			     //tagname[contains(@attribute,"value")]
			     //tagname[contains(text(),innertext/linktext)]
			     //tagname[starts-with(@attribute,"value")]
			     //tagname[@attribute="value"]/parenttag/parenttag	  
		   
		   
		   
		   
		   
		   
		   
	*/
	}
}
