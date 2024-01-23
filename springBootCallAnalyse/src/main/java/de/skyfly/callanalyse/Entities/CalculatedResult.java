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


    /** Number of jar files **/

    private int jarCount = 0;

    /** Number of mayor updates **/
    private int numbersOfMayorUpdates = 0;


    /** Number of Minor updates **/
    private int numbersOfMinorUpdates = 0;


    /** Number of Patch updates **/
    private int numbersOfPatchUpdates = 0;

    private int meanSumClassMayor = 0;
    private int meanSumMethodeMayor = 0;

    private int meanAddMethodeMayor = 0;

    private int meanDeleteMethodeMayor = 0;

    private int meanModiMethodeMayor = 0;

    private int meanAddClassMayor = 0;

    private int meanDeleteClassMayor = 0;

    private int meanDeleteMethodeByClassMayor = 0;

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
     *  column shows all methods that have been changed
     */
    private int meanChangeAllMethodeMayor = 0;

    /**
     *  column shows all methods that have been changed without the changes by new or deleted classes
     */
    private int meanChangeAllMethodeNoClassMayor = 0;


    private double percentMeanAddClassMayor = 0;

    private double percentMeanDeleteClassMayor = 0;

    private double percentMeanAddMethodeMayor = 0;

    private double percentMeanDeleteMethodeMayor = 0;

    private double percentMeanModiMethodeMayor = 0;

    private double percentMeanAddMethodeByClassMayor = 0;

    private double percentMeanDeleteMethodeByClassMayor = 0;

    private double percentMeanAllChangeMethodeMayor = 0;
    private double percentMeanAllChangeMethodeNoClassMayor = 0;

    private double percentMeanAllMethodeAddMayor = 0;

    private double percentMeanAllMethodeDeleteMayor = 0;











    private int meanSumClassMinor = 0;
    private int meanSumMethodeMinor = 0;

    private int meanAddMethodeMinor = 0;

    private int meanDeleteMethodeMinor = 0;

    private int meanModiMethodeMinor = 0;

    private int meanAddClassMinor = 0;

    private int meanDeleteClassMinor = 0;

    private int meanDeleteMethodeByClassMinor = 0;

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
     *  column shows all methods that have been changed
     */
    private int meanChangeAllMethodeMinor = 0;

    /**
     *  column shows all methods that have been changed without the changes by new or deleted classes
     */
    private int meanChangeAllMethodeNoClassMinor = 0;

    private double percentMeanAddClassMinor = 0;

    private double percentMeanDeleteClassMinor = 0;

    private double percentMeanAddMethodeMinor = 0;

    private double percentMeanDeleteMethodeMinor = 0;

    private double percentMeanModiMethodeMinor = 0;

    private double percentMeanAddMethodeByClassMinor = 0;

    private double percentMeanDeleteMethodeByClassMinor = 0;

    private double percentMeanAllChangeMethodeMinor = 0;
    private double percentMeanAllChangeMethodeNoClassMinor = 0;

    private double percentMeanAllMethodeAddMinor = 0;

    private double percentMeanAllMethodeDeleteMinor = 0;












    private int meanSumClassPatch = 0;
    private int meanSumMethodePatch = 0;

    private int meanAddMethodePatch = 0;

    private int meanDeleteMethodePatch = 0;

    private int meanModiMethodePatch = 0;

    private int meanAddClassPatch = 0;

    private int meanDeleteClassPatch = 0;

    private int meanDeleteMethodeByClassPatch = 0;

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
     *  column shows all methods that have been changed
     */
    private int meanChangeAllMethodePatch = 0;

    /**
     *  column shows all methods that have been changed without the changes by new or deleted classes
     */
    private int meanChangeAllMethodeNoClassPatch = 0;

    private double percentMeanAddClassPatch = 0;

    private double percentMeanDeleteClassPatch = 0;



    private double percentMeanAddMethodePatch = 0;



    private double percentMeanDeleteMethodePatch = 0;

    private double percentMeanModiMethodePatch = 0;

    private double percentMeanAddMethodeByClassPatch = 0;

    private double percentMeanDeleteMethodeByClassPatch = 0;


    private double percentMeanAllChangeMethodePatch = 0;
    private double percentMeanAllChangeMethodeNoClassPatch = 0;

    private double percentMeanAllMethodeAddPatch = 0;

    private double percentMeanAllMethodeDeletePatch = 0;


    public Long getId() {
        return id;
    }


    /**
     *  Set onlyOneJar to True
     */
    public void setOnlyOneJarTrue() {
        this.onlyOneJar = true;
    }

    /**
     *  Set DownloadException to True
     */
    public void setDownloadExceptionTrue()
    {
        this.downloadException = true;
    }

    /**
     *  Set Successfull to True
     */
    public void setSuccessfullTrue()
    {
        this.successfull = true;
    }


    /**
     *  Set NotSemver to True
     */
    public void setNotSemverTrue()
    {
        this.notSemver = true;
    }




    // only Setter and getter

    public int getMeanAddClassMayor() {
        return meanAddClassMayor;
    }

    public void setMeanAddClassMayor(int meanAddClassMayor) {
        this.meanAddClassMayor = meanAddClassMayor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPercentMeanDeleteClassMayor() {
        return percentMeanDeleteClassMayor;
    }

    public void setPercentMeanDeleteClassMayor(double percentMeanDeleteClassMayor) {
        this.percentMeanDeleteClassMayor = percentMeanDeleteClassMayor;
    }

    public int getMeanAddClassMinor() {
        return meanAddClassMinor;
    }

    public void setMeanAddClassMinor(int meanAddClassMinor) {
        this.meanAddClassMinor = meanAddClassMinor;
    }

    public int getMeanAddClassPatch() {
        return meanAddClassPatch;
    }

    public void setMeanAddClassPatch(int meanAddClassPatch) {
        this.meanAddClassPatch = meanAddClassPatch;
    }

    public int getMeanAddMethodeByClassMayor() {
        return meanAddMethodeByClassMayor;
    }

    public void setMeanAddMethodeByClassMayor(int meanAddMethodeByClassMayor) {
        this.meanAddMethodeByClassMayor = meanAddMethodeByClassMayor;
    }


    public int getMeanAddMethodeByClassMinor() {
        return meanAddMethodeByClassMinor;
    }

    public void setMeanAddMethodeByClassMinor(int meanAddMethodeByClassMinor) {
        this.meanAddMethodeByClassMinor = meanAddMethodeByClassMinor;
    }

    public double getPercentMeanModiMethodeMinor() {
        return percentMeanModiMethodeMinor;
    }

    public void setPercentMeanModiMethodeMinor(double percentMeanModiMethodeMinor) {
        this.percentMeanModiMethodeMinor = percentMeanModiMethodeMinor;
    }

    public int getMeanAddMethodeByClassPatch() {
        return meanAddMethodeByClassPatch;
    }

    public void setMeanAddMethodeByClassPatch(int meanAddMethodeByClassPatch) {
        this.meanAddMethodeByClassPatch = meanAddMethodeByClassPatch;
    }

    public int getMeanAddMethodeMayor() {
        return meanAddMethodeMayor;
    }

    public void setMeanAddMethodeMayor(int meanAddMethodeMayor) {
        this.meanAddMethodeMayor = meanAddMethodeMayor;
    }

    public int getMeanAddMethodeMinor() {
        return meanAddMethodeMinor;
    }

    public void setMeanAddMethodeMinor(int meanAddMethodeMinor) {
        this.meanAddMethodeMinor = meanAddMethodeMinor;
    }

    public int getMeanAddMethodePatch() {
        return meanAddMethodePatch;
    }

    public void setMeanAddMethodePatch(int meanAddMethodePatch) {
        this.meanAddMethodePatch = meanAddMethodePatch;
    }

    public int getMeanDeleteClassMayor() {
        return meanDeleteClassMayor;
    }

    public void setMeanDeleteClassMayor(int meanDeleteClassMayor) {
        this.meanDeleteClassMayor = meanDeleteClassMayor;
    }

    public int getMeanDeleteClassMinor() {
        return meanDeleteClassMinor;
    }

    public void setMeanDeleteClassMinor(int meanDeleteClassMinor) {
        this.meanDeleteClassMinor = meanDeleteClassMinor;
    }

    public int getMeanDeleteClassPatch() {
        return meanDeleteClassPatch;
    }

    public void setMeanDeleteClassPatch(int meanDeleteClassPatch) {
        this.meanDeleteClassPatch = meanDeleteClassPatch;
    }

    public int getMeanDeleteMethodeByClassMayor() {
        return meanDeleteMethodeByClassMayor;
    }

    public void setMeanDeleteMethodeByClassMayor(int meanDeleteMethodeByClassMayor) {
        this.meanDeleteMethodeByClassMayor = meanDeleteMethodeByClassMayor;
    }

    public int getMeanDeleteMethodeByClassMinor() {
        return meanDeleteMethodeByClassMinor;
    }

    public void setMeanDeleteMethodeByClassMinor(int meanDeleteMethodeByClassMinor) {
        this.meanDeleteMethodeByClassMinor = meanDeleteMethodeByClassMinor;
    }

    public int getMeanDeleteMethodeByClassPatch() {
        return meanDeleteMethodeByClassPatch;
    }

    public void setMeanDeleteMethodeByClassPatch(int meanDeleteMethodeByClassPatch) {
        this.meanDeleteMethodeByClassPatch = meanDeleteMethodeByClassPatch;
    }

    public int getMeanDeleteMethodeMayor() {
        return meanDeleteMethodeMayor;
    }

    public void setMeanDeleteMethodeMayor(int meanDeleteMethodeMayor) {
        this.meanDeleteMethodeMayor = meanDeleteMethodeMayor;
    }

    public int getMeanDeleteMethodeMinor() {
        return meanDeleteMethodeMinor;
    }

    public void setMeanDeleteMethodeMinor(int meanDeleteMethodeMinor) {
        this.meanDeleteMethodeMinor = meanDeleteMethodeMinor;
    }

    public int getMeanDeleteMethodePatch() {
        return meanDeleteMethodePatch;
    }

    public void setMeanDeleteMethodePatch(int meanDeleteMethodePatch) {
        this.meanDeleteMethodePatch = meanDeleteMethodePatch;
    }

    public int getMeanModiMethodeMayor() {
        return meanModiMethodeMayor;
    }

    public void setMeanModiMethodeMayor(int meanModiMethodeMayor) {
        this.meanModiMethodeMayor = meanModiMethodeMayor;
    }

    public int getMeanModiMethodeMinor() {
        return meanModiMethodeMinor;
    }

    public void setMeanModiMethodeMinor(int meanModiMethodeMinor) {
        this.meanModiMethodeMinor = meanModiMethodeMinor;
    }

    public int getMeanModiMethodePatch() {
        return meanModiMethodePatch;
    }

    public void setMeanModiMethodePatch(int meanModiMethodePatch) {
        this.meanModiMethodePatch = meanModiMethodePatch;
    }

    public int getMeanSumClassMayor() {
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
        this.percentMeanAllMethodeAddMinor = percentMeanAllMethodeAddMinor;
    }

    public double getPercentMeanAllMethodeAddPatch() {
        return percentMeanAllMethodeAddPatch;
    }

    public void setPercentMeanAllMethodeAddPatch(double percentMeanAllMethodeAddPatch) {
        this.percentMeanAllMethodeAddPatch = percentMeanAllMethodeAddPatch;
    }

    public double getPercentMeanAllMethodeDeleteMayor() {
        return percentMeanAllMethodeDeleteMayor;
    }

    public void setPercentMeanAllMethodeDeleteMayor(double percentMeanAllMethodeDeleteMayor) {
        this.percentMeanAllMethodeDeleteMayor = percentMeanAllMethodeDeleteMayor;
    }

    public double getPercentMeanAllMethodeDeleteMinor() {
        return percentMeanAllMethodeDeleteMinor;
    }

    public void setPercentMeanAllMethodeDeleteMinor(double percentMeanAllMethodeDeleteMinor) {
        this.percentMeanAllMethodeDeleteMinor = percentMeanAllMethodeDeleteMinor;
    }

    public double getPercentMeanAllMethodeDeletePatch() {
        return percentMeanAllMethodeDeletePatch;
    }

    public void setPercentMeanAllMethodeDeletePatch(double percentMeanAllMethodeDeletePatch) {
        this.percentMeanAllMethodeDeletePatch = percentMeanAllMethodeDeletePatch;
    }


    public int getMeanAddMethodeAllMayor() {
        return meanAddMethodeAllMayor;
    }

    public void setMeanAddMethodeAllMayor(int meanAddMethodeAllMayor) {
        this.meanAddMethodeAllMayor = meanAddMethodeAllMayor;
    }

    public int getMeanAddMethodeAllMinor() {
        return meanAddMethodeAllMinor;
    }

    public void setMeanAddMethodeAllMinor(int meanAddMethodeAllMinor) {
        this.meanAddMethodeAllMinor = meanAddMethodeAllMinor;
    }


    public int getMeanAddMethodeAllPatch() {
        return meanAddMethodeAllPatch;
    }

    public void setMeanAddMethodeAllPatch(int meanAddMethodeAllPatch) {
        this.meanAddMethodeAllPatch = meanAddMethodeAllPatch;
    }




    public int getJarCount() {
        return jarCount;
    }

    public void setJarCount(int jarCount) {
        this.jarCount = jarCount;
    }


    public int getMeanChangeAllMethodeMayor() {
        return meanChangeAllMethodeMayor;
    }

    public void setMeanChangeAllMethodeMayor(int meanChangeAllMethodeMayor) {
        this.meanChangeAllMethodeMayor = meanChangeAllMethodeMayor;
    }

    public int getMeanChangeAllMethodeMinor() {
        return meanChangeAllMethodeMinor;
    }

    public void setMeanChangeAllMethodeMinor(int meanChangeAllMethodeMinor) {
        this.meanChangeAllMethodeMinor = meanChangeAllMethodeMinor;
    }

    public int getMeanChangeAllMethodeNoClassMayor() {
        return meanChangeAllMethodeNoClassMayor;
    }

    public void setMeanChangeAllMethodeNoClassMayor(int meanChangeAllMethodeNoClassMayor) {
        this.meanChangeAllMethodeNoClassMayor = meanChangeAllMethodeNoClassMayor;
    }

    public int getMeanChangeAllMethodeNoClassMinor() {
        return meanChangeAllMethodeNoClassMinor;
    }

    public void setMeanChangeAllMethodeNoClassMinor(int meanChangeAllMethodeNoClassMinor) {
        this.meanChangeAllMethodeNoClassMinor = meanChangeAllMethodeNoClassMinor;
    }

    public int getMeanChangeAllMethodeNoClassPatch() {
        return meanChangeAllMethodeNoClassPatch;
    }

    public void setMeanChangeAllMethodeNoClassPatch(int meanChangeAllMethodeNoClassPatch) {
        this.meanChangeAllMethodeNoClassPatch = meanChangeAllMethodeNoClassPatch;
    }

    public int getMeanDeleteMethodeAllMinor() {
        return meanDeleteMethodeAllMinor;
    }

    public void setMeanDeleteMethodeAllMinor(int meanDeleteMethodeAllMinor) {
        this.meanDeleteMethodeAllMinor = meanDeleteMethodeAllMinor;
    }

    public int getMeanDeleteMethodeAllPatch() {
        return meanDeleteMethodeAllPatch;
    }

    public void setMeanDeleteMethodeAllPatch(int meanDeleteMethodeAllPatch) {
        this.meanDeleteMethodeAllPatch = meanDeleteMethodeAllPatch;
    }

    public int getMeanChangeAllMethodePatch() {
        return meanChangeAllMethodePatch;
    }

    public void setMeanChangeAllMethodePatch(int meanChangeAllMethodePatch) {
        this.meanChangeAllMethodePatch = meanChangeAllMethodePatch;
    }

    public int getMeanDeleteMethodeAllMayor() {
        return meanDeleteMethodeAllMayor;
    }

    public void setMeanDeleteMethodeAllMayor(int meanDeleteMethodeAllMayor) {
        this.meanDeleteMethodeAllMayor = meanDeleteMethodeAllMayor;
    }

    public void setNumbersOfMayorUpdates(int numbersOfMayorUpdates) {
        this.numbersOfMayorUpdates = numbersOfMayorUpdates;
    }

    public int getNumbersOfMayorUpdates() {
        return numbersOfMayorUpdates;
    }

    public int getNumbersOfPatchUpdates() {
        return numbersOfPatchUpdates;
    }

    public void setNumbersOfPatchUpdates(int numbersOfPatchUpdates) {
        this.numbersOfPatchUpdates = numbersOfPatchUpdates;
    }

    public int getNumbersOfMinorUpdates() {
        return numbersOfMinorUpdates;
    }

    public void setNumbersOfMinorUpdates(int numbersOfMinorUpdates) {
        this.numbersOfMinorUpdates = numbersOfMinorUpdates;
    }
}
