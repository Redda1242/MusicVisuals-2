package ie.tudublin;
import D21125383.Test;
import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}

	public void Test()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Test());		
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.Test();			
	}

	
}