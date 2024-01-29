package de.skyfly.callanalyse.Entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity(name = "calculated_result")
public class CalculatedResult {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    public PackageName packageName;

    private boolean onlyOneJar = false;

    private boolean downloadException = false;

    private boolean notSemver = false;

    private boolean successfull = false;


    /**
     * Number of jar files
     **/

    private int jarCount = 0;

    /**
     * Number of mayor updates
     **/
    private int numbersOfMayorUpdates = 0;


    /**
     * Number of Minor updates
     **/
    private int numbersOfMinorUpdates = 0;


    /**
     * Number of Patch updates
     **/
    private int numbersOfPatchUpdates = 0;

    /**
     * Number of Class
     */
    private int meanSumClassMayor = 0;

    /**
     * Numer of Methode
     */
    private int meanSumMethodeMayor = 0;

    /**
     * This variable holds the number of added methods.
     */
    private int meanAddMethodeMayor = 0;

    /**
     * This variable holds the number of deleted classes.
     */
    private int meanDeleteClassMayor = 0;

    /**
     * This variable holds the number of deleted Methode.
     */
    private int meanDeleteMethodeMayor = 0;

    /**
     * This variable holds the number of modi methods.
     */
    private int meanModiMethodeMayor = 0;

    /**
     * This variable holds the number of added class.
     */
    private int meanAddClassMayor = 0;

    /**
     * This variable holds the number of deleted methode by class.
     */
    private int meanDeleteMethodeByClassMayor = 0;

    /**
     * This variable holds the number of added method by class.
     */
    private int meanAddMethodeByClassMayor = 0;

    /**
     * column shows all newly added methods
     */
    private int meanAddMethodeAllMayor = 0;

    /**
     * column shows all delete methods
     */
    private int meanDeleteMethodeAllMayor = 0;

    /**
     * column shows all methods that have been changed
     */
    private int meanChangeAllMethodeMayor = 0;

    /**
     * column shows all methods that have been changed without the changes by new or deleted classes
     */
    private int meanChangeAllMethodeNoClassMayor = 0;

    /**
     * This variable holds the average percentage of added classes
     */
    private double percentMeanAddClassMayor = 0;

    /**
     * This variable holds the average percentage of deleted classes
     */
    private double percentMeanDeleteClassMayor = 0;

    /**
     * This variable holds the average percentage of added methods
     */
    private double percentMeanAddMethodeMayor = 0;

    /**
     * This variable holds the average percentage of deleted methods
     */
    private double percentMeanDeleteMethodeMayor = 0;

    /**
     * This variable holds the average percentage of modified methods
     */
    private double percentMeanModiMethodeMayor = 0;

    /**
     * This variable holds the average percentage of methods added per class
     */
    private double percentMeanAddMethodeByClassMayor = 0;

    /**
     * This variable holds the average percentage of methods deleted per class
     */
    private double percentMeanDeleteMethodeByClassMayor = 0;

    /**
     * This variable holds the average percentage of all method changes (additions, deletions, and modifications)
     */
    private double percentMeanAllChangeMethodeMayor = 0;

    /**
     * This variable holds the average percentage of all method changes (additions, deletions, and modifications) in each project that have not been classified
     */
    private double percentMeanAllChangeMethodeNoClassMayor = 0;

    /**
     * This variable holds the average percentage of all added methods
     */
    private double percentMeanAllMethodeAddMayor = 0;

    /**
     * This variable holds the average percentage of all deleted methods
     */
    private double percentMeanAllMethodeDeleteMayor = 0;


    /**
     * Number of Class
     */
    private int meanSumClassMinor = 0;

    /**
     * Number of Methode
     */
    private int meanSumMethodeMinor = 0;

    /**
     * This variable holds the number of added methods.
     */
    private int meanAddMethodeMinor = 0;

    /**
     * This variable holds the number of delete methods.
     */
    private int meanDeleteMethodeMinor = 0;

    /**
     * This variable holds the number of modi methods.
     */
    private int meanModiMethodeMinor = 0;

    /**
     * This variable holds the number of added class.
     */
    private int meanAddClassMinor = 0;

    /**
     * This variable holds the number of deleted class.
     */
    private int meanDeleteClassMinor = 0;

    /**
     * This variable holds the number of deleted method by class.
     */
    private int meanDeleteMethodeByClassMinor = 0;

    /**
     * This variable holds the number of added method by class.
     */
    private int meanAddMethodeByClassMinor = 0;


    /**
     * column shows all newly added methods
     */
    private int meanAddMethodeAllMinor = 0;

    /**
     * column shows all delete methods
     */
    private int meanDeleteMethodeAllMinor = 0;

    /**
     * column shows all methods that have been changed
     */
    private int meanChangeAllMethodeMinor = 0;

    /**
     * column shows all methods that have been changed without the changes by new or deleted classes
     */
    private int meanChangeAllMethodeNoClassMinor = 0;

    /**
     * This variable holds the number of added class.
     */
    private double percentMeanAddClassMinor = 0;

    /**
     * This variable holds the average percentage of deleted classes
     */
    private double percentMeanDeleteClassMinor = 0;

