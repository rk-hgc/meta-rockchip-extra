# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A image used for test and benchmark."

IMAGE_FEATURES += " \
	debug-tweaks \
	tools-testapps \
	tools-profile \
"

require recipes-rk/images/rk-image-multimedia.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	sshfs-fuse \
	dhcp-client \
	glmark2 \
	cpufrequtils \
	usbutils \
"
