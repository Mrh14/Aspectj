package Aspect;



import org.aspectj.lang.annotation.*;



@Aspect
public class MyFirstAspect {
	@Pointcut("execution(* *.Personne.Nom(..))")
	public void pcut() {
		
	}
	
	@Before("pcut()")
	public void Up()
	{
	
	System.out.println("Ceci est une NOTIFICATION Avant la methode NOM  ");	
	System.out.println("----------------------------------------------");
	}
	@Pointcut("execution(* *.Personne.Age(..))")
	public void pcut2() {
		
	}
	@After("pcut2()")
	public void behind() 
	{
		System.out.println("-------------------");
		System.out.println("Ceci est une NOTIFICATION Apres la methode Age ");
	
	}
    
}
