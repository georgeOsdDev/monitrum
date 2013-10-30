Monitrum
========

Realtime log monitor with Xitrum based on Actor messaging.
`Fluentd <http://fluentd.org/>`_

::

  +--------------------------------------------------------+                    +-----------------------------------+
  |                      Your Server                       |                    |           Monitrum-server         |
  |                                                        |                    |          * Reporting              |
  |  +----------------------+  +------------------------+  |                    |          * Alerting               |
  |  |       Your App       |  |     monitrum-client    |  |                    |          * Browsing               |
  |  |           |          |  |     (as standalone)    |  |                    |          * etc..                  |  +-------------+
  |  |           | write log|  |                        *--|-- Acttor Message --|->                                 |  |   Storage   |
  |  |           |          |  |   Collect server stat  |  |                    |                                  -+--|->           |
  |  |           |          |  +------------------------+  |                    |                                   |  +-------------+
  |  |  +--------*-------+  |                              |                    |                                   |
  |  |  | monitrum-client|  |                              |                    |                                   |
  |  |  |  (as library)  *--|------------------------------|-- Acttor Message --|->                   REST API      |
  |  |  +----------------+  |                              |                    +------*------------------*---------+
  |  |                      |                              |                           |                  |
  |  +----------------------+                              |                     +-----*-----+   +--------*--------+
  |                                                        |                     |    Mail   |   |    Http Client  |
  +--------------------------------------------------------+                     +-----------+   +-----------------+

