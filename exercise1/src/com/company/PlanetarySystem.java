/**
 * Se importa el paquete com.company
 */
package com.company;

/**
 * Representa la clase PlanetarySystem.
 * @version 1.0.0 2022-12-04
 * @author Leyder Badillo Valdes.
 * @since 1.0.0
 */
public class PlanetarySystem {
    /**
     * Representa los atributos de la clase PlanetarySystem.
     */
    private double mass;
    private double density;
    private int diameter;
    private double distanceSun;
    private int identifier;
    private String name;

    /**
     * Representa el constructor de la clase PlanetarySystem.
     * @param mass de tipo double.
     * @param density de tipo double.
     * @param diameter de tipo int.
     * @param distanceSun de tipo double.
     * @param identifier de tipo int.
     * @param name de tipo String.
     */
    public PlanetarySystem(double mass, double density, int diameter, double distanceSun, int identifier, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.identifier = identifier;
        this.name = name;
    }

    /**
     * Representa el método getMass.
     * @return la masa de un cuerpo.
     */

    public double getMass() {
        return mass;
    }

    /**
     * Representa el método setMass.
     * @param mass de tipo double.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Representa el método getDensity.
     * @return la densidad de un cuerpo.
     */
    public double getDensity() {
        return density;
    }

    /**
     * Representa el método setDensity.
     * @param density de tipo double.
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Representa el método getDiameter.
     * @return el diametro de un cuerpo.
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Representa el método setDiameter.
     * @param diameter de tipo int.
     */
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * Representa el método getDistanceSun.
     * @return la distancia al sol.
     */
    public double getDistanceSun() {
        return distanceSun;
    }

    /**
     * Representa el método setDistanceSun.
     * @param distanceSun de tipo double.
     */
    public void setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
    }

    /**
     * Representa el método getIdentifier.
     * @return el identificador de un cuerpo.
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Representa el método setIdentifier.
     * @param identifier de tipo int.
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * Representa el método getName.
     * @return el nombre de un cuerpo.
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el método setName.
     * @param name de tipo String.
     */
    public void setName(String name) {
        this.name = name;
    }
}
