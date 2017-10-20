public class ToDoApp {

    public static void main(String[] args) {
        Task functions = new Task();

        if (args.length == 0) {
            functions.printUsage();
        }
        else if (args[0].equals("-l")) {
            functions.listTasks();
        }
        else if (args[0].equals("-a")) {
            if(args.length == 1) {
                System.out.println("Unable to add: no task provided!");
                System.exit(0);
            }
            else {
                functions.addTasks(args[1]);
            }
        }
        else if (args[0].equals("-r")) {
            if(args.length == 1) {
                System.out.println("Unable to remove: no index provided!");
                System.exit(0);
            }
            else {
                functions.removeTasks(Integer.parseInt(args[1]));
            }
        }
        else if (args[0].equals("-c")) {
            if(args.length == 1) {
                System.out.println("Unable to check: no index provided");
                System.exit(0);
            }
            else {
                functions.checkTasks(Integer.parseInt(args[1]));
            }
        }
        else {
            System.out.println("Unsupported argument.");
        }
    }
}
