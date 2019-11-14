package com.example.employeereader;
public class EmployeeEntry
{
    static String FirstName = "Unknown";
    static String LastName = "Unknown";
    static String Weight = "Unknown";
    static String Height = "Unknown";
    static String age = "Unknown";
    public EmployeeEntry(String FN, String LN, String W, String H, String A)
    {
        this.FirstName = FN;
        this.LastName = LN;
        this.Weight = W;
        this.Height = H;
        this.age = A;
    }
    public String CreateList()
    {
        String List = "First Name: " + this.FirstName + ", Last Name: " + this.LastName + ", Weight: " + this.Weight + ", Height: " + this.Height + ", Age: " + this.age;
        return List;
    }
}
