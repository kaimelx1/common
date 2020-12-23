import java.util.Arrays;

public class ChunkArray {
    
    /**
     * Given unit test. Create chunk method that suits given unit test
     *
     * describe("Array Chunking", () => {
     *      it("Should implement array chunking", () => {
     *          assert.deepEqual(chunk([1, 2, 3, 4], 2), [[1, 2], [3, 4]]);
     *          assert.deepEqual(chunk([1, 2, 3, 4], 3), [[1, 2, 3], [4]]);
     *          assert.deepEqual(chunk([1, 2, 3, 4], 5), [[1, 2, 3, 4]]);
     *          assert.deepEqual(chunk([1, 2, 3, 4, 5, 6], 2), [[1, 2], [3, 4], [5, 6]]);
     *      });
     * });
     */
    public static void main() {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.deepToString(chunk(array, 2)));
        System.out.println(Arrays.deepToString(chunkCycle(array, 2)));
    }

    private static int[][] chunk(int[] array, int index) {

        int length = array.length;
        if (length < index || index == 0) return new int[][]{array};
        int capacity = length % index == 0 ? length / index : length / index + 1;
        int[][] newArray = new int[capacity][];

        int j = 0;
        int last;
        for (int i = 0; i < capacity; i++) {
            last = Math.min(j + index, length);
            newArray[i] = Arrays.copyOfRange(array, j, last);
            j += index;
        }

        return newArray;
    }

    private static int[][] chunkCycle(int[] array, int index) {

        int length = array.length;
        if (length < index || index == 0) return new int[][]{array};
        int capacity = length % index == 0 ? length / index : length / index + 1;
        int[][] newArray = new int[capacity][index];

        int t = 0;
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < index; j++) {
                if (t > length - 1) break;
                newArray[i][j] = array[t];
                t++;
            }
        }

        return newArray;
    }

}
