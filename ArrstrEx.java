class ArrstrEx{
	public static void main(String[]args){
		try{
			int[]a=new int[-5];
		}
		catch(NegativeArraySizeException e){
			System.out.println("Array is -ve "+e);
		}
	}
}