    /**
     * This variable holds the average percentage of added methode
     */
    private double percentMeanAddMethodeMinor = 0;

    /**
     * This variable holds the average percentage of deleted methode
     */
    private double percentMeanDeleteMethodeMinor = 0;

    /**
     * This variable holds the average percentage of modi methode
     */
    private double percentMeanModiMethodeMinor = 0;

    /**
     * This variable holds the average percentage of methods added per class
     */
    private double percentMeanAddMethodeByClassMinor = 0;

    /**
     * This variable holds the average percentage of methods deleted per class
     */
    private double percentMeanDeleteMethodeByClassMinor = 0;

    /**
     * This variable holds the average percentage of all method changes (additions, deletions, and modifications)
     */
    private double percentMeanAllChangeMethodeMinor = 0;

    /**
     * This variable holds the average percentage of all method changes (additions, deletions, and modifications) in each project that have not been classified
     */
    private double percentMeanAllChangeMethodeNoClassMinor = 0;

    /**
     * This variable holds the average percentage of all added methods
     */
    private double percentMeanAllMethodeAddMinor = 0;

    /**
     * This variable holds the average percentage of all deleted methods
     */
    private double percentMeanAllMethodeDeleteMinor = 0;


    /**
     * Number of Class
     */
    private int meanSumClassPatch = 0;

    /**
     * Number of Methode
     */
    private int meanSumMethodePatch = 0;

    /**
     * This variable holds the number of added methods.
     */
    private int meanAddMethodePatch = 0;

    /**
     * This variable holds the number of delete methods.
     */
    private int meanDeleteMethodePatch = 0;

    /**
     * This variable holds the number of modi methods.
     */
    private int meanModiMethodePatch = 0;

    /**
     * This variable holds the number of added class.
     */
    private int meanAddClassPatch = 0;

    /**
     * This variable holds the number of deleted class.
     */
    private int meanDeleteClassPatch = 0;

    /**
     * This variable holds the number of deleted method by class.
     */
    private int meanDeleteMethodeByClassPatch = 0;

    /**
     * This variable holds the number of added method by class.
     */
    private int meanAddMethodeByClassPatch = 0;

    /**
     * column shows all newly added methods
     */
    private int meanAddMethodeAllPatch = 0;

    /**
     * column shows all delete methods
     */
    private int meanDeleteMethodeAllPatch = 0;

    /**
     * column shows all methods that have been changed
     */
    private int meanChangeAllMethodePatch = 0;

    /**
     * column shows all methods that have been changed without the changes by new or deleted classes
     */
    private int meanChangeAllMethodeNoClassPatch = 0;

    /**
     * This variable holds the average percentage of added classes
     */
    private double percentMeanAddClassPatch = 0;

    /**
     * This variable holds the average percentage of deleted classes
     */
    private double percentMeanDeleteClassPatch = 0;


    /**
     * This variable holds the average percentage of added methode
     */
    private double percentMeanAddMethodePatch = 0;


    /**
     * This variable holds the average percentage of deleted methode
     */
    private double percentMeanDeleteMethodePatch = 0;

    /**
     * This variable holds the average percentage of modi methode
     */
    private double percentMeanModiMethodePatch = 0;

    /**
     * This variable holds the average percentage of methods added per class
     */
    private double percentMeanAddMethodeByClassPatch = 0;

    /**
     * This variable holds the average percentage of methods deleted per class
     */
    private double percentMeanDeleteMethodeByClassPatch = 0;


    /**
     * This variable holds the average percentage of all method changes (additions, deletions, and modifications)
     */
    private double percentMeanAllChangeMethodePatch = 0;

    /**
     * This variable holds the average percentage of all method changes (additions, deletions, and modifications) in each project that have not been classified
     */
    private double percentMeanAllChangeMethodeNoClassPatch = 0;

    /**
     * This variable holds the average percentage of all added methods
     */
    private double percentMeanAllMethodeAddPatch = 0;

    /**
     * This variable holds the average percentage of all deleted methods
     */
    private double percentMeanAllMethodeDeletePatch = 0;


    /**
     * Set onlyOneJar to True
     */
    public void setOnlyOneJarTrue() {
        this.onlyOneJar = true;
    }

    /**
     * Set DownloadException to True
     */
    public void setDownloadExceptionTrue() {
        this.downloadException = true;
    }

    /**
     * Set Successfull to True
     */
    public void setSuccessfullTrue() {
        this.successfull = true;
    }


    /**
     * Set NotSemver to True
     */
    public void setNotSemverTrue() {
        this.notSemver = true;
    }


    // only Setter and getter

    /**
     * Gets the id
     *
     * @return The id of this object, null if it has not yet been assigned one from the DB.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id
     *
     * @param id The new id to set on this object.
     */
    public void setId(Long id) {
        this.id = id;
    }


    public int getMeanAddClassMayor() {
// Returns the mean number of additional classes in the mayor's package when a class is added
        return meanAddClassMayor;
    }

    /**
     * Sets the mean number of additional classes in the mayor's package when a class is added.
     *
     * @param meanAddClassMayor The new value for meanAddClassMayor
     */
    public void setMeanAddClassMayor(int meanAddClassMayor) {
        this.meanAddClassMayor = meanAddClassMayor;
    }

