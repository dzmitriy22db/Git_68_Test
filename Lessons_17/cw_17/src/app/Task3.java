package app;

public class Task3 {
    public static void main(String[] args) {

        boolean isQuietHours = true;       //сейчас тихое время (ночь, например)
        boolean hasNeighborsComplaint = true; // жалуются ли соседи
        boolean isHoliday = false;          //сейчас праздник

        // ----------------
        boolean isMusicAllowed = (!isQuietHours  &&  !hasNeighborsComplaint ) || isHoliday;

        System.out.println("Можно включать музыку: " + isMusicAllowed);



    }

}


/*
Дано три переменные:
- isQuietHours — сейчас тихое время (ночь, например)
- hasNeighborsComplaint — жалуются ли соседи
- isHoliday — сейчас праздник
Музыку можно включить, если не тихое время и соседи не жалуются.
В праздник музыку можно включать даже если соседи жалуются или тихое время.
Запишите условие для переменной isMusicAllowed: можно ли включать музыку

 */
