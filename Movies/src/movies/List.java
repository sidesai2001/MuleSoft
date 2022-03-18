/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

/**
 *
 * @author sides
 */
public class List {
    
    private String name;
    private String actname;
    private String actresname;
    private String year;
    private String director;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname;
    }

    public String getActresname() {
        return actresname;
    }

    public void setActresname(String actresname) {
        this.actresname = actresname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List(String name, String actname, String actresname, String year, String director) {
        this.name = name;
        this.actname = actname;
        this.actresname = actresname;
        this.year = year;
        this.director = director;
    }
}