    public double getPercentMeanDeleteClassMayor() {
// Returns the percent of classes that were deleted in the mayor's package when a class was removed
        return percentMeanDeleteClassMayor;
    }

    /**
     * Sets the percent of classes that were deleted in the mayor's package when a class was removed.
     *
     * @param percentMeanDeleteClassMayor The new value for percentMeanDeleteClassMayor
     */
    public void setPercentMeanDeleteClassMayor(double percentMeanDeleteClassMayor) {
        this.percentMeanDeleteClassMayor = percentMeanDeleteClassMayor;
    }

    public int getMeanAddClassMinor() {
// Returns the mean number of additional classes in the minor's package when a class is added
        return meanAddClassMinor;
    }

    /**
     * Sets the mean number of additional classes in the minor's package when a class is added.
     *
     * @param meanAddClassMinor The new value for meanAddClassMinor
     */
    public void setMeanAddClassMinor(int meanAddClassMinor) {
        this.meanAddClassMinor = meanAddClassMinor;
    }

    public int getMeanAddClassPatch() {
// Returns the mean number of additional classes in the patch's package when a class is added
        return meanAddClassPatch;
    }

    /**
     * Sets the mean number of additional classes in the patch's package when a class is added.
     *
     * @param meanAddClassPatch The new value for meanAddClassPatch
     */
    public void setMeanAddClassPatch(int meanAddClassPatch) {
        this.meanAddClassPatch = meanAddClassPatch;
    }


    /**
     * Getter for meanAddMethodeByClassMayor.
     *
     * @return The value of meanAddMethodeByClassMayor.
     */
    public int getMeanAddMethodeByClassMayor() {
        return meanAddMethodeByClassMayor;
    }

    /**
     * Setter for meanAddMethodeByClassMayor.
     *
     * @param meanAddMethodeByClassMayor The new value to set.
     */
    public void setMeanAddMethodeByClassMayor(int meanAddMethodeByClassMayor) {
        this.meanAddMethodeByClassMayor = meanAddMethodeByClassMayor;
    }

    /**
     * Getter for meanAddMethodeByClassMinor.
     *
     * @return The value of meanAddMethodeByClassMinor.
     */
    public int getMeanAddMethodeByClassMinor() {
        return meanAddMethodeByClassMinor;
    }

    /**
     * Setter for meanAddMethodeByClassMinor.
     *
     * @param meanAddMethodeByClassMinor The new value to set.
     */
    public void setMeanAddMethodeByClassMinor(int meanAddMethodeByClassMinor) {
        this.meanAddMethodeByClassMinor = meanAddMethodeByClassMinor;
    }

    /**
     * Getter for percentMeanModiMethodeMinor.
     *
     * @return The value of percentMeanModiMethodeMinor.
     */
    public double getPercentMeanModiMethodeMinor() {
        return percentMeanModiMethodeMinor;
    }

    /**
     * Setter for percentMeanModiMethodeMinor.
     *
     * @param percentMeanModiMethodeMinor The new value to set.
     */
    public void setPercentMeanModiMethodeMinor(double percentMeanModiMethodeMinor) {
        this.percentMeanModiMethodeMinor = percentMeanModiMethodeMinor;
    }

    /**
     * Getter for meanAddMethodeByClassPatch.
     *
     * @return The value of meanAddMethodeByClassPatch.
     */
    public int getMeanAddMethodeByClassPatch() {
        return meanAddMethodeByClassPatch;
    }

    /**
     * Setter for meanAddMethodeByClassPatch.
     *
     * @param meanAddMethodeByClassPatch The new value to set.
     */
    public void setMeanAddMethodeByClassPatch(int meanAddMethodeByClassPatch) {
        this.meanAddMethodeByClassPatch = meanAddMethodeByClassPatch;
    }

    /**
     * Getter for meanAddMethodeMayor.
     *
     * @return The value of meanAddMethodeMayor.
     */
    public int getMeanAddMethodeMayor() {
        return meanAddMethodeMayor;
    }


    /**
     * Sets the mean number of add method commits in a mayor version.
     *
     * @param meanAddMethodeMayor The new value to set.
     */
    public void setMeanAddMethodeMayor(int meanAddMethodeMayor) {
        this.meanAddMethodeMayor = meanAddMethodeMayor;
    }

    /**
     * Gets the mean number of add method commits in a minor version.
     *
     * @return The current value of meanAddMethodeMinor.
     */
    public int getMeanAddMethodeMinor() {
        return meanAddMethodeMinor;
    }

    /**
     * Sets the mean number of add method commits in a minor version.
     *
     * @param meanAddMethodeMinor The new value to set.
     */
    public void setMeanAddMethodeMinor(int meanAddMethodeMinor) {
        this.meanAddMethodeMinor = meanAddMethodeMinor;
    }

    /**
     * Gets the mean number of add method commits in a patch version.
     *
     * @return The current value of meanAddMethodePatch.
     */
    public int getMeanAddMethodePatch() {
        return meanAddMethodePatch;
    }

