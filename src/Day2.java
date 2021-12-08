public class Day2 {
    public static void main(String[] args) {
        Day2 day2 = new Day2();
        day2.part1();
        day2.part2();
    }

    public void part1(){
        int x = 0;
        int y = 0;

        System.out.println("PART ONE");

        String[] instructions = fileReader.FileReader.processFile();

        for (String instruction: instructions) {
            String direction = instruction.split("\\s+")[0];
            int value = Integer.parseInt(instruction.split("\\s+")[1]);
            if (direction.equals("up")) {
                y -= value;
            } else if (direction.equals("down")) {
                y += value;
            } else {
                x += value;
            }
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x * y = " + (x * y));
    }
    public void part2(){
        int x = 0;
        int y = 0;
        int aim = 0;

        System.out.println("PART TWO");

        String[] instructions = fileReader.FileReader.processFile();

        for (String instruction: instructions) {
            String direction = instruction.split("\\s+")[0];
            int value = Integer.parseInt(instruction.split("\\s+")[1]);
            if (direction.equals("up")) {
                aim -= value;
            } else if (direction.equals("down")) {
                aim += value;
            } else {
                x += value;
                y += (aim * value);
            }
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x * y = " + (x * y));
    }


}
