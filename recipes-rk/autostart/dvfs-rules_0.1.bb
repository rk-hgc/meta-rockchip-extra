SUMMARY = "Rockchip userspace dvfs rules"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " \
	file://dvfs-rules.sh \
"
S = "${WORKDIR}"

inherit update-rc.d

do_install () {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/dvfs-rules.sh ${D}${sysconfdir}/init.d/dvfs-rules.sh
}

RDEPENDS_${PN} = "bash"

INITSCRIPT_NAME = "dvfs-rules.sh"
INITSCRIPT_PARAMS = "start 22 5 3 ."
