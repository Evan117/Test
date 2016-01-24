/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.zombie.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Evanator
 */
public class Game implements Serializable {
    
    //class instance variables
    private String name;
    private double besttime;

    public Game() {
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBesttime() {
        return besttime;
    }

    public void setBesttime(double besttime) {
        this.besttime = besttime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.besttime) ^ (Double.doubleToLongBits(this.besttime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", besttime=" + besttime + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.besttime) != Double.doubleToLongBits(other.besttime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
