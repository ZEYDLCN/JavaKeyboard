package work;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class keyboard extends JFrame implements ActionListener{
private JButton []  btn;

private String[] letters= {" '' ","1","2","3","4","5","6","7","8","9","0","*","-","   ⌫   ","  ⇆   " ,
"A","B","C","D","E","F","G","H","I","J",","," K ","<",">",
"   ↩   ","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",".",
"Space"};

private JTextArea text1;
private JPanel pnl1;
public keyboard() {

setLayout(new GridLayout(2,1));

btn= new JButton[47];

    text1=new JTextArea();  
    pnl1=new JPanel();
      add(text1);
     
  pnl1.setLayout(new FlowLayout());
   
for(int i=0;i<btn.length;i++)
{
btn[i]= new JButton(letters[i]);
pnl1.add(btn[i]);
btn[i].addActionListener(this);
}

btn[46].setPreferredSize(new Dimension(350, 30));
   add(pnl1);


setTitle("my screen keyboard");
setVisible(true);
setSize(770,350);
setLocationRelativeTo(null);
}
public static void main(String[] args) {
new keyboard();
}
@Override
public void actionPerformed(ActionEvent e) {
String a=text1.getText();
if(e.getSource()==btn[0]) {
text1.setText(a+ "''");
}
else if(e.getSource()==btn[1]) {
text1.setText(a+"1");
}
else if(e.getSource()==btn[2]) {
text1.setText(a+"2");
}
else if(e.getSource()==btn[3]) {
text1.setText(a+"3");
}
else if(e.getSource()==btn[4]) {
text1.setText(a+"4");
}
else if(e.getSource()==btn[5]) {
text1.setText(a+"5");
}
else if(e.getSource()==btn[6]) {
text1.setText(a+"6");
}else if(e.getSource()==btn[7]) {
text1.setText(a+"7");
}
else if(e.getSource()==btn[8]) {
text1.setText(a+"8");
}
else if(e.getSource()==btn[9]) {
text1.setText(a+"9");
}else if(e.getSource()==btn[10]) {
text1.setText(a+"0");
}
else if(e.getSource()==btn[11]) {
text1.setText(a+"*");
}
else if(e.getSource()==btn[12]) {
text1.setText(a+"-");

   }
else if(e.getSource()==btn[13]) {
text1.setText(a.substring(0,a.length()-1));   // SİLME TUŞU
}

else if(e.getSource()==btn[14]) {
text1.setText(a+" ");                      // TAB BOŞLUK
}

else if(e.getSource()==btn[15]) {
text1.setText(a+"A");
}
else if(e.getSource()==btn[16]) {
text1.setText(a+"B");
}else if(e.getSource()==btn[17]) {
text1.setText(a+"C");
}
else if(e.getSource()==btn[18]) {
text1.setText(a+"D");
}
else if(e.getSource()==btn[19]) {
text1.setText(a+"E");
}else if(e.getSource()==btn[20]) {
text1.setText(a+"F");
}
else if(e.getSource()==btn[21]) {
text1.setText(a+"G");
}
else if(e.getSource()==btn[22]) {
text1.setText(a+"H");
}
else if(e.getSource()==btn[23]) {
text1.setText(a+"I");
}
else if(e.getSource()==btn[24]) {
text1.setText(a+"J");

}else if(e.getSource()==btn[25]) {
text1.setText(a+",");
}

else if(e.getSource()==btn[26]) {
text1.setText(a+"K");      
}


else if(e.getSource()==btn[27]) {
text1.setText(a+"<");
}else if(e.getSource()==btn[28]) {
text1.setText(a+">");
}
else if(e.getSource()==btn[29]) {

text1.setText(a+"\n"); //ENTER TUŞU
}
else if(e.getSource()==btn[30]) {
text1.setText(a+"L");
} else if(e.getSource()==btn[31]) {
text1.setText(a+"M");
}
else if(e.getSource()==btn[32]) {
text1.setText(a+"N");
}else if(e.getSource()==btn[33]) {
text1.setText(a+"O");
}
else if(e.getSource()==btn[34]) {
text1.setText(a+"P");
}
else if(e.getSource()==btn[35]) {
text1.setText(a+"Q");
}else if(e.getSource()==btn[36]) {
text1.setText(a+"R");
}
else if(e.getSource()==btn[37]) {
text1.setText(a+"S");
}
else if(e.getSource()==btn[38]) {
text1.setText(a+"T");
}
else if(e.getSource()==btn[39]) {
text1.setText(a+"U");
}
else if(e.getSource()==btn[40]) {
text1.setText(a+"V");
}else if(e.getSource()==btn[41]) {
text1.setText(a+"W");
}
else if(e.getSource()==btn[42]) {
text1.setText(a+"X");
}
else if(e.getSource()==btn[43]) {
text1.setText(a+"Y");
}
else if(e.getSource()==btn[44]) {
text1.setText(a+"Z");
}
else if(e.getSource()==btn[45]) {
text1.setText(a+".");
}
else if(e.getSource()==btn[46]) {
text1.setText(a+"  ");
}

}


}