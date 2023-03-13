import java.util.Scanner;

public class ReverseString {


    // TODO: Sisend String, mis on vaja keerata tagurpidi s6nad.
    // TODO: Sisend String, kus on lisaks s6nadele ka t2hed tagurpidi.
    // TODO: Sisend String ja saab valida, et kas keeratakse s6nad ja/v6i t2hed tagurpidi v6i mitte kumbagi.

    public static void main(String[] args) {
        ReverseString stringUtils = new ReverseString();
        System.out.println("Sisesta oma stringid");
        Scanner scanner = new Scanner(System.in);
     String string = scanner.nextLine();
        String result = stringUtils.reverseString(string);
        System.out.println(result);

    }


    public String reverseString(String string){
        String[] splitString = string.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = splitString.length-1; i >= 0 ; i--) {
            result.append(splitString[i]).append(" ");
        }
        return result.toString().trim();
    }
}