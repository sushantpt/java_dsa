package dynamicArray;

public class ExecutionOfDynamicArray {
	
	public static void main (String [] args) {
		
		DynamicArray array = new DynamicArray();
		
		array.addElement(1);
		array.addElement(2);
		System.out.println("Size of array: " + array.getSize() + " and Capacity of array is: " + array.getCapacity());
		
		array.addElement(3);
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());
        array.printElements();
         
        // add element at index 2
        array.addElement(2,6);
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());        
        array.printElements();
         
        array.remove(2);
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());        
        array.printElements();      
 
        array.remove(3);
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());        
        array.printElements();
        
        // trimming the array
        array.trimUnused();
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());        
        array.printElements();      
        array.addElement(2);
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());
        array.printElements();
        array.addElement(3);
        System.out.println("Size :"+array.getSize()+
            " and Capacity :"+array.getCapacity());
        array.printElements();
	
	}
}
