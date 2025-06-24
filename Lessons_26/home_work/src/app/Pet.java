package app;

public class Pet {
    String typPet;
    String namePet;
    String colorPet;
    int birthdayPet;
public Pet(String typPet, String namePet, String colorPet, int birthdayPet){
    this.typPet = typPet;
    this.namePet = namePet;
    this.colorPet =colorPet;
    this.birthdayPet = birthdayPet;
}

public String toString(){
    return typPet + "." + namePet + "." + colorPet + "." + birthdayPet;
}
}