    /**
     * Sets the mean number of add method commits in a patch version.
     *
     * @param meanAddMethodePatch The new value to set.
     */
    public void setMeanAddMethodePatch(int meanAddMethodePatch) {
        this.meanAddMethodePatch = meanAddMethodePatch;
    }

    /**
     * Gets the mean number of delete class commits in a mayor version.
     *
     * @return The current value of meanDeleteClassMayor.
     */
    public int getMeanDeleteClassMayor() {
        return meanDeleteClassMayor;
    }

    /**
     * Sets the mean number of delete class commits in a mayor version.
     *
     * @param meanDeleteClassMayor The new value to set.
     */
    public void setMeanDeleteClassMayor(int meanDeleteClassMayor) {
        this.meanDeleteClassMayor = meanDeleteClassMayor;
    }

    /**
     * Gets the mean number of delete class commits in a minor version.
     *
     * @return The current value of meanDeleteClassMinor.
     */
    public int getMeanDeleteClassMinor() {
        return meanDeleteClassMinor;
    }

    /**
     * Sets the mean number of delete class commits in a minor version.
     *
     * @param meanDeleteClassMinor The new value to set.
     */
    public void setMeanDeleteClassMinor(int meanDeleteClassMinor) {
        this.meanDeleteClassMinor = meanDeleteClassMinor;
    }

    /**
     * Gets the mean number of delete class commits in a patch version.
     *
     * @return The current value of meanDeleteClassPatch.
     */
    public int getMeanDeleteClassPatch() {
        return meanDeleteClassPatch;
    }

    // This method sets the value for variable 'meanDeleteClassPatch'.
    public void setMeanDeleteClassPatch(int meanDeleteClassPatch) {
        this.meanDeleteClassPatch = meanDeleteClassPatch;
    }

    // This method gets the current value of 'meanDeleteMethodeByClassMayor' variable.
    public int getMeanDeleteMethodeByClassMayor() {
        return meanDeleteMethodeByClassMayor;
    }

    // This method sets a new value for variable 'meanDeleteMethodeByClassMayor'.
    public void setMeanDeleteMethodeByClassMayor(int meanDeleteMethodeByClassMayor) {
        this.meanDeleteMethodeByClassMayor = meanDeleteMethodeByClassMayor;
    }

    // This method gets the current value of 'meanDeleteMethodeByClassMinor' variable.
    public int getMeanDeleteMethodeByClassMinor() {
        return meanDeleteMethodeByClassMinor;
    }

    // This method sets a new value for variable 'meanDeleteMethodeByClassMinor'.
    public void setMeanDeleteMethodeByClassMinor(int meanDeleteMethodeByClassMinor) {
        this.meanDeleteMethodeByClassMinor = meanDeleteMethodeByClassMinor;
    }

    // This method gets the current value of 'meanDeleteMethodeByClassPatch' variable.
    public int getMeanDeleteMethodeByClassPatch() {
        return meanDeleteMethodeByClassPatch;
    }

    // This method sets a new value for variable 'meanDeleteMethodeByClassPatch'.
    public void setMeanDeleteMethodeByClassPatch(int meanDeleteMethodeByClassPatch) {
        this.meanDeleteMethodeByClassPatch = meanDeleteMethodeByClassPatch;
    }

    // This method gets the current value of 'meanDeleteMethodeMayor' variable.
    public int getMeanDeleteMethodeMayor() {
        return meanDeleteMethodeMayor;
    }

    // This method sets a new value for variable 'meanDeleteMethodeMayor'.
    public void setMeanDeleteMethodeMayor(int meanDeleteMethodeMayor) {
        this.meanDeleteMethodeMayor = meanDeleteMethodeMayor;
    }

    // This method gets the current value of 'meanDeleteMethodeMinor' variable.
    public int getMeanDeleteMethodeMinor() {
        return meanDeleteMethodeMinor;
    }


    public void setMeanDeleteMethodeMinor(int meanDeleteMethodeMinor) { // Sets the mean of delete method in minor version
        this.meanDeleteMethodeMinor = meanDeleteMethodeMinor;
    }

    public int getMeanDeleteMethodePatch() { // Returns the mean of delete method in patch version
        return meanDeleteMethodePatch;
    }

    public void setMeanDeleteMethodePatch(int meanDeleteMethodePatch) { // Sets the mean of delete method in patch version
        this.meanDeleteMethodePatch = meanDeleteMethodePatch;
    }

    public int getMeanModiMethodeMayor() { // Returns the mean of modify method in mayor version
        return meanModiMethodeMayor;
    }

    public void setMeanModiMethodeMayor(int meanModiMethodeMayor) { // Sets the mean of modify method in mayor version
        this.meanModiMethodeMayor = meanModiMethodeMayor;
    }

    public int getMeanModiMethodeMinor() { // Returns the mean of modify method in minor version
        return meanModiMethodeMinor;
    }

    public void setMeanModiMethodeMinor(int meanModiMethodeMinor) { // Sets the mean of modify method in minor version
        this.meanModiMethodeMinor = meanModiMethodeMinor;
    }

    public int getMeanModiMethodePatch() { // Returns the mean of modify method in patch version
        return meanModiMethodePatch;
    }

