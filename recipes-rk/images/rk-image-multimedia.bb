# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A image with Rockchip's multimedia packages."

require recipes-rk/images/rk-image-base.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	packagegroup-rk-gstreamer-full \
"
