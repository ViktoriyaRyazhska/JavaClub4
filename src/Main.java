
import Implementation.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Вирішення задач---");
        System.out.println("---Виберіть тип задачі---" +
                "\n1.Basic program" +
                "\n2.Classes" +
                "\n3.Conditions" +
                "\n4.Loops" +
                "\n5.OOP" +
                "\n6.String" +
                "\n7.Collections");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("-Basic program-\n");
                System.out.println("Виберіть задачу\n1.you-cant-code-under-pressure-number-1" +
                        "\n2.function-3-multiplying-two-numbers\n3.volume-of-a-cuboid" +
                        "\n4.thinkful-number-drills-pixelart-planning\n5.jennys-secret-message" +
                        "\n6.convert-to-binary\n7.beginner-series-number-2-clock\n7.century-from-year" +
                        "\n8.return-negative\n9.age-range-compatibility-equation\n10.grasshopper-debug");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("--function-3-multiplying-two-numbers--");
                        System.out.println("Введіть числа для перемноження");
                        int xMul, yMul;
                        xMul = scanner.nextInt();
                        yMul = scanner.nextInt();
                        System.out.println(MultiplyingTwoNumbers.multiply(xMul, yMul));
                        break;
                    case 3:
                        System.out.println("--volume-of-a-cuboid--");
                        System.out.println("Введіть сторони кубоїда");
                        int xCub, yCub, zCub;
                        xCub = scanner.nextInt();
                        yCub = scanner.nextInt();
                        zCub = scanner.nextInt();
                        System.out.println(VolumeOfACuboid.getVolumeOfCuboid(xCub, yCub, zCub));
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                }
                break;
            case 2:
                System.out.println("-Classes-\n");
                System.out.println("Виберіть задачу" +
                        "\n1.lombok-encapsulation" +
                        "\n2.fixme-static-electrickery" +
                        "\n3.two-fighters-one-winner" +
                        "\n4.building-blocks" +
                        "\n5.fractions-class" +
                        "\n6.simple-drawing-board");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        ClassesImpl.encapsulation();
                        break;
                    case 2:
                        ClassesImpl.StaticElectrickery(scanner);
                        break;
                    case 3:
                        ClassesImpl.twoFighters();
                        break;
                    case 4:
                        ClassesImpl.buildingBlocks();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
                break;
            case 3:
                System.out.println("-Conditions-\n");
                System.out.println("Виберіть задачу" +
                        "\n1.opposite-number" +
                        "\n2.is-n-divisible-by-x-and-y" +
                        "\n3.convert-a-boolean-to-a-string" +
                        "\n4.do-i-get-a-bonus" +
                        "\n5.how-old-will-i-be-in-2099" +
                        "\n6.rock-paper-scissors" +
                        "\n7.basic-mathematical-operations" +
                        "\n8.opposites-attract" +
                        "\n9.convert-boolean-values-to-strings-yes-or-no" +
                        "\n10.will-there-be-enough-space" +
                        "\n11.the-modulo-3-sequence" +
                        "\n12.switch-it-up" +
                        "\n13.thinkful-logic-drills-traffic-light" +
                        "\n14.transportation-on-vacation");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        ConditionsImpl.oppositeNumber();
                        break;
                    case 2:
                        ConditionsImpl.DivisibleByXAndY(scanner);
                        break;
                    case 3:
                        ConditionsImpl.boolenToStr();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        ConditionsImpl.BasicOperations(scanner);
                        break;
                    case 8:
                        ConditionsImpl.oppositesAttract();
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        ConditionsImpl.SwitchItUp(scanner);
                        break;
                    case 13:
                        ConditionsImpl.traffic();
                        break;
                    case 14:
                        break;
                }
                break;
            case 4:
                System.out.println("-Loops-\n");
                System.out.println("Виберіть задачу");
                System.out.println("Виберіть задачу" +
                        "\n1.string-repeat" +
                        "\n2.cat-years-dog-years" +
                        "\n3.get-the-mean-of-an-array" +
                        "\n4.beginner-lost-without-a-map" +
                        "\n5.counting-sheep-dot-dot-dot" +
                        "\n6.reversed-sequence" +
                        "\n7.how-good-are-you-really" +
                        "\n8.beginner-reduce-but-grow" +
                        "\n9.sum-of-positive" +
                        "\n10.my-head-is-at-the-wrong-end" +
                        "\n11.twice-as-old" +
                        "\n12.find-nearest-square-number" +
                        "\n13.grasshopper-summation" +
                        "\n14.gap-in-primes" +
                        "\n15.21-sticks");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        LoopsImpl.MeanOfAnArray(scanner);
                        break;
                    case 4:
                        LoopsImpl.maps();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        LoopsImpl.ReduceButGrow(scanner);
                        break;
                    case 9:
                        LoopsImpl.sumOfPositive();
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        LoopsImpl.GrassHopper(scanner);
                        break;
                    case 14:
                        LoopsImpl.gapInPr();
                        break;
                    case 15:
                        break;
                }
                break;
            case 5:
                System.out.println("-OOP-\n");
                System.out.println("Виберіть задачу" +
                        "\n1.basic-subclasses-adam-and-eve" +
                        "\n2.rotations-and-reflections-i" +
                        "\n3.Leetspeak" +
                        "\n4.tdd-area-calculations");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        OopImpl.Leetspeak(scanner);
                        break;
                    case 4:
                        OopImpl.calcShape();
                        break;
                }
                break;
            case 6:
                System.out.println("-String-\n");
                System.out.println("Виберіть задачу" +
                        "\n1.convert-a-number-to-a-string" +
                        "\n2.reversed-strings" +
                        "\n3.welcome-to-the-city" +
                        "\n4.opposite-number" +
                        "\n5.fixme-replace-all-dots" +
                        "\n6.are-you-playing-banjo" +
                        "\n7.remove-string-spaces" +
                        "\n8.triple-trouble-2" +
                        "\n9.find-the-position" +
                        "\n10.fake-binary" +
                        "\n11.parse-nice-int-from-char-problem" +
                        "\n12.grasshopper-debug" +
                        "\n13.abbreviate-a-two-word-name" +
                        "\n14.Accepts string and count doubles of letters" +
                        "\n15.sort-and-star" +
                        "\n16.correct-the-mistakes-of-the-character-recognition-software" +
                        "\n17.alternating-case" +
                        "\n18.exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        StringImpl.OppositeNumber(scanner);
                        break;
                    case 5:
                        StringImpl.replase();
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        StringImpl.FindThePosition(scanner);
                        break;
                    case 10:
                        StringImpl.fakeBinary();
                        break;
                    case 11:
                        break;
                    case 12:
                        StringImpl.grassHopper();
                        break;
                    case 13:
                        break;
                    case 14:
                        StringImpl.AllStarCodeChallenge(scanner);
                        break;
                    case 15:
                        StringImpl.sortAndStar();
                        break;
                    case 16:
                        break;
                    case 17:
<<<<<<< HEAD
                        StringImpl.alternativeCase();

=======
>>>>>>> b8607b9 (trying to save my work)
                        break;
                    case 18:
                        break;
                }
                break;
            case 7:
                System.out.println("-Collections-\n");
                System.out.println("Виберіть задачу" +
                        "\n1.push-a-hash-slash-an-object-into-array" +
                "\n2.unfinished-loop-bug-fixing-number-1" +
                "\n3.filtering-even-numbers-bug-fixes" +
                "n\4.interactive-dictionary");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        CollectionsImpl.PushAnObjectIntoArray(scanner);
                        break;
                    case 2:
                        CollectionsImpl.createL();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
                break;
        }

    }
}
