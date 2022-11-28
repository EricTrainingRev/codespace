# Setup
1. update the vm
```bash
sudo apt upgrade -y
```
2. install firefox
```bash
sudo apt install -y firefox
```
3. install the "Java Extension Pack" and "Live Server" extensions for VSC in the codespace
4. Ensure visibility for port forwarding for your web application and live server for your web pages are set to public
    - anytime you restart your web server you will need to reset the port forwarding to public
    - you should not need to update the port forwarding link as long as you are working in the same codespace: if the codespace changes you will need to update http links