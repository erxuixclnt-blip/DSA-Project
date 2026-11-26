

                        while (true) {
                            System.out.print("Enter student name: ");
                            newName = sc.nextLine().trim();

                            if (newName.matches("[a-zA-Z\\s]+")
                                    && !newName.isEmpty()) {
                                break;
                            } else {
                                System.out.println(
                                    "Invalid input! Student name must contain letters only."
                                );
                            }
                        }

                        studentList.put(newNum, newName);

                        System.out.println(
                            "Record successfully saved/updated."
                        );
                        System.out.println(
                            "Updated student directory: " + studentList
                        );
                        break;
                    }

                    case 4:
                        System.out.println("Exiting current session...");
                        break;

                    default:
                        System.out.println(
                            "Invalid input. Please choose between 1 and 4."
                        );
                        break;
                }

            } while (choice != 4);

            while (true) {
                System.out.print(
                    "\nDo you want to run the program again? (yes/no): "
                );
                continueChoice = sc.nextLine().trim().toLowerCase();

                if (continueChoice.equals("yes")
                        || continueChoice.equals("no")
                        || continueChoice.equals("y")
                        || continueChoice.equals("n")) {
                    break;
                } else {
                    System.out.println(
                        "Invalid input! Please type 'yes' or 'no'."
                    );
                }
            }

        } while (continueChoice.equals("yes")
                || continueChoice.equals("y"));

        System.out.println(
            "Thank you for using Student Directory. !"
        );

        sc.close();
    }
}
