//Nama    : Mohamad Faizin
//Kelas   : 2D
//NIM     : 21090100


import QuickSort.QuickSort;

public class PokemonGo {
    public String Bug;
    public String Dark;
    public String Dragon;
    public String Electric;
    public String Fairy;
    public String Fighting;
    public String Fire;
    public String Flying;
    public String Ghost;
    public String Grass;
    public String Ground;
    public String Ice;
    public String Normal;
    public String Poison;
    public String Psychic;
    public String Rock;
    public String Steel;
    public String Water;

    public PokemonGo(String bug,String dark,String dragon,String electric,String fairy,String fighting,
                     String fire,String flying,String ghost,String grass,String ground,String ice,
                     String normal,String poison,String psychic,String rock,String steel,String water){
        this.Bug = bug;
        this.Dark = dark;
        this.Dragon = dragon;
        this.Electric = electric;
        this.Fairy = fairy;
        this.Fighting = fighting;
        this.Fire = fire;
        this.Flying = flying;
        this.Ghost = ghost;
        this.Grass = grass;
        this.Ground = ground;
        this.Ice = ice;
        this.Normal = normal;
        this.Poison = poison;
        this.Psychic = psychic;
        this.Rock = rock;
        this.Steel = steel;
        this.Water = water;
    }

    public static void main(String[] args) {
        int[] dataArray = {13,18,27,2,19,25};
        int n = dataArray.length;
        System.out.println("""
                Before sorting array elemnts are -\s""");
        QuickSort _myQS = new QuickSort();
        _myQS.setData(dataArray);
        _myQS.printArr(n);
        _myQS.quickSort(0,n - 1);
        System.out.println("\n After sorting array elemnt are - ");
        _myQS.printArr(n);
        System.out.println();
    }

}
