SUMMARY = "Set the application that will run automatically"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

USE_X11 = "${@bb.utils.contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"
USE_WL = "${@bb.utils.contains("DISTRO_FEATURES", "wayland", "yes", "no", d)}"

SRC_URI = "file://mini-custom-x-session"
S = "${WORKDIR}"

RDEPENDS_${PN} = "sudo"

inherit update-alternatives

ALTERNATIVE_${PN} = "x-session-manager"
ALTERNATIVE_TARGET[x-session-manager] = "${bindir}/mini-custom-x-session"
ALTERNATIVE_PRIORITY = "80"

do_install() {

	if [ "${USE_X11}" = "yes" ]; then
		install -d ${D}/${bindir}
		install -m 0755 ${S}/mini-custom-x-session ${D}/${bindir}
	fi

}
