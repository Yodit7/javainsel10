package com.tutego.insel.thread;

import javax.swing.JOptionPane;

class ThatsMyEnd
{
  public static void main( String[] args )
  {
    Runtime.getRuntime().addShutdownHook( new Thread() {
      @Override public void run() {
        System.out.println( "Jedes Leben endet t�dlich." );
      }
    } );
    
    JOptionPane.showConfirmDialog( null, "Ende?" );
    System.exit( 0 );
  }
}
