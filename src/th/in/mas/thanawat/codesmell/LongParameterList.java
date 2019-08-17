package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

public class LongParameterList extends CodeSmellImpl {
    @Override
    public String smellName() {
        return LongParameterList.class.getSimpleName();
    }

    public static void main(String[] args) {
        LongParameterList code = new LongParameterList();
        code.run();
    }


    @Override
    public void problem() {
        super.problem();

        String name = "Thanawat M.";
        double age = 28.00;
        char sex = 'U';
        String tel = "085XXX0000";

        String creditCardNo = "9999 9999 XXXX 9999";
        String creditBank = "BANK";
        double payTotalAmount = 456934.00;
        int payTotalTimes = 10;

        boolean hasRegistered = true;

        meetCashbackCriteria(name, age, sex, tel, creditCardNo, creditBank, payTotalAmount, payTotalTimes, hasRegistered);
    }

    private boolean meetCashbackCriteria(String name, double age, char sex, String tel,
                                         String creditCardNo, String creditBank, double payTotalAmount, int payTotalTimes,
                                         boolean hasRegistered) {
        System.out.println("============================");
        System.out.println("Method :: meetCashbackCriteria");
        System.out.println("****************************");
        System.out.println("Name: " + name + ", register: " + hasRegistered);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Tel: " + tel);
        System.out.println("With credit card no. : " + creditCardNo + ", credit bank : " + creditBank);
        System.out.println("Total Times = " + payTotalTimes + ", Amount = " + payTotalAmount );
        System.out.println("****************************");

        if(hasRegistered) {
            double avg = payTotalAmount / payTotalTimes;
            return avg > 5000 && payTotalAmount > 50000;
        }
        return false;
    }


    @Override
    public void solve() {
        super.solve();

        String name = "Thanawat M.";
        double age = 28.00;
        char sex = 'U';
        String tel = "085XXX0000";
        Person person = new Person(name, age, sex, tel);

        String creditCardNo = "9999 9999 XXXX 9999";
        String creditBank = "BANK";
        double payTotalAmount = 456934.00;
        int payTotalTimes = 10;
        CreditCardUsage usage = new CreditCardUsage(creditCardNo, creditBank, payTotalAmount, payTotalTimes);

        boolean hasRegistered = true;

        meetCashbackCriteria(person, usage, hasRegistered);
    }

    private boolean meetCashbackCriteria(Person person,
                                         CreditCardUsage usage,
                                         boolean hasRegistered) {
        System.out.println("============================");
        System.out.println("Method :: meetCashbackCriteria");
        System.out.println("****************************");
        System.out.println("Name: " + person.getName() + ", register: " + hasRegistered);
        System.out.println("Age: " + person.getAge());
        System.out.println("Sex: " + person.getSex());
        System.out.println("Tel: " + person.getTel());
        System.out.println("With credit card no. : " + usage.getCreditCardNo() + ", credit bank : " + usage.getCreditBank());
        System.out.println("Total Times = " + usage.getPayTotalTimes() + ", Amount = " + usage.getPayTotalAmount() );
        System.out.println("****************************");

        if(hasRegistered) {
            double avg = usage.getPayTotalAmount() / usage.getPayTotalTimes();
            return usage.getPayTotalAmount() > 50000 && avg > 5000;
        }
        return false;
    }



    class CreditCardUsage {
        private String creditCardNo;
        private String creditBank;
        private double payTotalAmount;
        private int payTotalTimes;

        public CreditCardUsage(String creditCardNo, String creditBank, double payTotalAmount, int payTotalTimes) {
            this.creditCardNo = creditCardNo;
            this.creditBank = creditBank;
            this.payTotalAmount = payTotalAmount;
            this.payTotalTimes = payTotalTimes;
        }

        public String getCreditCardNo() {
            return creditCardNo;
        }

        public void setCreditCardNo(String creditCardNo) {
            this.creditCardNo = creditCardNo;
        }

        public String getCreditBank() {
            return creditBank;
        }

        public void setCreditBank(String creditBank) {
            this.creditBank = creditBank;
        }

        public double getPayTotalAmount() {
            return payTotalAmount;
        }

        public void setPayTotalAmount(double payTotalAmount) {
            this.payTotalAmount = payTotalAmount;
        }

        public int getPayTotalTimes() {
            return payTotalTimes;
        }

        public void setPayTotalTimes(int payTotalTimes) {
            this.payTotalTimes = payTotalTimes;
        }
    }

    class Person {
        private String name;
        private double age;
        private char sex;
        private String tel;

        public Person(String name, double age, char sex, String tel) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.tel = tel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }

}
