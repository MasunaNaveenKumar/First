import java.util.Scanner;

class MainClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter table name: ");
        String tableName = scanner.next();
        
        Framework framework = new Framework(tableName);
    }
}