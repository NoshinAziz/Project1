import com.sun.prism.shader.Solid_ImagePattern_Loader;
import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

import java.sql.SQLOutput;

public class Topic {
    /**
     * Session19Topic
     * Session20Topic
     *
     * whenever we create a java class there is one default builder or constructor which helps us to build or create
     * object of that class
     */

    String[] listOfTopic= new String[7];

    /***
     * Method vs Constrctor
     * void/return type
     * Method Name can be anything
     * Constructor name has to be same as class name
     */
    public Topic(){
        System.out.println("I am a constructor, you need my help help to create an object of topic class");

    }

    public static void main(String[] args) {


        //Lets create Session20Topic object so that we can add, update, delete, items/topic in the topic list
        //TypeOfObject namOfObject =new TypeOfObject;
        Topic session20Topic= new Topic(); // Topic() --> Constructor (someone who has ability to construct/build)
        //Add a topic into session20Topic
        // How to call a method? objectName.methodName()

        session20Topic.addTopic(  "String class", 0);
        session20Topic.addTopic(  "String class", 1);
    }




    public void addTopic(String topic, int indexNumber){
        System.out.println("Add on item to the topic");
        System.out.println("Size of the list of topic before insertion :" + listOfTopic[0]);
        listOfTopic[indexNumber]= topic;
        System.out.println("Size of the list of topic after insertion :" + listOfTopic[0]);
        System.out.println("Size of the list of topic after insertion :" + listOfTopic[1]);
    }

    public void deleteTopic(){
        System.out.println("Delete on item from the topic");

    }

    public void updateTopic(){
        System.out.println("Update on item from the topic");

    }






}
