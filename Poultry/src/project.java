
import java.util.*;
class project {
    double tcks; // Total number of chicks

    int tfb; // Total number of feed bags
    
    int cbds; // Catched birds

    double fcr; // Feed Control Range

    double twt; // Total weight
    
    double awt; // Average weight

    double tmrt; // Total Mortality

    double bds; // Birds alive

    int tfw;// total feed weight

    double tamt; // total amount credit to farmers

    double mrtpct;// mortality percentage

    double averagewt; // average weight
    
    double rpkg;  // rupee per kilogram

    Scanner sc = new Scanner(System.in);

    void input(String tcks,String tfb,String cbds,String twt,String tmrt)
    {
    	
        this.tcks=Integer.parseInt(tcks);
        
        this.tfb=Integer.parseInt(tfb);
        
        this.cbds=Integer.parseInt(cbds);
        
        this.twt=Integer.parseInt(twt);
        
        this.tmrt=Integer.parseInt(tmrt);
        
        tfw=this.tfb*75;
        
        bds = this.tcks - this.tmrt;
        
      }

    String FCR() // Calculating Feed Control Range
    {
        fcr = tfw/twt;
        return Double.toString(fcr);
    }

    String mrtpercentage() // Calculating Mortality Percentage
    {

        mrtpct = tmrt * 100/tcks;
        return Double.toString(mrtpct);

    }

    String avgwt() {
        averagewt = twt / cbds;
        return Double.toString(averagewt);
    }

    String totalamt()
    {
        if (fcr >= 2) {

            tamt = twt * 6.5;
            rpkg=6.5;

        } else if (fcr >= 1.9 && fcr < 2) {

            tamt = twt * 6.60;
            rpkg=6.6;


        } else if (fcr >= 1.8 && fcr < 1.9) {
            tamt = twt * 6.70;
            rpkg=6.7;
        } else if (fcr >= 1.7 && fcr < 1.8) {
            tamt = twt * 6.80;
            rpkg=6.8;
        } else if (fcr >= 1.6 && fcr < 1.7) {
            tamt = twt * 6.95;
            rpkg=6.95;
        } else if (fcr >= 1.5 && fcr < 1.6) {
            tamt = twt * 7;
            rpkg=7;
        } else if (fcr >= 1.4 && fcr < 1.5) {
            tamt = twt * 8;
            rpkg=8;
        } else if (fcr >= 1.3 && fcr < 1.4) {
            tamt = twt * 9;
            rpkg=9;
        } else if (fcr <= 1.2) {
            tamt = twt * 10;
        	rpkg=10;
        }
        
        return Double.toString(tamt);
    }
    
    String rpkgs() {
    	return Double.toString(rpkg);
    }

}


