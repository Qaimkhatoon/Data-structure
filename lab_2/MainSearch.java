public class MainSearch {
    public static void main(String[] args) {
    Search sr = new Search();
        sr.add(3);
        sr.add(2);
        sr.add(5);
        sr.add(2);
        sr.add(4);
        
        int target = 2;
        
        if (sr.search(target)) {
            System.out.println("Element " + target + " is found in the linked list.");
        } else {
            System.out.println("Element " + target + " is not found in the linked list.");
        }
        sr.printList();

    }      
}
