import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by leo.zinger on 3/15/17.
 */
    class Foo {
        public static void method() {
            System.out.println("in Foo");
        }
    }

    class Bar extends Foo {
        public static void method() {
            System.out.println("in Bar");
        }
    }

    class Test {
        public void mainly(String[] args) {
            String fs = "Final String";
            Foo.method();
            Bar.method();
            fs = fs.substring(6);
            System.out.println(fs);
        }

        public int testTryCatch() {
            return 0;
        }
    }

    class MoreTest extends Test {
        public static void main(String[] args) {
            Test moretest = new MoreTest();
            int ret;
            ret = moretest.testTryCatch();
        }

        public int testTryCatch()
        {
            try {
                System.out.println("in MoreTest class instance");
                File file = new File("C:/TestFile");
                throw new FileNotFoundException();
            } catch (Exception e) {
                e.printStackTrace();
                return 1;
            } finally {
                System.out.println("i don't know if this will get printed out.");
            }
        }
    }

