# ZipTeam

a zip code slack clone

### Project planning:
Use the git server to record project plans in the project repo’s wiki.
Each project must keep:
* An overview document of the project
* A plan of phases of the project
* The issue tracker in the repo must track what’s being worked on
  * Track the assignment of different parts of the project to students (using Issues)
  * Each section of the app needs to keep pages on its design, progress and bugs (using Issues)
  * All issues should be attached to project milestones and assigned to team members.
* UML diagrams and specs must be kept, seriously. 
* API design docs, for each segment where a protocol needs to be used for data communications.
* Designs should use Model/View/Controller, with Client and Server focus subgroups
* UI/UX should be done in Typescript/Ionic/Angular (or another pre-approved)
* The database should be either MySQL, MariaDB or Postgres.
*The app server must be based on Spring.io (probably spring boot)

Each web-app project needs to include a server backed by a database and one or more clients (web? Mobile? terminal?).
The project work should be in agile sprints of 3-5 days, commit histories are important. Each students should work in a different git branch). Multiple commits should be done daily on all personal work. All sprints end with a complete merge back to the master branch, and a demo/preso for an instructor.
The project should start with simple features, and then add to it over the course of several weeks (and several sprints).
The internet has many different ways of doing each of these projects, tutorials, descriptions and so on, describing how these things can be done. Research on the topics should be considered to be the very first task a group should do on the project.
The User Interface for the project should start with simple UIs, and refine/embellish them over the sprints. The final front end UI should be written in Typescript/Ionic/Angular (or in a UX framework approved by Kris).

### Description - A Slack-like clone. 

Start with a simple, multi-user  “Chatserver” - it should work with a central server, and clients which REST into that server. The central server is backed by a database.
Simple UI, bootstrap/ionic/angular client page for starter UI.

APIs
* User create/delete, Login
* Post message/ readAll for single -> many channels
* Channel create/delete/invite/post/readAll

One channel, send messages, many clients, chat-server functionality

Add user auth, User spaces, 

Add multiple channels with membership (invitation), privacy between channels 

Add image attachments, emojis. Document attachments, with download.

Mobile app interface