    public void setMeanModiMethodePatch(int meanModiMethodePatch) { // Sets the mean of modify method in patch version
        this.meanModiMethodePatch = meanModiMethodePatch;
    }

    public int getMeanSumClassMayor() { // Returns the mean of sum class in mayor version
        return meanSumClassMayor;
    }

    public void setMeanSumClassMayor(int meanSumClassMayor) {
        this.meanSumClassMayor = meanSumClassMayor;
    }

    public int getMeanSumClassMinor() {
        return meanSumClassMinor;
    }

    public void setMeanSumClassMinor(int meanSumClassMinor) {
        this.meanSumClassMinor = meanSumClassMinor;
    }

    public int getMeanSumMethodeMayor() {
        return meanSumMethodeMayor;
    }

    public void setMeanSumMethodeMayor(int meanSumMethodeMayor) {
        this.meanSumMethodeMayor = meanSumMethodeMayor;
    }

    public int getMeanSumClassPatch() {
        return meanSumClassPatch;
    }

    public void setMeanSumClassPatch(int meanSumClassPatch) {
        this.meanSumClassPatch = meanSumClassPatch;
    }

    public int getMeanSumMethodePatch() {
        return meanSumMethodePatch;
    }

    public void setMeanSumMethodePatch(int meanSumMethodePatch) {
        this.meanSumMethodePatch = meanSumMethodePatch;
    }

    public int getMeanSumMethodeMinor() {
        return meanSumMethodeMinor;
    }

    public void setMeanSumMethodeMinor(int meanSumMethodeMinor) {
        this.meanSumMethodeMinor = meanSumMethodeMinor;
    }

    public double getPercentMeanAddClassMayor() {
        return percentMeanAddClassMayor;
    }

    public void setPercentMeanAddClassMayor(double percentMeanAddClassMayor) {
        this.percentMeanAddClassMayor = percentMeanAddClassMayor;
    }

    public double getPercentMeanAddMethodeByClassMayor() {
        return percentMeanAddMethodeByClassMayor;
    }

    public void setPercentMeanAddMethodeByClassMayor(double percentMeanAddMethodeByClassMayor) {
        this.percentMeanAddMethodeByClassMayor = percentMeanAddMethodeByClassMayor;
    }

    public double getPercentMeanDeleteClassMinor() {
        return percentMeanDeleteClassMinor;
    }

    public void setPercentMeanDeleteClassMinor(double percentMeanDeleteClassMinor) {
        this.percentMeanDeleteClassMinor = percentMeanDeleteClassMinor;
    }

    public double getPercentMeanAddMethodePatch() {
        return percentMeanAddMethodePatch;
    }

    public void setPercentMeanAddMethodePatch(double percentMeanAddMethodePatch) {
        this.percentMeanAddMethodePatch = percentMeanAddMethodePatch;
    }

    public double getPercentMeanDeleteClassPatch() {
        return percentMeanDeleteClassPatch;
    }

    public void setPercentMeanDeleteClassPatch(double percentMeanDeleteClassPatch) {
        this.percentMeanDeleteClassPatch = percentMeanDeleteClassPatch;
    }

    public double getPercentMeanAddMethodeMinor() {
        return percentMeanAddMethodeMinor;
    }

    public void setPercentMeanAddMethodeMinor(double percentMeanAddMethodeMinor) {
        this.percentMeanAddMethodeMinor = percentMeanAddMethodeMinor;
    }

    public double getPercentMeanAddClassMinor() {
        return percentMeanAddClassMinor;
    }

    public void setPercentMeanAddClassMinor(double percentMeanAddClassMinor) {
        this.percentMeanAddClassMinor = percentMeanAddClassMinor;
    }

    public double getPercentMeanDeleteMethodeMayor() {
        return percentMeanDeleteMethodeMayor;
    }

    public void setPercentMeanDeleteMethodeMayor(double percentMeanDeleteMethodeMayor) {
        this.percentMeanDeleteMethodeMayor = percentMeanDeleteMethodeMayor;
    }

    public double getPercentMeanDeleteMethodeByClassPatch() {
        return percentMeanDeleteMethodeByClassPatch;
    }

    public void setPercentMeanDeleteMethodeByClassPatch(double percentMeanDeleteMethodeByClassPatch) {
        this.percentMeanDeleteMethodeByClassPatch = percentMeanDeleteMethodeByClassPatch;
    }

    public double getPercentMeanDeleteMethodeByClassMayor() {
        return percentMeanDeleteMethodeByClassMayor;
    }

    public void setPercentMeanDeleteMethodeByClassMayor(double percentMeanDeleteMethodeByClassMayor) {
        this.percentMeanDeleteMethodeByClassMayor = percentMeanDeleteMethodeByClassMayor;
    }

    public double getPercentMeanModiMethodeMayor() {
        return percentMeanModiMethodeMayor;
    }

    public void setPercentMeanModiMethodeMayor(double percentMeanModiMethodeMayor) {
        this.percentMeanModiMethodeMayor = percentMeanModiMethodeMayor;
    }

    public double getPercentMeanDeleteMethodeByClassMinor() {
        return percentMeanDeleteMethodeByClassMinor;
    }

