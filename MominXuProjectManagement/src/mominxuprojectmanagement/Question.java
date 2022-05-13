/*
 * Author: Kaif Momin, David Xu
 * Date: 2022-05-12
 * UNIT 6 SUMMATIVE 
 * Question class is defined by the question itself, options: A, B, C, D (to pick from in mc),
 * the answer to the question, and the explanation for the answer.
 * This class contains a full set of accessors and mutators for the question String
 * Each option (A, B, C, D), the answer, the explanation, an equals method to check
 * if two objects are the same, a clone method to copy an object, and a toString method
 * for a visual representation of the Question's attributes.
 */
package mominxuprojectmanagement;

/**
 *
 * @author kaifm
 */
public class Question {
    //encapsualte attributes
    private String q, optA, optB, optC, optD, ans, reason;
    /**
     * Primary Constructor
     * Initializes all attributes
     */
    public Question() {
        q = "";
        optA = "";
        optB = "";
        optC = "";
        optD = "";
        ans = "";
        reason = "";
    }
    /**
     * Secondary constructor
     * chains with primary to initialize attributes. Then assigns attributes
     * to passed arguments
     * @param q - question title
     * @param optA - first mc option
     * @param optB - second mc option
     * @param optC - third mc option
     * @param optD - fourth mc option
     * @param ans - answer to the question
     * @param r - reason/explanation for the answer
     */
    public Question(String q, String optA, String optB, String optC, String optD, String ans, String r) {
        this(); //chain with primary
        this.q = q;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.optD = optD;
        this.ans = ans;
        this.reason = r;
    }
    /**
     * Getter for the question title
     * @return - q
     */
    public String getQ(){
        return this.q;
    }
    /**
     * getter for the option A
     * @return -optA
     */
    public String getA(){
        return this.optA;
    }
    /**
     * getter for the option B
     * @return -optB
     */
    public String getB(){
        return this.optB;
    }
    /**
     * getter for the option C
     * @return -optC
     */
    public String getC(){
        return this.optC;
    }
    /**
     * getter for the option D
     * @return -optD
     */
    public String getD(){
        return this.optD;
    }
    /**
     * getter for the question answer
     * @return - ans
     */
    public String getAns(){
        return this.ans;
    }
    /**
     * getter for the answer reason
     * @return - reason
     */
    public String getReason(){
        return this.reason;
    }
    /**
     * Setter for the question title
     * @param q - new question title
     */
    public void setQ(String q){
        this.q = q;
    }
    /**
     * Setter for option A
     * @param a - new option A
     */
    public void setA(String a){
        this.optA = a;
    }
    /**
     * Setter for option B
     * @param b - new option B
     */
    public void setB(String b){
        this.optB = b;
    }
    /**
     * Setter for option C
     * @param c - new option C
     */
    public void setC(String c){
        this.optC = c;
    }
    /**
     * Setter for option D
     * @param d - new option D
     */
    public void setD(String d){
        this.optD = d;
    }
    /**
     * Setter for questions answer
     * @param ans - new answer
     */
    public void setAns(String ans){
        this.ans = ans;
    }
    /**
     * Setter for answer explanation
     * @param r - new reason/explanation
     */
    public void setReason(String r){
        this.reason = r;
    }
    /**
     * Clone method, creates copy of object with the exact same attributes
     * @return - other 
     */
    @Override
    public Question clone(){
        Question other; //dec;are object
        //instantiate object
        other = new Question(q, optA, optB, optC, optD, ans, reason);
        return other;
    }
    /**
     * toString method for a string representation of the Questions attributes
     * @return - String message
     */
    @Override
    public String toString(){
        return "Question: " + q + "\nOptions: A. " + optA + "\tB. " +optB+ "\tC. "+optC+"\tD. "+optD+ "\nAnswer: " + ans + "\nReason: "+reason;
    }
    
}
