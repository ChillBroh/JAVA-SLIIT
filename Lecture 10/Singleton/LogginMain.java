package Singleton;

public class LogginMain {
	//Loggin l = new Loggin(); cannot create object.because default construcotr is private and must only create one object
	Loggin ob = Loggin.getInstance();
}
