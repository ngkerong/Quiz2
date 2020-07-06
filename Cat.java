/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

package lab1stage1;

/**
 *
 * @author HP
 */
public class Cat extends Animal{
    
    private String newName;

    public Cat(String newName) {
        this.newName = newName;
    }
    
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is " + this.newName + ".");
    }
}
