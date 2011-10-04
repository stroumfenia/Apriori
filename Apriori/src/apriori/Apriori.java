/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apriori;

import java.util.List;

/**
 *
 * @author Carsten van Weelden <cweelden@science.uva.nl>
 */
public class Apriori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputFilepath = args[0];
        double minSup = Double.valueOf(args[1]);
        double minConf = Double.valueOf(args[2]);
        
        TransactionSet transactions = parseInputFile(inputFilepath);
        List<ItemSet> frequentItemsets = generateFrequentItemsets(transactions, minSup);
        List<AssociationRule> associationRules = generateRules(frequentItemsets, minConf);
        
    }

    private static TransactionSet parseInputFile(String inputFilepath) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static List<ItemSet> generateFrequentItemsets(TransactionSet transactions, double minSup) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static List<AssociationRule> generateRules(List<ItemSet> frequentItemsets, double minConf) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
