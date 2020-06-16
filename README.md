![Theme](https://raw.githubusercontent.com/Jakubson/JPremium/master/images/916fd6ff9b545ba89a7f395da3d113e34b1c6233.png)

## Introduce
> **Before purchasing, please read the whole description and remember JPremium requires a BungeeCord server, at least two Spigot servers, Internet connection and Java 8+! Please also check working principle of [fixing unique ids](https://github.com/Jakubson/JPremiumCleared/wiki#fixed-unique-ids)!**

Nowadays the majority of servers transform into networks with many backend servers connected with one proxy server, therefore standard authorisation plugins do not perform their function today. The plugins became obsolete, they do not catch up with the server progress, they do not use fully the latest Minecraft features. So, I want you to present JPremium.

JPremium is an advanced BungeeCord authorisation plugin. JPremium is different from other popular authorisation plugins. The plugin has very necessary features, which many servers need, automatic login premium players and sessions for cracked players. List of all features with description you can find below.

## Features
* JPremium has the automatic login premium players feature. They also can disable that feature and login with passwords. Automatic registration is dependent on your JPremium configuration. You can set automatic registration premium players, but then cracked players with premium nicknames cannot join to the server.

* JPremium supports changing premium nicknames. Premium players who change their nicknames will not lose any data and will not be able to steal any cracked accounts because the plugin uses fixed unique ids. That feature works only when you enable the `fixedUniqueIds` option in your JPremium configuration. If you do not enable it, premium players will not be able to join the server after changing their nicknames.

* JPremium has the session feature for cracked players. When they have sessions, they do not have to login every joining. You can set automatic starting sessions for specified time after registration and login.

* JPremium has mail integration. Cracked players can add their mails. When they lose their passwords, they can recover passwords by mails.

* JPremium has protection against bots. The first protection is forbidding joining when JPremium detects too many joining requests. Even if bots join the server, bots cannot register because JPremium requires entering captcha codes from maps. You can change the icon on the captcha maps (please see the second image in the images section).

* JPremium has the special registration form which you can use on your website and set that all new players have to register on your website. The registration form uses Google re-captcha system, so bots cannot register.

* JPremium connects all not logged players with the limbo server. They have to login or register there and then they will be connected with the main server or their last servers on which they were before quit from the server. Logged and premium players are directly connected with the main server or their last servers. The limbo server and the main server can be the same server.

* JPremium has the redirection feature. When one of the servers is shutting down, all players from that server will be redirected to the limbo server. And when that server comebacks, all redirected players will be connected to that server again.

* JPremium forbids joining directly with Spigot servers without your BungeeCord server. The plugin uses access tokens to validate connections. It is a very good means of protection, but remember any plugins do not warrant full protection, I recommend having a firewall!

* JPremium uses salted SHA-256 to hash cracked player passwords. The plugin also requires entering strong passwords by cracked players. You can also limit registration from one IP address.

* JPremium is fully configurable, so you can change almost all features and messages.

## Images
![Network Structure](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/NetworkStructure.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image1.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image2.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image3.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image4.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image5.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image6.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image7.png)
![](https://raw.githubusercontent.com/Jakubson/JPremiumCleared/master/images/image8.png)

## Terms
* The buyer can use the product only on their own server.
* The buyer cannot edit the source code of the product without the author agreement.
* The buyer cannot distribute the product or the source code of the product without the author agreement.
* The author does not have to refund the buyer's money for their request.
* The author does not warrant the product is not lacking errors and is not liable for damages caused by using the product.
* The author makes an effort to repair or improve the product, but does not warrant updating the product or repairing all issues.

