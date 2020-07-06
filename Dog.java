/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

package lab1stage1;

public class Dog extends Animal {
    
    private String newName;

    public Dog(String newName) {
        this.newName = newName;
    }
    
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " + this.newName + ".");
    }  
}