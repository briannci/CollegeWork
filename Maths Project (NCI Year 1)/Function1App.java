/*
* Function1App.java
* @author: Brian Murphy
* 12/11/2012
*/


import javax.swing.JOptionPane;


	public class Function1App{
		public static void main (String args[]){

		int x;
		int y;
		String option;

		Function1 myFunction = new Function1();

		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a value for x"));

        option = JOptionPane.showInputDialog(null,
        "Please enter which compositions you would ilke to calculate: fof, gog, fog, gof, f-1of, g-1og");

        if(option.equals("fof")){
		//fof
		 myFunction.setX(x);
		 myFunction.computef();
		 y = myFunction.getY();
		 myFunction.setX(y);
	     myFunction.computef();

	     y = myFunction.getY();

	     JOptionPane.showMessageDialog(null,"the result of fof is "+y);

	  }
	else if(option.equals("gog")){

		 //gog
		 myFunction.setX(x);
		 myFunction.computeg();
		 y = myFunction.getY();

		 JOptionPane.showMessageDialog(null,"the result of gog is "+y);
    }
	else if(option.equals("fog")){

		 //fog
		 myFunction.setX(x);
		 myFunction.computef();
		 y = myFunction.getY();

		 JOptionPane.showMessageDialog(null,"the result of fog is "+y);
	}
    else if(option.equals("gof")){

		//gog
		myFunction.setX(x);
		myFunction.computeg();
	    y = myFunction.getY();

	    JOptionPane.showMessageDialog(null,"the result of gog is "+y);
	}
	else if(option.equals("f-1of")){

	    //f inverse
		myFunction.setX(x);
		myFunction.computefInverse();
	    y = myFunction.getY();

	    JOptionPane.showMessageDialog(null,"the result of f Inverse is "+y);
	}
	else if(option.equals("f-1")){

		//g Inverse
		myFunction.setX(x);
	    myFunction.computegInverse();
	    y = myFunction.getY();

	    JOptionPane.showMessageDialog(null,"the result of g Inverse is "+y);
	}
  }




