import java.text.Collator;

class CollatorDemo
{
  public static void main( String[] args )
  {
    Collator col = Collator.getInstance();
    System.out.println( col.compare( "Armleuchter", "�tsch" ) ); // -1
    System.out.println( col.compare( "�tsch", "B�tsch" ) );      // -1
  }
}
