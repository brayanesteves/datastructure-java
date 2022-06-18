package datastructure.GRAPHS_00.SHORTCUT.AlgorithmFloyd_00;

/**
 *
 * @author brayan
 */
public class Shortcut {
    
    public String algorithmFloyd(long[][] adyacentArray) {
        int    vertex             = adyacentArray.length;
        long   adyacentArrays[][]  = adyacentArray;
        String paths[][]          = new String[vertex][vertex];
        String auxiliaryPaths[][] = new String[vertex][vertex];
        String pathTraveled       = "";
        String chain              = "";
        String path               = "";
        int    i, j, k;
        float  temporal_1, temporal_2, temporal_3, temporal_4;
        float  min;
        
        /**
         * Init array path and path auxiliary
         */
        for(i = 0; i < vertex; i++) {
            for(j = 0; j < vertex; j++) {
                paths[i][j]          = "";
                auxiliaryPaths[i][j] = "";
            }
        }
        
        for(k = 0; k < vertex; k++) {
            for(i = 0; i < vertex; i++) {
                for(j = 0; j < vertex; j++) {
                    temporal_1 = adyacentArrays[i][j];
                    temporal_2 = adyacentArrays[i][k];
                    temporal_3 = adyacentArrays[k][j];
                    temporal_4 = temporal_2 + temporal_3;
                    
                    /**
                     * Find 'min'
                     */
                    min = Math.min(temporal_1, temporal_4);
                    if(temporal_1 != temporal_4) {
                        if(min == temporal_4) {
                            pathTraveled         = "";
                            auxiliaryPaths[i][j] = k + "";
                            paths[i][j]          = this.pathsRecursive(i, k, auxiliaryPaths, pathTraveled) + (k + 1);
                        }
                    }
                    adyacentArrays[i][j] = (long) min;
                }
            }
        }
        
        /**
         * Add paths at chain
         */
        for(i = 0; i < vertex; i++) {
            for(j = 0; j < vertex; j++) {
                chain = chain + "[" + adyacentArrays[i][j] + "]";
            }
            chain = chain + "\n";
        }        
        // =========================================== //        
        for(i = 0; i < vertex; i++) {
            for(j = 0; j < vertex; j++) {
                if(adyacentArrays[i][j] != 1000000000) {
                    if(i != j) {
                        if(paths[i][j].equals("")) {
                            path += "It's (" + (i + 1) 
                                    + " ===> " 
                                    + (j + 1) 
                                    + ") Go for...(" 
                                    + (i + 1) 
                                    + ", " 
                                    + (j + 1) 
                                    + ")\n";
                        } else {
                            path += "It's (" + (i + 1) 
                                    + " ===> " 
                                    + (j + 1) 
                                    + ") Go for...(" 
                                    + (i + 1) 
                                    + ", " 
                                    + paths[i][j] 
                                    + ", " 
                                    + (j + 1) 
                                    + ")\n";
                        }
                    }
                }
            }
        }
        return "The matrix of shortest paths between the different vertices is:\n" 
                + chain + "\n" 
                + "The different shortest paths between vertices are:\n" 
                + path;
    }
    
    public String pathsRecursive(int i, int k, String[][] auxiliaryPath, String pathTraveled) {
        if(auxiliaryPath[i][k].equals("")) {
            return "";
        } else {
            /**
             * recursion to million
             */
            pathTraveled += pathsRecursive(i, Integer.parseInt(auxiliaryPath[i][k].toString()), auxiliaryPath, pathTraveled) + (Integer.parseInt(auxiliaryPath[i][k].toString()) + 1) + ", ";
            return pathTraveled;
        }
    }
    
}
