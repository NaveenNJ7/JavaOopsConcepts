package PracticeLocators;

public class DemoLocators {
	
	public static void main(String[] args)
	{
		/*
		 Locators - These are the addresses used identify the elements on web page uniquely
		 
		 Types
		 Locators and Customized locators
		 Basic locators we will directly find in web page, they are
		 id, name, LinkText, partial linktext, tagname, classname
		 
		 id, name, linktext and partial linktext used to identify specific web element
		 tagname and classname used to identify group of elements
		 
		 find element is method, in that input is locator,input nothing but
		 using By class we will call methods id, name, link and partial linktext, tagname and classname
		 
		 find element returns single web element and return type is Webelement
		 
		 find elements is method in that input is locator used to identify group of elements
		 input is tagname and class name
		 
		 find elements returns group of elements and return type is List<WebElement>
		 
		 Difference linktext and partial link text
		 every link will have linktext, most of the time whatever we see on ui that will be the linktext
		 for linktext we need write full text
		 but for partial linktext we need to write portion of the text
		 
		 Difference between find elements and find element
		 1) Locator with single web element
		 findelement - returns single element - return type will be Webelement
		 findelements - returns single element - return type will be List<Webelement>
		 (in group of web elements, it will return first element of the list of web elements
		 
		 2) Locator with multiple webelements
		 findelement - returns single elment - return tyep will be webelement
		 findelments - return multiple elements - List<WebElement>
		 
		 3) locator is not matching any element
		 findelement - Through No such element exception
		 findelements - it returns Zero, because in list collection if there is no elements(empty list)
		 means it give zero only
		 
		 Note - in most of the cases in Html
		 for every link there will be href - hyperlink reference
		 a is the anchor tag
		 
		 inner text is different and link text is different
		 suppose if there is a heading on ui and in html inner text will there
		 
		 
		 
		 
		 */
	}

}
