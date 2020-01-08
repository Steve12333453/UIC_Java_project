public class ControllerCreate extends Controller {

    public ControllerCreate(FinanceOffice m) {
        super(m);
    }


    public String create(String name, String amount, int type) {
        try {
            int money = Integer.parseInt(amount);
            Payer payer;
            //use switch method to let user have three options
            switch (type) {
                case 0:
                    payer = new Student(name, money);
                    break;
                case 1:
                    payer = new Employee(name, money);
                    break;
                default:
                    payer = new FacultyMember(name, money);
                    break;
            }

            m.addPayer(payer);
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
