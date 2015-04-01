package month.java;

public class UsingEnum {
	Month month;
 public	UsingEnum(Month month){
		this.month = month;
			
	}
	
public void selectMonth(){
	switch(month){
	case January :
		 System.out.println("------------january -----------------------");
			
		 break;
	case  February :
		 System.out.println("-----------february ----------------------");
			
		 break;
	
    case March  :
	     System.out.println("-----------march----------------------");
		
	     break;

    case April :
    	System.out.println("------------april----------------------");
		
    	break;

    case  May :
    	System.out.println("------------may----------------------");
		
    	break;

    case  June  :
    	System.out.println("-----------jun----------------------");
		
    	break;

    case July :
    	System.out.println("-----------july -----------------------");
		
    	break;
    case  August :
    	System.out.println("-----------augast----------------------");
		
    	break;
   case September:
	   System.out.println("------------september----------------------");
		
	    break;
    case October :
	 System.out.println("-----------octobar---------------------");
		
	    break;
     case November :
    	 System.out.println("-----------november----------------------");
		
	   break;
    case December :
    	System.out.println("------------december----------------------");
		
    	break;
	 
	}
	
   }

}

