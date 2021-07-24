package org.add;

public class GreensTech {
public void greensOmr(String Address, int Blockno) {
	System.out.println(Address+"\n"+Blockno);
}public void greensOmr(int Branchno, String Contactemail) {
	System.out.println(Branchno+"\n"+Contactemail);	
}public static void main(String[] args) {
	GreensTech g = new GreensTech();
	g.greensOmr(7, "greenstech@gmail.com");
	g.greensOmr("OMR Chennai", 55);
}
}
