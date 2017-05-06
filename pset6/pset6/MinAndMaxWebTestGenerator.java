package pset6;


import static pset6.MinWebTestGenerator.*;

public class MinAndMaxWebTestGenerator {

	public static void main(String[] a) {
		String suite = new MinAndMaxWebTestGenerator().createTestSuite();
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

	static String imports() {
		return "import static org.junit.Assert.*;\n\n"
		       + "import org.junit.After;\n"
		       + "import org.junit.AfterClass;\n"
		       + "import org.junit.Before;\n"
		       + "import org.junit.BeforeClass;\n"
		       + "import org.junit.Test;\n\n"
		       + "import org.openqa.selenium.By;\n"
		       + "import org.openqa.selenium.WebDriver;\n"
		       + "import org.openqa.selenium.WebElement;\n"
		       + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
	}

	String testsuite() {
		StringBuilder sb = new StringBuilder();
		sb.append("public class MinAndMaxWebTestSuite {\n");

		String[] inputBlocks = {NEG, ZERO, POS, INF};
		String[] radioBlocks = {MAX, MIN};
		String clickStr = "\t\twe = wd.findElement(By.id(\"computeButton\"));\n" +
		                  "\t\twe.click();\n";
		String closingBrace = "\t}\n\n";
		int    counter      = 0;

		sb.append(minMaxInitGlobal());
		sb.append(minMaxInitSetUpClass());
		sb.append(minMaxInitSetUp());
		sb.append(minMaxInitTearDown());
		sb.append(minMaxInitTearDownClass());

		for (int i = 0; i < inputBlocks.length; i++) {
			for (int j = 0; j < inputBlocks.length; j++) {
				for (int k = 0; k < inputBlocks.length; k++) {
					for (int r = 0; r < radioBlocks.length; r++) {
						String x = inputBlocks[i],
								y = inputBlocks[j],
								z = inputBlocks[k],
								minOrMax = radioBlocks[r],
								expectedVal = minOrMax.equals(MIN) ? calcMin(x, y, z)
								                                   : calcMax(x, y, z),
								send = sendBlockWhere(x, y, z, minOrMax),
								out = retrieveOutput(),
								check = makeAssertWhere(x, y, z, expectedVal, minOrMax);

						sb.append(makeHeaderWhere(counter));
						counter++;
						sb.append(send)
						  .append(out)
						  .append(EMPTY_ASSERT)
						  .append(closingBrace);

						sb.append(makeHeaderWhere(counter));
						counter++;
						sb.append(send)
						  .append(clickStr)
						  .append(out)
						  .append(check)
						  .append(closingBrace);
					}
				}
			}
		}

		sb.append("}\n");
		return sb.toString();
	}

	private String makeAssertWhere(String x, String y, String z,
	                               String expectedResult, String minOrMax)
	{
		return expectedResult.equals(INV) ? "\t\tassertEquals(\"" + INV + "\", output);\n"
		                                  : "\t\tassertEquals(\"" +
		                                    (minOrMax.equals(MIN) ? "min(" : "max(") +
		                                    x + ", " + y + ", " + z +
		                                    ") = " + expectedResult + "\", output);\n";
	}


	private String sendBlockWhere(String x, String y, String z, String minOrMax) {
		String minSet  = "\t\twe = wd.findElement(By.id(\"min\"));\n",
				maxSet = "\t\twe = wd.findElement(By.id(\"max\"));\n",
				click  = "\t\twe.click();\n";


		return ("\t\twe = wd.findElement(By.id(\"x\"));\n" +
		        "\t\twe.sendKeys(\"" + x + "\");\n" +
		        "\t\twe = wd.findElement(By.id(\"y\"));\n" +
		        "\t\twe.sendKeys(\"" + y + "\");\n" +
		        "\t\twe = wd.findElement(By.id(\"z\"));\n" +
		        "\t\twe.sendKeys(\"" + z + "\");\n") +
		        (minOrMax.equals(MIN) ? minSet : maxSet) +
				click;
	}

	private String calcMax(String x, String y, String z) {
		if (x.equals(INF) ||
		    y.equals(INF) ||
		    z.equals(INF)) return INV;

		if (x.equals(POS) ||
		    y.equals(POS) ||
		    z.equals(POS)) return POS;

		if (x.equals(ZERO) ||
		    y.equals(ZERO) ||
		    z.equals(ZERO)) return ZERO;

		return NEG;
	}

	private String minMaxInitGlobal() {
		return "\tprivate String output;\n" +
		       "\tprivate WebElement we;\n" +
		       "\tprivate static WebDriver wd;\n" +
		       "\tprivate static WebElement result;\n";
	}

	private String minMaxInitSetUpClass() {
		return "\n\t@BeforeClass\n" +
		       "\tpublic static void setUpClass() {\n" +

		       "\t\tSystem.setProperty(\"webdriver.gecko.driver\", \"/home/aria/webdriver/firefox/geckodriver\");\n" +
		       "\t\twd = new FirefoxDriver();\n" +

		       "\t\tString classPath = MinWebTest.class.getResource(\"minandmax.html\").toString();\n" +
		       "\t\twd.get(classPath);\n" +
		       "\t}\n\n";
	}

	private String minMaxInitSetUp() {
		return "\t@Before\n" +
		       "\tpublic void setUp() {\n" +
		       "\t\tresult = wd.findElement(By.id(\"result\"));\n" +
		       "\t}\n\n";
	}

	private String minMaxInitTearDown() {
		return "\t@After\n" +
		       "\tpublic void tearDown() {\n" +
		       "\t\twd.navigate().refresh();\n" +
		       "\t}\n\n";
	}

	private String minMaxInitTearDownClass() {
		return "\t@AfterClass\n" +
		       "\tpublic static void tearDownClass(){\n" +
		       "\t\twd.quit();\n" +
		       "\t}\n\n";
	}
}