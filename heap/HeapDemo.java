package heap;

import java.util.ArrayList;
import java.util.List;

public class HeapDemo {
    private List<Integer> heap;

    public HeapDemo() {
        this.heap = new ArrayList<Integer>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<Integer>(heap);
    }

    private int leftChild(int Index) {
        return 2 * Index + 1;
    }

    private int rightChild(int Index) {
        return 2 * Index + 2;
    }

    private int parent(int Index) {
        return (Index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index2);
        heap.set(index2, heap.get(index1));
        heap.set(index1, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxValue;
    }

    private void sinkDown(int Index) {
        int maxindex = Index;
        while (true) {
            int leftIndex = leftChild(Index);
            int rightIndex = rightChild(Index);
            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxindex)) {
                maxindex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxindex)) {
                maxindex = rightIndex;
            }
            if (maxindex != Index) {
                swap(maxindex, Index);
                Index = maxindex;
            } else {
                return;
            }
        }
    }
}
