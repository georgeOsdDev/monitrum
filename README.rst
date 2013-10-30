Monitrum
========

Realtime log monitor with Xitrum based on Actor messaging.
Aiming to `Fluentd <http://fluentd.org/>`_

::

  +--------------------------------------------------------+
  |                      Your Server                       |
  |                                                        |
  |  +----------------------+  +------------------------+  |
  |  |       Your App       |  |     monitrum-client    |  |
  |  |           |          |  |     (as standalone)    |  |
  |  |           | write log|  |                        |  |
  |  |           |          |  |   Collect server stat  |  |
  |  |           |          |  +------*-----------------+  |
  |  |  +--------*-------+  |         |                    |
  |  |  | monitrum-client|  |         |                    |
  |  |  |  (as library)  |  |         |                    |
  |  |  +--------*-------+  |         |                    |
  |  +-----------|----------+         |                    |
  +--------------|--------------------|--------------------+
                 |                    |
                 |                    |
     +-----------*--------------------*--+
     |                                   |
     |           Monitrum-server         |
     |          * Reporting              |  +-------------+
     |          * Alerting               |  |   Storage   |
     |          * Browsing              -+--|->           |
     |          * etc..                  |  +-------------+
     |                                   |
     |                     REST API      |
     +------*------------------*---------+
            |                  |
      +-----*-----+   +--------*--------+
      |    Mail   |   |    Http Client  |
      +-----------+   +-----------------+