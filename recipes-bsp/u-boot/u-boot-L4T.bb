require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot provided by NVideo for Jetson TX1."
PROVIDES = "u-boot"

PR = "r23.2.0"

SRC_URI = "http://developer.download.nvidia.com/embedded/L4T/r23_Release_v2.0/source/u-boot_src.tbz2"
