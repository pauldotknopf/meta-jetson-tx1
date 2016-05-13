SECTION = "kernel"
DESCRIPTION = "Linux For Tegra R23.2.0 Kernel recipe."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
KERNEL_IMAGETYPE = "Image"

inherit kernel

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/setup-defconfig.inc

DEPENDS_append_aarch64 = " libgcc"
KERNEL_CC_append_aarch64 = " ${TOOLCHAIN_OPTIONS}"
KERNEL_LD_append_aarch64 = " ${TOOLCHAIN_OPTIONS}"

DEFAULT_PREFERENCE = "-1"

S = "${WORKDIR}/git"

PR = "r23.2.0"
SRC_URI = "git://github.com/watatuki/linux_l4t_tx1.git \
           file://defconfig"

SRCREV = "c98f65fccfc4a99313c17683ce69c24bc17c7b25"

KERNEL_DEVICETREE = "tegra210-jetson-tx1-p2597-2180-a01-devkit.dtb"
