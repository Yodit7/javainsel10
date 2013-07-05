import java.io.*;
import java.util.*;

public class ReadColorTable
{
  private static int[] readColorTable( String filename )
  {
    int[] colors = new int[ 256 ];
    Scanner input = null;
    try
    {
      input = new Scanner( new File(filename) );
      while ( input.hasNextLine() )
      {
        int index = input.nextInt();
        int rgb   = input.nextInt( 16 );
        colors[ index ] = rgb;
      }
      return colors;
    }
    catch ( IOException e )
    {
      System.err.printf( "Dateioperationen fehlgeschlagen%n%s%n", e );
    }
    catch ( InputMismatchException | ArrayIndexOutOfBoundsException e )
    {
      System.err.printf( "Datenformat falsch%n%s%n", e );
    }
    finally
    {
      input.close();
    }
    return null;
  }

  public static void main( String[] args )
  {
    readColorTable( "basiscolors.txt" );
  }
}