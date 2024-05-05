package PBTPKG1 ;
import javax.swing.JOptionPane;
public class C
{
  private void priv(int p, int q)
 { 
    int x =q;
   int  y = p;
  int c = x+y;
   
    JOptionPane.showMessageDialog(null,"I am a priv Abstract methed "+ c);
 }
   void nomodi()
   {
          JOptionPane.showMessageDialog(null,"I am a nomodi Abstract methed ");
   }
   protected void pro()
{
   JOptionPane.showMessageDialog(null,"I am a protected Abstracted methed ");
} 
 public void pub()
  {
    JOptionPane.showMessageDialog(null,"I am a public Abstract methed :");
  }

}