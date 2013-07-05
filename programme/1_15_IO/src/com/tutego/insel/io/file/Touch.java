package com.tutego.insel.io.file;

import java.io.*;

public class Touch
{
  public static void main( String[] args )
  {
    for ( String s : args )
    {
      File f = new File( s );

      if ( f.exists() )
      {
        if ( f.setLastModified( System.currentTimeMillis() ) )
          System.out.println( "Ber�hrte " + s );
        else
          System.out.println( "Konnte nicht ber�hren " + s );
      }
      else
      {
        try
        {
          f.createNewFile();
          System.out.println( "Legte neue Datei an " + s );
        } catch ( IOException e ) { e.printStackTrace(); }
      }
    }
  }
}
