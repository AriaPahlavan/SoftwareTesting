package pset6;

public class MinWebTestGenerator {
    public static void main(String[] a) {
        String suite = new MinWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.Assert.*;\n\n"
            + "import org.junit.Test;\n\n"
            + "import org.openqa.selenium.By;\n"
            + "import org.openqa.selenium.WebDriver;\n"
            + "import org.openqa.selenium.WebElement;\n"
            + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinWebTestSuite {\n");

        // your code goes here
        // ...

        sb.append("}\n");
        return sb.toString();
    }

    // implement any helper methods that you need in this class
}
