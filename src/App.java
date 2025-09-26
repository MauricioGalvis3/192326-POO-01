import utils.*;;
public class App {
    
        public static void main(String[] args) {
            
          
            Student student1 = new Student();
            student1.showInfo();
    
            // Usando constructor con nombre y edad
            Student student2 = new Student("Ana", 20);
            student2.showInfo();
    
            // Usando constructor con nombre, edad e id
            Student student3 = new Student("Carlos", 22, "U12345");
            student3.showInfo();
        }
    
}
    