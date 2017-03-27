# Copyright (C) 2016 - 2017 Jacob Chen <jacob2.chen@rock-chips.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Rockchip firmware"
DESCRIPTION = "Rockchip firmware such as for the WIFI, BT"

LICENSE = "BINARY"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=564e729dd65db6f65f911ce0cd340cf9"
NO_GENERIC_LICENSE[BINARY] = "LICENSE.TXT"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/rockchip-linux/rkbin.git"
S = "${WORKDIR}/git"

inherit allarch

do_install () {
	install -d ${D}/system/etc/
	cp -rf ${S}/firmware/* ${D}/system/etc/
}

FILES_${PN} = "/system/etc/*"
