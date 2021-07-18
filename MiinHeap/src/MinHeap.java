import java.util.ArrayList;
import java.util.List;

// Use List<Integer> to store each item in the min heap
// List.get(0) is the minimum number
// pop()    // Pop out the min number
// insert() // Insert a new number
public class MinHeap {
    List<Integer> storage;

    public MinHeap() {
        this.storage = new ArrayList<>();
    }

    // Insert:
    // Insert the new number to the last of arraylist
    // Do bubble up
    public void insert(int val) {
        storage.add(val);
        bubbleUp(storage.size()-1);
    }

    // Pop:
    // Swap the top value with the last value
    // Record the last value for return, then delete it
    // Do bubble down
    public Integer pop() {
        if(storage.size() == 0) {
            return null;
        }

        swap(0, storage.size()-1);
        int result = storage.get(storage.size()-1);
        storage.remove(storage.size()-1);
        bubbleDown(0);

        return result;
    }

    // Get the child index
    // If the value at child is smaller, swap them
    // Keep doing until there is no more child or current value is smaller than its children
    public void bubbleDown(int pIndex) {
        int cIndex = getChild(pIndex);
        while(storage.get(pIndex) > storage.get(cIndex)) {
            swap(pIndex, cIndex);
            pIndex = cIndex;
            cIndex = getChild(pIndex);
        }
    }

    // If both children don't exist, return parent index
    // Else if right child doesn't exist, return left child
    // Else, return the smaller one between left and right child
    public int getChild(int pIndex) {
        int cLeft = pIndex * 2 + 1;
        int cRight = pIndex * 2 + 2;
        if(cLeft >= storage.size() && cRight >= storage.size()) {
            return pIndex;
        }
        else if(cRight >= storage.size()) {
            return cLeft;
        }

        return storage.get(cLeft) <= storage.get(cRight) ? cLeft : cRight;
    }

    // Get the parent index
    // If the value at parent is smaller than that at child index, swap them
    // Keep doing until there is no more parent or parent value is smaller
    public void bubbleUp(int cIndex) {
        int pIndex = getParent(cIndex);
        while(pIndex >= 0 && storage.get(cIndex) < storage.get(pIndex)) {
            swap(pIndex, cIndex);
            cIndex = pIndex;
            pIndex = getParent(cIndex);
        }
    }

    // Parent index = ( Child index - 1 ) / 2
    public int getParent(int cIndex) {
        return (cIndex - 1) / 2;
    }

    public void swap(int pIndex, int cIndex) {
        int tmp = storage.get(pIndex);
        storage.set(pIndex, storage.get(cIndex));
        storage.set(cIndex, tmp);
    }

    public Integer peek() {
        return storage.size() > 0 ? storage.get(0) : null;
    }

    // Remove:
    // Iterate the arraylist to see if target exist
    // If so, swap it with the last element, and remove the last element
    //        ** If the target is the last element, don't need to bubble up and bubble down
    //        Do bubble up
    //        Do bubble down
    //        return true
    // Else,  return false
    public boolean remove(int val) {
        int targetIndex = -1;
        for(int i = 0; i < storage.size(); i++) {
            if(storage.get(i) == val) {
                targetIndex = i;
                break;
            }
        }

        if(targetIndex == -1) {
            return false;
        }

        boolean lastItem = false;
        if(targetIndex == storage.size()-1) {
            lastItem = true;
        }
        swap(targetIndex, storage.size()-1);
        storage.remove(storage.size()-1);
        if(lastItem) {
            return true;
        }

        bubbleUp(targetIndex);
        bubbleDown(targetIndex);
        return true;
    }

    public int size() {
        return storage.size();
    }
}
