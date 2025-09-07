package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartphoneRotateAngle: ImageVector
    get() {
        if (_smartphoneRotateAngle != null) {
            return _smartphoneRotateAngle!!
        }
        _smartphoneRotateAngle = Builder(
            name = "SmartphoneRotateAngle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 5.0f)
                horizontalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.4263f, 14.4122f)
                curveTo(21.1016f, 14.1549f, 20.6299f, 14.2096f, 20.3727f, 14.5342f)
                curveTo(20.1155f, 14.8589f, 20.1701f, 15.3306f, 20.4948f, 15.5878f)
                lineTo(21.4263f, 14.4122f)
                close()
                moveTo(3.5052f, 15.5878f)
                curveTo(3.8299f, 15.3306f, 3.8846f, 14.8589f, 3.6273f, 14.5342f)
                curveTo(3.3701f, 14.2096f, 2.8984f, 14.1549f, 2.5737f, 14.4122f)
                lineTo(3.5052f, 15.5878f)
                close()
                moveTo(12.0f, 20.6875f)
                lineTo(12.4939f, 21.2519f)
                curveTo(12.6566f, 21.1095f, 12.75f, 20.9038f, 12.75f, 20.6875f)
                curveTo(12.75f, 20.4712f, 12.6566f, 20.2655f, 12.4939f, 20.1231f)
                lineTo(12.0f, 20.6875f)
                close()
                moveTo(10.5f, 19.375f)
                lineTo(10.9939f, 18.8106f)
                curveTo(10.7724f, 18.6168f, 10.4581f, 18.5704f, 10.1901f, 18.692f)
                curveTo(9.9221f, 18.8136f, 9.75f, 19.0807f, 9.75f, 19.375f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.5f, 22.0f)
                horizontalLineTo(9.75f)
                curveTo(9.75f, 22.2943f, 9.9221f, 22.5614f, 10.1901f, 22.683f)
                curveTo(10.4581f, 22.8046f, 10.7724f, 22.7582f, 10.9939f, 22.5644f)
                lineTo(10.5f, 22.0f)
                close()
                moveTo(14.4244f, 19.8173f)
                curveTo(14.0123f, 19.859f, 13.7121f, 20.227f, 13.7538f, 20.6391f)
                curveTo(13.7956f, 21.0512f, 14.1635f, 21.3514f, 14.5756f, 21.3096f)
                lineTo(14.4244f, 19.8173f)
                close()
                moveTo(20.4948f, 15.5878f)
                curveTo(21.0684f, 16.0424f, 21.25f, 16.443f, 21.25f, 16.75f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 15.7998f, 22.1833f, 15.012f, 21.4263f, 14.4122f)
                lineTo(20.4948f, 15.5878f)
                close()
                moveTo(2.75f, 16.75f)
                curveTo(2.75f, 16.443f, 2.9316f, 16.0424f, 3.5052f, 15.5878f)
                lineTo(2.5737f, 14.4122f)
                curveTo(1.8167f, 15.012f, 1.25f, 15.7998f, 1.25f, 16.75f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.4939f, 20.1231f)
                lineTo(10.9939f, 18.8106f)
                lineTo(10.0061f, 19.9394f)
                lineTo(11.5061f, 21.2519f)
                lineTo(12.4939f, 20.1231f)
                close()
                moveTo(10.9939f, 22.5644f)
                lineTo(12.4939f, 21.2519f)
                lineTo(11.5061f, 20.1231f)
                lineTo(10.0061f, 21.4356f)
                lineTo(10.9939f, 22.5644f)
                close()
                moveTo(21.25f, 16.75f)
                curveTo(21.25f, 17.2066f, 20.8246f, 17.8623f, 19.5314f, 18.5103f)
                curveTo(18.3014f, 19.1266f, 16.522f, 19.6047f, 14.4244f, 19.8173f)
                lineTo(14.5756f, 21.3096f)
                curveTo(16.791f, 21.0851f, 18.7617f, 20.5738f, 20.2034f, 19.8514f)
                curveTo(21.5819f, 19.1606f, 22.75f, 18.1281f, 22.75f, 16.75f)
                horizontalLineTo(21.25f)
                close()
                moveTo(9.75f, 19.375f)
                verticalLineTo(20.6435f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.375f)
                horizontalLineTo(9.75f)
                close()
                moveTo(9.75f, 20.6435f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.6435f)
                horizontalLineTo(9.75f)
                close()
                moveTo(10.5443f, 19.8948f)
                curveTo(8.2015f, 19.756f, 6.1725f, 19.2897f, 4.7556f, 18.6471f)
                curveTo(4.0458f, 18.3252f, 3.5244f, 17.9747f, 3.1906f, 17.6296f)
                curveTo(2.8603f, 17.288f, 2.75f, 16.993f, 2.75f, 16.75f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 17.494f, 1.6008f, 18.1434f, 2.1124f, 18.6724f)
                curveTo(2.6207f, 19.1979f, 3.3221f, 19.644f, 4.136f, 20.0131f)
                curveTo(5.7662f, 20.7525f, 7.9873f, 21.246f, 10.4557f, 21.3922f)
                lineTo(10.5443f, 19.8948f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5017f, 17.0f)
                curveTo(5.5f, 16.6878f, 5.5f, 16.355f, 5.5f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(5.5f, 5.1716f, 5.5f, 3.7574f, 6.3787f, 2.8787f)
                curveTo(7.2574f, 2.0f, 8.6716f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(12.5f)
                curveTo(15.3284f, 2.0f, 16.7426f, 2.0f, 17.6213f, 2.8787f)
                curveTo(18.5f, 3.7574f, 18.5f, 5.1716f, 18.5f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(18.5f, 16.355f, 18.5f, 16.6878f, 18.4983f, 17.0f)
            }
        }
            .build()
        return _smartphoneRotateAngle!!
    }

private var _smartphoneRotateAngle: ImageVector? = null
