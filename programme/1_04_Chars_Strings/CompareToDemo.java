public class CompareToDemo
{
  public static void main( String[] args )
  {
    System.out.println( "Justus".compareTo( "Bob" ) > 0 );   //"Justus" ist lexikografisch gr��er als "Bob"
    System.out.println( "Justus".compareTo( "Justus" ) == 0 );
    System.out.println( "Justus".compareTo( "Peter" ) < 0 );
  }
}
