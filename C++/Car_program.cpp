#include <iostream>
#include <fstream>
#include <string>
#include <list>
#include <vector>
#include <set>
#include <numeric>

using namespace std;

void getInput();
void summaryReport();
int count;
//char date[20], fuel[10], odo_reading[10], brand[10];

int main()
{

    ofstream outfile;
    outfile.open("Test.txt");

    char opt;

    // to check 'record' or 'view'
    cout <<"\nNOTE : [R] = record car fuel consumption history ; [V] = view car fuel comsumption report " ;
    cout << "\nPlease Input [R] / [V] ? :  ";
    cin >> opt;
    cin.ignore();

    if ((opt == 'R') || (opt == 'r'))
    {
        getInput();
    }
    else if ((opt == 'V') || (opt == 'v'))
    {
        cout << "\nNo data found. Please input new data. " << endl;
        getInput();
    }

    outfile.close();

    return 0;
}

void getInput()
{
    char date[20], fuel[10], odo_reading[10], brand[10];
    char opt;

    cout << "_____________________________\n" << endl;

    cout << "Date : ";
    cin.getline(date, 20);

    cout << "Amount of fuel used (in litters) : ";
    cin.getline(fuel, 10);

    cout << "Odometer reading (in KM) : ";
    cin.getline(odo_reading, 10);

    cout << "Car brand type ( 1: BMW, 2: Toyota, 3: Honda ): ";
    cin.getline(brand, 10);

    // using <string> class to create an array of mutable strings :
    //  the size of the string is not fixed, and the strings can be changed.
    string car_Fuel_Consumption_Record[4] = {date, fuel, odo_reading, brand};


    ofstream outfile;
    outfile.open("Test.txt", ios::app);     //append

    if (outfile.is_open())
    {
        for (int i = 0; i < 4; i++)
        {
            // transport the data that has being stored in the string array into the txt file
            // seperate each value by a delimiter (in this case : a tab)
            outfile << car_Fuel_Consumption_Record[i] << "\t" ;
            count++;
        }

        outfile << "\n" << endl;
        outfile.close();
    }
    else
    {
        cout << "Unable to open file. ";
    }


    cout << "Continue Add Data [R]? or View Summary Report [V] ? : ";
    cin >> opt;
    cin.ignore();

    if ((opt == 'R') || (opt == 'r'))
    {
        return getInput();
    }
    else
    {
        summaryReport();
    }
}

void summaryReport ()
{
    cout << "\n------------------Summary Report--------------------\n\n";

    ifstream inFile;
    inFile.open("Test.txt");
    if (inFile.fail())
    {
        cerr << "Error opening file. " << endl;
        exit(1);
    }
    else
    {
        // Retrive car_brand_set information
        ifstream infile("Test.txt");

        string date[20];
        double fuel[10], odo_reading[10];
        int brand[10];

        double fuel_Total = 0;
        double fuel_Avg = 0;
        double odometer_Total = 0;
        double odometer_Avg = 0;
        double distance = 0;
        double a_fuel = 0;
        double b_fuel = 0;
        double c_fuel = 0;
        double a_km = 0;
        double b_km = 0;
        double c_km = 0;
        double a_avg_fuel = 0;
        double b_avg_fuel = 0;
        double c_avg_fuel = 0;

        int x = count / 4;
        int i, a = 0, b = 0, c = 0;

        cout << "---- Travel Report For The Week ----" << endl;

        cout << endl << "Total entries: " << x << endl;

        for(i = 0; i < x; i++)
        {
            infile >> date[i] >> fuel[i] >> odo_reading[i] >> brand[i];
        }

        for(i = 0; i < x; i++)
        {
            if (brand[i] == 1)
            {
                cout << "On " << date[i] << ", you have used " << fuel[i] << " litres of fuel and driven "
                << odo_reading[i] << " km in a BMW." << endl;
                a++;

                a_fuel += fuel[i];
                a_km += odo_reading[i];
                a_avg_fuel = a_fuel / a;
            }

            if (brand[i] == 2)
            {
                cout << "On " << date[i] << ", you have used " << fuel[i] << " litres of fuel and driven "
                << odo_reading[i] << " km in a Toyota." << endl;
                b++;

                b_fuel += fuel[i];
                b_km += odo_reading[i];
                b_avg_fuel = b_fuel / b;
            }

            if (brand[i] == 3)
            {
                cout << "On " << date[i] << ", you have used " << fuel[i] << " litres of fuel and driven "
                << odo_reading[i] << " km in a Honda." << endl;
                c++;

                c_fuel += fuel[i];
                c_km += odo_reading[i];
                c_avg_fuel = c_fuel / c;
            }
        }

        // Fuel Total
        for (int i = 0; i < x; i++)
        {
            fuel_Total += fuel[i];
        }

        // Fuel Average
        fuel_Avg = fuel_Total / x;

        // Odometer Total
        for (int i = 0; i < x; i++)
        {
            odometer_Total += odo_reading[i];
        }

        // Odometer average
        odometer_Avg = odometer_Total / x;

        //For calculating the average km and fuel per car
        for (int i = 0; i < x; i++)
        {

        }


        cout << "\n----Breakdown Report----\n";
        cout << "\nTotal Fuel consumed: " << fuel_Total << " litres."<< endl;
        cout << "\nTotal distance traveled : " << odometer_Total << " km." << endl;
        cout << "\nAverage Amount Of Fuel Consumed: " << fuel_Avg << " litres." << endl;
        cout << "\nAverage Distance traveled : " << odometer_Avg << " km." << endl;

        cout << "\n----Car Report----\n";
        if (a > 0)
        {
            cout << "BMW total distance traveled: " << a_km << " km." << endl;
            cout << "BMW total fuel consumed: " << a_fuel << " litres" << endl;
            cout << "BMW average fuel consumed: " << a_avg_fuel << " litres." << endl;
        }

        if (b > 0)
        {
            cout << "Toyota total distance traveled: " << b_km << " km." << endl;
            cout << "Toyota total fuel consumed: " << b_fuel << " litres" << endl;
            cout << "Toyota average fuel consumed: " << b_avg_fuel << " litres." << endl;
        }

        if (c > 0)
        {
            cout << "Honda total distance traveled: " << c_km << " km." << endl;
            cout << "Honda total fuel consumed: " << c_fuel << " litres." << endl;
            cout << "Honda average fuel consumed: " << c_avg_fuel << " litres." << endl;
        }
    }
}
