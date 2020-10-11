package se.lexicon.romeobot;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.romeobot.component.ComponentScanConfig;
import se.lexicon.romeobot.data_access.StudentDao;
import se.lexicon.romeobot.service.StudentManagement;
import se.lexicon.romeobot.util.UserInputService;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Dependency injection" );

        //Read Spring java configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);

        UserInputService userInputService= context.getBean(UserInputService.class);

        StudentManagement studentManagement = context.getBean(StudentManagement.class);
    }
}
