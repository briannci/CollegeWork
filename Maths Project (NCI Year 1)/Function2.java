/*
* Function2.java
* @author: Brian Murphy
* 12/11/2012
*/


	public class Function2{

		//data members
		private int x,y;
		private boolean conjunction;
		private boolean disjunction;
		private boolean negation;
		private boolean error;

		public Function2(){
			this.x = 0;
			this.y = 0;
			this.conjunction = false;
	    	this.disjunction = false;
			this.negation = false;
			this.error=false;
		}

		//Set Methods
		public void setX(int x){
			this.x = x;
		}

		public void setY(int y){
		this.y = y;
		}

		//compute methods
		public void compute(){
			if((x%2 == 0) & (y <= 10)){
			conjunction = true;
			} else {
				conjunction = false;
			}

			if((x%2 == 0) | (y <= 10)){
				disjunction = true;
			} else {
				conjunction = false;
			}

			if((x%2 == 0) == true){
				negation = false;
			} else if ((x%2 == 0) == false){
				negation = true;
			} else {
				negation = false;
				error = true;
		}
	}

		//get methods
	public boolean getConjunction(){
		return conjunction;
	}

	public boolean getDisjunction(){
		return disjunction;
	}

	public boolean getNegationP(){
		return negation;
	}

	public boolean getError(){
		return error;
	}

}