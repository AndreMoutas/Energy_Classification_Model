from xml.dom import minidom
from os import listdir, stat
from os.path import isfile, join, splitext

import json

from decimal import Decimal
import numpy as np

# Android Lint parsing

android_lint_output_path = "Outputs/Android-Lint-Train/"

android_lint_files = [f for f in listdir(android_lint_output_path) if isfile(join(android_lint_output_path, f))]


android_lint_output_path_75 = "Outputs/Android-Lint-Final/"

android_lint_files_75 = [f for f in listdir(android_lint_output_path_75) if isfile(join(android_lint_output_path_75, f))]

set_75_app_names = set()

for filename in android_lint_files_75:
    app_name = splitext(filename)[0]
    set_75_app_names.add(app_name)

""" android_lint_issues = []

android_lint_issues_by_priority = [] """

list_android_lint_total_issues = []

android_lint_total_issues = 0

android_lint_total_issues_75 = 0

for filename in android_lint_files:

    # get the file name without the extension, which is the name of the app
    app_name = splitext(filename)[0]
    
    filepath = android_lint_output_path + filename

    # create object to store all the issues
    """ current_app = {"name": app_name, "issues": {}, "num_total_issues": 0} """

    # create object to store issues by priority
    """ current_app_priorities = {"name": app_name, "issues": {}, "num_total_issues": 0} """

    # check if file is empty
    if (stat(filepath).st_size == 0):
        """ android_lint_issues.append(current_app) """
        """ android_lint_issues_by_priority.append(current_app_priorities) """
        list_android_lint_total_issues.append({"name": app_name, "total_issues": 0, "weight": 0})
    else:
        # get file by its path
        file = minidom.parse(filepath)
        # retrieve all issues
        issues = file.getElementsByTagName('issue')

        num_total_issues = 0
        

        for issue in issues:
            category = issue.attributes['category'].value
            if category == "Greenness":
                
                #increase the number of total issues
                num_total_issues += 1

                """ issue_priority = issue.attributes['priority'].value

                # update count according to the list by ID
                issue_id = issue.attributes['id'].value
                if issue_id in current_app["issues"]:
                    current_app["issues"][issue_id] = {"priority": issue_priority, "count": current_app["issues"][issue_id]["count"] + 1}
                else:
                    current_app["issues"][issue_id] = {"priority": issue_priority, "count": 1}

                # update count according to the list by priority
                if issue_priority in current_app_priorities["issues"]:
                    current_app_priorities["issues"][issue_priority] = current_app_priorities["issues"][issue_priority] + 1
                else:
                    current_app_priorities["issues"][issue_priority] = 1 """

        """ current_app["num_total_issues"] = num_total_issues
        current_app_priorities["num_total_issues"] = num_total_issues """

        # add current app with the total number of issues to the list
        current_app_total_issues = {"name": app_name, "total_issues": num_total_issues, "weight": 0}
        list_android_lint_total_issues.append(current_app_total_issues)

        android_lint_total_issues += num_total_issues

        if app_name in set_75_app_names:
            android_lint_total_issues_75 += num_total_issues


        # add current app issues grouped by ID to the list
        """ android_lint_issues.append(current_app) """

        # add current app issues grouped by priorities to the list
        """ android_lint_issues_by_priority.append(current_app_priorities) """

# Kadabra parsing

kadabra_output_path = "Outputs/Kadabra-Train/"

kadabra_files = [f for f in listdir(kadabra_output_path) if isfile(join(kadabra_output_path, f))]

""" kadabra_issues = []

list_excessive_method_calls = []
list_hashmap_usage = []
list_internal_getter = []
list_member_ignoring_method = [] """

list_kadabra_total_issues = []

kadabra_total_issues = 0

kadabra_total_issues_75 = 0

for filename in kadabra_files:

    # get the file name without the extension, which is the name of the app
    app_name = splitext(filename)[0]
    
    filepath = kadabra_output_path + filename

    # open current json file
    file = open(filepath)

    # retrieve data from file into a variable
    data = json.load(file)



    # count the number of times each detector appears

    """ num_excessive_method_calls = len(data["detectors"]["Excessive Method Calls Detector"])
    list_excessive_method_calls.append(num_excessive_method_calls)

    num_hashmap_usage = len(data["detectors"]["HashMap Usage Detector"])
    list_hashmap_usage.append(num_hashmap_usage) """

    num_internal_getter = len(data["detectors"]["Internal Getter Detector"])
    """ list_internal_getter.append(num_internal_getter) """

    """ num_member_ignoring_method = len(data["detectors"]["Member Ignoring Method Detector"])
    list_member_ignoring_method.append(num_member_ignoring_method) """

    # assign total number of issues excluding "Internal Getter"
    num_total_issues = data["total"] - num_internal_getter
    current_app_total_issues = {"name": app_name, "total_issues": num_total_issues, "weight": 0}
    list_kadabra_total_issues.append(current_app_total_issues)

    kadabra_total_issues += num_total_issues

    if app_name in set_75_app_names:
        kadabra_total_issues_75 += num_total_issues

    # create an object with the issues and correspondant number of appearances
    """ issues = {"Excessive Method Calls Detector": num_excessive_method_calls, 
                "HashMap Usage Detector": num_hashmap_usage,
                "Internal Getter Detector": num_internal_getter,
                "Member Ignoring Method Detector": num_member_ignoring_method}

    current_app = {"name": app_name, "issues": issues, "num_total_issues": num_total_issues}


    kadabra_issues.append(current_app) """


