# OOP Tasks

This project contains separate Java console apps for practicing Object-Oriented Programming.

Each app is an independent IntelliJ IDEA module and can be started separately.

Important: do not run the project root as one Java module. Each folder below is a separate module with its own main class.

## Project Structure

```text
oop_tasks/
├── README.md
├── .gitignore
├── vehicle-rental-management/
│   ├── README.md
│   ├── vehicle-rental-management.iml
│   └── src/
└── bank-system/
    ├── README.md
    ├── bank-system.iml
    └── src/
```

## Run/Debug Configurations

Open:

```text
Run -> Edit Configurations...
```

Click `+`, then choose `Application`.

If IntelliJ asks about source roots, mark each module's `src` folder as `Sources Root`:

```text
vehicle-rental-management/src
bank-system/src
```

## Configuration 1: Vehicle Rental Management

Use these values:

- Name: `Vehicle Rental Management`
- Main class: `Main`
- Module: `vehicle-rental-management`
- JRE: project default JDK
- Program arguments: leave empty
- VM options: leave empty
- Working directory:

```text
/Users/tigranho/Projects/test/oop_tasks/vehicle-rental-management
```

Build and run settings:

- Before launch: `Build`
- Activate tool window: checked

## Configuration 2: Bank System

Use these values:

- Name: `Bank System`
- Main class: `MainBank`
- Module: `bank-system`
- JRE: project default JDK
- Program arguments: leave empty
- VM options: leave empty
- Working directory:

```text
/Users/tigranho/Projects/test/oop_tasks/bank-system
```

Build and run settings:

- Before launch: `Build`
- Activate tool window: checked

If `Build` is missing under `Before launch`:

1. Click `+` in the `Before launch` section.
2. Choose `Build`.
3. Click `OK`.

## Start The Apps From IntelliJ

After creating the configurations:

1. Open the Run/Debug configuration dropdown near the top-right of IntelliJ IDEA.
2. Select one app:

```text
Vehicle Rental Management
Bank System
```

3. Click the green `Run` button.

Use `Debug` instead of `Run` if you want to practice breakpoints.

## Notes

- Each module has its own `README.md` with student tasks.
- Start each console app from its own main class.
- The apps are separate and do not share code.
