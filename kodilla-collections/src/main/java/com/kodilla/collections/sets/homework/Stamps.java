package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String name;
    private String size;
    private String stample;

    public Stamps(String name, String size, String stample){
        this.name = name;
        this.size = size;
        this.stample = stample;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getStample() {
        return stample;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return stample == stamps.stample &&
                Objects.equals(name, stamps.name) &&
                Objects.equals(size, stamps.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, stample);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", stample=" + stample +
                '}';
    }
}