    public void setPercentMeanDeleteMethodeByClassMinor(double percentMeanDeleteMethodeByClassMinor) {
        this.percentMeanDeleteMethodeByClassMinor = percentMeanDeleteMethodeByClassMinor;
    }

    public double getPercentMeanDeleteMethodeMinor() {
        return percentMeanDeleteMethodeMinor;
    }

    public void setPercentMeanDeleteMethodeMinor(double percentMeanDeleteMethodeMinor) {
        this.percentMeanDeleteMethodeMinor = percentMeanDeleteMethodeMinor;
    }

    public double getPercentMeanAddMethodeByClassPatch() {
        return percentMeanAddMethodeByClassPatch;
    }

    public void setPercentMeanAddMethodeByClassPatch(double percentMeanAddMethodeByClassPatch) {
        this.percentMeanAddMethodeByClassPatch = percentMeanAddMethodeByClassPatch;
    }

    public double getPercentMeanDeleteMethodePatch() {
        return percentMeanDeleteMethodePatch;
    }

    public void setPercentMeanDeleteMethodePatch(double percentMeanDeleteMethodePatch) {
        this.percentMeanDeleteMethodePatch = percentMeanDeleteMethodePatch;
    }

    public double getPercentMeanAddMethodeByClassMinor() {
        return percentMeanAddMethodeByClassMinor;
    }

    public void setPercentMeanAddMethodeByClassMinor(double percentMeanAddMethodeByClassMinor) {
        this.percentMeanAddMethodeByClassMinor = percentMeanAddMethodeByClassMinor;
    }

    public double getPercentMeanAddMethodeMayor() {
        return percentMeanAddMethodeMayor;
    }

    public void setPercentMeanAddMethodeMayor(double percentMeanAddMethodeMayor) {
        this.percentMeanAddMethodeMayor = percentMeanAddMethodeMayor;
    }

    public double getPercentMeanModiMethodePatch() {
        return percentMeanModiMethodePatch;
    }

    public void setPercentMeanModiMethodePatch(double percentMeanModiMethodePatch) {
        this.percentMeanModiMethodePatch = percentMeanModiMethodePatch;
    }

    public double getPercentMeanAddClassPatch() {
        return percentMeanAddClassPatch;
    }

    public void setPercentMeanAddClassPatch(double percentMeanAddClassPatch) {
        this.percentMeanAddClassPatch = percentMeanAddClassPatch;
    }

    public double getPercentMeanAllChangeMethodeMayor() {
        return percentMeanAllChangeMethodeMayor;
    }

    public void setPercentMeanAllChangeMethodeMayor(double percentMeanAllChangeMethodeMayor) {
        this.percentMeanAllChangeMethodeMayor = percentMeanAllChangeMethodeMayor;
    }

    public double getPercentMeanAllChangeMethodeMinor() {
        return percentMeanAllChangeMethodeMinor;
    }

    public void setPercentMeanAllChangeMethodeMinor(double percentMeanAllChangeMethodeMinor) {
        this.percentMeanAllChangeMethodeMinor = percentMeanAllChangeMethodeMinor;
    }

    public double getPercentMeanAllChangeMethodeNoClassMayor() {
        return percentMeanAllChangeMethodeNoClassMayor;
    }

    public void setPercentMeanAllChangeMethodeNoClassMayor(double percentMeanAllChangeMethodeNoClassMayor) {
        this.percentMeanAllChangeMethodeNoClassMayor = percentMeanAllChangeMethodeNoClassMayor;
    }

    public double getPercentMeanAllChangeMethodeNoClassMinor() {
        return percentMeanAllChangeMethodeNoClassMinor;
    }

    public void setPercentMeanAllChangeMethodeNoClassMinor(double percentMeanAllChangeMethodeNoClassMinor) {
        this.percentMeanAllChangeMethodeNoClassMinor = percentMeanAllChangeMethodeNoClassMinor;
    }

    public double getPercentMeanAllChangeMethodeNoClassPatch() {
        return percentMeanAllChangeMethodeNoClassPatch;
    }

    public void setPercentMeanAllChangeMethodeNoClassPatch(double percentMeanAllChangeMethodeNoClassPatch) {
        this.percentMeanAllChangeMethodeNoClassPatch = percentMeanAllChangeMethodeNoClassPatch;
    }

    public double getPercentMeanAllChangeMethodePatch() {
        return percentMeanAllChangeMethodePatch;
    }

    public void setPercentMeanAllChangeMethodePatch(double percentMeanAllChangeMethodePatch) {
        this.percentMeanAllChangeMethodePatch = percentMeanAllChangeMethodePatch;
    }

    public double getPercentMeanAllMethodeAddMayor() {
        return percentMeanAllMethodeAddMayor;
    }

    public void setPercentMeanAllMethodeAddMayor(double percentMeanAllMethodeAddMayor) {
        this.percentMeanAllMethodeAddMayor = percentMeanAllMethodeAddMayor;
    }

    public double getPercentMeanAllMethodeAddMinor() {
        return percentMeanAllMethodeAddMinor;
    }

    public void setPercentMeanAllMethodeAddMinor(double percentMeanAllMethodeAddMinor) {
        // This method calculates the mean of all additions and divides it by 100 to get a percentage
        this.percentMeanAllMethodeAddMinor = percentMeanAllMethodeAddMinor;
    }

