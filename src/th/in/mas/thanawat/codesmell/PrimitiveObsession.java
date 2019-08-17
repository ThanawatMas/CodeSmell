package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

public class PrimitiveObsession extends CodeSmellImpl {
    @Override
    public String smellName() {
        return PrimitiveObsession.class.getSimpleName();
    }

    public static void main(String[] args) {
        PrimitiveObsession obsession = new PrimitiveObsession();
        obsession.run();
    }

    @Override
    public void problem() {
        super.problem();

        Integer[] someDistrictInBkkZipcode = {
                10100, //ป้อมปราบศัตรูพ่าย, สัมพันธวงศ์
                10200, //พระนคร
                10300, //ดุสิต
                10400, //พญาไท, ราชเทวี, ดินแดง
                10500, //บางรัก
                10600 //คลองสาน, บางกอกใหญ่, ธนบุรี
        };

        for(Integer zipcode: someDistrictInBkkZipcode) {
            System.out.println("ZipCode: =" +  zipcode);
        }
    }

    @Override
    public void solve() {
        super.solve();

        Integer[] someDistrictInBkkZipcode = {
                BkkZipCode.POMPRABSUDTOOPRAI_SAMPUNTHAWONG,
                BkkZipCode.PRANAKORN,
                BkkZipCode.DUSIT,
                BkkZipCode.PHAYATHAI_RAJCHATEVEE_DINDANG,
                BkkZipCode.BANGRAK,
                BkkZipCode.KHLONGSAN_BANGKOKYAI_THONBURI
        };

        for(Integer zipcode: someDistrictInBkkZipcode) {
            System.out.println("ZipCode: =" +  zipcode);
        }
    }

    static class BkkZipCode {
        static Integer POMPRABSUDTOOPRAI_SAMPUNTHAWONG = 10100;
        static Integer PRANAKORN = 10200;
        static Integer DUSIT = 10300;
        static Integer PHAYATHAI_RAJCHATEVEE_DINDANG = 10400;
        static Integer BANGRAK = 10500;
        static Integer KHLONGSAN_BANGKOKYAI_THONBURI = 10600;
    }
}
