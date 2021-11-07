#include <iostream>
using namespace std;

class City{
    public:
        int distance;
        int price;
};

int main()
{
    int n;
    cin >> n;

    // cond 1
    if (n < 0 || n > 100)
        exit(0);

    City city_array[n];

    // INPUT
    for (int i = 0; i < n; i++)
    {
        cin >> city_array[i].distance;
        cin >> city_array[i].price;


        // cond 2 and 3
        if (city_array[i].distance < 1 || city_array[i].distance > 20000 || city_array[i].price < 1 || city_array[i].price > 2000000)
            exit(0);
    }


    // POST CONDITION

    int GOOD = 0;
    // find good cities
    for (int i = 0; i < n; i++)
    {
        if ((city_array[i].price / city_array[i].distance) >= 100)
            GOOD++;
    }

    cout << GOOD << " ";

    for (int i = 0; i < n; i++)
    {
        if ((city_array[i].price / city_array[i].distance) >= 100)
            cout << i+1 << " ";
    }

    return (0);
}