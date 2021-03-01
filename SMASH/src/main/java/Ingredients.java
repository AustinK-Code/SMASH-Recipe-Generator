import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ingredients {

    private static List<String> hopList = new ArrayList<>();
    private static List<String> maltList = new ArrayList<>();

    public static void populateLists() {//populates hops and malt lists
        Path malt = Path.of("BaseMalt.txt");
        Path hops = Path.of("Hops.txt");
        hops.getParent();
        malt.getParent();
        try (Scanner sourceScanner = new Scanner(malt)) {
            while (sourceScanner.hasNextLine()){
                String add = sourceScanner.nextLine();
                maltList.add(add);
            }
        } catch (IOException e) {
            System.out.println("Error scanning malt file");
        }
        try (Scanner sourceScanner = new Scanner(hops)){
            while (sourceScanner.hasNextLine()){
                String add = sourceScanner.nextLine();
                hopList.add(add);
            }
        } catch (IOException e) {
            System.out.println("Error scanning hop file");
        }
    }
    public static String pullAHop(){
        int max = hopList.size();
        return hopList.get(new Random().nextInt(max));
    }
    public static String pullAMalt(){
        int max = maltList.size();
        return maltList.get(new Random().nextInt(max));
    }

}