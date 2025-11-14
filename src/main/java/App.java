import com.EmailExtractor;
import com.ExtractorReport;
import com.NumberExtractorReport;
import com.animal.Animal;
import com.animal.Cat;
import com.animal.Dog;
import com.arnab.BankAccount;
import come.employee.Programmer;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;

public class App {
    public static void main( String[] args )throws FileNotFoundException
    {
        // Encapsulation <- you will have only setters and getters and all your fields will be PRIVATE
        System.out.println( "Encapsulation" );
        BankAccount account = new BankAccount("Ahmed Arnab", new BigDecimal(10));
         account.withdraw(new BigDecimal(11));
         account.withdraw(new BigDecimal(4));

        System.out.println("++++++++++++++++++++++++");

        // Inheritance
        System.out.println("Inheritance");
        String[] programmingLanguages = {"Java", "Golang", "Javascript"};
        Programmer programmer  = new Programmer(
                "Ahmed",
                22,
                "New Hargeisa",
                "Java and javascript",
                programmingLanguages);
        System.out.println(programmer.getProgammingLangues());
        System.out.println(programmer.writeSomeCode());

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Abstract Classes");

        // new Animal("Lion"); <-- this is an abstract class you can't instantiate
        Animal dog = new Dog("Jay"); // <-- BUT THE OTHER WAY AROUND YOU CAN SAY DOG IS AN ANIMAL TYPE, AND HAVE METHODS AND PROPS
        Animal cat = new Cat("Milana");
        System.out.println(cat.getName());
        cat.makeSound();
        dog.makeSound();

        // BOTH OF THEM THEY ARE SHARING EXTRACTOR REPORT CLASS
        ExtractorReport extractorReport = new NumberExtractorReport();
        ExtractorReport emailExtractor = new EmailExtractor();

        emailExtractor.prepareAndSendReport(getFile());
        extractorReport.prepareAndSendReport(getFile());

    }

    private static InputStream getFile() {
        return App.class.getResourceAsStream("/data.txt");
    }
}
