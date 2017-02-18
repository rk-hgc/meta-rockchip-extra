DESCRIPTION = "A image with Rockchip's multimedia packages."

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-rk-gstreamer \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
						'weston weston-init weston-examples \
							gtk+3-demo clutter-1.0-examples', '', d)} \
"