    public double getPercentMeanAllMethodeAddPatch() {
        // This method calculates the mean of all additions and divides it by 100 to get a percentage
        return this.percentMeanAllMethodeAddPatch;
    }

    public void setPercentMeanAllMethodeAddPatch(double percentMeanAllMethodeAddPatch) {
        // This method calculates the mean of all additions and divides it by 100 to get a percentage
        this.percentMeanAllMethodeAddPatch = percentMeanAllMethodeAddPatch;
    }

    public double getPercentMeanAllMethodeDeleteMayor() {
        // This method calculates the mean of all deletions and divides it by 100 to get a percentage
        return this.percentMeanAllMethodeDeleteMayor;
    }

    public void setPercentMeanAllMethodeDeleteMayor(double percentMeanAllMethodeDeleteMayor) {
        // This method calculates the mean of all deletions and divides it by 100 to get a percentage
        this.percentMeanAllMethodeDeleteMayor = percentMeanAllMethodeDeleteMayor;
    }

    public double getPercentMeanAllMethodeDeleteMinor() {
        // This method calculates the mean of all deletions and divides it by 100 to get a percentage
        return this.percentMeanAllMethodeDeleteMinor;
    }

    public void setPercentMeanAllMethodeDeleteMinor(double percentMeanAllMethodeDeleteMinor) {
        // This method calculates the mean of all deletions and divides it by 100 to get a percentage
        this.percentMeanAllMethodeDeleteMinor = percentMeanAllMethodeDeleteMinor;
    }

    public double getPercentMeanAllMethodeDeletePatch() {
        // This method calculates the mean of all deletions and divides it by 100 to get a percentage
        return this.percentMeanAllMethodeDeletePatch;
    }


    /**
     * Sets the percentMeanAllMethodeDeletePatch.
     *
     * @param percentMeanAllMethodeDeletePatch The new value for percentMeanAllMethodeDeletePatch.
     */
    public void setPercentMeanAllMethodeDeletePatch(double percentMeanAllMethodeDeletePatch) {
        this.percentMeanAllMethodeDeletePatch = percentMeanAllMethodeDeletePatch;
    }

    /**
     * Gets the meanAddMethodeAllMayor.
     *
     * @return The value of meanAddMethodeAllMayor.
     */
    public int getMeanAddMethodeAllMayor() {
        return this.meanAddMethodeAllMayor;
    }

    /**
     * Sets the meanAddMethodeAllMayor.
     *
     * @param meanAddMethodeAllMayor The new value for meanAddMethodeAllMayor.
     */
    public void setMeanAddMethodeAllMayor(int meanAddMethodeAllMayor) {
        this.meanAddMethodeAllMayor = meanAddMethodeAllMayor;
    }

    /**
     * Gets the meanAddMethodeAllMinor.
     *
     * @return The value of meanAddMethodeAllMinor.
     */
    public int getMeanAddMethodeAllMinor() {
        return this.meanAddMethodeAllMinor;
    }

    /**
     * Sets the meanAddMethodeAllMinor.
     *
     * @param meanAddMethodeAllMinor The new value for meanAddMethodeAllMinor.
     */
    public void setMeanAddMethodeAllMinor(int meanAddMethodeAllMinor) {
        this.meanAddMethodeAllMinor = meanAddMethodeAllMinor;

    }


    public int getMeanAddMethodeAllPatch() {
        return this.meanAddMethodeAllPatch;
    }

    public void setMeanAddMethodeAllPatch(int meanAddMethodeAllPatch) {
        this.meanAddMethodeAllPatch = meanAddMethodeAllPatch;
    }


    /**
     * Returns the number of jars in a jarCount.
     *
     * @return int
     */
    public int getJarCount() {
        return jarCount;
    }

    /**
     * Sets the value for jarCount to an int value.
     *
     * @param jarCount Count of Jars
     */
    public void setJarCount(int jarCount) {
        this.jarCount = jarCount;
    }

    /**
     * Returns the mean of all changeAllMethodeMayor values in a MeanChangeAllMethodeMayor.
     *
     * @return int
     */
    public int getMeanChangeAllMethodeMayor() {
        return meanChangeAllMethodeMayor;
    }

    /**
     * Sets the value for meanChangeAllMethodeMayor to an int value.
     *
     * @param meanChangeAllMethodeMayor
     */
    public void setMeanChangeAllMethodeMayor(int meanChangeAllMethodeMayor) {
        this.meanChangeAllMethodeMayor = meanChangeAllMethodeMayor;
    }

    /**
     * Returns the mean of all changeAllMethodeMinor values in a MeanChangeAllMethodeMinor.
     *
     * @return int
     */
    public int getMeanChangeAllMethodeMinor() {
        return meanChangeAllMethodeMinor;
    }

    /**
     * Sets the value for meanChangeAllMethodeMinor to an int value.
     *
     * @param meanChangeAllMethodeMinor
     */
    public void setMeanChangeAllMethodeMinor(int meanChangeAllMethodeMinor) {
        this.meanChangeAllMethodeMinor = meanChangeAllMethodeMinor;
    }

