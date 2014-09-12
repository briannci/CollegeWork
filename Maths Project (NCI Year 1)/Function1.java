/*
* Function1.java
* @author: Brian Murphy
* 04/12/2012
*/


	public class Function1{

		//data members
		private int x;
		private int y;
		private int option;
		private int returned;
		private boolean error;

	 	//constructor
		 public Function1(){
		 this.x = 0;
		 this.y = 0;
		 this.option = 0;
		 this.error = false;
       }
		//Set Methods
		public void setX(int x){
			this.x = x;
		}

		public void setOption(int option){
		this.option = option;
	    }

		//compute methods
		public void computeF(int x){
		int y = ((int)Math.pow(x,2) + (2*x) + 1);
			return y;
	    }

		public void computeFInverse(int y){
	    int x =(int)(Math.sqrt(y) - 1);
			return x;
	    }

		public void computeG(int x){
		int y =((int)(9*Math.pow(x,2) - 1));
			return y;
     	}

		public void computeGInverse(int y){
		int x = Math.pow(9x,2)+1;
			return x;(int)(Math.sqrt((y+1)/9));
	    }

	public void compute(){
		switch(option){
		case 1: returned = functionF(functionF(x)); break;
		case 2: returned = functionG(functionG(x)); break;
		case 3: returned = functionG(functionF(x)); break;
		case 4: returned = functionF(functionG(x)); break;
		case 5: returned = inverseF(functionF(x));  break;
		case 6: returned = inverseG(functionG(x));  break;
		default: error = true;
	}
}


	//get methods
		public int getX(){
			return x;
		}

		public int getResult(){
			return returned;
	    }

	    public int getError(){
			return error;
		}
}









