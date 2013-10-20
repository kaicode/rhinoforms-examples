Rhinoforms Examples
===================

This web application contains example form flows which demonstrate the features of Rhinoforms.

Building
--------
This project uses the Rhinoforms war as an overlay.

First clone and build Rhinoforms localy.
<pre>
git clone https://github.com/kaicode/rhinoforms.git
cd rhinoforms
mvn install
cd ..
</pre>

Then clone and build this project.
<pre>
git clone https://github.com/kaicode/rhinoforms-examples.git
cd rhinoforms-examples
mvn install
</pre>
Take the war from the target directory and drop it into a servlet container like Tomcat.
