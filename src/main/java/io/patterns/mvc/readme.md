Model View Controller
---

**Model:** The central component of the pattern. 
It is the application's dynamic data structure, independent of the user interface. 
It directly manages the data, logic and rules of the application.
- Uses the **Observer Pattern** to dynamically update the views

**Controller:** Accepts input and converts it to commands for the model or view.
- Uses **Strategy Pattern** to easily switch the behaviour of the controller if desired.

**View:** Any representation of information such as a chart, diagram or table. 
Multiple views of the same information are possible, such as a bar chart for management and a tabular view for accountants.