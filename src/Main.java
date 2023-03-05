import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        FileData file1 = new FileData("file1.txt", 18, Paths.get("src/firstFolder"));
        FileData file2 = new FileData("file2.txt", 8, Paths.get("src/firstFolder"));
        FileData file3 = new FileData("file3.txt", 14, Paths.get("src/firstFolder"));
        FileData file4 = new FileData("file4.txt", 12, Paths.get("src/secondFolder"));
        FileData file5 = new FileData("file5.txt", 5, Paths.get("src/secondFolder"));
        FileData file6 = new FileData("file6.txt", 7, Paths.get("src/secondFolder"));
        FileNavigator fileNavigator = new FileNavigator();
        FileNavigator fileNavigator2 = new FileNavigator();

        fileNavigator.add(Paths.get("src/firstFolder"), file1);
        fileNavigator2.add(Paths.get("src/firstFolder"), file2);
        fileNavigator.add(Paths.get("src/firstFolder"), file3);
        fileNavigator2.add(Paths.get("src/secondFolder"), file4);
        fileNavigator.add(Paths.get("src/secondFolder"), file5);
        fileNavigator2.add(Paths.get("src/secondFolder"), file6);

        System.out.println(fileNavigator2.find(Paths.get("src/secondFolder")));
        System.out.println(fileNavigator.filterBySize(10));
        System.out.println(fileNavigator.sortBySize());
        System.out.println(fileNavigator.remove(Paths.get("src/firstFolder")));
    }
}
