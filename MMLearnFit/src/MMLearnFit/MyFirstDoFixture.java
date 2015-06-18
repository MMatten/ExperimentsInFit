package MMLearnFit;
import fitlibrary.DoFixture;
import fit.Fixture;
import uk.org.odietamo.fixtures.OsCommandLineFixture;

public class MyFirstDoFixture extends DoFixture {
	
	public void myFirstMethod () {
		System.out.println("MyFirstMethod has been called");
		//return 0;
	}
	
	public void myFirstFunnyNameMethod (String arg1, String arg2) {
		System.out.println("myFirstFunnyNameMethod has been called with: " + arg1 + " and " + arg2);
		//return 0;
	}
	
	public Fixture myFixtureSpawningMethod() {
		System.out.println("myFixtureSpawningMethod has been called");
		return new OsCommandLineFixture();
	}
}
