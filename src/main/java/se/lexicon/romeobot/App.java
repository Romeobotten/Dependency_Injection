package se.lexicon.romeobot;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.romeobot.component.ComponentScanConfig;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Dependency injection" );

        //Read Spring java configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        // StudentDao studentDao = context.getBean(StudentDao.class);
    }
}
