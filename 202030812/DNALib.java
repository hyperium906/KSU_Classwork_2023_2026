public class DNALib {
    public static boolean validator(String DNA){

    if(DNA.length()%3!=0){

        return false;
    }
    for (int i = 0; i<3;i++){
        if ((DNA.charAt(i)!= 'A'&& DNA.charAt(i)!='C'&&DNA.charAt(i)!='T'&&DNA.charAt(i)!='G')){
            return false;
        }
    }
    if(DNA.length()==3){
        return true;
    }
    return validator(DNA.substring(3));
    }
    public static String reverser(String DNA){
        String reverse=""+DNA.charAt(DNA.length()-1);
        if (DNA.length()==1){
            return DNA;
        }
        else {
            reverse+=reverser(DNA.substring(0,DNA.length()-1));
        }
        return reverse;
    }


    public static String inverser (String DNA){
        String inverse = "";
        if(DNA.length()==0){
            return"";
        }
        switch (DNA.charAt(0)){
            case 'A':
            inverse="T";
            break;
            case 'G':
            inverse="C";
            break;
            case 'T':
            inverse="A";
            break;
            case 'C':
            inverse="G";
            break;
        }
        inverse+=inverser(DNA.substring(1));
        return inverse;
    }
    public static String translator(String DNA){
        if(DNA.length()==0){
            return "";
        }
        String sequence = DNA.substring(0,3);
        String aminoacid = "";

        switch(sequence){
            case "GCA":
            case "GCC":
            case "GCG":
            case "GCT":
                aminoacid = "A";
                break;
            case "TGC":
            case "TGT":
                aminoacid = "C";
                break;
            case "GAC":
            case "GAT":
                aminoacid = "D";
                break;
            case "GAA":
            case "GAG":
                aminoacid = "E";
                break;
            case "TTC":
            case "TTT":
                aminoacid = "F";
                break;
            case "GGA":
            case "GGC":
            case "GGG":
            case "GGT":
                aminoacid = "G";
                break;
            case "CAC":
            case "CAT":
                aminoacid = "H";
                break;
            case "ATA":
            case "ATC":
            case "ATT":
                aminoacid = "I";
                break;
            case "AAA":
            case "AAG":
                aminoacid = "K";
                break;
            case "CTA":
            case "CTC":
            case "CTG":
            case "CTT":
            case "TTA":
            case "TTG":
                aminoacid = "L";
                break;
            case "ATG":
                aminoacid = "M";
                break;
            case "AAT":
            case "AAC":
                aminoacid = "N";
                break;
            case "CCA":
            case "CCC":
            case "CCG":
            case "CCT":
                aminoacid = "P";
                break;
            case "CAA":
            case "CAG":
                aminoacid = "Q";
                break;
            case "AGA":
            case "AGG":
            case "CGA":
            case "CGC":
            case "CGG":
            case "CGT":
                aminoacid = "R";
                break;
            case "AGC":
            case "AGT":
            case "TCA":
            case "TCC":
            case "TCG":
            case "TCT":
                aminoacid = "S";
                break;
            case "ACA":
            case "ACC":
            case "ACG":
            case "ACT":
                aminoacid = "T";
                break;
            case "GTA":
            case "GTC":
            case "GTG":
            case "GTT":
                aminoacid = "V";
                break;
            case "TGG":
                aminoacid = "W";
                break;
            case "TAC":
            case "TAT":
                aminoacid = "Y";
                break;
            case "TAA":
            case "TAG":
            case "TGA":
                aminoacid = "-";
                break;
        }
        aminoacid += translator(DNA.substring(3));
        return aminoacid;
    }

}
