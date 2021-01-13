package com.home.stream;
public class Student implements Comparable<Student>
{
    private Integer id;
    private String name;
    private Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student obj)
    {
        return this.name.compareTo(obj.name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int hashCode()
    {
        int hash=this.name.hashCode()+this.age.hashCode()+this.id.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        Student student=(Student)obj;
        return (this.id==student.id || this.id.equals(student.id)) &&
                (this.name==student.name || this.name.equals(student.name)) &&
                (this.age==student.age || this.age.equals(student.age));
    }

}
