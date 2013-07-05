package com.tutego.insel.xml.jdom;

import java.util.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

class Wedding
{
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );
    
    Element party = doc.getRootElement();
    Element albert = party.getChild( "gast" );
    
    Attribute albertName = albert.getAttribute( "name" );
    System.out.println( "albertName: " + albertName.getValue() );
    
    boolean albertLedig = albert.getChild( "zustand" ).getAttribute( "ledig" ).getBooleanValue();
    
    if ( albertLedig )
    {
      // Albert nimmt den Namen von Martina an
      albert.setAttribute( "name", "Albert Mutig" );
      
      // Martina trinkt seit der Hochzeit auch Wein
      Element wein = new Element( "getraenk" );
      wein.addContent( "Wein" );

      // Liste aller G�ste
      Iterator<?> gaesteListe = party.getChildren( "gast" ).iterator();

      while ( gaesteListe.hasNext() )
      {
        Element gast = (Element) gaesteListe.next();
        
        if ( "Martina Mutig".equals( gast.getAttribute( "name" ).getValue()) )
          gast.addContent( wein );
      }
    }

    XMLOutputter fmt = new XMLOutputter();
    fmt.output( doc, System.out );
  }
}
