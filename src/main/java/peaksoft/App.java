package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DetectiveBook detectiveBook= applicationContext.getBean("detectiveBook", DetectiveBook.class);
//        System.out.println(detectiveBook);

        FantasyBook fantasyBook= applicationContext.getBean("fantasyBook", FantasyBook.class);
//        System.out.println(fantasyBook);


       Book book= applicationContext.getBean("book", Book.class);
       System.out.println(book);
        applicationContext.close();
    }
}
