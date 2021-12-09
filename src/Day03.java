public class Day03 {
    public static void main(String[] args) {
        Day03 day03 = new Day03();
        day03.part1();
    }

    public void part1(){
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        String[] diagnostics = fileReader.FileReader.processFile();

        int[] binaryCounts = new int[diagnostics[1].length()];

        for (int i = 0; i< diagnostics[1].length(); i++) {
            binaryCounts[i] = 0;
        }

        for (String diagnostic : diagnostics) {
            for (int i = 0; i<diagnostic.length(); i++) {
                if (diagnostic.charAt(i) == '1') {
                    binaryCounts[i]++;
                } else {
                    binaryCounts[i]--;
                }
            }
        }

        for (int binaryCount : binaryCounts) {
            if (binaryCount>0) {
                gamma.append("1");
                epsilon.append("0");
            } else {
                gamma.append("0");
                epsilon.append("1");
            }
        }
        System.out.println(gamma);
        System.out.println(epsilon);
        int gammaDec = Integer.parseInt(gamma.toString(),2);
        int epsilonDec = Integer.parseInt(epsilon.toString(),2);
        int powerConsumption = (gammaDec * epsilonDec);

        System.out.println("Power Consumption: " + powerConsumption);
    }

}
