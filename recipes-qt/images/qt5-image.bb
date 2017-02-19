require recipes-rk/images/rk-image-multimedia.bb

IMAGE_FEATURES += "\
	splash	\
"

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
"

do_rootfs[depends] += "virtual/kernel:do_populate_sysroot"

IMAGE_INSTALL = " \
    ${COMMON_INSTALL} \
    ${QT_DEMOS} \
	packagegroup-core-x11-utils \
"