    /**
     * Returns the mean of all changeAllMethodeNoClassMayor values in a MeanChangeAllMethodeNoClassMayor.
     *
     * @return int
     */
    public int getMeanChangeAllMethodeNoClassMayor() {
        return meanChangeAllMethodeNoClassMayor;
    }

    /**
     * Sets the value for meanChangeAllMethodeNoClassMayor to an int value.
     *
     * @param meanChangeAllMethodeNoClassMayor
     */
    public void setMeanChangeAllMethodeNoClassMayor(int meanChangeAllMethodeNoClassMayor) {
        this.meanChangeAllMethodeNoClassMayor = meanChangeAllMethodeNoClassMayor;
    }

    /**
     * Returns the mean of all changeAllMethodeNoClassMinor values in a MeanChangeAllMethodeNoClassMinor.
     *
     * @return int
     */
    public int getMeanChangeAllMethodeNoClassMinor() {
        return meanChangeAllMethodeNoClassMinor;
    }

    /**
     * Sets the value for meanChangeAllMethodeNoClassMinor to an int value.
     *
     * @param meanChangeAllMethodeNoClassMinor
     */
    public void setMeanChangeAllMethodeNoClassMinor(int meanChangeAllMethodeNoClassMinor) {
        this.meanChangeAllMethodeNoClassMinor = meanChangeAllMethodeNoClassMinor;
    }


    /**
     * getter method for meanChangeAllMethodeNoClassPatch variable
     */
    public int getMeanChangeAllMethodeNoClassPatch() {
        return meanChangeAllMethodeNoClassPatch;
    }

    /**
     * setter method for meanChangeAllMethodeNoClassPatch variable
     */
    public void setMeanChangeAllMethodeNoClassPatch(int meanChangeAllMethodeNoClassPatch) {
        this.meanChangeAllMethodeNoClassPatch = meanChangeAllMethodeNoClassPatch;
    }

    /**
     * getter method for meanDeleteMethodeAllMinor variable
     */
    public int getMeanDeleteMethodeAllMinor() {
        return meanDeleteMethodeAllMinor;
    }

    /**
     * setter method for meanDeleteMethodeAllMinor variable
     */
    public void setMeanDeleteMethodeAllMinor(int meanDeleteMethodeAllMinor) {
        this.meanDeleteMethodeAllMinor = meanDeleteMethodeAllMinor;
    }

    /**
     * getter method for meanDeleteMethodeAllPatch variable
     */
    public int getMeanDeleteMethodeAllPatch() {
        return meanDeleteMethodeAllPatch;
    }

    /**
     * setter method for meanDeleteMethodeAllPatch variable
     */
    public void setMeanDeleteMethodeAllPatch(int meanDeleteMethodeAllPatch) {
        this.meanDeleteMethodeAllPatch = meanDeleteMethodeAllPatch;
    }

    /**
     * getter method for meanChangeAllMethodePatch variable
     */
    public int getMeanChangeAllMethodePatch() {
        return meanChangeAllMethodePatch;
    }

    /**
     * setter method for meanChangeAllMethodePatch variable
     */
    public void setMeanChangeAllMethodePatch(int meanChangeAllMethodePatch) {
        this.meanChangeAllMethodePatch = meanChangeAllMethodePatch;
    }

    /**
     * Getter for meanDeleteMethodeAllMayor
     */
    public int getMeanDeleteMethodeAllMayor() {
        return meanDeleteMethodeAllMayor;
    }

    /**
     * Setter for meanDeleteMethodeAllMayor
     *
     * @param meanDeleteMethodeAllMayor the value to set
     */
    public void setMeanDeleteMethodeAllMayor(int meanDeleteMethodeAllMayor) {
        this.meanDeleteMethodeAllMayor = meanDeleteMethodeAllMayor;
    }

    /**
     * Setter for numbersOfMayorUpdates
     *
     * @param numbersOfMayorUpdates the value to set
     */
    public void setNumbersOfMayorUpdates(int numbersOfMayorUpdates) {
        this.numbersOfMayorUpdates = numbersOfMayorUpdates;
    }

    /**
     * Getter for numbersOfMayorUpdates
     */
    public int getNumbersOfMayorUpdates() {
        return numbersOfMayorUpdates;
    }

    /**
     * Getter for numbersOfPatchUpdates
     */
    public int getNumbersOfPatchUpdates() {
        return numbersOfPatchUpdates;
    }

    /**
     * Setter for numbersOfPatchUpdates
     *
     * @param numbersOfPatchUpdates the value to set
     */
    public void setNumbersOfPatchUpdates(int numbersOfPatchUpdates) {
        this.numbersOfPatchUpdates = numbersOfPatchUpdates;
    }

    /**
     * Getter for numbersOfMinorUpdates
     */
    public int getNumbersOfMinorUpdates() {
        return numbersOfMinorUpdates;
    }

    /**
     * Setter for numbersOfMinorUpdates
     *
     * @param numbersOfMinorUpdates the value to set
     */
    public void setNumbersOfMinorUpdates(int numbersOfMinorUpdates) {
        this.numbersOfMinorUpdates = numbersOfMinorUpdates;
    }
}
