package oct.exe_14102024_Abstraction.Realexample2;

public class WagonR extends Engine{
    void drive()
    {
       // void StartEngine();
         // void StopEngine();
    }

    @Override
    void StartEngine()
    {
       System.out.println("starting the engine");
    }

    @Override
    void StopEngine()
    {
       System.out.println("stope the engine");
    }
}
