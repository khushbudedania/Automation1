package oct.exe_14102024_Abstraction.Interface;

public class Lab102 {
}
interface I4{}
interface I5{}
class A{}
class B{}
class Test1 extends A{}
//class Test2 extends A,B{}//multiple inheritance never possible with class in java.
class Test3 implements I4{}
class Test4 implements I4,I5{}//multiple inheritance only possible with interface.
class Test5 extends A implements I4,I5{}
//class Test6 implements I4,I5 extends A {}//not possible because extend keyword first then implements.