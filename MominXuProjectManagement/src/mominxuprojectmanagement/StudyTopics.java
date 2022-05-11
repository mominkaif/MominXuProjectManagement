/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mominxuprojectmanagement;

/**
 *
 * @author daxu2195
 */
public class StudyTopics {
    private int topicNum;
    private String topicName, studyMaterial;
    
    
    public StudyTopics(String topicName){
        this.topicNum = 0;
        this.topicName = "";
        this.studyMaterial = "";
    }
    
    public StudyTopics(int topicNum, String topicName, String studyMaterial){
        this(topicName);
        this.topicNum = topicNum;
        this.topicName = topicName;
        this.studyMaterial = studyMaterial;
    }
    
    public int getTopicNum(){
        return topicNum;
    }
    
    public void setTopicNum(int other){
        topicNum = other;
    }
    
    public String getTopicName(){
        return topicName;
    }
    
    public void setTopicName(String other){
        topicName = other;
    }
    
    public String getStudyMaterial(){
        return studyMaterial;
    }
    
    public void setStudyMaterial(String other){
        studyMaterial = other;
    }
    public boolean equals(StudyTopics other){
        return this.topicNum == other.getTopicNum() && 
                this.topicName.equals(other.getTopicName()) && this.studyMaterial.equals(other.getStudyMaterial());
    }
    public StudyTopics clone(){
        StudyTopics other;
        other = new StudyTopics(this.topicNum, this.topicName, this.studyMaterial);
        return other;
    }
    public String toString(){
        return "Topic Number: " + topicNum + "\nTopic Name: " + topicName + "\nStudyMaterial: " + studyMaterial;
    }
}
 
