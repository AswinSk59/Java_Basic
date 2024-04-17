class MultiCatch{
	public static void main(String[]args){
		try{
			int a[]={5,10};
			int b=5;
			int x=a[1]/b-a[0];
			System.out.println("x= "+x);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index OOB: "+e);
		}
		catch(ArrayStoreException e){
			System.out.println("Wrong data type "+e);
		}
		System.out.println("After Try & Catch blocks");
	}
}