# Order lists and write to a csv file for better evaluation

def sort_total_values(app):
    return app["total_issues"]

# Kadabra
""" list_excessive_method_calls.sort()
list_hashmap_usage.sort()
list_internal_getter.sort()
list_member_ignoring_method.sort() """

list_kadabra_total_issues.sort(key=sort_total_values)

try:
    f = open("values_kadabra.csv", "x")
    """ for i in range(len(list_kadabra_total_issues)):
        f.write(str(list_excessive_method_calls[i]) + ","
                + str(list_hashmap_usage[i]) + ","
                + str(list_internal_getter[i]) + ","
                + str(list_member_ignoring_method[i]) + ", , ," +
                str(list_kadabra_total_issues[i]) + "\n") """
    for i in range(len(list_kadabra_total_issues)):
        f.write(str(list_kadabra_total_issues[i]["name"]) + "," + str(list_kadabra_total_issues[i]["total_issues"]) + "\n")
except:
    print("Kadabra file already exists")

# Android Lint

list_android_lint_total_issues.sort(key=sort_total_values)

try:
    f = open("values_android_lint.csv", "x")
    for i in range(len(list_android_lint_total_issues)):
        f.write(str(list_android_lint_total_issues[i]["name"]) + "," + str(list_android_lint_total_issues[i]["total_issues"]) + "\n")
except:
    print("Android Lint file already exists")



android_lint_apps_weights = []

android_lint_weights = []
android_lint_weights_75 = []

for app in list_android_lint_total_issues:
    app_weight = float(app['total_issues']) / float(android_lint_total_issues)
    android_lint_weights.append(app_weight)

    if app["name"] in set_75_app_names:
        app_weight_75 = float(app['total_issues']) / float(android_lint_total_issues_75)
        android_lint_weights_75.append(app_weight_75)

        android_lint_apps_weights.append({"app_name": app["name"], "weight": app_weight, "weight_75": app_weight_75})

quantiles_AL = np.quantile(android_lint_weights, [.1, .2, .3, .4, .5, .6, .7, .8, .9])
quantiles_AL_75 = np.quantile(android_lint_weights_75, [.1, .2, .3, .4, .5, .6, .7, .8, .9])

kadabra_apps_weights = []

kadabra_weights = []
kadabra_weights_75 = []

for app in list_kadabra_total_issues:
    app_weight = float(app['total_issues']) / float(kadabra_total_issues)
    kadabra_weights.append(app_weight)

    if app["name"] in set_75_app_names:
        app_weight_75 = float(app['total_issues']) / float(kadabra_total_issues_75)
        kadabra_weights_75.append(app_weight_75)

        kadabra_apps_weights.append({"app_name": app["name"], "weight": app_weight, "weight_75": app_weight_75})

quantiles_kadabra = np.quantile(kadabra_weights, [.1, .2, .3, .4, .5, .6, .7, .8, .9])
quantiles_kadabra_75 = np.quantile(kadabra_weights_75, [.1, .2, .3, .4, .5, .6, .7, .8, .9])

# sort applications by name

def sort_by_name(app):
    return app["app_name"]

android_lint_apps_weights.sort(key=sort_by_name)
kadabra_apps_weights.sort(key=sort_by_name)


# classify applications

def classify_app(app_weight, deciles):
    if app_weight <= deciles[2]:
        return 5.0
    elif app_weight <= deciles[4]:
        return 4.0
    elif app_weight <= deciles[6]:
        return 3.0
    elif app_weight <= deciles[8]:
        return 2.0
    else:
        return 1.0

classifications = []

for i in range(len(android_lint_apps_weights)):
    app_AL = android_lint_apps_weights[i]
    app_kadabra = kadabra_apps_weights[i]

    classification_AL = classify_app(app_AL["weight"], quantiles_AL)
    classification_AL_75 = classify_app(app_AL["weight_75"], quantiles_AL_75)

    classification_kadabra = classify_app(app_kadabra["weight"], quantiles_kadabra)
    classification_kadabra_75 = classify_app(app_kadabra["weight_75"], quantiles_kadabra_75)

    app_classification = (classification_AL_75 + classification_kadabra_75) / 2.0

    classifications.append({"name": app_AL["app_name"],"classification_AL": classification_AL, "classification_AL_75": classification_AL_75, 
                            "classification_kadabra": classification_kadabra, "classification_kadabra_75": classification_kadabra_75,
                            "app_classification": app_classification})


try:
    f = open("classifications.csv", "x")
    f.write("App name, AL75, K75, Class, , AL75, AL82, , K75, K250\n")
    for app in classifications:
        f.write(app["name"] + "," + 
                str(app["classification_AL_75"]) + "," + str(app["classification_kadabra_75"]) + "," + str(app["app_classification"]) + ", ," +
                str(app["classification_AL_75"]) + "," + str(app["classification_AL"]) + ", ," + 
                str(app["classification_kadabra_75"]) + "," + str(app["classification_kadabra"]) + "\n")
except:
    print("Classifications file already exists")

print("Android Lint: ")
print(quantiles_AL)

print("\n")

print("Kadabra: ")
print(quantiles_kadabra)