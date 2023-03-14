# This is a sample Python script.
import random
import pandas as pd


# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def arrGen(size):
    data = pd.DataFrame({"value": [random.randint(0, 100000000) for _ in range(size)]})
    return data


def arrToCSV(arr, size):
    arr.to_csv("arrays/" + str(size) + ".csv", sep=",", index=False, header=False);


def genAllCSV(factor):
    for i in range(1, 11):
        arrToCSV(arrGen(i * factor), i * factor)


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    genAllCSV(100)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
