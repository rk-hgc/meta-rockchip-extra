# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

IMAGE_FEATURES += "\
	splash	\
"

do_rootfs[depends] += "virtual/kernel:do_populate_sysroot"

require recipes-rk/images/rk-image-multimedia.bb

COMMON_INSTALL = " \
	qtbase	\
	qtdeclarative \
	qtmultimedia \
	qtsvg \
	qtsensors \
	qtimageformats \
	qtsystems \
	qtscript \
	qt3d \
	qtwebkit \
	qtgraphicaleffects \
	qtconnectivity \
	qtlocation \
"

QT_DEMOS = " \
	qtsmarthome \
	qt5-opengles2-test \
"

IMAGE_INSTALL += " \
	${@base_contains('DISTRO_FEATURES', 'wayland', 'qtwayland', '', d)} \
	${COMMON_INSTALL} \
	${QT_DEMOS} \
	packagegroup-fonts-truetype \
"
