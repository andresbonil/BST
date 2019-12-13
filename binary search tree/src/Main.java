
//public class Main {
//
//	public static void main(String[] args) {
//		BST<Integer> bsti = new BST<Integer>(12);
//		bsti.insert(7);
//		bsti.insert(19);
//		bsti.insert(23);
//		bsti.insert(8);
//		// If printed in order, the below line should produce 7, 12, 19
	
//
//}
//

public class Main {
 
    public static void main(String[] args) {
        Randp r = new Randp(10000);
        BST<Integer> bsti =  new BST<Integer>(r.nextInt());
       
        for (int i = 0; i < 10000; i++) {
            bsti.insert(r.nextInt());
        }
        System.out.println(bsti.depth());
    }
 
}


//depths: 28 32 31 32 31 30 34 30 31 36 28 31
//avg depth: 31.17
//worst case: order O(n)
//average case: O(nlog n)
//best case: O(1)
//order of growth for insert: O(nlog n)
//printing order of growth: O(1)
//