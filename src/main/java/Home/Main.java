package Home;

import Home.HashTable.HashTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);


/**
 Example of HashTable
 **/
        HashTable<Object> hash=new HashTable<>();
        hash.add(8.8);
        hash.add("Ahmad");
        hash.add("mohamed");
        hash.add("Adam");
        hash.add("Ammar");
        hash.add(89977);
/**
 This function prints all
 elements that start with the letter we want
 */

        hash.printAll("A");

/**
 outputs:
 Ahmad
 Adam
 Ammar
 **/

        hash.printAll(8);

/**
 outputs:
 8.8
 89977
 */


    }
}
