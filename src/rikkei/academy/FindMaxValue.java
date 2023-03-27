package rikkei.academy;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "F:\\Workspace_JAVA\\JAVA-MD3-Bai16\\JAVA-MD3-Bai16-TH2-TimGiaTriLonNhatVaGhiRaFile\\src\\rikkei\\academy\\number.txt";
        String PAHT_RESULT = "F:\\Workspace_JAVA\\JAVA-MD3-Bai16\\JAVA-MD3-Bai16-TH2-TimGiaTriLonNhatVaGhiRaFile\\src\\rikkei\\academy\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PAHT_RESULT, maxValue);
    }
}
