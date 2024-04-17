class NestedTry{
	public static void main(String[]args){
		int number[]={20,40,60,80,100};
		int denom[]={5,0,0,10};
		try{
			for(int i=0;i<number.length;i++){
				try{
					int q=number[i]/denom[i];
					System.out.println(number[i]+"/"+denom[i]+"="+q);
				}
				catch(ArithmeticException e){
					System.out.println("Divide by 0: "+e);
				}
				catch(IndexOutOfBoundsException e){
					System.out.println("Out of Bound: "+e);
					System.out.println("Program Terminated");
				}
			}
		}
		finally{
			System.out.println("In Final Block");
		}
	}
}
