package processes;

public class ProcessMain {

    public static void main(String[] args) {
        ProcessHandle
                .allProcesses()
                .filter(h -> h.info().toString().toLowerCase().contains("notepad"))
                .peek(p -> System.out.println(p.info()))
                .findAny().orElseThrow().destroy();
    }
}
