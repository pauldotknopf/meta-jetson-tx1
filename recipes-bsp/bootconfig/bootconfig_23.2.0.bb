DESCRIPTION = "NVIDIA Linux Bootloader config"
HOMEPAGE = "https://developer.nvidia.com/"
LICENSE = "Proprietary"
SECTION = "base"

SRC_URI = "file://extlinux.conf.sdcard"

LIC_FILES_CHKSUM = "file://extlinux.conf.sdcard;md5=3d15c8dda4c86ac15d7117d698d29551"

S="${WORKDIR}"

PR = "r0" 

PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES = "${PN}"
FILES_${PN} = "/boot/extlinux/*"

do_install () {
    mkdir ${D}/boot
    mkdir ${D}/boot/extlinux
    cp ${WORKDIR}/extlinux.conf.sdcard ${D}/boot/extlinux/extlinux.conf
}
