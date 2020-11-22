
package xmlparsing_sobhana;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class XMLparsing_Sobhana {

    
  public static int countCount=0;
  public static int countTitle=0;
  public static int countbook=0;
  public static int countPrice=0;
  public static int c=0;
 public static void main(String argv[]) {
String priceArray[] = new String[10]; 
Integer countArray[] = new Integer[10]; 
String titleArray[] = new String[10];
Integer bookArray[] = new Integer[10];

String count[] = new String[10];
  
    try {
 
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
 
	DefaultHandler handler = new DefaultHandler() {
 
	boolean bcount = false;
	boolean bprice = false;
	boolean bbook = false;
	boolean bisbn = false;
        boolean btitle = false;
        boolean bauthors = false;
        boolean bauthor = false;
        boolean bmanufacturer = false;
        boolean bmodel = false;
        boolean bstandard_feature = false;
        

 
	public void startElement(String uri, String localName,String qName, 
                Attributes attributes) throws SAXException {
 
		System.out.println("Start Element :" + qName);
 
		if (qName.equalsIgnoreCase("COUNT")) {
			bcount = true;
		}
 
		if (qName.equalsIgnoreCase("PRICE")) {
			bprice = true;
		}
 
		if (qName.equalsIgnoreCase("BOOK")) {
			bbook = true;
                        
		}
                if (qName.equalsIgnoreCase("ISBN")) {
			bisbn = true;
		}
                if (qName.equalsIgnoreCase("TITLE")) {
			btitle = true;
		}
                 if (qName.equalsIgnoreCase("AUTHORS")) {
			bauthors = true;
		}
                if (qName.equalsIgnoreCase("AUTHOR")) {
			bauthor = true;
		}
                if (qName.equalsIgnoreCase("Manufacturer")) {
			bmanufacturer = true;
		}
                 if (qName.equalsIgnoreCase("MODEL")) {
			bmodel = true;
		}
                if (qName.equalsIgnoreCase("standard_feature")) {
			bstandard_feature = true;
		}
 
	}
 
	public void endElement(String uri, String localName,
		String qName) throws SAXException {
 
		System.out.println("End Element :" + qName);
 
	}
 
	public void characters(char ch[], int start, int length) throws SAXException {
char a=0; 
		if (bcount) {
                    
                    
                    String strbookCount =new String(ch, start, length);
                    
                   int bookCount=Integer.parseInt(strbookCount);  

                    
                        countArray[countCount] = bookCount;
                         countCount=countCount+1;
			System.out.println("Count : " + bookCount);
                        c=bookCount;
                        
			bcount = false;
		}
 
		if (bprice) {
                    priceArray[countPrice] =new String(ch, start, length);
                    
                   

                    
                        
                         countPrice=countPrice+1;
			System.out.println("Price : " + new String(ch, start, length));
                        
			bprice = false;
		}
 
		if (bbook) {
                    
                        String bookNumber =new String(ch, start, length);
                        bookArray[countbook] =   c;
                        countbook=countbook+1;
                        
			//System.out.println("Book : " + bookprice);
			bbook = false;
		}
 
		if (bisbn) {
			System.out.println("ISBN : " + new String(ch, start, length));
			bisbn = false;
		}
                
                if (btitle) {
                    
                    String booktitle =new String(ch, start, length);
                    
                    

                    
                        titleArray[countTitle] = booktitle;
                        countTitle=countTitle+1;
			System.out.println("Title : " + booktitle);
			btitle = false;
		}
                
                if (bauthors) {
			//System.out.println("Authors : " + new String(ch, start, length));
			bauthors = false;
		}
                
                if (bauthor) {
			System.out.println("Author : " + new String(ch, start, length));
			bauthor = false;
                }
                if (bmanufacturer) {
			System.out.println("Manufacturer : " + new String(ch, start, length));
			bmanufacturer = false;
		}
                
                if (bmodel) {
			System.out.println("Model : " + new String(ch, start, length));
			bmodel = false;
                }
                if (bstandard_feature) {
			System.out.println("Standard_feature : " + new String(ch, start, length));
			bstandard_feature = false;
                }
                
               
 
	}
         
     };
        
 
       saxParser.parse("src\\Order.xml", handler);
      
       //count the number copies ordered for a particular book.
      
       System.out.println("\n\nCount the number copies ordered for a particular book.\n");
       for(int i=0;i<bookArray.length;i++)  
       {
           if(bookArray[i]!=null)
               {System.out.println("\nBook Name= "+titleArray[i] +"  & Order Count Number : "
                       + bookArray[i]);
               }
       }
       //The name and price of the book which got maximum number of orders
       System.out.println("\n\nThe name and price of the book which got maximum number of orders\n");
      int max = bookArray[0]; 
       for(int i=0;i<bookArray.length;i++)  
       {
           if(bookArray[i]!=null)
           { 
        
             if (bookArray[i] > max) 
                 max = bookArray[i]; 
        
           }
           
        }
       System.out.println("Maximum Number of orders: "+max);
       for(int i=0;i<bookArray.length;i++)
       {if(bookArray[i]!=null)
            {
                if(max==bookArray[i])
                {
                    System.out.println("Title of that book:   "+titleArray[i]+" & Price of that book:  "
                            +priceArray[i]);
                }
            }
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
 
   }

    
 
}
