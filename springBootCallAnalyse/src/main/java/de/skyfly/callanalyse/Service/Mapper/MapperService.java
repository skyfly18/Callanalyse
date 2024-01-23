package de.skyfly.callanalyse.Service.Mapper;

import de.skyfly.analysetool.result.ResultPackage;
import de.skyfly.callanalyse.Entities.CalculatedResult;
import org.springframework.stereotype.Service;

/**
 * The mapper service transforms the results from the analysis into the database schema.
 */
@Service
public class MapperService {

    /**
     *
     * The function transforms the data from ResultPackage into the database schema.
     * @param resultPackage The results before mapping
     * @return Data in database schmema
     */
    public CalculatedResult resultPackageToCalculatedResult(ResultPackage resultPackage)
    {
        CalculatedResult calculatedResult = new CalculatedResult();

        calculatedResult.setJarCount(resultPackage.jarCount());

        calculatedResult.setMeanAddClassMayor(resultPackage.getMeanAddClassMayor());
        calculatedResult.setMeanDeleteClassMayor(resultPackage.getMeanDeleteClassMayor());
        calculatedResult.setMeanAddMethodeMayor(resultPackage.getMeanAddMethodeMayor());
        calculatedResult.setMeanDeleteClassMayor(resultPackage.getMeanDeleteMethodeMayor());
        calculatedResult.setMeanModiMethodeMayor(resultPackage.getMeanModiMethodeMayor());
        calculatedResult.setMeanAddMethodeByClassMayor(resultPackage.getMeanAddMethodeByClassMayor());
        calculatedResult.setMeanDeleteMethodeByClassMayor(resultPackage.getMeanDeleteMethodeByClassMayor());

        calculatedResult.setPercentMeanAddClassMayor(resultPackage.getPercentAddClassMayor());
        calculatedResult.setPercentMeanDeleteClassMayor(resultPackage.getPercentDeleteClassMayor());
        calculatedResult.setPercentMeanAddMethodeMayor(resultPackage.getPercentAddMethodeMayor());
        calculatedResult.setPercentMeanDeleteMethodeMayor(resultPackage.getPercentDeleteMethodeMayor());
        calculatedResult.setPercentMeanModiMethodeMayor(resultPackage.getPercentModiMethodeMayor());
        calculatedResult.setPercentMeanAddMethodeByClassMayor(resultPackage.getPercentAddMethodeByClassMayor());
        calculatedResult.setPercentMeanDeleteMethodeByClassMayor(resultPackage.getPercentDeleteMethodeByClassMayor());

        calculatedResult.setPercentMeanAllChangeMethodeMayor(resultPackage.getPercentAllChangeMayor());
        calculatedResult.setPercentMeanAllChangeMethodeNoClassMayor(resultPackage.getPercentAllChangeNoClassMayor());
        calculatedResult.setPercentMeanAllMethodeAddMayor(resultPackage.getPercentAddAllMethodeMayor());
        calculatedResult.setPercentMeanAllMethodeDeleteMayor(resultPackage.getPercentDeleteAllMethodeMayor());

        calculatedResult.setMeanSumClassMayor(resultPackage.getMeanSumClassMayor());
        calculatedResult.setMeanSumMethodeMayor(resultPackage.getMeanSumMethodeMayor());

        calculatedResult.setMeanAddMethodeAllMayor(resultPackage.getMeanAllAddMethodeMayor());
        calculatedResult.setMeanDeleteMethodeAllMayor(resultPackage.getMeanAllDeleteMethodeMayor());
        calculatedResult.setMeanChangeAllMethodeMayor(resultPackage.getMeanAllChangeMethodeMayor());
        calculatedResult.setMeanChangeAllMethodeNoClassMayor(resultPackage.getMeanAllChangeNoClassMethodeMayor());
        calculatedResult.setNumbersOfMayorUpdates(resultPackage.getCountMayorUpdate());







        //Minor
        calculatedResult.setMeanAddClassMinor(resultPackage.getMeanAddClassMinor());
        calculatedResult.setMeanDeleteClassMinor(resultPackage.getMeanDeleteClassMinor());
        calculatedResult.setMeanAddMethodeMinor(resultPackage.getMeanAddMethodeMinor());
        calculatedResult.setMeanDeleteClassMinor(resultPackage.getMeanDeleteMethodeMinor());
        calculatedResult.setMeanModiMethodeMinor(resultPackage.getMeanModiMethodeMinor());
        calculatedResult.setMeanAddMethodeByClassMinor(resultPackage.getMeanAddMethodeByClassMinor());
        calculatedResult.setMeanDeleteMethodeByClassMinor(resultPackage.getMeanDeleteMethodeByClassMinor());

        calculatedResult.setPercentMeanAddClassMinor(resultPackage.getPercentAddClassMinor());
        calculatedResult.setPercentMeanDeleteClassMinor(resultPackage.getPercentDeleteClassMinor());
        calculatedResult.setPercentMeanAddMethodeMinor(resultPackage.getPercentAddMethodeMinor());
        calculatedResult.setPercentMeanDeleteMethodeMinor(resultPackage.getPercentDeleteMethodeMinor());
        calculatedResult.setPercentMeanModiMethodeMinor(resultPackage.getPercentModiMethodeMinor());
        calculatedResult.setPercentMeanAddMethodeByClassMinor(resultPackage.getPercentAddMethodeByClassMinor());
        calculatedResult.setPercentMeanDeleteMethodeByClassMinor(resultPackage.getPercentDeleteMethodeByClassMinor());

        calculatedResult.setPercentMeanAllChangeMethodeMinor(resultPackage.getPercentAllChangeMinor());
        calculatedResult.setPercentMeanAllChangeMethodeNoClassMinor(resultPackage.getPercentAllChangeNoClassMinor());
        calculatedResult.setPercentMeanAllMethodeAddMinor(resultPackage.getPercentAddAllMethodeMinor());
        calculatedResult.setPercentMeanAllMethodeDeleteMinor(resultPackage.getPercentDeleteAllMethodeMinor());

        calculatedResult.setMeanSumClassMinor(resultPackage.getMeanSumClassMinor());
        calculatedResult.setMeanSumMethodeMinor(resultPackage.getMeanSumMethodeMinor());

        calculatedResult.setMeanAddMethodeAllMinor(resultPackage.getMeanAllAddMethodeMinor());
        calculatedResult.setMeanDeleteMethodeAllMinor(resultPackage.getMeanAllDeleteMethodeMinor());
        calculatedResult.setMeanChangeAllMethodeMayor(resultPackage.getMeanAllChangeMethodeMinor());
        calculatedResult.setMeanChangeAllMethodeNoClassMinor(resultPackage.getMeanAllChangeMethodeNoClassMinor());

        calculatedResult.setNumbersOfMinorUpdates(resultPackage.getCountMinorUpdate());




        //Patch
        calculatedResult.setMeanAddClassPatch(resultPackage.getMeanAddClassPatch());
        calculatedResult.setMeanDeleteClassPatch(resultPackage.getMeanDeleteClassPatch());
        calculatedResult.setMeanAddMethodePatch(resultPackage.getMeanAddMethodePatch());
        calculatedResult.setMeanDeleteClassPatch(resultPackage.getMeanDeleteMethodePatch());
        calculatedResult.setMeanModiMethodePatch(resultPackage.getMeanModiMethodePatch());
        calculatedResult.setMeanAddMethodeByClassPatch(resultPackage.getMeanAddMethodeByClassPatch());
        calculatedResult.setMeanDeleteMethodeByClassPatch(resultPackage.getMeanDeleteMethodeByClassPatch());

        calculatedResult.setPercentMeanAddClassPatch(resultPackage.getPercentAddClassPatch());
        calculatedResult.setPercentMeanDeleteClassPatch(resultPackage.getPercentDeleteClassPatch());
        calculatedResult.setPercentMeanAddMethodePatch(resultPackage.getPercentAddMethodePatch());
        calculatedResult.setPercentMeanDeleteMethodePatch(resultPackage.getPercentDeleteMethodePatch());
        calculatedResult.setPercentMeanModiMethodePatch(resultPackage.getPercentModiMethodePatch());
        calculatedResult.setPercentMeanAddMethodeByClassPatch(resultPackage.getPercentAddMethodeByClassPatch());
        calculatedResult.setPercentMeanDeleteMethodeByClassMinor(resultPackage.getPercentDeleteMethodeByClassPatch());

        calculatedResult.setPercentMeanAllChangeMethodePatch(resultPackage.getPercentAllChangePatch());
        calculatedResult.setPercentMeanAllChangeMethodeNoClassPatch(resultPackage.getPercentAllChangeNoClassPatch());
        calculatedResult.setPercentMeanAllMethodeAddPatch(resultPackage.getPercentAddAllMethodePatch());
        calculatedResult.setPercentMeanAllMethodeDeletePatch(resultPackage.getPercentDeleteAllMethodePatch());

        calculatedResult.setMeanSumClassPatch(resultPackage.getMeanSumClassPatch());
        calculatedResult.setMeanSumMethodePatch(resultPackage.getMeanSumMethodePatch());

        calculatedResult.setMeanAddMethodeAllPatch(resultPackage.getMeanAllAddMethodePatch());
        calculatedResult.setMeanDeleteMethodeAllPatch(resultPackage.getMeanAllDeleteMethodePatch());
        calculatedResult.setMeanChangeAllMethodePatch(resultPackage.getMeanAllChangeMethodePatch());
        calculatedResult.setMeanChangeAllMethodeNoClassPatch(resultPackage.getMeanAllChangeNoClassMethodePatch());

        calculatedResult.setNumbersOfPatchUpdates(resultPackage.getCountPatchUpdate());








        return calculatedResult;
    }
}
