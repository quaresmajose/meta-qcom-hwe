inherit qprebuilt

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "Example for Secure DSP usecase."

DEPENDS += "fastrpc libvmmem securemsm-features"

PBT_ARCH = "aarch64"

SRC_URI[aarch64.sha256sum] = "dc24222262fcc7828adf93ea380aa023f9ca63c34d21d36664ea8fc24de6dc2e"

SRC_URI = "https://${PBT_ARTIFACTORY}/${PBT_BUILD_ID}/${PBT_BIN_PATH}/${BPN}_${PV}_${PBT_ARCH}.tar.gz;name=${PBT_ARCH}"

FILES:${PN} = "${libdir}/*.so ${bindir}/*"
FILES:${PN}-dev = "${libdir}/*.la ${includedir}"
