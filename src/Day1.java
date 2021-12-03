import fileReader.FileReader;

public class Day1 {
    long[] triadSumsArray = new long[FileReader.processFile().length - 2];
    long[] depthsArray = stringArrayToLongArray(FileReader.processFile());

    public void countTriadIncreases() {
        sumTriads();
        System.out.println("Number of Triad Increases: " + countIncreases(triadSumsArray));
    }

    public int countIncreases(long[] array) {
        int numIncreases = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[(i-1)]) {
                numIncreases++;
            }
        }
        System.out.println("Number of increases: " + numIncreases);
        return numIncreases;
    }

    public void sumTriads() {
        for (int i = 2; i < depthsArray.length; i++) {
            triadSumsArray[i-2] = (depthsArray[i-2] + depthsArray[i-1] + depthsArray[i]);
        }
    }

    public long[] stringArrayToLongArray(String[] stringArray) {
        long[] intArray = new long[stringArray.length];
        for (int i = 0; i < stringArray.length; i++){
            intArray[i] = Long.parseLong(stringArray[i]);
        }
        return intArray;
    }
}
