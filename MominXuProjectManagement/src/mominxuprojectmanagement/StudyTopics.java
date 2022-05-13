/*
 * Author: David Xu
 * Date: 2022-05-12
 * UNIT 6 SUMMATIVE
 * Study Topics class, defines a StudyTopic by its topic number, name, and its 
 * study material.
 * Contains full getters and setters for the topic number, name, study material,
 * an equals, clone and a toString method for a visual representation of the object
 */
package mominxuprojectmanagement;

/**
 *
 * @author daxu2195
 */
public class StudyTopics {
    //encapsulate attributes
    private int topicNum;
    private String topicName, studyMaterial;
    
    /**
     * Primary Constructor
     * initializes attributes
     */
    public StudyTopics(){
        this.topicNum = 0;
        this.topicName = "";
        this.studyMaterial = "";
    }
    /**
     * Secondary Constructor 
     * Chains with primary constructor and initializes the topic number and 
     * study material, and topic Name
     * @param topicNum - topics number
     * @param topicName - name of topic
     * @param studyMaterial - information to study regarding topic
     */
    public StudyTopics(int topicNum, String topicName, String studyMaterial){
        this(); //chain with primary
        this.topicName = topicName;
        this.topicNum = topicNum;
        this.studyMaterial = studyMaterial;
    }
    /**
     * Getter for topic number
     * @return - topicNum
     */
    public int getTopicNum(){
        return topicNum;
    }
    /**
     * Setter for topicNum
     * @param other - new topic number
     */
    public void setTopicNum(int other){
        topicNum = other;
    }
    /**
     * Getter for topic name
     * @return - topicName
     */
    public String getTopicName(){
        return topicName;
    }
    /**
     * Setter for topic name
     * @param other - new topic name
     */
    public void setTopicName(String other){
        topicName = other;
    }
    /**
     * Getter for studyMaterial
     * @return - studyMaterial
     */
    public String getStudyMaterial(){
        return studyMaterial;
    }
    /**
     * Setter for studyMaterial
     * @param other - new String for studyMaterial
     */
    public void setStudyMaterial(String other){
        studyMaterial = other;
    }
    /**
     * Equals method, compares all attributes of both objects
     * @param other - StudyTopics object we are comparing with
     * @return - boolean
     */
    public boolean equals(StudyTopics other){
        return this.topicNum == other.getTopicNum() && 
                this.topicName.equals(other.getTopicName()) && this.studyMaterial.equals(other.getStudyMaterial());
    }
    /**
     * Clone method, instantiates a new object with the same attributes as
     * the current object
     * @return - StudyTopics object other
     */
    public StudyTopics clone(){
        StudyTopics other; //declare object
        //instantiate
        other = new StudyTopics(this.topicNum, this.topicName, this.studyMaterial);
        return other;
    }
    /**
     * toString method for a string representation of the objects attributes
     * @return - String message
     */
    public String toString(){
        return "Topic Number: " + topicNum + "\nTopic Name: " + topicName + "\nStudyMaterial:\n" + studyMaterial;
    }
}
 
