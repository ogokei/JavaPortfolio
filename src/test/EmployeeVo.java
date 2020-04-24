package test;

class EmployeeVo {
    // プロパティ
    private String employeeName;// 社員名
    private String divisionName;// 部署名
    private int vitality;// 体力

    EmployeeVo() {
    }

    EmployeeVo(String employeeName, String divisionName, int vitality) {
        System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
}