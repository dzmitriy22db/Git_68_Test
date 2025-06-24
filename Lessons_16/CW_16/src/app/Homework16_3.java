/*
Дано три переменные:

isQuietHours — сейчас тихое время (ночь, например)
hasNeighborsComplaint — жалуются ли соседи
isHoliday — сейчас праздник Музыку можно включить, если не тихое время и соседи не жалуются.
В праздник музыку можно включать даже если соседи жалуются или тихое время.
Запишите условие для переменной isMusicAllowed: можно ли включать музыку

 */


package app;

public class Homework16_3 {
    public static void main(String[] args) {

        boolean isQuietHours = false;
        boolean hasNeighborsComplaint = true;
        boolean isHoliday = true;

        boolean isMusicAllowed = isHoliday || (!isQuietHours && !hasNeighborsComplaint);
        if (isMusicAllowed) {
            System.out.println(" Музыку включать можно ");
        } else {
            System.out.println(" Музыку включать нельзя");

            }
        }

    }

