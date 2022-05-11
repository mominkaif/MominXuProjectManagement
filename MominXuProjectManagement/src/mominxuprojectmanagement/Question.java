/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mominxuprojectmanagement;

/**
 *
 * @author kaifm
 */
public class Question {

    private String q, optA, optB, optC, optD, ans, reason;

    public Question() {
        q = "";
        optA = "";
        optB = "";
        optC = "";
        optD = "";
        ans = "";
        reason = "";
    }

    public Question(String q, String optA, String optB, String optC, String optD, String ans, String r) {
        this.q = q;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.optD = optD;
        this.ans = ans;
        this.reason = r;
    }
    
    public String getQ(){
        return this.q;
    }
    
    public String getA(){
        return this.optA;
    }
    
    public String getB(){
        return this.optB;
    }
    
    public String getC(){
        return this.optC;
    }
    
    public String getD(){
        return this.optD;
    }
    
    public String getAns(){
        return this.ans;
    }
    
    public String getReason(){
        return this.reason;
    }
    
    public void setQ(String q){
        this.q = q;
    }
    
    public void setA(String a){
        this.optA = a;
    }
    
    public void setB(String b){
        this.optB = b;
    }
    
    public void setC(String c){
        this.optC = c;
    }
    
    public void setD(String d){
        this.optD = d;
    }
    
    public void setAns(String ans){
        this.ans = ans;
    }
    
    public void setReason(String r){
        this.reason = r;
    }
    
    public Question clone(){
        Question other;
        other = new Question(q, optA, optB, optC, optD, ans, reason);
        return other;
    }
    public String toString(){
        return "Question: " + q + "\nOptions: A. " + optA + "\tB. " +optB+ "\tC. "+optC+"\tD. "+optD+ "\nAnswer: " + ans + "\nReason: "+reason;
    }
    
}
